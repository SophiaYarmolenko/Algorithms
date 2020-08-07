# :heartpulse: Mergesort and Improvements, Bottom-up mergesort
---
### Basic plan:
*    Divide array into two halves
*    Recursively sort each half
*    Merge two halves
### Running time:
*    Laptop executes 10^8 compares/second
*    Supercomputer executes 10^12 compares/second
### Proposition:
Mergesort uses at most NlgN compares and 6NlgN array accesses to sort any array of size N
### Proof sketch:
The number of compares C(N) and array acceses A(N) to mergesort an array of size N satisfy the recurrences:
> C(N) <= C([N/2])+C([N/2])+N for N>1, with C(1) = 0

> A(N) <= A([N/2])+A([N/2])+6N for N>1, with A(1) = 0

> Solve the recurrence when N is a power of 2 (results holds for all N)

> D(N) = 2D(N/2) + N, for N>1, with D(1) = 0
### Proposition:
If D(N) satisfies D(N) = 2D(N/2)+N for N>1, with D(1) = 0, then D(N) = NlgN.
### Pf1 (assuming N is a power of 2)
![Mergsort recursion tree](https://qph.fs.quoracdn.net/main-qimg-407420a69a5e2cf7d8432831320a9742.webp)
### Proposition:
Mergesort uses extra space proportional to N.
### Pf:
The array aux[] needs to be of size N for the last merge

---
## Practical Improvements
### First improvement:
Use insertion sort for small subarrays:
*    Mergesort has too much overhead for tiny  subarrays.
*    Cutoff to insertion sort for ~7 items.
### Second improvement:
Compare last element in the first array and first element on the second array before merge. If last<first => do nothing.
### Third improvement:
Eliminate the copy to the auxiliary array: Save time(but not space) by switching the role of the input and auxiliary array in each recursive call

---
## Bottom-up mergesort
### Basic plan:
*    Pass through array, merging subarrays of size 1.
*    Repeat for subarrays of size 2, 4, 8, 16, ...
*    (No recursion needed)
