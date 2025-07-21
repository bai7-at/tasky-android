package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class sc1 {
    private final Drawable a;
    private final boolean b;

    public sc1(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    public final Drawable a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sc1) {
            sc1 sc1Var = (sc1) obj;
            if (zq3.c(this.a, sc1Var.a) && this.b == sc1Var.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }
}
