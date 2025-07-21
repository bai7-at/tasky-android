package defpackage;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;

/* loaded from: classes5.dex */
public abstract class zt6 {
    private static final au6 a;
    private static final vu3[] b;

    static {
        au6 au6Var = null;
        try {
            au6Var = (au6) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (au6Var == null) {
            au6Var = new au6();
        }
        a = au6Var;
        b = new vu3[0];
    }

    public static xu3 a(FunctionReference functionReference) {
        return a.a(functionReference);
    }

    public static vu3 b(Class cls) {
        return a.b(cls);
    }

    public static wu3 c(Class cls) {
        return a.c(cls, "");
    }

    public static wu3 d(Class cls, String str) {
        return a.c(cls, str);
    }

    public static ev3 e(MutablePropertyReference0 mutablePropertyReference0) {
        return a.d(mutablePropertyReference0);
    }

    public static fv3 f(MutablePropertyReference1 mutablePropertyReference1) {
        return a.e(mutablePropertyReference1);
    }

    public static gv3 g(MutablePropertyReference2 mutablePropertyReference2) {
        return a.f(mutablePropertyReference2);
    }

    public static jv3 h(PropertyReference0 propertyReference0) {
        return a.g(propertyReference0);
    }

    public static kv3 i(PropertyReference1 propertyReference1) {
        return a.h(propertyReference1);
    }

    public static String j(tt2 tt2Var) {
        return a.i(tt2Var);
    }

    public static String k(Lambda lambda) {
        return a.j(lambda);
    }
}
