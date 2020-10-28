# Questions.

> **1\. What is Set?**
>
> Answer:
> 
> Set is an interface for a collection that contains no duplicate elements.

> **2\. What is the difference between HashSet, LinkedHashSet and TreeSet?**
>
> Answer:
> 
> In a HashSet, the order of the elements is not guaranteed. In TreeSet elements are ordered 
> using their natural ordering, or by a Comparator provided at set creation time. 
> In a LinkedHashSet, items are stored in the order in which they were added.

> **3\. What is HashSet based on?**
>
> Answer:
> 
> HashSet based on HashMap.

> **4\. What is a red-black tree?**
>
> Answer:
> 
> ![red-black tree](img/RBTreeExample.png)
> A red-black tree is a special type of binary tree. Each piece of data is stored in a node. 
> One of the nodes always functions as our starting place, and is not the child of any node; 
> we call this the root node or root. It has up to two "children", other nodes to which it connects. 
> Each of these children can have children of its own, and so on. 
> The root node thus has a path connecting it to any other node in the tree.

> **5\. How do I get a read-only Set collection?**
>
> Answer:
> 
> Collections.unmodifiableCollection() method can be used.