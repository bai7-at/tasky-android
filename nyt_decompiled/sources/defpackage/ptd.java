package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class ptd extends h0e {
    private final a1d i;
    private long j;

    public ptd(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, a1d a1dVar) {
        super(kscVar, "mkunJHFc5vhTAVOcsaNSYx7OvFB6slgbORGrA/joIDO0IYq5rQvDcAbp2AI6CPUh", "k8GEQUoJxJPI/0jAlfeUix8QD7WaaXAfMcSQAzrpgrU=", h3Var, i, 53);
        this.i = a1dVar;
        if (a1dVar != null) {
            this.j = a1dVar.c();
        }
    }

    @Override // defpackage.h0e
    protected final void a() {
        if (this.i != null) {
            this.e.H(((Long) this.f.invoke(null, Long.valueOf(this.j))).longValue());
        }
    }
}
