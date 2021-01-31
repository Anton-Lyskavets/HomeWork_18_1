package JavaPVT.HW_18_1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SignCode {
    Type type();

    int id();
}
