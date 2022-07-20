package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");

        File file=new File("File Name : Virtusa , Profile ,"+" File Edit Time : "+ dateFormat.format(new Date()));
        file.save();
        file.setFileData("File Name : A , Propile ,"+" File Edit Time : "+ dateFormat.format(new Date()));
        file.save();
        file.setFileData("File Name : A , Profilee ,"+" File Edit Time : "+ dateFormat.format(new Date()));

        file.save();
        file.undo();

        System.out.println("File Content: "+file.getContent());


        file.undo();

        System.out.println("File Content: "+file.getContent());

        file.undo();

        System.out.println("File Content: "+file.getContent());

        System.out.println(file.getSize());
    }

}
