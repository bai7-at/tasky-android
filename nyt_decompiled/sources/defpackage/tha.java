package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class tha extends cia {
    private final boolean i;

    public tha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2) {
        super(jgaVar, "JHENilgoa32pdW2+FQZfbiKa1To+b6hAFc5hyxP6u/LWvHbIhkfTDC3kQMR4mpq3", "JQeYWB/Ar5LqSSZ5i6IhxYZ+uXn8SEDYL9xPjgGTx2M=", u0Var, i, 61);
        this.i = jgaVar.s();
    }

    @Override // defpackage.cia
    protected final void a() {
        long longValue = ((Long) this.f.invoke(null, this.b.b(), Boolean.valueOf(this.i))).longValue();
        synchronized (this.e) {
            this.e.r(longValue);
        }
    }
}
