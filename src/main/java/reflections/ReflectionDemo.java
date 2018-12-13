package reflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {

    public static void main(String[] args) {

        //demo for Class.forName

        Class c = null;

        try {
            c = Class.forName("reflections.People");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        if (c != null) {
           // System.out.println(c.getName());
        }

        // demo getConstructors
        try {
            Class c1 = Class.forName("reflections.People");
            Constructor[] ct = c1.getConstructors();
            for (int i = 0; i < ct.length; i++) {
                System.out.println("Using getConstructors");
                System.out.println(ct[i]);
            }

            Constructor[] ct1 = c1.getDeclaredConstructors();
            for (int i = 0; i < ct1.length; i++) {
                System.out.println("getDeclaredConstructors");
                System.out.println(ct1[i]);
            }


        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // demo getMethods
        try {
            Class cls = Class.forName("reflections.People");

            Method[] methods = cls.getMethods();
            System.out.println("invoking getMethods");
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i]);
            }

            Method[] methods1 = cls.getDeclaredMethods();
            System.out.println("invoking getDeclaredMethods");
            Arrays.stream(methods1).forEach(System.out::println);


        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // demo getFields
        try {
            Class cls1 = Class.forName("reflections.People");

            Field[] fields = cls1.getFields();
            System.out.println("invoking getFields");
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
            }

            fields = cls1.getDeclaredFields();
            System.out.println("invoking getDeclaredFields");
            Arrays.stream(fields).forEach(System.out::println);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // get Package info
        People people = new People(1, "James", "China", "male", 111);

        Class pleClass = people.getClass();
        Package peoplePackage = pleClass.getPackage();
        System.out.println(peoplePackage);

        // get interfaces
        Class[] peopleInterfaces = pleClass.getInterfaces();
        Arrays.stream(peopleInterfaces).forEach(System.out::println);

        // get annotation
        Annotation[] annotations = pleClass.getAnnotations();
        Arrays.stream(annotations).forEach(System.out::println);

        // instantiate object from constructor
        try {
            Constructor constructor = people.getClass().getConstructor(String.class);
            People people1 = (People) constructor.newInstance("James");

            System.out.println(people1.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // getField type
        try {
            Field field = people.getClass().getDeclaredField("name");
            Object fieldType = field.getType();
            System.out.println("Fiedl type: " + fieldType);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //demo set private member field
        try {
            Field field = people.getClass().getDeclaredField("name");;
            field.setAccessible(true);
            field.set(people, "juju");
            System.out.println(people.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //demo obtaining specific method
        try {
            Method method = People.class.getMethod("getName", null);
            Object returnValue = method.invoke(people, null);
            System.out.println("Return value is: " + returnValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // demo get parameters type and return types
        try {
            Method method = People.class.getMethod("setName", String.class);
            Arrays.stream(method.getParameterTypes()).forEach(System.out::println);
            Class returnType = method.getReturnType();
            System.out.println(returnType);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Method[] methods = People.class.getMethods();
            Arrays.stream(methods).forEach(method -> {
                if (isGetter(method)) {
                    System.out.println(method + "is a getter method");
                }
                if (isSetter(method)) {
                    System.out.println(method + "is a setter method");
                }});
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Method method = People.class.getDeclaredMethod("getNamePrivate", null);
            method.setAccessible(true);
            Object returnValue = method.invoke(people, null);
            System.out.println("Invoke its private method" + returnValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isGetter(Method method) {
        if (!method.getName().startsWith("get")) {
            return false;
        }

        if (method.getParameterTypes().length != 0) {
            return false;
        }

        if (void.class.equals(method.getReturnType())) {
            return false;
        }

        return true;
    }

    private static boolean isSetter(Method method) {
        if (!method.getName().startsWith("set")) {
            return false;
        }

        if (method.getParameterTypes().length != 1) {
            return false;
        }

        return true;
    }
}
