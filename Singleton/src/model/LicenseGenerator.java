package model;

import java.util.Random;

public class LicenseGenerator {

    private static volatile LicenseGenerator generator;
    private static String licenseKey;


    private LicenseGenerator(){

        if (generator!=null){

            throw new RuntimeException("License Key Already Generated!");
        }


        }


    public static LicenseGenerator generateKey(){

        if(generator==null){

            synchronized (LicenseGenerator.class){

                if (generator==null){

                    Random objGenerator = new Random();
                    for (int iCount = 0; iCount < 1; iCount++) {
                        int randomNumber = objGenerator.nextInt(1000000);
                        licenseKey = String.valueOf(randomNumber);
                    }

                    generator=new LicenseGenerator();

                }


            }


        }
  return generator;
    }

public String getLicenseKey(){

     if (licenseKey==null){

         synchronized (LicenseGenerator.class) {

             if (licenseKey==null) {

                 generator=generator.generateKey();
             }

         }

     }

return licenseKey;
}


}
