public class Intro {
    private String fName;
    private String age;

    public Intro(String fName, String age) {
        this.fName = fName;
        this.age = age;
    }

    public Intro(String fName) {
        this.fName = fName;
    }
}
/*

 Suggestions
     1. Parts of code are separated based on the code that may vary and the code remains same
     2. Always try to have interface implementations rather than a concrete implementation.

 Types of pattern:
 1. Creational => Creational design patterns are concerned with the way of creating objects.
                  These design patterns are used when a decision must be made at the time of instantiation of a class
                  (i.e. creating an object of a class).
                  Encapsulation of Object Creation [Builder, Prototype, Singleton, Abstract Factory]
 2. Structural => Composition of Classes. [Adapter, Bride, Composite, Decorator, Facade, etc.]
 3. Behavioural => How the interaction b/w classes and Object


 */