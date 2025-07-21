package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class ye9 {

    private static class a {
        static final qf9 a = new qf9(ye9.d().getWebkitToCompatConverter());
    }

    private static class b {
        static final bf9 a = ye9.a();
    }

    static bf9 a() {
        try {
            return new cf9((WebViewProviderFactoryBoundaryInterface) zb0.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new ui3();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static qf9 c() {
        return a.a;
    }

    public static bf9 d() {
        return b.a;
    }

    public static ClassLoader e() {
        return oj.b();
    }
}
