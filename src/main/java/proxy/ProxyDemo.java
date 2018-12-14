package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Count count = new CountImpl();
        StaticCountProxy staticCountProxy = new StaticCountProxy(count);
        staticCountProxy.queryCount();
        staticCountProxy.updateCount();


        System.out.println("=================================================");


        BookFacade bookFacade = new BookFacadeImpl();
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookFacade1 = (BookFacade) proxy.bind(bookFacade);

        bookFacade1.addBook();

        bookFacade1.openBook();

        bookFacade1.turnPage();


        System.out.println("=================================================");

        BookFacadeCglibProxy proxy1 = new BookFacadeCglibProxy();
        BookFacade bookFacade2 = (BookFacade) proxy1.getInstance(bookFacade);

        bookFacade2.turnPage();

        bookFacade2.openBook();

        bookFacade2.addBook();


    }
}
