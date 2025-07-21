package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class a32 extends xg3 {
    private final Drawable a;
    private final vg3 b;
    private final Throwable c;

    public a32(Drawable drawable, vg3 vg3Var, Throwable th) {
        super(null);
        this.a = drawable;
        this.b = vg3Var;
        this.c = th;
    }

    @Override // defpackage.xg3
    public Drawable a() {
        return this.a;
    }

    @Override // defpackage.xg3
    public vg3 b() {
        return this.b;
    }

    public final Throwable c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a32) {
            a32 a32Var = (a32) obj;
            if (zq3.c(a(), a32Var.a()) && zq3.c(b(), a32Var.b()) && zq3.c(this.c, a32Var.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable a = a();
        return ((((a != null ? a.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.c.hashCode();
    }
}
