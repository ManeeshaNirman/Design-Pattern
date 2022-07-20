public class Car implements ProtoType {

    private String model;
    private String color;
    private String fuelType;
    private boolean is4wd;
    private boolean allowWheels;
    private boolean selfControl;

    public Car(String model, String color, String fuelType, boolean is4wd, boolean allowWheels, boolean selfControl) {
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.is4wd = is4wd;
        this.allowWheels = allowWheels;
        this.selfControl = selfControl;
    }

    @Override
    public Car clone() {

        Car car=new Car(this.model,this.color,this.fuelType,this.is4wd,this.allowWheels,this.selfControl);

        return car;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    public void setAllowWheels(boolean allowWheels) {
        this.allowWheels = allowWheels;
    }

    public void setSelfControl(boolean selfControl) {
        this.selfControl = selfControl;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", is4wd=" + is4wd +
                ", allowWheels=" + allowWheels +
                ", selfControl=" + selfControl +
                '}';
    }
}
