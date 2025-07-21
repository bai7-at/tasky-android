package defpackage;

import com.google.android.gms.internal.pal.h3;

/* loaded from: classes3.dex */
public final class sud extends h0e {
    private static volatile Long i;
    private static final Object j = new Object();

    public sud(ksc kscVar, String str, String str2, h3 h3Var, int i2, int i3) {
        super(kscVar, "5BhEc19mhLCb3gixLpO/usqpdcrz8iDHUvKRNr8tUAX9rUzF0wog6vEOJrftvcpW", "yZHUQ89G8fTgEsMNs0hBrXwZIrb4VL1iE12C/t/Y3UE=", h3Var, i2, 33);
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
            this.e.O(i.longValue());
        }
    }
}
