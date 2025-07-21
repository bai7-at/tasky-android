package defpackage;

import com.google.android.gms.internal.ads.u0;

/* loaded from: classes3.dex */
public final class zga extends cia {
    private static volatile Long i;
    private static final Object j = new Object();

    public zga(jga jgaVar, String str, String str2, u0 u0Var, int i2, int i3) {
        super(jgaVar, "L1KomYFd7sBH8JLOTR3glPup1jq/oqWyQJNU/5dJtxixjKQHD3ZBhAic9dH4TZgA", "m4uJd6hJYeAUgFAUB1OT370Awen8YINd4hKC7XM/6ec=", u0Var, i2, 44);
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
            this.e.n0(i.longValue());
        }
    }
}
