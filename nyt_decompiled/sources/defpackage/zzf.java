package defpackage;

/* loaded from: classes3.dex */
public final class zzf {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    private zzf(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final zzf a(Object obj) {
        return this.a.equals(obj) ? this : new zzf(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzf)) {
            return false;
        }
        zzf zzfVar = (zzf) obj;
        return this.a.equals(zzfVar.a) && this.b == zzfVar.b && this.c == zzfVar.c && this.d == zzfVar.d && this.e == zzfVar.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public zzf(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public zzf(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzf(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
