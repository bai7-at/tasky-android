package defpackage;

/* loaded from: classes3.dex */
final class pyf implements p2g {
    public final p2g a;
    private boolean b;
    final /* synthetic */ qyf c;

    public pyf(qyf qyfVar, p2g p2gVar) {
        this.c = qyfVar;
        this.a = p2gVar;
    }

    @Override // defpackage.p2g
    public final int a(kdf kdfVar, n7f n7fVar, int i) {
        qyf qyfVar = this.c;
        if (qyfVar.h()) {
            return -3;
        }
        if (this.b) {
            n7fVar.c(4);
            return -4;
        }
        long zzb = qyfVar.zzb();
        int a = this.a.a(kdfVar, n7fVar, i);
        if (a != -5) {
            long j = this.c.e;
            if (j == Long.MIN_VALUE || ((a != -4 || n7fVar.f < j) && !(a == -3 && zzb == Long.MIN_VALUE && !n7fVar.e))) {
                return a;
            }
            n7fVar.b();
            n7fVar.c(4);
            this.b = true;
            return -4;
        }
        l6a l6aVar = kdfVar.a;
        l6aVar.getClass();
        int i2 = l6aVar.B;
        if (i2 == 0) {
            if (l6aVar.C != 0) {
                i2 = 0;
            }
            return -5;
        }
        int i3 = this.c.e == Long.MIN_VALUE ? l6aVar.C : 0;
        x3a b = l6aVar.b();
        b.f(i2);
        b.g(i3);
        kdfVar.a = b.D();
        return -5;
    }

    @Override // defpackage.p2g
    public final int b(long j) {
        if (this.c.h()) {
            return -3;
        }
        return this.a.b(j);
    }

    public final void c() {
        this.b = false;
    }

    @Override // defpackage.p2g
    public final void zzd() {
        this.a.zzd();
    }

    @Override // defpackage.p2g
    public final boolean zze() {
        return !this.c.h() && this.a.zze();
    }
}
