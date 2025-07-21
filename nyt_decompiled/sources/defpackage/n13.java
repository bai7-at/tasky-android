package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public class n13 {
    private final float[] a;
    private final int[] b;

    public n13(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    private void a(n13 n13Var) {
        int i = 0;
        while (true) {
            int[] iArr = n13Var.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = n13Var.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    private int c(float f) {
        int binarySearch = Arrays.binarySearch(this.a, f);
        if (binarySearch >= 0) {
            return this.b[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.b[0];
        }
        int[] iArr = this.b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return xv2.c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    public n13 b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = c(fArr[i]);
        }
        return new n13(fArr, iArr);
    }

    public int[] d() {
        return this.b;
    }

    public float[] e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n13 n13Var = (n13) obj;
        return Arrays.equals(this.a, n13Var.a) && Arrays.equals(this.b, n13Var.b);
    }

    public int f() {
        return this.b.length;
    }

    public void g(n13 n13Var, n13 n13Var2, float f) {
        int[] iArr;
        if (n13Var.equals(n13Var2)) {
            a(n13Var);
            return;
        }
        if (f <= 0.0f) {
            a(n13Var);
            return;
        }
        if (f >= 1.0f) {
            a(n13Var2);
            return;
        }
        if (n13Var.b.length != n13Var2.b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + n13Var.b.length + " vs " + n13Var2.b.length + ")");
        }
        int i = 0;
        while (true) {
            iArr = n13Var.b;
            if (i >= iArr.length) {
                break;
            }
            this.a[i] = nu4.i(n13Var.a[i], n13Var2.a[i], f);
            this.b[i] = xv2.c(f, n13Var.b[i], n13Var2.b[i]);
            i++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = n13Var.b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }
}
