# :rocket: Implementation of Priority Queue and HeapSort using BinaryHeap
## Binary Heap
>Binary tree - empty or node with links to left and right binary trees
>>Complete binary tree - perfect balanced, except for bottom level
### Property:
*    Height of complete tree with N nodes is [logN]
*    Height only increases when N is a power of 2
### Heap-ordered binary tree:
*    Keys in nodes
*    Parent\`s key no smaller than children\`s
*    Largest key is a[1], which is root of binary tree
*    Parent of node at k is at k/2
*    Children of node at k are at 2k and 2k+1
### Promotion in a heap
#### Situation:
Child\'s key becomes larger than its parent\`s key 

#### Elimination:
1.    Exchange key in child with key in parent
2.    Repeat until heap order restored
>Function `swim()`
### Insertion in a heap:
*    Add node to the end, then swim it up
*    Cost: At most 1+lnN compares
### Demotion in a heap
#### Situation:
Parent\'s key becomes smaller than one(or both) of its children\'s 
#### Elimination:
1.    Exchange key in parent with key in larger child
2.    Repeat until heap order restored
>Function `sink()`
### Delete the maximum in a heap
#### Idea: exchange root with node at end, than sink it down
#### Cost: 2lnN
---
## Priority Queue
>Priority queue - remove the largest (or smallest) item. Generic items in collections should be comparable.

### Functionality:
*    `MaxPQ()`
>create an empty PQ
*    `void insert()`
>insert a key into the pq
*    `Key delMax()`
>return and remove the largest key
*    `boolean isEmpty()`
>is the priority queue empty?
*    `Key max()`
>return the largest key
*    `int size()`
>number of entries in the pq
---
## Heapsort
### Basic plan:
*    Create max-heap with all N keys
*    Repeatedly remove the maximum key.
### Construction:
*    Build heap using bottom-up method 
*    Remove the maximum, one at a time.
*    Leave in array, instead of nulling out.
