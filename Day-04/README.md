Problem :
Merge Two Sorted Arrays
You are given two sorted arrays, arr1 of size m and arr2 of size n. 
Your task is to merge these two arrays into a single sorted array without using any extra space (i.e., in-place merging).
The elements in arr1 should be merged first, followed by the elements of arr2, resulting in both arrays being sorted after the merge.

Input :
Two sorted integer arrays, arr1 of size m and arr2 of size n.
Example : 
arr1 = [1, 3, 6, 7]
arr2 = [2, 4, 5, 8]

Output :
Both arr1 and arr2 should be sorted after the merge.
Since you cannot use extra space, the final result will be reflected in arr1 and arr2.
Example:
arr1 = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8]

According to the question, we have to take 2 sorted arrays as input and then merge them without creating a third array, 
so the elements in arr1 should be less than arr2.
to achieve this we first compare elements of arr1 and arr2, and when arr1 > arr2 we swap the values. 
After swapping, we sort arr2 because, for example,  when we swap a number 6 from arr1 with 3 from arr2, 
arr1 becomes [ 1, 2, 3, 7] while arr2 becomes [6, 4, 5, 8]
which is not sorted anymore, so we sort it. By sorting it again, it becomes [4, 5, 6, 8]
And finally, when both arrays are sorted, we will get the arrays arr1 = [1, 2, 3, 4]
arr2 = [5, 6, 7, 8]
