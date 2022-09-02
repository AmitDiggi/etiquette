import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheels;

    Car(){
        this.engine = new Engine();
        this.wheels = new ArrayList<>();
    }

    public boolean startCar(){
        System.out.println("Starting Car......");
        engine.startEngine();
        return true;
    }

    public void stopCar(){
        System.out.println("Stopping Car......");
        engine.stopEngine();
    }
}

