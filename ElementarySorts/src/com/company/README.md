# Elementary sorts
---
## Selection sorts
### Idea: 
*    In iteration i, find index min of smallest remaining entry
*    Swap a[i] and a[min]
### Proposition:
Selection sort uses (N-1) + (N-2)+...+1+0 ~ N^2/2 compares and N exchanges. Quadratic time, even if input is sorted. Liner number of exchanges.

---
## Insertion sort
### Idea:
In iteration i, swap a[i] with each larger entry to its left.
### Proposition:
To sort a randomly ordered array with distinct keys, insertion sort uses ~ N^2/4 compares and N^2/4 exchanges on average.
#### Pf:
Expect each entry to move halfway back.
#### Best case:
If the array is in ascending order, insertion sort makes N-1 compares and 0 exchanges.
#### Worst case:
If the array is in descending order (and no duplicates) insertion sort makes ~ N^2/2 compares and ~ N^2/2 exchanges

---
## Shell sort
### Idea:
Move entries more than one position at a time by h-sorting the array.
### Why isertion sort?
*    Big increments => small subarray
*    Small increments => nearly in order 
### Worst-case:
Number of compares used by shell sort with the 3x+1 increments is at most by a small multiple of N times the # of increments used
### Cost:
Make linearithmic compares on an input array that is already sorted.

---
## Shuffling
### Idea:
*    Generate a random real number for each array entry.
*    Sort the array 
### Proposition:
Knuth shuffling algorithm produces a uniformly random permutation of the input array in linear time.
