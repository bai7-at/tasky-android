package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l80 implements Cloneable {
    private int[] a;
    private int b;

    public l80() {
        this.b = 0;
        this.a = new int[1];
    }

    private void e(int i) {
        if (i > (this.a.length << 5)) {
            int[] i2 = i(i);
            int[] iArr = this.a;
            System.arraycopy(iArr, 0, i2, 0, iArr.length);
            this.a = i2;
        }
    }

    private static int[] i(int i) {
        return new int[(i + 31) / 32];
    }

    public void a(boolean z) {
        e(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public void b(l80 l80Var) {
        int i = l80Var.b;
        e(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(l80Var.f(i2));
        }
    }

    public void c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        e(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l80 clone() {
        return new l80((int[]) this.a.clone(), this.b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80Var = (l80) obj;
        return this.b == l80Var.b && Arrays.equals(this.a, l80Var.a);
    }

    public boolean f(int i) {
        return (this.a[i / 32] & (1 << (i & 31))) != 0;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return (this.b + 7) / 8;
    }

    public int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public void k(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public void l(l80 l80Var) {
        if (this.b != l80Var.b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ l80Var.a[i];
            i++;
        }
    }

    public String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    l80(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }
}
