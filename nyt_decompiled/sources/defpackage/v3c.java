package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v3c {
    private static final String f = Integer.toString(0, 36);
    private static final String g = Integer.toString(1, 36);
    public static final zhf h = new zhf() { // from class: r2c
    };
    public final int a = 1;
    public final String b;
    public final int c;
    private final l6a[] d;
    private int e;

    public v3c(String str, l6a... l6aVarArr) {
        this.b = str;
        this.d = l6aVarArr;
        int b = qcb.b(l6aVarArr[0].l);
        this.c = b == -1 ? qcb.b(l6aVarArr[0].k) : b;
        d(l6aVarArr[0].c);
        int i = l6aVarArr[0].e;
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public final int a(l6a l6aVar) {
        for (int i = 0; i <= 0; i++) {
            if (l6aVar == this.d[i]) {
                return i;
            }
        }
        return -1;
    }

    public final l6a b(int i) {
        return this.d[i];
    }

    public final v3c c(String str) {
        return new v3c(str, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v3c.class == obj.getClass()) {
            v3c v3cVar = (v3c) obj;
            if (this.b.equals(v3cVar.b) && Arrays.equals(this.d, v3cVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.b.hashCode() + 527) * 31) + Arrays.hashCode(this.d);
        this.e = hashCode;
        return hashCode;
    }
}
