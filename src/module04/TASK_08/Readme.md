# Questions.

> **1\. What collection implementations, besides queues, 
>  the java.util.concurrent provides for use in multithreaded contexts?**
>
> Answer:
>
> ConcurrentHashMap, ConcurrentSkipListMap, ConcurrentSkipListSet, CopyOnWriteArrayList, and CopyOnWriteArraySet.

> **2\. What do all change operations (add, set, remove) lead to in CopyOnWrite collections?**
>
> Answer:
>
> Performing a write operation in CopyOnWrite collections creates a new copy of the object.

> **3\. Which collection from the java.util.concurrent is analogous to TreeMap with multithreading support?**
>
> Answer:
>
> ConcurrentSkipListMap.

> **4\. When is CopyOnWriteArrayList preferred over synchronized Array List?**
>
> Answer:
>
> When reads hugely outnumber writes or when the array is small (or writes are very infrequent)

> **5\. When is it preferable to use "concurrent" versions of collections, and when are unsynchronized collections, 
> and when are "Synchronized" classes?**
>
> Answer:
>
> A concurrent collection is thread-safe, but not governed by a single exclusion lock.
> "Synchronized" classes can be useful when you need to prevent all access to a collection via a single lock, 
> at the expense of poorer scalability. 
> In other cases in which multiple threads are expected to access a common collection, 
> "concurrent" versions are normally preferable. 
> And unsynchronized collections are preferable when either collections are unshared, 
> or are accessible only when holding other locks.