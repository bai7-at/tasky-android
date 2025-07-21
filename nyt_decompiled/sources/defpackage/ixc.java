package defpackage;

/* loaded from: classes3.dex */
final class ixc extends iza {
    final /* synthetic */ Object a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ f7e d;
    final /* synthetic */ ugb e;
    final /* synthetic */ jxc f;

    ixc(jxc jxcVar, Object obj, String str, long j, f7e f7eVar, ugb ugbVar) {
        this.a = obj;
        this.b = str;
        this.c = j;
        this.d = f7eVar;
        this.e = ugbVar;
        this.f = jxcVar;
    }

    @Override // defpackage.jza
    public final void b(String str) {
        jvc jvcVar;
        wec wecVar;
        v7e v7eVar;
        synchronized (this.a) {
            this.f.v(this.b, false, str, (int) (dyf.b().elapsedRealtime() - this.c));
            jvcVar = this.f.l;
            jvcVar.b(this.b, "error");
            wecVar = this.f.o;
            wecVar.zzb(this.b, "error");
            v7eVar = this.f.p;
            f7e f7eVar = this.d;
            f7eVar.s(str);
            f7eVar.S(false);
            v7eVar.b(f7eVar.zzl());
            this.e.c(Boolean.FALSE);
        }
    }

    @Override // defpackage.jza
    public final void zzf() {
        jvc jvcVar;
        wec wecVar;
        v7e v7eVar;
        synchronized (this.a) {
            this.f.v(this.b, true, "", (int) (dyf.b().elapsedRealtime() - this.c));
            jvcVar = this.f.l;
            jvcVar.d(this.b);
            wecVar = this.f.o;
            wecVar.I(this.b);
            v7eVar = this.f.p;
            f7e f7eVar = this.d;
            f7eVar.S(true);
            v7eVar.b(f7eVar.zzl());
            this.e.c(Boolean.TRUE);
        }
    }
}
