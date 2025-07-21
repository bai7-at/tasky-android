package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class uha extends cia {
    private final StackTraceElement[] i;

    public uha(jga jgaVar, String str, String str2, u0 u0Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(jgaVar, "kB6Ls9/mn9iw4biP/HsD3FFR9Vy1jOQ1ljTH52MXzz14qrvyk1QMusJQlJpZNqjT", "pY1LPqV65osROa0AkcabhXHjwpz5nP0HOapDW2QtdtU=", u0Var, i, 45);
        this.i = stackTraceElementArr;
    }

    @Override // defpackage.cia
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.i;
        if (stackTraceElementArr != null) {
            aga agaVar = new aga((String) this.f.invoke(null, stackTraceElementArr));
            synchronized (this.e) {
                try {
                    this.e.s(agaVar.b.longValue());
                    if (agaVar.c.booleanValue()) {
                        this.e.S(true != agaVar.d.booleanValue() ? 2 : 1);
                    } else {
                        this.e.S(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
