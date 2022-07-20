package model;

public class User {

    public static void main(String[] args) {

     LicenseGenerator generator=LicenseGenerator.generateKey();
     String key=generator.getLicenseKey();
        System.out.println(key);
        LicenseGenerator generator1=LicenseGenerator.generateKey();
        String key1=generator1.getLicenseKey();
        System.out.println(key1);

    }

}
