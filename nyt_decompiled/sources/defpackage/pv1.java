package defpackage;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;

/* loaded from: classes.dex */
public final class pv1 extends nd2 {
    private final Drawable a;
    private final boolean b;
    private final DataSource c;

    public pv1(Drawable drawable, boolean z, DataSource dataSource) {
        super(null);
        this.a = drawable;
        this.b = z;
        this.c = dataSource;
    }

    public final DataSource a() {
        return this.c;
    }

    public final Drawable b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pv1) {
            pv1 pv1Var = (pv1) obj;
            if (zq3.c(this.a, pv1Var.a) && this.b == pv1Var.b && this.c == pv1Var.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode();
    }
}
