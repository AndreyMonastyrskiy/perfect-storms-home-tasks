# Questions.

> **1\. How many ways to create threads do you know?**
>
> Answer:
> 
> Extending Thread class, Implementing Runnable interface, override method run of Thread class with a lambda.

> **2\. What does the word volatile allow you to do?**
>
> Answer:
> 
> The Java volatile keyword is used to mark a Java variable as "being stored in main memory, not in the cache". 
> This keyword guarantees visibility of changes to variables across threads.

> **3\. What is common and what is the difference between a mutex, a monitor and a semaphore?**
>
> Answer:
> 
> Mutex and a semaphore have the same mission: to synchronize access to some resource. 
> The only difference is that an object's mutex can be acquired by only one thread at a time, 
> while in the case of a semaphore, which uses a thread counter, several threads can access the resource simultaneously.
> A mutex is actually a semaphore with a count of 1. In other words, it's a semaphore that can accommodate a single thread. 
> It's also known as a "binary semaphore" because its counter can have only 2 values — 1 ("unlocked") and 0 ("locked").

>> **4\. What are the main problems in multithreading?**
 >
 > Answer:
 > 
 > The main problems in multithreading are: race conditions, deadlocks.