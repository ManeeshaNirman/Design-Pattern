package model;

public class UnlimitedPackage implements Package{

    private String name="Unlimited";
    private int price=325;
    private String anytimeData="4GB";
    private String nighttimeData="6GB";
    private String dtodcall="Unlimited";
    private String dtoocall="100 min";



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
