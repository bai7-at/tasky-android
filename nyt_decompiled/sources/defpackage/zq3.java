package defpackage;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes5.dex */
public abstract class zq3 {

    public static class a {
    }

    public static boolean a(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean b(Float f, Float f2) {
        if (f == null) {
            if (f2 != null) {
                return false;
            }
        } else if (f2 == null || f.floatValue() != f2.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) o(new IllegalStateException(str + " must not be null")));
    }

    public static void e(Object obj) {
        if (obj == null) {
            r();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) o(new NullPointerException(str + " must not be null")));
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            v(str);
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    public static int j(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int k(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    private static String l(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = zq3.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + InstructionFileId.DOT + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static void m() {
        w();
    }

    public static void n(int i, String str) {
        w();
    }

    private static Throwable o(Throwable th) {
        return p(th, zq3.class.getName());
    }

    static Throwable p(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    public static String q(String str, Object obj) {
        return str + obj;
    }

    public static void r() {
        throw ((NullPointerException) o(new NullPointerException()));
    }

    public static void s(String str) {
        throw ((NullPointerException) o(new NullPointerException(str)));
    }

    public static void t() {
        throw ((KotlinNullPointerException) o(new KotlinNullPointerException()));
    }

    private static void u(String str) {
        throw ((IllegalArgumentException) o(new IllegalArgumentException(l(str))));
    }

    private static void v(String str) {
        throw ((NullPointerException) o(new NullPointerException(l(str))));
    }

    public static void w() {
        x("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void x(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void y(String str) {
        throw ((UninitializedPropertyAccessException) o(new UninitializedPropertyAccessException(str)));
    }

    public static void z(String str) {
        y("lateinit property " + str + " has not been initialized");
    }
}
