# :crown: Quick sort, 3-way quick sort, Selection problem
## Quick sort
### Basic plan:
*    Shuffle the array
*    Partition so that for some j
     -    entry a[j] is in place
     -    no targer entry to the left of j
     -    no smaller entry to the right of j
*    Sort each piece recursively
### Phase 1:
Repeat until i and j pointers cross:
*    Scan i from left to right so long as (a[i] < a[lo])
*    Scan j from right to left so long as (a[j] > a[lo])
*    Exchange a[i] with a[j]
### Phase 2:
When pointers cross: exchange a[lo] with a[j]
### Preserving randomness:
Shuffling is needed for performance quarantee.
### Equal keys:
When duplicates are present, it is (counter-intuitively) better to stop on keys equal to the partitioning item's key
### Best case: 
Number of compares is ~NlgN
### Worst case:
Number of compares is ~N^2/2
### Average-case analysis:
#### Proposition:
The average number of compares Cn to quick sort an array of N distinct keys is ~ 2NlnN (and the number of exchanges is  ~NlnN/3)
#### Worst case:
Number of compares is quadratic:
*    N + (N-1) + (N-2) + ... + 1 ~ N^2/2
#### Average case:
Number of compares is ~ 1.39NlgN:
*    39% more compares than mergesort
*    But faster than mergesort in practice because of less data movement
### Reason for random shuffle:
*    Probabilistic guarantee against worst case.
*    Basis for math model that can be validated with experiments
### Proposition
Quick sort is an in-place sorting algorithm and is not stable
#### Proof:
*    Partitioning: constant extra space
*    Depth of recursion: logarithmic extra space (with high probability)

---
## Improvements:
### First:
*    Insertion sort small subarrays
*    Even quicksort has too much overhead for tiny subarrays
*    Cutoff to insertion sort for ~ 10 items
*    Note: could delay insertion sort until one pass at end
### Second:
Use median of sample:
*    Best choice of pivot item = median
*    Estimate true median by taking median of sample
*    Median-of-3 (random) items

---
## Selection problem
### Goal:
Given an array of N items, find the k-th largest
### Partition array so that:
*    Entry a[j] is in place
*    No targer entry to the left of j
*    No smaller entry to the right of j
*    Repeat in one subarray, depending on j; finished when j equals k
### Proposition:
Quick-select takes linear time on average.
