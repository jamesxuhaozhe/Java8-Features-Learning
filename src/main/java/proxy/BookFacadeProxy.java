package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        String beforeLog = "";
        String afterLog = "";
        if (method.getName().startsWith("add")) {
            beforeLog = "before invoking addBook method";
            afterLog = "after invoking addBook method";
        } else if (method.getName().startsWith("turn")) {
            beforeLog = "before invoking turnPage method";
            afterLog = "after invoking turnPage method";
        } else if (method.getName().startsWith("open")) {
            beforeLog = "before invoking openBook method";
            afterLog = "after invoking openBook method";
        }

        System.out.println(beforeLog);
        result = method.invoke(target, args);
        System.out.println(afterLog);

        return result;
    }
}
