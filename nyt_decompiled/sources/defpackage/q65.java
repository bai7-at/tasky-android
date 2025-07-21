package defpackage;

import com.datadog.android.privacy.TrackingConsent;

/* loaded from: classes2.dex */
public final class q65 implements su0 {
    @Override // defpackage.su0
    public void a() {
    }

    @Override // defpackage.su0
    public void b(mq8 mq8Var) {
        zq3.h(mq8Var, "callback");
    }

    @Override // defpackage.su0
    public TrackingConsent c() {
        return TrackingConsent.GRANTED;
    }

    @Override // defpackage.su0
    public void d(TrackingConsent trackingConsent) {
        zq3.h(trackingConsent, "consent");
    }

    @Override // defpackage.su0
    public void e(mq8 mq8Var) {
        zq3.h(mq8Var, "callback");
    }
}
