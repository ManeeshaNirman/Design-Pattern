public class Vehicle {

    private final String number;
    private final String nic;
    private final String email;
    private final int mobile;
    private final String fuelType;
    private final String vehicleType;
    private final String chasisNumber;



    public Vehicle(Builder builder) {
        this.number = builder.number;
        this.nic = builder.nic;
        this.email = builder.email;
        this.mobile = builder.mobile;
        this.fuelType = builder.fuelType;
        this.vehicleType = builder.vehicleType;
        this.chasisNumber = builder.chasisNumber;
    }

    public String getNumber() {
        return number;
    }

    public String getNic() {
        return nic;
    }

    public String getEmail() {
        return email;
    }

    public int getMobile() {
        return mobile;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getChasisNumber() {
        return chasisNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "number='" + number + '\'' +
                ", nic='" + nic + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", fuelType='" + fuelType + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", chasisNumber='" + chasisNumber + '\'' +
                '}';
    }

    static class Builder{

        private  String number;
        private String nic;
        private  String email;
        private  int mobile;
        private  String fuelType;
        private  String vehicleType;
        private  String chasisNumber;

        public Vehicle build(){
            Vehicle user=new Vehicle(this);
            return user;

        }

        public Builder(String number, String nic, int mobile, String fuelType, String vehicleType, String chasisNumber) {
            this.number = number;
            this.nic = nic;
            this.mobile = mobile;
            this.fuelType = fuelType;
            this.vehicleType = vehicleType;
            this.chasisNumber = chasisNumber;
        }



        public void setNic(String nic) {
            this.nic = nic;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setMobile(int mobile) {
            this.mobile = mobile;
        }

        public void setFuelType(String fuelType) {
            this.fuelType = fuelType;
        }



        public void setChasisNumber(String chasisNumber) {
            this.chasisNumber = chasisNumber;
        }
    }

}
