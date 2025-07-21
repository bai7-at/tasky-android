package defpackage;

import android.view.Surface;

/* loaded from: classes2.dex */
public final class zc8 {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;

    public zc8(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc8)) {
            return false;
        }
        zc8 zc8Var = (zc8) obj;
        return this.b == zc8Var.b && this.c == zc8Var.c && this.d == zc8Var.d && this.a.equals(zc8Var.a);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public zc8(Surface surface, int i, int i2, int i3) {
        ur.b(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
