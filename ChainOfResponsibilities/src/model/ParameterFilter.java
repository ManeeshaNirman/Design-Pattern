package model;

public class ParameterFilter extends ServletFilter{

    @Override
    public void filter(Request request) {

        String text= request.parameter;

        if(text.contains("username") && text.contains("password")){
            System.out.println("Parameter Contains Correctly....");

            this.filter.filter(request);

        }else{
            System.out.println("Invalid parameters.....");
        }

    }

}
