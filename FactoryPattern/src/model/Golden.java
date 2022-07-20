package model;

public class Golden implements Package{

    private String name="Golden";
    private int price=5300;
    private String anytimeData="900GB";
    private String nighttimeData="90GB";
    private String dtodcall="Unlimited";
    private String dtoocall="3000 min";



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
