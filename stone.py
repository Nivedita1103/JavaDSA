
def organize_stones(M, codes):
    n = len(codes)
    result = []

    min_price = float('inf')  # Initialize the minimum price as infinity

    for i in range(n):
        price = int(input())  # Read the price of the current stone
        min_price = min(min_price, price)  # Update the minimum price seen so far
        result.append(min_price)  # Add the minimum price to the result

    return result

# Read input
M = int(input())
codes = input()

# Call the function to organize stones and display values for the second board
result = organize_stones(M, codes)

# Print the result as a space-separated string
print(" ".join(map(str, result)))
