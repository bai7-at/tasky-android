package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class opd extends h0e {
    private final boolean i;

    public opd(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        super(kscVar, "RjfRn/7K/Mx2/M8Fl6a7u1D5niklht4X0VG1cOixOa4SuaPG6Qd7la4v6f0IM/MO", "cZ2qwY2ZIJRch325gepGJtH7dQ9IcqmfWvaHdfiFi6Y=", h3Var, i, 61);
        this.i = kscVar.s();
    }

    @Override // defpackage.h0e
    protected final void a() {
        long longValue = ((Long) this.f.invoke(null, this.b.b(), Boolean.valueOf(this.i))).longValue();
        synchronized (this.e) {
            this.e.q(longValue);
        }
    }
}
