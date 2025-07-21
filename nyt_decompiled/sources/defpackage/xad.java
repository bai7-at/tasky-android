package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class xad extends h0e {
    private static volatile Long i;
    private static final Object j = new Object();

    public xad(ksc kscVar, String str, String str2, h3 h3Var, int i2, int i3) {
        super(kscVar, "XFxH1z0dBuMDP7aWA+P/3WKwW9qr8sC2ASjEfciaKHfSLryjCNl4cmJgfsh2Tylb", "r0MNv9zqwvoUwASL1pBJjOA1OkDa8Kcs5NaA6VOkJEI=", h3Var, i2, 44);
    }

    @Override // defpackage.h0e
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
            this.e.q0(i.longValue());
        }
    }
}
