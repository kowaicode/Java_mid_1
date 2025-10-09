package nested.inner.ex1;

public class Car {
    
    private String model;
    private int chargeLevel;
    private Engine engine;

    // Car 객체가 생성될 때 Engine 객체도 함께 생성
    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine에서만 호출되는 메서드
    public String getModel() {
        return model;
    }

    // Engine에서만 호출되는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println(model + " 출발!");
    }
}
