package Singleton;


/*
    To create Any Singleton We need :
       1. static member -> to create instance
       2. private constructor
       3. static factory method
*/


//EARLY INSTANCE
public class AircraftEager {
    /*
     public static AircraftEager instance = new AircraftEager();   // BECAUSE =>
         1. So that instance created at load time
         2. private member -> no Outside class can access it to create instance
         3. static -> Inside AircraftEager class you don't want any kind of new instance be loaded
     */
    public static AircraftEager instance = new AircraftEager(); //this instance will not be accessible outside the class

    private AircraftEager(){} //private constructor

    public static AircraftEager getInstance(){
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft");
    }


}

//LAZY INSTANCE


class Client{
    public static void main(String[] args) {

        AircraftEager instance1 = AircraftEager.getInstance();
        instance1.fly();

        AircraftEager instance2 = AircraftEager.getInstance();
        instance2.fly();
    }
}

/*
 Session :
    Gmail
     => Gmail arjunUser = new Gmail()
     => arjunUser.login() => Typed is Password, Username
     Sessions[ Expiry time[ 1Day ] for Instance closed ] => they keep a track of Instance Creation
     Arjun got logged in @15th sep 9:00 => saves session time in memory
     For more than a day session time get expired and whenever I try a new Instance would be created
     It tries to access the old instance
     Closed Browser
     => Gmail  michealUser = new Gmail
     Cache => Stores UserName, Debit Card Details

 */
