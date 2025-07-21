package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class iha extends cia {
    private final kga i;

    public iha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, kga kgaVar) {
        super(jgaVar, "Srq4/7DDafVhhxKPQvFzGwPCcbAxjsRhBUoTZMyZ8i1elMwCHCPiECib9I+dpg+U", "+ExOXtPxYV6dYowx9W8QaGOBr19dRESYWAuzCGJGeu8=", u0Var, i, 85);
        this.i = kgaVar;
    }

    @Override // defpackage.cia
    protected final void a() {
        long[] jArr = (long[]) this.f.invoke(null, Long.valueOf(this.i.d()), Long.valueOf(this.i.h()), Long.valueOf(this.i.b()), Long.valueOf(this.i.f()));
        synchronized (this.e) {
            this.e.v0(jArr[0]);
            this.e.u0(jArr[1]);
        }
    }
}
