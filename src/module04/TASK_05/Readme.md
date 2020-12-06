# Questions.

> **1\. How do I make a field non-serializable?**
>
> Answer:
> 
> Mark it as transient.

> **2\. Can static fields be serialized?**
>
> Answer:
> 
> No.

> **3\. What methods does the Serializable interface have?**
>
> Answer:
> 
> There no methods.

> **4\. What methods does the Externalizable interface have?**
>
> Answer:
> 
> Externalizable have two methods: writeExternal, readExternal.

> **5\. What is the difference between Serializable and Externalizable interfaces?**
>
> Answer:
> 
> The Externalizable, unlike the Serializable, 
> requires you to implement your own serialization and deserialization logic

> **6\. WIf the parent implements the Serializable interface, then the child also implements?**
>
> Answer:
> 
> Yes