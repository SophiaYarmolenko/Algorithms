# :sunglasses: Union-Find
---
algorithm | worst-case time
--------- | ---------------
quick find | MN
quick union | MN
weighted QU | N + MlogN
QU + path compression | N + MlogN
weighted QU + path compression | N + Mlg^*N

---
## Quick Find
### Interpretation:
p and q are connected iff (if and only if) they have the same id
### Find:
Check if p and q have the same id.
### Union:
To merge components containing p and q, change all entries whose id equals id[p] to id[q]
### Defect
*    Too expensive union => too slow for huge problem
*    Trees are flat, but too expensive to keep them flat
---
## Quick - union
### Interpretation:
*    Root of i is id[[...id[i]...]]
*    p and q are connected iff they have the same root
### Find:
Check if p and q have the same root id.
### Union:
To merge components containing p and q, set the id of p's root to the id of q's root
### Defect
*    Trees can get tall
*    Find too expensive(could be N array accesses)
---
## Quick - union Improvements
### Weighted quick-union improvement
*    Modify quick-union to avoid tall trees.
*    Keep track of size of each tree (number of objects)
*    Balance by linking root of smaller tree to root of larger tree
#### Union:
Modify quick-union to:
*    Link root of smaller tree to root of larger tree.
*    Update the size array.
#### Running time:
*    Find: takes time proportional to depth of p and q.
*    Union: takes constant time, given roots
### Path compression improvement 
>Just after computing the root of p, set the id of each examined node to point to that root
#### Two-pass implementation: 
Add second loop to root() to set the id[] of each examined node to the root
#### Simple one-pass variant:
Make every other node in path point to its grandparent (thereby halving path length)
