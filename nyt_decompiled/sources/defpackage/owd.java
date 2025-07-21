package defpackage;

/* loaded from: classes3.dex */
final class owd implements nid {
    final /* synthetic */ pwd a;

    owd(pwd pwdVar) {
        this.a = pwdVar;
    }

    @Override // defpackage.nid
    public final void zza() {
        synchronized (this.a) {
            this.a.k = null;
        }
    }

    @Override // defpackage.nid
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        hwd hwdVar;
        hwd hwdVar2;
        zuc zucVar;
        eyb eybVar = (eyb) obj;
        synchronized (this.a) {
            try {
                eyb eybVar2 = this.a.k;
                if (eybVar2 != null) {
                    eybVar2.a();
                }
                pwd pwdVar = this.a;
                pwdVar.k = eybVar;
                eybVar.i(pwdVar);
                pwd pwdVar2 = this.a;
                hwdVar = pwdVar2.f;
                hwdVar2 = pwdVar2.f;
                zucVar = pwdVar2.h;
                hwdVar.t(new iyb(eybVar, pwdVar2, hwdVar2, zucVar));
                eybVar.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
