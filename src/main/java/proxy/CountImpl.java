package proxy;

public class CountImpl implements Count {
    @Override
    public void queryCount() {
        System.out.println("query Count");
    }

    @Override
    public void updateCount() {
        System.out.println("update Count");
    }
}
