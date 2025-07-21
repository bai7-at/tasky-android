package defpackage;

import java.lang.reflect.Method;
import kotlin.collections.d;
import kotlin.random.Random;

/* loaded from: classes5.dex */
public abstract class lu5 {

    private static final class a {
        public static final a a = new a();
        public static final Method b;
        public static final Method c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            zq3.e(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (zq3.c(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    zq3.g(parameterTypes, "getParameterTypes(...)");
                    if (zq3.c(d.x0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (zq3.c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            c = method;
        }

        private a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        zq3.h(th, "cause");
        zq3.h(th2, "exception");
        Method method = a.b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public Random b() {
        return new ga2();
    }
}
