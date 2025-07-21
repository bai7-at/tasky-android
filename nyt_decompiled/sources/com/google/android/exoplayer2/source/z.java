package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.b0;
import defpackage.nb;
import defpackage.ob;
import defpackage.s91;
import defpackage.t31;
import defpackage.ur;
import defpackage.yo5;
import defpackage.yp8;
import defpackage.z19;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
class z {
    private final ob a;
    private final int b;
    private final yo5 c;
    private a d;
    private a e;
    private a f;
    private long g;

    private static final class a implements ob.a {
        public long a;
        public long b;
        public nb c;
        public a d;

        public a(long j, int i) {
            d(j, i);
        }

        @Override // ob.a
        public nb a() {
            return (nb) ur.e(this.c);
        }

        public a b() {
            this.c = null;
            a aVar = this.d;
            this.d = null;
            return aVar;
        }

        public void c(nb nbVar, a aVar) {
            this.c = nbVar;
            this.d = aVar;
        }

        public void d(long j, int i) {
            ur.g(this.c == null);
            this.a = j;
            this.b = j + i;
        }

        public int e(long j) {
            return ((int) (j - this.a)) + this.c.b;
        }

        @Override // ob.a
        public ob.a next() {
            a aVar = this.d;
            if (aVar == null || aVar.c == null) {
                return null;
            }
            return aVar;
        }
    }

    public z(ob obVar) {
        this.a = obVar;
        int e = obVar.e();
        this.b = e;
        this.c = new yo5(32);
        a aVar = new a(0L, e);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    private void a(a aVar) {
        if (aVar.c == null) {
            return;
        }
        this.a.a(aVar);
        aVar.b();
    }

    private static a d(a aVar, long j) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        return aVar;
    }

    private void g(int i) {
        long j = this.g + i;
        this.g = j;
        a aVar = this.f;
        if (j == aVar.b) {
            this.f = aVar.d;
        }
    }

    private int h(int i) {
        a aVar = this.f;
        if (aVar.c == null) {
            aVar.c(this.a.b(), new a(this.f.b, this.b));
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }

    private static a i(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a d = d(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (d.b - j));
            byteBuffer.put(d.c.a, d.e(j), min);
            i -= min;
            j += min;
            if (j == d.b) {
                d = d.d;
            }
        }
        return d;
    }

    private static a j(a aVar, long j, byte[] bArr, int i) {
        a d = d(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (d.b - j));
            System.arraycopy(d.c.a, d.e(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == d.b) {
                d = d.d;
            }
        }
        return d;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, b0.b bVar, yo5 yo5Var) {
        long j = bVar.b;
        int i = 1;
        yo5Var.Q(1);
        a j2 = j(aVar, j, yo5Var.e(), 1);
        long j3 = j + 1;
        byte b = yo5Var.e()[0];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        t31 t31Var = decoderInputBuffer.b;
        byte[] bArr = t31Var.a;
        if (bArr == null) {
            t31Var.a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a j4 = j(j2, j3, t31Var.a, i2);
        long j5 = j3 + i2;
        if (z) {
            yo5Var.Q(2);
            j4 = j(j4, j5, yo5Var.e(), 2);
            j5 += 2;
            i = yo5Var.N();
        }
        int i3 = i;
        int[] iArr = t31Var.d;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = t31Var.e;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i4 = i3 * 6;
            yo5Var.Q(i4);
            j4 = j(j4, j5, yo5Var.e(), i4);
            j5 += i4;
            yo5Var.U(0);
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = yo5Var.N();
                iArr4[i5] = yo5Var.L();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.a - ((int) (j5 - bVar.b));
        }
        yp8.a aVar2 = (yp8.a) z19.j(bVar.c);
        t31Var.c(i3, iArr2, iArr4, aVar2.b, t31Var.a, aVar2.a, aVar2.c, aVar2.d);
        long j6 = bVar.b;
        int i6 = (int) (j5 - j6);
        bVar.b = j6 + i6;
        bVar.a -= i6;
        return j4;
    }

    private static a l(a aVar, DecoderInputBuffer decoderInputBuffer, b0.b bVar, yo5 yo5Var) {
        if (decoderInputBuffer.v()) {
            aVar = k(aVar, decoderInputBuffer, bVar, yo5Var);
        }
        if (!decoderInputBuffer.j()) {
            decoderInputBuffer.t(bVar.a);
            return i(aVar, bVar.b, decoderInputBuffer.c, bVar.a);
        }
        yo5Var.Q(4);
        a j = j(aVar, bVar.b, yo5Var.e(), 4);
        int L = yo5Var.L();
        bVar.b += 4;
        bVar.a -= 4;
        decoderInputBuffer.t(L);
        a i = i(j, bVar.b, decoderInputBuffer.c, L);
        bVar.b += L;
        int i2 = bVar.a - L;
        bVar.a = i2;
        decoderInputBuffer.x(i2);
        return i(i, bVar.b, decoderInputBuffer.f, bVar.a);
    }

    public void b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            this.a.c(aVar.c);
            this.d = this.d.b();
        }
        if (this.e.a < aVar.a) {
            this.e = aVar;
        }
    }

    public void c(long j) {
        ur.a(j <= this.g);
        this.g = j;
        if (j != 0) {
            a aVar = this.d;
            if (j != aVar.a) {
                while (this.g > aVar.b) {
                    aVar = aVar.d;
                }
                a aVar2 = (a) ur.e(aVar.d);
                a(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.d = aVar3;
                if (this.g == aVar.b) {
                    aVar = aVar3;
                }
                this.f = aVar;
                if (this.e == aVar2) {
                    this.e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.d);
        a aVar4 = new a(this.g, this.b);
        this.d = aVar4;
        this.e = aVar4;
        this.f = aVar4;
    }

    public long e() {
        return this.g;
    }

    public void f(DecoderInputBuffer decoderInputBuffer, b0.b bVar) {
        l(this.e, decoderInputBuffer, bVar, this.c);
    }

    public void m(DecoderInputBuffer decoderInputBuffer, b0.b bVar) {
        this.e = l(this.e, decoderInputBuffer, bVar, this.c);
    }

    public void n() {
        a(this.d);
        this.d.d(0L, this.b);
        a aVar = this.d;
        this.e = aVar;
        this.f = aVar;
        this.g = 0L;
        this.a.d();
    }

    public void o() {
        this.e = this.d;
    }

    public int p(s91 s91Var, int i, boolean z) {
        int h = h(i);
        a aVar = this.f;
        int read = s91Var.read(aVar.c.a, aVar.e(this.g), h);
        if (read != -1) {
            g(read);
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public void q(yo5 yo5Var, int i) {
        while (i > 0) {
            int h = h(i);
            a aVar = this.f;
            yo5Var.l(aVar.c.a, aVar.e(this.g), h);
            i -= h;
            g(h);
        }
    }
}
