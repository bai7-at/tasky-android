package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class fha extends cia {
    private final long i;

    public fha(jga jgaVar, String str, String str2, u0 u0Var, long j, int i, int i2) {
        super(jgaVar, "hIbo0WHjc5N2XBD7HI+Mwh9BXu/nIzOhdTaHZ1DPjeizuR48SZNCpBdtOxY4cHlb", "mLbfRIQxtPVbZphUgAhWqMeuqa25Ale/5rz8vv9YVkc=", u0Var, i, 25);
        this.i = j;
    }

    @Override // defpackage.cia
    protected final void a() {
        long longValue = ((Long) this.f.invoke(null, null)).longValue();
        synchronized (this.e) {
            try {
                this.e.s0(longValue);
                long j = this.i;
                if (j != 0) {
                    this.e.H(longValue - j);
                    this.e.I(this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
