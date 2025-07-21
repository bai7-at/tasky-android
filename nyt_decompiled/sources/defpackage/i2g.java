package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class i2g {
    private final b9e a = new b9e(32);
    private v1g b;
    private v1g c;
    private v1g d;
    private long e;
    private final s7g f;

    public i2g(s7g s7gVar) {
        this.f = s7gVar;
        v1g v1gVar = new v1g(0L, 65536);
        this.b = v1gVar;
        this.c = v1gVar;
        this.d = v1gVar;
    }

    private final int i(int i) {
        v1g v1gVar = this.d;
        if (v1gVar.c == null) {
            e7g b = this.f.b();
            v1g v1gVar2 = new v1g(this.d.b, 65536);
            v1gVar.c = b;
            v1gVar.d = v1gVar2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    private static v1g j(v1g v1gVar, long j) {
        while (j >= v1gVar.b) {
            v1gVar = v1gVar.d;
        }
        return v1gVar;
    }

    private static v1g k(v1g v1gVar, long j, ByteBuffer byteBuffer, int i) {
        v1g j2 = j(v1gVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.b - j));
            byteBuffer.put(j2.c.a, j2.a(j), min);
            i -= min;
            j += min;
            if (j == j2.b) {
                j2 = j2.d;
            }
        }
        return j2;
    }

    private static v1g l(v1g v1gVar, long j, byte[] bArr, int i) {
        v1g j2 = j(v1gVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.b - j));
            System.arraycopy(j2.c.a, j2.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == j2.b) {
                j2 = j2.d;
            }
        }
        return j2;
    }

    private static v1g m(v1g v1gVar, n7f n7fVar, k2g k2gVar, b9e b9eVar) {
        v1g v1gVar2;
        int i;
        if (n7fVar.k()) {
            long j = k2gVar.b;
            b9eVar.h(1);
            v1g l = l(v1gVar, j, b9eVar.m(), 1);
            long j2 = j + 1;
            byte b = b9eVar.m()[0];
            int i2 = b & 128;
            int i3 = b & Byte.MAX_VALUE;
            j7f j7fVar = n7fVar.c;
            byte[] bArr = j7fVar.a;
            if (bArr == null) {
                j7fVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i2 != 0;
            v1gVar2 = l(l, j2, j7fVar.a, i3);
            long j3 = j2 + i3;
            if (z) {
                b9eVar.h(2);
                v1gVar2 = l(v1gVar2, j3, b9eVar.m(), 2);
                j3 += 2;
                i = b9eVar.F();
            } else {
                i = 1;
            }
            int[] iArr = j7fVar.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = j7fVar.e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i4 = i * 6;
                b9eVar.h(i4);
                v1gVar2 = l(v1gVar2, j3, b9eVar.m(), i4);
                j3 += i4;
                b9eVar.k(0);
                for (int i5 = 0; i5 < i; i5++) {
                    iArr2[i5] = b9eVar.F();
                    iArr4[i5] = b9eVar.E();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = k2gVar.a - ((int) (j3 - k2gVar.b));
            }
            lx9 lx9Var = k2gVar.c;
            int i6 = khe.a;
            j7fVar.c(i, iArr2, iArr4, lx9Var.b, j7fVar.a, lx9Var.a, lx9Var.c, lx9Var.d);
            long j4 = k2gVar.b;
            int i7 = (int) (j3 - j4);
            k2gVar.b = j4 + i7;
            k2gVar.a -= i7;
        } else {
            v1gVar2 = v1gVar;
        }
        if (!n7fVar.e()) {
            n7fVar.i(k2gVar.a);
            return k(v1gVar2, k2gVar.b, n7fVar.d, k2gVar.a);
        }
        b9eVar.h(4);
        v1g l2 = l(v1gVar2, k2gVar.b, b9eVar.m(), 4);
        int E = b9eVar.E();
        k2gVar.b += 4;
        k2gVar.a -= 4;
        n7fVar.i(E);
        v1g k = k(l2, k2gVar.b, n7fVar.d, E);
        k2gVar.b += E;
        int i8 = k2gVar.a - E;
        k2gVar.a = i8;
        ByteBuffer byteBuffer = n7fVar.g;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            n7fVar.g = ByteBuffer.allocate(i8);
        } else {
            n7fVar.g.clear();
        }
        return k(k, k2gVar.b, n7fVar.g, k2gVar.a);
    }

    private final void n(int i) {
        long j = this.e + i;
        this.e = j;
        v1g v1gVar = this.d;
        if (j == v1gVar.b) {
            this.d = v1gVar.d;
        }
    }

    public final int a(xyf xyfVar, int i, boolean z) {
        int i2 = i(i);
        v1g v1gVar = this.d;
        int b = xyfVar.b(v1gVar.c.a, v1gVar.a(this.e), i2);
        if (b != -1) {
            n(b);
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long b() {
        return this.e;
    }

    public final void c(long j) {
        v1g v1gVar;
        if (j != -1) {
            while (true) {
                v1gVar = this.b;
                if (j < v1gVar.b) {
                    break;
                }
                this.f.c(v1gVar.c);
                this.b = this.b.b();
            }
            if (this.c.a < v1gVar.a) {
                this.c = v1gVar;
            }
        }
    }

    public final void d(n7f n7fVar, k2g k2gVar) {
        m(this.c, n7fVar, k2gVar, this.a);
    }

    public final void e(n7f n7fVar, k2g k2gVar) {
        this.c = m(this.c, n7fVar, k2gVar, this.a);
    }

    public final void f() {
        v1g v1gVar = this.b;
        if (v1gVar.c != null) {
            this.f.d(v1gVar);
            v1gVar.b();
        }
        this.b.c(0L, 65536);
        v1g v1gVar2 = this.b;
        this.c = v1gVar2;
        this.d = v1gVar2;
        this.e = 0L;
        this.f.g();
    }

    public final void g() {
        this.c = this.b;
    }

    public final void h(b9e b9eVar, int i) {
        while (i > 0) {
            int i2 = i(i);
            v1g v1gVar = this.d;
            b9eVar.g(v1gVar.c.a, v1gVar.a(this.e), i2);
            i -= i2;
            n(i2);
        }
    }
}
