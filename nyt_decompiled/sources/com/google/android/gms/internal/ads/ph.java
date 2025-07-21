package com.google.android.gms.internal.ads;

import defpackage.l0f;
import defpackage.lh4;
import defpackage.w1f;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ph {
    private static volatile ph b;
    static final ph c = new ph(true);
    private final Map a = Collections.emptyMap();

    ph(boolean z) {
    }

    public static ph a() {
        return c;
    }

    public static ph b() {
        ph phVar = b;
        if (phVar != null) {
            return phVar;
        }
        synchronized (ph.class) {
            try {
                ph phVar2 = b;
                if (phVar2 != null) {
                    return phVar2;
                }
                ph a = vh.a(ph.class);
                b = a;
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final l0f c(w1f w1fVar, int i) {
        lh4.a(this.a.get(new oh(w1fVar, i)));
        return null;
    }
}
