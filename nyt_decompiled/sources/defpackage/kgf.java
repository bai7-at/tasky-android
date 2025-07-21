package defpackage;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class kgf implements xdf {
    private final acd a;
    private boolean b;
    private long c;
    private long d;
    private hib e = hib.d;

    public kgf(acd acdVar) {
        this.a = acdVar;
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void c() {
        if (this.b) {
            a(zza());
            this.b = false;
        }
    }

    @Override // defpackage.xdf
    public final void e(hib hibVar) {
        if (this.b) {
            a(zza());
        }
        this.e = hibVar;
    }

    @Override // defpackage.xdf
    public final long zza() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        hib hibVar = this.e;
        return j + (hibVar.a == 1.0f ? khe.F(elapsedRealtime) : hibVar.a(elapsedRealtime));
    }

    @Override // defpackage.xdf
    public final hib zzc() {
        return this.e;
    }

    @Override // defpackage.xdf
    public final /* synthetic */ boolean zzj() {
        throw null;
    }
}
