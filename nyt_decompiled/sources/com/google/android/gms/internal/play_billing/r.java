package com.google.android.gms.internal.play_billing;

import defpackage.lh4;
import defpackage.o9b;
import defpackage.sbc;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class r {
    private static volatile r b;
    static final r c = new r(true);
    private final Map a = Collections.emptyMap();

    r(boolean z) {
    }

    public static r a() {
        r rVar = b;
        if (rVar != null) {
            return rVar;
        }
        synchronized (r.class) {
            try {
                r rVar2 = b;
                if (rVar2 != null) {
                    return rVar2;
                }
                r a = w.a(r.class);
                b = a;
                return a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o9b b(sbc sbcVar, int i) {
        lh4.a(this.a.get(new q(sbcVar, i)));
        return null;
    }
}
