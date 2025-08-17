Problem :
Find the Duplicate Number
You are given an array arr containing n+1 integers, where each integer is in the range [1, n] inclusive. 
There is exactly one duplicate number in the array, but it may appear more than once. 
Your task is to find the duplicate number without modifying the array and using constant extra space.

Input :
An integer array arr of size n+1, where each element is an integer in the range [1, n].
Example: arr = [3, 1, 3, 4, 2]

Output :
Return the duplicate integer present in the array.
Example: Duplicate number: 3

I first tried to understand the problem and noticed that there could be a loop forming if I imagined the array as a linked list.
Then, after some searching, I came across Floyd’s algorithm.
So to solve this problem, I first learned Floyd’s cycle detection algorithm.
And in order to understand it clearly, I used the tortoise and hare analogy, where tortoise = slow pointer and hare = fast pointer
Then assigned two pointers, slow and fast. 
Slow moves by taking one step, while fast moves by taking two steps. Then they both meet at some point inside the cycle.
Then fast goes back to the start, now both fast and slow moves by taking one step, where slow starts from their first meet and fast from the start.
Then, where they meet again is the duplicate number

