# Questions.

> **1\. What is Comparable?**
>
> Answer:
> 
> Comparable is an interface that imposes a total ordering on the objects of each class 
> that implements it.

> **2\. What is Comparator?**
>
> Answer:
> 
> Comparator is a comparison function, which imposes a total ordering on some collection 
> of objects

> **3\. What the compare () and compareTo () methods return. How it works?**
>
> Answer:
> 
> Compare () and compareTo () methods return positive number if the first object is greater than the second, 
> negative number if the first object is less than the second, 
> zero if the objects are equal.

> **4\. When is a comparator preferred?**
>
> Answer:
> 
> A comparator preferred when it is necessary to implement several sorting algorithms for one type of objects.

> **5\. Can comparator be used when Comparable is already implemented?**
>
> Answer:
> 
> Yes.

> **6\. What does the method for sorting the collection look like?**
>
> Answer:
> 
> Collections.sort() method call's sort method of List. 
> List.sort() method converts List to Array and sort elements with Arrays.sort() method.

> **7\. Do I need to implement Comparable for strings and numbers? Why?**
>
> Answer:
> 
> No, because they already have a compareTo() method implementation's.