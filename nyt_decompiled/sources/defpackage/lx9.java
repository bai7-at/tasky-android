package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class lx9 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public lx9(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lx9.class == obj.getClass()) {
            lx9 lx9Var = (lx9) obj;
            if (this.a == lx9Var.a && this.c == lx9Var.c && this.d == lx9Var.d && Arrays.equals(this.b, lx9Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
