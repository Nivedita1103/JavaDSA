import java.util.*;

public class apiq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of requests: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        String[] requests = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter request " + (i + 1) + ": ");
            requests[i] = scanner.nextLine();
        }

        List<String> sortedResources = getSortedResources(requests);
        for (String resource : sortedResources) {
            System.out.println(resource);
        }
    }

    public static List<String> getSortedResources(String[] requests) {
        Map<String, Set<String>> dependencies = new HashMap<>();

        for (String request : requests) {
            String[] parts = request.split("/");
            String resource = parts[parts.length - 2];
            String id = parts[parts.length - 1];

            dependencies.putIfAbsent(id, new HashSet<>());
            dependencies.get(id).add(resource);
        }

        List<String> sortedResources = new ArrayList<>(dependencies.keySet());
        Collections.sort(sortedResources);

        List<String> result = new ArrayList<>();
        for (String id : sortedResources) {
            List<String> levelResources = new ArrayList<>();
            levelResources.add(id);
            generateDependencyTree(id, dependencies, levelResources, 1);
            result.addAll(levelResources);
        }

        return result;
    }

    public static void generateDependencyTree(String id, Map<String, Set<String>> dependencies,
                                             List<String> levelResources, int level) {
        if (level > 3) {
            return;
        }
        
        for (String resource : dependencies.get(id)) {
            levelResources.add(resource);
            generateDependencyTree(resource, dependencies, levelResources, level + 1);
        }
    }
}