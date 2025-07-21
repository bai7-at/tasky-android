package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class xha extends cia {
    private static volatile Long i;
    private static final Object j = new Object();

    public xha(jga jgaVar, String str, String str2, u0 u0Var, int i2, int i3) {
        super(jgaVar, "nKZwK8oioxkTwDfG9V2sR2xNb9GbO72JaQ9OaUpmWGl7ZX+EiCwiESnhzEGly7cm", "WIPKXsZv2l0NBmLvWdV3TkucPJ5dkfbRYYrTASAxFfQ=", u0Var, i2, 33);
    }

    @Override // defpackage.cia
    protected final void a() {
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = (Long) this.f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.e) {
            this.e.J(i.longValue());
        }
    }
}
