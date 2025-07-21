package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zpb {
    static final String j = Integer.toString(0, 36);
    private static final String k = Integer.toString(1, 36);
    static final String l = Integer.toString(2, 36);
    static final String m = Integer.toString(3, 36);
    static final String n = Integer.toString(4, 36);
    private static final String o = Integer.toString(5, 36);
    private static final String p = Integer.toString(6, 36);
    public static final zhf q = new zhf() { // from class: uob
    };
    public final Object a;
    public final int b;
    public final cza c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    public zpb(Object obj, int i, cza czaVar, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = czaVar;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zpb.class == obj.getClass()) {
            zpb zpbVar = (zpb) obj;
            if (this.b == zpbVar.b && this.e == zpbVar.e && this.f == zpbVar.f && this.g == zpbVar.g && this.h == zpbVar.h && this.i == zpbVar.i && mge.a(this.c, zpbVar.c) && mge.a(this.a, zpbVar.a) && mge.a(this.d, zpbVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
