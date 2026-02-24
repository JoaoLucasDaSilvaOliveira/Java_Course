package reflexionApi;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public interface Factory {
    static <T> T create(Class<T> theClass) throws Exception {
        T object = theClass.getConstructor().newInstance();
        Field[] fields = theClass.getDeclaredFields();
        for (Field f : fields){
            if (f.getAnnotation(Inject.class) != null){
                f.setAccessible(true);//byPass se o campo for private
                Method method = ObjetoEspelho.class.getDeclaredMethod(f.getName());
                Object valueToInject = method.invoke(null);//null pq esse métod-o é static e não tem classe pra aplicar ele
                f.set(object, valueToInject);
            }
        }
        return object;
    }
}
