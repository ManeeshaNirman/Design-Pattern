package model;

public class SendRequest {

    public static void main(String[] args) {
        ServletFilter filter=new UrlFilter();
        ServletFilter filter1=new ParameterFilter();
        ServletFilter filter2=new LoginDataFilter();

        Request request=new Request("www.virtusa.com/a.jsp", "www.abc.com/a.jsp?username=abc & password=123");

        filter.nextFilter(filter1);
        filter1.nextFilter(filter2);

        filter.filter(request);

        System.out.println("--------------------------------------------------------------------------------------");
        Request request1=new Request("www.virtusa.com/a", "www.abc.com/a.jsp?username=abc & password=123");


        filter.nextFilter(filter1);
        filter1.nextFilter(filter2);

        filter.filter(request1);
    }

}








