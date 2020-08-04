#  :sparkles: Algorithms
Different java and C++ algorithms 
## Sorting algorithms: summary
kind | inplace? | stable? | worst | average | best | remarks
---- | -------- | ------- | ----- | ------- | ---- | -------
selection | x |  | N^2/2 | N^2/2 | N^2/2 | N exchanges
insertion | x | x | N^2/2 | N^2/4 | N | use for small N or partially ordered
shell | x |  | ? | ? | N | tight code, subquadretic
quick | x |  | N^2/2 | 2NlnN | NlgN | NlogN probabilistic guarantee fastest in practice
3-way quick | x |  | N^2/2 | 2NlnN | N | improves quicksort in presence of duplicate keys
merge |  | x | NlgN | NlgN | NlgN |NlgN | NlogN quarantee, stable
heap | x |  | 2NlgN | 2NlgN | NlgN | NlogN quarantee, in-place
??? | x | x | NlgN | NlgN | NlgN | holy sorting grail
## Using mergesort:
*    Java sort for objects
*    Perl, C++ stable sort, Python stable sort, firefox, JavaScript...
## Using Quick sort:
*    Java sort for primitive types
*    C qsort, Unix, Visual C++, Python, Matlab, Chrome JavaScript ...
