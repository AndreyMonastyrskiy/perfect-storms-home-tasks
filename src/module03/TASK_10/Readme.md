# Questions.

> **1\. What is the Adapter pattern?**
>
> Answer:
> 
> Adapter is a structural design pattern, which allows objects with incompatible interfaces to collaborate.
> It catches calls for one object and transforms them to format and interface recognizable by the second object.
> Adapter is recognizable by a constructor which takes an instance of a different abstract/interface type. 
> When the adapter receives a call to any of its methods, 
> it translates parameters to the appropriate format 
> and then directs the call to one or several methods of the wrapped object.

> **2\. What is the difference between Adapter and Decorator?**
>
> Answer:
> 
> Unlike the Adapter pattern, which allows objects with incompatible interfaces to collaborate, 
> Decorator pattern allows attaching new behaviors to objects 
> by placing these objects inside special wrapper objects that contain the behaviors.

> **3\. When do we use the Composite pattern?**
>
> Answer:
> 
> We can use Composite pattern when is needed to implement a tree-like object structure.
> Composite pattern let us compose objects into tree structures 
> and then work with these structures as if they were individual objects.


> **4\. Give an example of the Facade pattern.**
>
> Answer:
> 
> Facade is a structural design pattern that provides a simplified interface to a library, 
> a framework, or any other complex set of classes. 
> For example, if we have separate classes that implement the logic of the operation of individual parts of the car, 
> then using the Facade pattern, we can create a class that will implement the logic 
> of the car ("simple" methods to start, drown, drive, etc.). 
> In this case, within the class that implements the Facade pattern, 
> methods of the classes that implement the logic of the operation of individual parts of the car will be used.
