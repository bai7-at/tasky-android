package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class lm8 {
    private long[] a;
    private Object[] b;
    private int c;
    private int d;

    public lm8() {
        this(10);
    }

    private void b(long j, Object obj) {
        int i = this.c;
        int i2 = this.d;
        Object[] objArr = this.b;
        int length = (i + i2) % objArr.length;
        this.a[length] = j;
        objArr[length] = obj;
        this.d = i2 + 1;
    }

    private void d(long j) {
        if (this.d > 0) {
            if (j <= this.a[((this.c + r0) - 1) % this.b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] f = f(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, f, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, f, i3, this.c);
        }
        this.a = jArr;
        this.b = f;
        this.c = 0;
    }

    private static Object[] f(int i) {
        return new Object[i];
    }

    private Object h(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = k();
            j2 = j3;
        }
        return obj;
    }

    private Object k() {
        ur.g(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public synchronized void a(long j, Object obj) {
        d(j);
        e();
        b(j, obj);
    }

    public synchronized void c() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public synchronized Object g(long j) {
        return h(j, false);
    }

    public synchronized Object i() {
        return this.d == 0 ? null : k();
    }

    public synchronized Object j(long j) {
        return h(j, true);
    }

    public synchronized int l() {
        return this.d;
    }

    public lm8(int i) {
        this.a = new long[i];
        this.b = f(i);
    }
}
