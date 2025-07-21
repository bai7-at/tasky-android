package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.jp5;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.internal.ResourceFileSystem;

/* loaded from: classes5.dex */
public abstract class we2 {
    public static final a a = new a(null);
    public static final we2 b;
    public static final jp5 c;
    public static final we2 d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        we2 su3Var;
        try {
            Class.forName("java.nio.file.Files");
            su3Var = new l65();
        } catch (ClassNotFoundException unused) {
            su3Var = new su3();
        }
        b = su3Var;
        jp5.a aVar = jp5.b;
        String property = System.getProperty("java.io.tmpdir");
        zq3.g(property, "getProperty(...)");
        c = jp5.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = ResourceFileSystem.class.getClassLoader();
        zq3.g(classLoader, "getClassLoader(...)");
        d = new ResourceFileSystem(classLoader, false, null, 4, null);
    }

    public final yt7 a(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return b(jp5Var, false);
    }

    public abstract yt7 b(jp5 jp5Var, boolean z);

    public abstract void c(jp5 jp5Var, jp5 jp5Var2);

    public final void d(jp5 jp5Var) {
        zq3.h(jp5Var, "dir");
        e(jp5Var, false);
    }

    public final void e(jp5 jp5Var, boolean z) {
        zq3.h(jp5Var, "dir");
        h.a(this, jp5Var, z);
    }

    public final void f(jp5 jp5Var) {
        zq3.h(jp5Var, "dir");
        g(jp5Var, false);
    }

    public abstract void g(jp5 jp5Var, boolean z);

    public final void h(jp5 jp5Var) {
        zq3.h(jp5Var, "path");
        i(jp5Var, false);
    }

    public abstract void i(jp5 jp5Var, boolean z);

    public final boolean j(jp5 jp5Var) {
        zq3.h(jp5Var, "path");
        return h.b(this, jp5Var);
    }

    public abstract List k(jp5 jp5Var);

    public final ne2 l(jp5 jp5Var) {
        zq3.h(jp5Var, "path");
        return h.c(this, jp5Var);
    }

    public abstract ne2 m(jp5 jp5Var);

    public abstract fe2 n(jp5 jp5Var);

    public final yt7 o(jp5 jp5Var) {
        zq3.h(jp5Var, TransferTable.COLUMN_FILE);
        return p(jp5Var, false);
    }

    public abstract yt7 p(jp5 jp5Var, boolean z);

    public abstract px7 q(jp5 jp5Var);
}
