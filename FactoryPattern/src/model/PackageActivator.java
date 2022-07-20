package model;

public class PackageActivator {

    public static Package subscribePackage(String packageName){

    switch (packageName){

        case "Unlimited":
            return new UnlimitedPackage();

        case "Blaster":
            return new Blaster();

        case "Golden":
            return new Golden();
        default:
            return null;
    }


    }

}
