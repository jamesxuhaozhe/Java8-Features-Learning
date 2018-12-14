package proxy;

public class BookFacadeImpl implements BookFacade {
    @Override
    public void openBook() {
        System.out.println("open book");
    }

    @Override
    public void addBook() {
        System.out.println("add book");
    }

    @Override
    public void turnPage() {
        System.out.println("turn page");
    }
}
