package co.datadome.sdk;

import com.facebook.AuthenticationTokenClaims;
import defpackage.qn9;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class i {
    private static volatile i d;
    private Date a;
    private final long b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    private i() {
        this.b = qn9.b.b(e.ADVANCED_SIGNALS_COLLECTION) ? AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED : 10000L;
    }

    static i a() {
        if (d == null) {
            synchronized (i.class) {
                try {
                    if (d == null) {
                        d = new i();
                    }
                } finally {
                }
            }
        }
        return d;
    }

    void b(Date date) {
        this.a = date;
    }

    void c(boolean z) {
        this.c.set(z);
    }

    boolean d(List list) {
        return !this.c.get() && (this.a == null || (new Date().getTime() - this.a.getTime() > this.b && list.size() >= 5));
    }
}
