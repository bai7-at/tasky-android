package defpackage;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class lj implements rt0 {
    private static final Set c = new HashSet();
    private final String a;
    private final String b;

    private static class a {
        static final Set a = new HashSet(Arrays.asList(ye9.d().a()));
    }

    public static class b extends lj {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return true;
        }
    }

    public static class c extends lj {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return true;
        }
    }

    public static class d extends lj {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return false;
        }
    }

    public static class e extends lj {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return true;
        }
    }

    public static class f extends lj {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return true;
        }
    }

    public static class g extends lj {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return true;
        }
    }

    public static class h extends lj {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return true;
        }
    }

    public static class i extends lj {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // defpackage.lj
        public final boolean b() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    lj(String str, String str2) {
        this.a = str;
        this.b = str2;
        c.add(this);
    }

    public static Set d() {
        return Collections.unmodifiableSet(c);
    }

    @Override // defpackage.rt0
    public String a() {
        return this.a;
    }

    public abstract boolean b();

    public boolean c() {
        return zb0.b(a.a, this.b);
    }

    @Override // defpackage.rt0
    public boolean isSupported() {
        return b() || c();
    }
}
