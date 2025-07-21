package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class wha extends cia {
    private final qga i;
    private long j;

    public wha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, qga qgaVar) {
        super(jgaVar, "2ZUgS25mCfmBpvNAAnoop42ZvK9H4E17vIqHMHWBgDSruAgpJ0/PRWhyN3sqcUbC", "ZqqofhkB4+yK9ARzF+IbcECpWBtuTXlqWFDkC/AVdcM=", u0Var, i, 53);
        this.i = qgaVar;
        if (qgaVar != null) {
            this.j = qgaVar.c();
        }
    }

    @Override // defpackage.cia
    protected final void a() {
        if (this.i != null) {
            this.e.D(((Long) this.f.invoke(null, Long.valueOf(this.j))).longValue());
        }
    }
}
