package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class vid extends h0e {
    private final x3c i;
    private final long j;
    private final long k;

    public vid(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, x3c x3cVar, long j, long j2) {
        super(kscVar, "X9PgbTHLX0FFxbl3gdPDuVwcglfXy5CDrzo8siaVNaH+OIJ6JI34Wu3QK5rLega4", "JLulXGPEHVwHK+0FG96HP9my+NvwpTQbwIaIZrjn9OU=", h3Var, i, 11);
        this.i = x3cVar;
        this.j = j;
        this.k = j2;
    }

    @Override // defpackage.h0e
    protected final void a() {
        x3c x3cVar = this.i;
        if (x3cVar != null) {
            p1c p1cVar = new p1c((String) this.f.invoke(null, x3cVar.a(), Long.valueOf(this.j), Long.valueOf(this.k)));
            synchronized (this.e) {
                try {
                    this.e.C0(p1cVar.b.longValue());
                    if (p1cVar.c.longValue() >= 0) {
                        this.e.I(p1cVar.c.longValue());
                    }
                    if (p1cVar.d.longValue() >= 0) {
                        this.e.g0(p1cVar.d.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
