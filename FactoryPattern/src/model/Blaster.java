package model;

public class Blaster implements Package{

    private String name="Blaster";
    private int price=2500;
    private String anytimeData="30GB";
    private String nighttimeData="30GB";
    private String dtodcall="Unlimited";
    private String dtoocall="1000 min";



    @Override
    public void activePackage() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "You have Successfully Activated "+name +" "+"package for" +
                " Rs=" + price +
                ", with Anytime Data='" + anytimeData + '\'' +
                ", Night TimeData='" + nighttimeData + '\'' +
                ", Dialog to Dialog call='" + dtodcall + '\'' +
                ", Dialog to Other call='" + dtoocall + '\'';
    }

}
