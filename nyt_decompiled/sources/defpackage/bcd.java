package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class bcd extends h0e {
    private final long i;

    public bcd(ksc kscVar, String str, String str2, h3 h3Var, long j, int i, int i2) {
        super(kscVar, "zwwnNjW/9dn+p0q/2u+mmA6XQB8+gtknmtJMKP3tBmoncBehPCILsKxRnck9yFjA", "vpqgk7W2OO4+emKKnTSxckIsP1c64LGVSWcdsnDvr3w=", h3Var, i, 25);
        this.i = j;
    }

    @Override // defpackage.h0e
    protected final void a() {
        long longValue = ((Long) this.f.invoke(null, null)).longValue();
        synchronized (this.e) {
            try {
                this.e.w0(longValue);
                long j = this.i;
                if (j != 0) {
                    this.e.M(longValue - j);
                    this.e.N(this.i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
