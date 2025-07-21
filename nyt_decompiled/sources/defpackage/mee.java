package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class mee {
    private long[] a = new long[10];
    private Object[] b = new Object[10];
    private int c;
    private int d;

    public mee(int i) {
    }

    private final Object f() {
        wad.f(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public final synchronized int a() {
        return this.d;
    }

    public final synchronized Object b() {
        if (this.d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j) {
        Object obj;
        obj = null;
        while (this.d > 0 && j - this.a[this.c] >= 0) {
            obj = f();
        }
        return obj;
    }

    public final synchronized void d(long j, Object obj) {
        try {
            if (this.d > 0) {
                if (j <= this.a[((this.c + r0) - 1) % this.b.length]) {
                    e();
                }
            }
            int length = this.b.length;
            if (this.d >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i2 = this.c;
                int i3 = length - i2;
                System.arraycopy(this.a, i2, jArr, 0, i3);
                System.arraycopy(this.b, this.c, objArr, 0, i3);
                int i4 = this.c;
                if (i4 > 0) {
                    System.arraycopy(this.a, 0, jArr, i3, i4);
                    System.arraycopy(this.b, 0, objArr, i3, this.c);
                }
                this.a = jArr;
                this.b = objArr;
                this.c = 0;
            }
            int i5 = this.c;
            int i6 = this.d;
            Object[] objArr2 = this.b;
            int length2 = (i5 + i6) % objArr2.length;
            this.a[length2] = j;
            objArr2[length2] = obj;
            this.d = i6 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }
}
