package objectsAndClasses;

public class Car {
    private int yearModel;
    private String make;
    private int speed;

    public Car(int model, String make) {
        yearModel = model;
        this.make = make;
        speed = 0;
    }

    public int getYearModel(){
        return yearModel;
    }
    public String getMake(){
        return make;
    }
    public int getSpeed(){
        return speed;
    }
    public void setYearModel(int yearModel){
        this.yearModel = yearModel;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void accelerate(){
        this.speed += 5;
    }
    public void brake(){
        this.speed -= 5;
    }
}
