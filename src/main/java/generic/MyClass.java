package generic;

public class MyClass<T> {

    private T variable;

    public MyClass(T variable) {
        this.variable = variable;
    }

    public T getVariable() {
        return variable;
    }

    public static void main(String[] args) {
        MyClass<Integer> variable = new MyClass<>(1234);

        MyClass<String> variable1 = new MyClass<>("122444");

        System.out.println(variable.getVariable());

        System.out.println(variable1.getVariable());
    }
}
