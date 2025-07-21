package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xc4 {
    private final Object a;
    private final Throwable b;

    public xc4(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc4)) {
            return false;
        }
        xc4 xc4Var = (xc4) obj;
        if (b() != null && b().equals(xc4Var.b())) {
            return true;
        }
        if (a() == null || xc4Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public xc4(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
