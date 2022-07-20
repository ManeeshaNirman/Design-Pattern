public class ManufactureCar {

    public static void main(String[] args) {

        Car car1=new Car("A3","RED","Petrol",false,true,false);

        System.out.println(car1.toString());

        Car clonecar=car1.clone();
        System.out.println(clonecar);

        clonecar.setFuelType("Disel");
        clonecar.setColor("BLUE");
        clonecar.setIs4wd(true);
        clonecar.setSelfControl(true);
        System.out.println(clonecar);

        System.out.println(clonecar);



    }

}
