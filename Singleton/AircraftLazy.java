package Singleton;


//Lazy Instantiation
public class AircraftLazy {
    /*
         1. So that instance created at load time
         2. private member -> no Outside class can access it to create instance
         3. static -> Inside AircraftEager class you don't want any kind of new instance be loaded
     */
    private static AircraftLazy instance;

    private AircraftLazy(){} //private constructor

    public static AircraftLazy getInstance(){
        if(instance==null){
            instance = new AircraftLazy();
        }
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft");
    }


}

class Client2{
    public static void main(String[] args) {

        AircraftLazy instance1 = AircraftLazy.getInstance();
        instance1.fly();

        AircraftLazy instance2 = AircraftLazy.getInstance();
        instance2.fly();
    }
}
