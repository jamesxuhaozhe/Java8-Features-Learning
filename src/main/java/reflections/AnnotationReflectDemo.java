package reflections;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class AnnotationReflectDemo {
    public static void main(String[] args) throws Exception{
        Annotation[] annotations = House.class.getAnnotations();

        Arrays.stream(annotations).forEach(System.out::println);

        Arrays.stream(annotations).forEach(annotation -> {
            if (annotation instanceof MyAnnotationType) {
                MyAnnotationType myAnnotationType = (MyAnnotationType) annotation;
                System.out.println(myAnnotationType.name() + myAnnotationType.value());
            }
        });


    }
}
