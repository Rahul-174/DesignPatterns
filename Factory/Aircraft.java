package Factory;

abstract class Aircraft {
    public abstract  String getEngine();

    @Override
    public String toString() {
        return "Engine"+this.getEngine();
    }

    public void fly() {
        System.out.println("Aircraft Flying");
    }

    public abstract void engineFail();
}

class Boeing extends  Aircraft{
    String engine;

    Boeing(String engine){
        this.engine = engine;
    }
    @Override
    public String getEngine() {
        return engine;
    }
    public void fly(){
        System.out.println("Boeing Flying");
    }

    @Override
    public void engineFail() {
        System.out.println("Boeing Engine Failed");
    }
}

class F16 extends  Aircraft{
    String engine;

    F16(String engine){
        this.engine = engine;
    }
    @Override
    public String getEngine() {
        return engine;
    }
    public void fly(){
        System.out.println("F16 Flying");
    }

    @Override
    public void engineFail() {
        System.out.println("F16 Engine Failed");
    }
}
class Cesna extends  Aircraft{
    String engine;

    Cesna(String engine){
        this.engine = engine;
    }
    @Override
    public String getEngine() {
        return engine;
    }
    public void fly(){
        System.out.println("Cesna Flying");
    }

    @Override
    public void engineFail() {
        System.out.println("F16 Engine Failed");
    }
}

class AircraftFactory{
    public static Aircraft getInstance(String type, String engine){
        switch(type) {
            case "Boeing":
                return new Boeing(engine);
            // code block

            case "F16":
                return new F16(engine);
            // code block

            case "Cesna":
                return new Cesna(engine);
            // code block
            default:
                return null;
            // code block
        }
    }
}



class FactoryImplementation{

    public static void main(String[] args) {
        // we add or update class name we need to change in AircraftFactory and the functionality of FactoryImplementation
        // will remain same
        Aircraft boeing = AircraftFactory.getInstance("Boeing","-123 For Boeing");
        boeing.fly();// public funx
        boeing.engineFail();// abstract fnx
        System.out.println(boeing); // toString already declare in SuperClass
        System.out.println();
        Aircraft cesna = AircraftFactory.getInstance("Cesna","-456 For Cesna");
        cesna.fly();// public funx
        cesna.engineFail();// abstract fnx
        System.out.println(cesna);// toString already declare in SuperClass
        System.out.println();
        Aircraft f16 = AircraftFactory.getInstance("F16","-789 for F16");
        f16.fly(); // public funx
        f16.engineFail(); // abstract fnx
        System.out.println(f16);// toString already declare in SuperClass

    }
}

// Class - Blue yonder

// Subclass
// 1. CommerceNew
// 2. Logistics
// 3. Warehouse

// So between this create a Factory Class (Luminate Platform eg)
// Factor Class BlueYonderFactory

// Change from Commerce -> CommerceNew
// Implementations -> Client classes
// OMS {commerce, logistics, warehouse}
// OFS {commerce, logistics}
// TMS {warehouse, logistics}
// Changes made in subclasses will not affect the client classes
// since we have to make change in only Factory class