package Builder;

/*
    Builder pattern encapsulates or hides the process of building a complex object and separates the representation of
    object and its construction.
    -part of creational design pattern
    - when we have too many arguments to send the constructor
    -when we don't want to send all patterns in initializing the object

    => Static Nested class which contains all arguments of outer class
    => Naming convention general followed by the class name with Builder
    => public constructor with all the required parameters
*/
class Aircraft{
    // Required Parameters
    //1. Engine, 2. Wheels,
    private String engine;
    private int wheels;

    // Optional Parameters
    // 3. Food Service
    private boolean isFoodServiceAvailable;
    public static class AircraftBuilder{
        private String engine;
        private int wheels;
        private boolean isFoodServiceAvailable;

        public AircraftBuilder(String engine, int wheels) {
            this.engine = engine;
            this.wheels = wheels;
        }

        public AircraftBuilder setFoodServiceAvailable(boolean isFoodServiceAvailable){
            this.isFoodServiceAvailable = isFoodServiceAvailable;
            return this;
        }

        public Aircraft build(){
            return new Aircraft(this);
        }

    }

    public Aircraft(AircraftBuilder aircraftBuilder) {
        this.engine = aircraftBuilder.engine;
        this.wheels = aircraftBuilder.wheels;
        this.isFoodServiceAvailable = aircraftBuilder.isFoodServiceAvailable;

    }

    // Constructors


    // Getters
    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isFoodServiceAvailable() {
        return isFoodServiceAvailable;
    }
    @Override
    public String toString(){
        return "Engine: "+this.engine+","+
                " Wheels: "+this.wheels+","+
                (this.isFoodServiceAvailable==true ? " Food Available": " Food NOT Available");
    }
}


class BuilderImplementationClient{
    public static void main(String[] args) {
        // without food Service
        Aircraft f16 = new Aircraft.AircraftBuilder("Single Engine",3).build();
        System.out.println(f16);

        // with food Service
        Aircraft boeing = new Aircraft.AircraftBuilder("Dual Engine",8).setFoodServiceAvailable(true).build();
        System.out.println(boeing);

    }
}
