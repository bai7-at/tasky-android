package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class tgf {
    public final long a;
    public final n1c b;
    public final int c;
    public final zzf d;
    public final long e;
    public final n1c f;
    public final int g;
    public final zzf h;
    public final long i;
    public final long j;

    public tgf(long j, n1c n1cVar, int i, zzf zzfVar, long j2, n1c n1cVar2, int i2, zzf zzfVar2, long j3, long j4) {
        this.a = j;
        this.b = n1cVar;
        this.c = i;
        this.d = zzfVar;
        this.e = j2;
        this.f = n1cVar2;
        this.g = i2;
        this.h = zzfVar2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && tgf.class == obj.getClass()) {
            tgf tgfVar = (tgf) obj;
            if (this.a == tgfVar.a && this.c == tgfVar.c && this.e == tgfVar.e && this.g == tgfVar.g && this.i == tgfVar.i && this.j == tgfVar.j && mge.a(this.b, tgfVar.b) && mge.a(this.d, tgfVar.d) && mge.a(this.f, tgfVar.f) && mge.a(this.h, tgfVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
