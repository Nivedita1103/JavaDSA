import java.util.Scanner;

public class msol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Number of binary numbers
        int numberOfBits = scanner.nextInt(); // Number of bits in each binary number
        int maxOperationsAllowed = scanner.nextInt(); // Maximum operations allowed

        int[] binaryNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            binaryNumbers[i] = Integer.parseInt(scanner.next(), 2); // Read binary numbers and convert to decimal
        }

        int maxSum = maximizeSum(binaryNumbers, numberOfBits, maxOperationsAllowed);
        System.out.println(Integer.toBinaryString(maxSum)); // Convert decimal answer to binary and print
    }

    public static int maximizeSum(int[] binaryNumbers, int numberOfBits, int maxOperationsAllowed) {
        int[] oneCount = new int[numberOfBits]; // Count of 1s in each bit position
        
        for (int num : binaryNumbers) {
            for (int i = 0; i < numberOfBits; i++) {
                if ((num & (1 << i)) != 0) {
                    oneCount[i]++;
                }
            }
        }

        int totalSum = 0;
        int bitValue = 1 << (numberOfBits - 1);
        int operationsLeft = maxOperationsAllowed;

        for (int i = 0; i < numberOfBits; i++) {
            int flippedSum = totalSum + bitValue * (binaryNumbers.length - oneCount[i]) +
                             (1 << i) * oneCount[i];
            int unchangedSum = totalSum + bitValue * oneCount[i] +
                               (1 << i) * (binaryNumbers.length - oneCount[i]);

            if (operationsLeft > 0) {
                totalSum = Math.max(flippedSum, unchangedSum);
                operationsLeft--;
            } else {
                totalSum = unchangedSum;
            }

            bitValue >>= 1;
        }

        return totalSum;
    }
}

