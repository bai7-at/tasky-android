package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface lk7 {
    Class with() default KSerializer.class;
}
