# Questions.

> **1\. How do you understand why we use Generics?**
>
> Answer:
> 
> Generics allow us to abstract over types (as a result, we get a reduction in the amount of code) 
> and providing compile-time type safety.

> **2\. What is wildcards?**
>
> Answer:
> 
> The wildcard "?" is a special type parameter that controls the type safety of the use of 
> generic (parameterized) types.

> **3\. Name the types of bounded wildcards and explain the difference between them.**
>
> Answer:
> 
> Types of bounded wildcards: upper bound (extends) and lower bound (super).
>
> In upper bound wildcards types must be T or sub-class of T (<? extends T>)
>
> In lower bound wildcards types must be T or the super class of T (<? super T>)

