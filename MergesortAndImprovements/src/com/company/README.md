# :octocat: Mergesort and Improvements
## Basic plan:
*    Divide array into two halves
*    Recursively sort each half
*    Merge two halves
## Running time:
*    Laptop executes 10^8 compares/second
*    Supercomputer executes 10^12 compares/second
## Proposition:
Mergesort uses at most NlgN compares and 6NlgN array accesses to sort any array of size N
## Proof sketch:
The number of compares C(N) and array acceses A(N) to mergesort an array of size N satisfy the recurrences:
> C(N) <= C([N/2])+C([N/2])+N for N>1, with C(1) = 0

> A(N) <= A([N/2])+A([N/2])+6N for N>1, with A(1) = 0

> Solve the recurrence when N is a power of 2 (results holds for all N)

> D(N) = 2D(N/2) + N, for N>1, with D(1) = 0
### Proposition:
If D(N) satisfies D(N) = 2D(N/2)+N for N>1, with D(1) = 0, then D(N) = NlgN.
### Pf1 (assuming N is a power of 2)
