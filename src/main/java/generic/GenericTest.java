package generic;

public class GenericTest {

    public static class Generic<T> {
        private T key;

        public Generic(T key) {
            this.key = key;
        }

        public T getKey() {
            return key;
        }
    }

    public <T> T showKeyName(Generic<T> container) {
        T key = container.getKey();
        return key;
    }

    public void showKeyValue(Generic<Number> container) {
        System.out.println(container.getKey());
    }

    public void showKeyValue1(Generic<?> container) {
        System.out.println(container.getKey());
    }

    public void showkeyValue2(Generic<? extends Number> container) {
        System.out.println(container);
    }

    public <T extends Number> T showKeyValue3(Generic<T> container) {
        return container.getKey();
    }

    public <T> void printMsg(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(111);
        Generic<Double> generic1 = new Generic<>(1233d);
        Generic<Float> generic2 = new Generic<>(123f);

        new GenericTest().showkeyValue2(generic);
        new GenericTest().showkeyValue2(generic1);
        new GenericTest().showkeyValue2(generic2);

        System.out.println(new GenericTest().showKeyValue3(generic));
        System.out.println(new GenericTest().showKeyValue3(generic1));
        System.out.println(new GenericTest().showKeyValue3(generic2));
    }
}
