Questions.

    What is the parent class of all classes?
    Answer: Object 
    
    How do I call the constructor of the parent class?
    Answer: super(); 
    
    Will the parent class constructor be called automatically?
    Answer: yes, if it has no arguments
    
    Will the parent class constructor be automatically called with arguments?
    Answer: no
    
    Can interface type be used for polymorphism?
    Answer: yes

There are the following classes:

class A {

}

class B extends A {

}

class C extends B {

}

    Is it possible to do this?
    Answer: no

B b = new A();

    Is it possible to do this?
    Answer: yes

B b = new B();

    Is it possible to do this?
    Answer: yes

B b = new C();

    Is it possible to do this?
    Answer: yes

Object obj = new A();
Object obj1 = new B();
Object obj2 = new C();