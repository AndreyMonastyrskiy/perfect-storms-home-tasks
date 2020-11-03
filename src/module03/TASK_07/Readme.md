# Questions.

> **1\. What is SOLID for?**
>
> Answer:
> 
> SOLID is a set of principles that make it possible to develop easily maintainable, extensible and reliable software.

> **2\. What is the Single Responsibility Principle?**
>
> Answer:
> 
> One class should have only one responsibility, fully encapsulated within that class. 
> At the same time, changes made to this class should not affect other classes.

> **3\. What is the Open Closed Principle?**
>
> Answer:
> 
> Software entities (classes, modules, functions) must be open for extension, but not for modification.
> The system should be flexible, with the ability to work in variable conditions without changing the source code.

> **4\. What is the Liskov’s Substitution Principle?**
>
> Answer:
> 
> A class designed by extending from a base class must override its methods so that functionality 
> is not compromised from the client's point of view. 
> That is, if a developer extends your class and uses it in an application, 
> they should not change the expected behavior of overridden methods.
> The purpose of this principle is that derived classes can be used instead of the parent classes 
> from which they are derived without disrupting the program.

> **5\. What is the Interface Segregation Principle?**
>
> Answer:
> 
> Large interfaces need to be divided into smaller and specific ones so that clients of 
> small interfaces only know about the methods they need to work with. 
> As a result, changing the interface method should not change clients that do not use this method.

> **6\. What is the Dependency Inversion Principle?**
>
> Answer:
> 
> Software must be designed so that the various modules are self-contained 
> and connected to each other using abstraction.

> **7\. Do you have to follow the principles of SOLID?**
>
> Answer:
> 
> It is advisable to follow the principles of SOLID.