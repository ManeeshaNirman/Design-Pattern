package model;

public class LoginDataFilter extends ServletFilter{

    @Override
    public void filter(Request request) {

        String text= request.parameter;

        if(text.contains("username=abc") && text.contains("password=123")){
            System.out.println("Login Success....");


        }else{
            System.out.println("Invalid Username and password.....");
        }

    }

}
