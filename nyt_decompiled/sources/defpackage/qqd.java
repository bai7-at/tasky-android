package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class qqd extends h0e {
    private final StackTraceElement[] i;

    public qqd(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(kscVar, "d2tnKFzXPwiZyQGi+81r0jKuUmc/wF2bs8mf3rZLUgisIeswnimQDm/skPYjpEo4", "e/DvqiTz4SkFtBEBn/3V8Pr2h2slHO4xuLOBAItCJ4w=", h3Var, i, 45);
        this.i = stackTraceElementArr;
    }

    @Override // defpackage.h0e
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.i;
        if (stackTraceElementArr != null) {
            pkc pkcVar = new pkc((String) this.f.invoke(null, stackTraceElementArr));
            synchronized (this.e) {
                try {
                    this.e.r(pkcVar.b.longValue());
                    if (pkcVar.c.booleanValue()) {
                        this.e.W(true != pkcVar.d.booleanValue() ? 2 : 1);
                    } else {
                        this.e.W(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
