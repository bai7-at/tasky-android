package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class fc {
    private final String a;
    private volatile Logger b;

    fc(Class cls) {
        this.a = cls.getName();
    }

    final Logger a() {
        Logger logger = this.b;
        if (logger != null) {
            return logger;
        }
        synchronized (this) {
            try {
                Logger logger2 = this.b;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.a);
                this.b = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
