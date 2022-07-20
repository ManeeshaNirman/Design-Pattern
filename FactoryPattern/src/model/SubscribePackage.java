package model;

public class SubscribePackage {

    public static void main(String[] args) {

        Package customer1=PackageActivator.subscribePackage("Unlimited");
        System.out.println(customer1);

        System.out.println("---------------------------------------------------------");

        Package customer2=PackageActivator.subscribePackage("Blaster");
        System.out.println(customer2);

        System.out.println("---------------------------------------------------------");

        Package customer3=PackageActivator.subscribePackage("Golden");
        System.out.println(customer3);
    }

}
