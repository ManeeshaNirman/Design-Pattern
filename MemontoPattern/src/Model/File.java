package Model;

public class File {

    private String content;
    CareTaker careTaker=new CareTaker();

    public File(String content) {

        this.content = content;
    }

    public void setFileData(String content) {
        this.content = content;

    }



    public String getContent() {
        return content;
    }





    public void save() {
        System.out.println(content);
        careTaker.addMemento(new Memento(content));

    }

    public void undo() {

        try {
            this.content=careTaker.getMemento().getContent();
        }catch (NullPointerException exception){

            System.out.println("Cannot Undo!");
        }


    }

    public int getSize(){
         return careTaker.size();
    }

}
