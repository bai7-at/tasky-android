package defpackage;

import com.google.android.gms.internal.ads.zzds;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class bwf extends lsc {
    private int i;
    private int j;
    private boolean k;
    private int l;
    private byte[] m = khe.f;
    private int n;
    private long o;

    @Override // defpackage.grc
    public final void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l <= 0) {
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer d = d(length);
            int max = Math.max(0, Math.min(length, this.n));
            d.put(this.m, 0, max);
            int max2 = Math.max(0, Math.min(length - max, i2));
            byteBuffer.limit(byteBuffer.position() + max2);
            d.put(byteBuffer);
            byteBuffer.limit(limit);
            int i3 = i2 - max2;
            int i4 = this.n - max;
            this.n = i4;
            byte[] bArr = this.m;
            System.arraycopy(bArr, max, bArr, 0, i4);
            byteBuffer.get(this.m, this.n, i3);
            this.n += i3;
            d.flip();
        }
    }

    @Override // defpackage.lsc
    public final cpc c(cpc cpcVar) {
        if (cpcVar.c != 2) {
            throw new zzds("Unhandled input format:", cpcVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? cpc.e : cpcVar;
    }

    @Override // defpackage.lsc
    protected final void e() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.lsc
    protected final void f() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.lsc
    protected final void g() {
        this.m = khe.f;
    }

    public final long i() {
        return this.o;
    }

    public final void j() {
        this.o = 0L;
    }

    public final void k(int i, int i2) {
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.lsc, defpackage.grc
    public final ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.n) > 0) {
            d(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.zzb();
    }

    @Override // defpackage.lsc, defpackage.grc
    public final boolean zzh() {
        return super.zzh() && this.n == 0;
    }
}
