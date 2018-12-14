package proxy;

public class StaticCountProxy implements Count {

    private Count count;

    public StaticCountProxy(Count count) {
        this.count = count;
    }
    @Override
    public void queryCount() {
        System.out.println("Doing something before query count");
        count.queryCount();
        System.out.println("Doing something after query count");
    }

    @Override
    public void updateCount() {
        System.out.println("Doing something before update count");
        count.updateCount();
        System.out.println("Doing something after update count");
    }
}
