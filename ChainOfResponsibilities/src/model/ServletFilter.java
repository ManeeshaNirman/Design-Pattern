package model;

public abstract class ServletFilter {

    protected ServletFilter filter;

    public void nextFilter(ServletFilter filter) {
        this.filter = filter;
    }

    public abstract void filter(Request request);


}
