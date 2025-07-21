package defpackage;

import com.google.android.gms.internal.ads.zzds;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class quc implements grc {
    private int b;
    private float c = 1.0f;
    private float d = 1.0f;
    private cpc e;
    private cpc f;
    private cpc g;
    private cpc h;
    private boolean i;
    private mtc j;
    private ByteBuffer k;
    private ShortBuffer l;
    private ByteBuffer m;
    private long n;
    private long o;
    private boolean p;

    public quc() {
        cpc cpcVar = cpc.e;
        this.e = cpcVar;
        this.f = cpcVar;
        this.g = cpcVar;
        this.h = cpcVar;
        ByteBuffer byteBuffer = grc.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // defpackage.grc
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            mtc mtcVar = this.j;
            mtcVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            mtcVar.f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // defpackage.grc
    public final cpc b(cpc cpcVar) {
        if (cpcVar.c != 2) {
            throw new zzds("Unhandled input format:", cpcVar);
        }
        int i = this.b;
        if (i == -1) {
            i = cpcVar.a;
        }
        this.e = cpcVar;
        cpc cpcVar2 = new cpc(i, cpcVar.b, 2);
        this.f = cpcVar2;
        this.i = true;
        return cpcVar2;
    }

    public final long c(long j) {
        long j2 = this.o;
        if (j2 < 1024) {
            return (long) (this.c * j);
        }
        long j3 = this.n;
        this.j.getClass();
        long b = j3 - r2.b();
        int i = this.h.a;
        int i2 = this.g.a;
        return i == i2 ? khe.H(j, b, j2, RoundingMode.FLOOR) : khe.H(j, b * i, j2 * i2, RoundingMode.FLOOR);
    }

    public final void d(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void e(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // defpackage.grc
    public final ByteBuffer zzb() {
        int a;
        mtc mtcVar = this.j;
        if (mtcVar != null && (a = mtcVar.a()) > 0) {
            if (this.k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            mtcVar.d(this.l);
            this.o += a;
            this.k.limit(a);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = grc.a;
        return byteBuffer;
    }

    @Override // defpackage.grc
    public final void zzc() {
        if (zzg()) {
            cpc cpcVar = this.e;
            this.g = cpcVar;
            cpc cpcVar2 = this.f;
            this.h = cpcVar2;
            if (this.i) {
                this.j = new mtc(cpcVar.a, cpcVar.b, this.c, this.d, cpcVar2.a);
            } else {
                mtc mtcVar = this.j;
                if (mtcVar != null) {
                    mtcVar.c();
                }
            }
        }
        this.m = grc.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.grc
    public final void zzd() {
        mtc mtcVar = this.j;
        if (mtcVar != null) {
            mtcVar.e();
        }
        this.p = true;
    }

    @Override // defpackage.grc
    public final void zzf() {
        this.c = 1.0f;
        this.d = 1.0f;
        cpc cpcVar = cpc.e;
        this.e = cpcVar;
        this.f = cpcVar;
        this.g = cpcVar;
        this.h = cpcVar;
        ByteBuffer byteBuffer = grc.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.grc
    public final boolean zzg() {
        if (this.f.a == -1) {
            return false;
        }
        if (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.f.a != this.e.a;
    }

    @Override // defpackage.grc
    public final boolean zzh() {
        if (!this.p) {
            return false;
        }
        mtc mtcVar = this.j;
        return mtcVar == null || mtcVar.a() == 0;
    }
}
