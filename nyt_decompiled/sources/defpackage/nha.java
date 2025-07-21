package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class nha extends cia {
    private final jfa i;
    private final long j;
    private final long k;

    public nha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, jfa jfaVar, long j, long j2) {
        super(jgaVar, "ChMYhePBDqkXl5DeRTg9cgSXXNPVEcIqgEVciYHEVlkZyx/HkVQXSnen8aw33G2s", "tJ+SvALjKnpAv9FF8u56pKKRS55/vzUDe+m9ct97Lx4=", u0Var, i, 11);
        this.i = jfaVar;
        this.j = j;
        this.k = j2;
    }

    @Override // defpackage.cia
    protected final void a() {
        jfa jfaVar = this.i;
        if (jfaVar != null) {
            hfa hfaVar = new hfa((String) this.f.invoke(null, jfaVar.b(), Long.valueOf(this.j), Long.valueOf(this.k)));
            synchronized (this.e) {
                try {
                    this.e.z0(hfaVar.b.longValue());
                    if (hfaVar.c.longValue() >= 0) {
                        this.e.E(hfaVar.c.longValue());
                    }
                    if (hfaVar.d.longValue() >= 0) {
                        this.e.b0(hfaVar.d.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
