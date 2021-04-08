import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class VersionAnnotationProcessor {
    public void process(Class<?> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        boolean annotationPresent = clazz.isAnnotationPresent(Version.class);
        if (annotationPresent) {
            Version annotation = clazz.getAnnotation(Version.class);
            System.out.println("Параметры аннотации: version_number = " + annotation.version_number() + ", version_codename = " + annotation.version_codename());

            Constructor<?> constructor = clazz.getConstructor();
            MyService service = (MyService) constructor.newInstance();
            service.setName("Casino");
            service.setIp("836869b1-3997-4f29-803b-986be9fd270c");

            Method method = clazz.getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            method.invoke(service);


        }

    }
}
