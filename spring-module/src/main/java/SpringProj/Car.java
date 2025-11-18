package SpringProj;

public class Car {
    private PetrolEngine engine;
    // tightly coupled to PetrolEngine
    public Car()
    {
        this.engine=new PetrolEngine();//dependency
    }
    public void drive()
    {
        System.out.println(engine.start());
        System.out.println("car is moving");
    }
}
