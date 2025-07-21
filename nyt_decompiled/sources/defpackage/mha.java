package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class mha extends cia {
    private final bga i;

    public mha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, bga bgaVar) {
        super(jgaVar, "ouo6/s5NPxZlxezvpiuAYZ73R/AsqpZljIGTfLgJpzrsB+84nXU0ZzhmetmfkBrN", "5BsC37pqFx3Fp5Qtv0y+RSU8LVttAMXjX8aFccLrzxg=", u0Var, i, 94);
        this.i = bgaVar;
    }

    @Override // defpackage.cia
    protected final void a() {
        int intValue = ((Integer) this.f.invoke(null, this.i.a())).intValue();
        synchronized (this.e) {
            this.e.U(cda.a(intValue));
        }
    }
}
