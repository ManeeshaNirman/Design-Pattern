public class Register {

    public static void main(String[] args) {
        Vehicle.Builder builder=new Vehicle.Builder("CAQ-4982","983260071V",0766250072,"Petrol","Car","LKK23333WE455");
        Vehicle vehicle= builder.build();
        System.out.println(vehicle);
        builder.setEmail("Maneesha@gmail.com");
        Vehicle vehicle1= builder.build();
        System.out.println(vehicle1);
    }

}
