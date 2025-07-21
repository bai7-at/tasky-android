package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class hgc {
    private static final String e = Integer.toString(0, 36);
    private static final String f = Integer.toString(1, 36);
    private static final String g = Integer.toString(3, 36);
    private static final String h = Integer.toString(4, 36);
    public static final zhf i = new zhf() { // from class: dfc
    };
    public final int a;
    private final v3c b;
    private final int[] c;
    private final boolean[] d;

    public hgc(v3c v3cVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = v3cVar.a;
        this.a = 1;
        this.b = v3cVar;
        this.c = (int[]) iArr.clone();
        this.d = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final l6a b(int i2) {
        return this.b.b(0);
    }

    public final boolean c() {
        for (boolean z : this.d) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i2) {
        return this.d[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hgc.class == obj.getClass()) {
            hgc hgcVar = (hgc) obj;
            if (this.b.equals(hgcVar.b) && Arrays.equals(this.c, hgcVar.c) && Arrays.equals(this.d, hgcVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 961) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
