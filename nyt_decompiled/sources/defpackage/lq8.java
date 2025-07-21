package defpackage;

import com.datadog.android.privacy.TrackingConsent;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public final class lq8 implements su0 {
    private final LinkedList a;
    private volatile TrackingConsent b;

    public lq8(TrackingConsent trackingConsent) {
        zq3.h(trackingConsent, "consent");
        this.a = new LinkedList();
        this.b = trackingConsent;
    }

    private final void f(TrackingConsent trackingConsent, TrackingConsent trackingConsent2) {
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((mq8) it2.next()).b(trackingConsent, trackingConsent2);
        }
    }

    @Override // defpackage.su0
    public synchronized void a() {
        this.a.clear();
    }

    @Override // defpackage.su0
    public synchronized void b(mq8 mq8Var) {
        zq3.h(mq8Var, "callback");
        this.a.remove(mq8Var);
    }

    @Override // defpackage.su0
    public TrackingConsent c() {
        return this.b;
    }

    @Override // defpackage.su0
    public synchronized void d(TrackingConsent trackingConsent) {
        zq3.h(trackingConsent, "consent");
        if (trackingConsent == this.b) {
            return;
        }
        TrackingConsent trackingConsent2 = this.b;
        this.b = trackingConsent;
        f(trackingConsent2, trackingConsent);
    }

    @Override // defpackage.su0
    public synchronized void e(mq8 mq8Var) {
        zq3.h(mq8Var, "callback");
        this.a.add(mq8Var);
    }
}
