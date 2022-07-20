package model;

public class UrlFilter extends ServletFilter{

    @Override
    public void filter(Request request) {

        String text= request.url;

        if(text.contains(".jsp")){
            System.out.println("URL Validated....");

            this.filter.filter(request);

        }else{
            System.out.println("invalid URL....");
        }

    }

}
