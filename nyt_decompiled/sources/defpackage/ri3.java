package defpackage;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ri3 {
    private static ri3 h;
    private final Class a;
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;
    public static final a g = new a(null);
    private static final AtomicBoolean i = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a() {
            Class a = si3.a("com.android.billingclient.api.SkuDetailsParams");
            Class a2 = si3.a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (a == null || a2 == null) {
                return;
            }
            Method d = si3.d(a, "newBuilder", new Class[0]);
            Method d2 = si3.d(a2, "setType", String.class);
            Method d3 = si3.d(a2, "setSkusList", List.class);
            Method d4 = si3.d(a2, "build", new Class[0]);
            if (d == null || d2 == null || d3 == null || d4 == null) {
                return;
            }
            ri3.c(new ri3(a, a2, d, d2, d3, d4));
        }

        public final ri3 b() {
            if (ri3.a().get()) {
                return ri3.b();
            }
            a();
            ri3.a().set(true);
            return ri3.b();
        }

        private a() {
        }
    }

    public ri3(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        zq3.h(cls, "skuDetailsParamsClazz");
        zq3.h(cls2, "builderClazz");
        zq3.h(method, "newBuilderMethod");
        zq3.h(method2, "setTypeMethod");
        zq3.h(method3, "setSkusListMethod");
        zq3.h(method4, "buildMethod");
        this.a = cls;
        this.b = cls2;
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = method4;
    }

    public static final /* synthetic */ AtomicBoolean a() {
        if (c11.d(ri3.class)) {
            return null;
        }
        try {
            return i;
        } catch (Throwable th) {
            c11.b(th, ri3.class);
            return null;
        }
    }

    public static final /* synthetic */ ri3 b() {
        if (c11.d(ri3.class)) {
            return null;
        }
        try {
            return h;
        } catch (Throwable th) {
            c11.b(th, ri3.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(ri3 ri3Var) {
        if (c11.d(ri3.class)) {
            return;
        }
        try {
            h = ri3Var;
        } catch (Throwable th) {
            c11.b(th, ri3.class);
        }
    }

    public final Object d(String str, List list) {
        Object e;
        Object e2;
        if (c11.d(this)) {
            return null;
        }
        try {
            si3 si3Var = si3.a;
            Object e3 = si3.e(this.a, this.c, null, new Object[0]);
            if (e3 != null && (e = si3.e(this.b, this.d, e3, str)) != null && (e2 = si3.e(this.b, this.e, e, list)) != null) {
                return si3.e(this.b, this.f, e2, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    public final Class e() {
        if (c11.d(this)) {
            return null;
        }
        try {
            return this.a;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }
}
