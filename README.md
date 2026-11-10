Project README
1. Recursive Multithreaded Subset Sum Algorithm and Thread Synchronization
   Overview
   The project implements a recursive multithreaded version of the subset sum problem, where we determine if there exists a subset within an array that sums up to a given target value. The algorithm leverages Java's concurrency features to improve performance by parallelizing the search space.

Thread Synchronization
Thread synchronization is handled using synchronized blocks and wait(), notifyAll() methods to ensure mutual exclusion during critical sections of the code. Each thread works on a portion of the array, and communication between threads is managed to avoid race conditions and deadlocks.

2. Data Structure Refactoring to ArrayList
   Overview
   The original implementation used a different data structure for storing subsets, which was refactored to use ArrayList<Integer> for better flexibility and ease of manipulation.

Changes Made
Replaced the old data structure with ArrayList<Integer>.
Updated all references in the code to ensure compatibility with the new data structure.
3. Code Documentation with Javadoc
   Overview
   Javadoc comments have been added throughout the codebase to document classes, methods, and other components. This ensures that other developers can easily understand the purpose and usage of each part of the code.

Example Javadoc Comments

Apply
/**
* Finds a subset of the given array that sums up to the target value.
*
* @param array The input array containing integers.
* @param target The target sum for the subset.
* @return true if a subset with the target sum exists, false otherwise.
  */
  public boolean findSubsetSum(int[] array, int target) {
  // Method implementation
  }
4. Authors and Git Collaboration Roles
   Authors
   Author 1 - GitHub Profile
   Author 2 - GitHub Profile
   Git Collaboration Roles
   Author 1 - Primary developer, responsible for algorithm implementation.
   Author 2 - Code reviewer and documentation writer.
5. Licensing under 'Braude College Academic License'
   Overview
   This project is licensed under the Braude College Academic License. Please refer to the LICENSE file in the repository for more details on the terms and conditions of use.

