package defpackage;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class zvf extends lsc {
    private int i;
    private boolean j;
    private byte[] k;
    private byte[] l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;

    public zvf() {
        byte[] bArr = khe.f;
        this.k = bArr;
        this.l = bArr;
    }

    private final int k(long j) {
        return (int) ((j * this.b.a) / 1000000);
    }

    private final int l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > 1024) {
                int i = this.i;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    private final void m(byte[] bArr, int i) {
        d(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.p = true;
        }
    }

    private final void n(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.o);
        int i2 = this.o - min;
        System.arraycopy(bArr, i - i2, this.l, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.l, i2, min);
    }

    @Override // defpackage.grc
    public final void a(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !h()) {
            int i = this.m;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.k.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs((int) byteBuffer.getShort(limit2)) > 1024) {
                        int i2 = this.i;
                        position = ((limit2 / i2) * i2) + i2;
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.m = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    d(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.p = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int l = l(byteBuffer);
                byteBuffer.limit(l);
                this.q += byteBuffer.remaining() / this.i;
                n(byteBuffer, this.l, this.o);
                if (l < limit3) {
                    m(this.l, this.o);
                    this.m = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int l2 = l(byteBuffer);
                int position2 = l2 - byteBuffer.position();
                byte[] bArr = this.k;
                int length = bArr.length;
                int i3 = this.n;
                int i4 = length - i3;
                if (l2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.k, this.n, min);
                    int i5 = this.n + min;
                    this.n = i5;
                    byte[] bArr2 = this.k;
                    if (i5 == bArr2.length) {
                        if (this.p) {
                            m(bArr2, this.o);
                            long j = this.q;
                            int i6 = this.n;
                            int i7 = this.o;
                            this.q = j + ((i6 - (i7 + i7)) / this.i);
                            i5 = i6;
                        } else {
                            this.q += (i5 - this.o) / this.i;
                        }
                        n(byteBuffer, this.k, i5);
                        this.n = 0;
                        this.m = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m(bArr, i3);
                    this.n = 0;
                    this.m = 0;
                }
            }
        }
    }

    @Override // defpackage.lsc
    public final cpc c(cpc cpcVar) {
        if (cpcVar.c == 2) {
            return this.j ? cpcVar : cpc.e;
        }
        throw new zzds("Unhandled input format:", cpcVar);
    }

    @Override // defpackage.lsc
    protected final void e() {
        if (this.j) {
            this.i = this.b.d;
            int k = k(150000L) * this.i;
            if (this.k.length != k) {
                this.k = new byte[k];
            }
            int k2 = k(20000L) * this.i;
            this.o = k2;
            if (this.l.length != k2) {
                this.l = new byte[k2];
            }
        }
        this.m = 0;
        this.q = 0L;
        this.n = 0;
        this.p = false;
    }

    @Override // defpackage.lsc
    protected final void f() {
        int i = this.n;
        if (i > 0) {
            m(this.k, i);
            this.n = 0;
            this.m = 0;
        }
        if (this.p) {
            return;
        }
        this.q += this.o / this.i;
    }

    @Override // defpackage.lsc
    protected final void g() {
        this.j = false;
        this.o = 0;
        byte[] bArr = khe.f;
        this.k = bArr;
        this.l = bArr;
    }

    public final long i() {
        return this.q;
    }

    public final void j(boolean z) {
        this.j = z;
    }

    @Override // defpackage.lsc, defpackage.grc
    public final boolean zzg() {
        return this.j;
    }
}
