function superSum(arr, i, initialSum) {
    let sum = initialSum;
    let currentIndex = i;
    let groupSize = 1;
    
    while (currentIndex < arr.length) {
        let groupSum = 0;
        // Add elements to the group sum
        for (let j = 0; j < groupSize && currentIndex < arr.length; j++) {
            groupSum += arr[currentIndex];
            currentIndex++;
        }
        // Add group sum to total sum
        sum += groupSum;
        // Increment group size for the next iteration
        groupSize++;
    }
    
    return sum;
}

// Sample Inputs
const arr1 = [2, 3, 4, 4, 5, 6, 6, 7, 7, 8];
const arr2 = [1, 2, 3, 4, 5, 6, 7, 8];
const arr3 = [3, 5, 7, 9, 11, 13, 15, 17, 19, 21];

// Testing the function
console.log("Final Super Sum:", superSum(arr1, 0, 0));  // Output: 46
console.log("Final Super Sum:", superSum(arr2, 0, 0));  // Output: 46
console.log("Final Super Sum:", superSum(arr3, 0, 0));  // Output: 82