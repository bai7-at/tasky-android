package defpackage;

/* loaded from: classes3.dex */
public final class iqc extends ppc implements bgc {
    private bgc f;

    @Override // defpackage.bgc
    public final synchronized void X() {
        bgc bgcVar = this.f;
        if (bgcVar != null) {
            bgcVar.X();
        }
    }

    protected final synchronized void c(jq9 jq9Var, awa awaVar, tof tofVar, cwa cwaVar, wq9 wq9Var, bgc bgcVar) {
        super.a(jq9Var, awaVar, tofVar, cwaVar, wq9Var);
        this.f = bgcVar;
    }

    @Override // defpackage.bgc
    public final synchronized void zzs() {
        bgc bgcVar = this.f;
        if (bgcVar != null) {
            bgcVar.zzs();
        }
    }
}
