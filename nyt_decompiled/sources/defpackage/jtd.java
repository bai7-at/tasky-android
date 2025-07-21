package defpackage;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public final class jtd extends cde {
    public jtd(Looper looper) {
        super(looper);
    }

    @Override // defpackage.cde
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            dyf.r();
            wxf.l(dyf.q().d(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            dyf.q().w(e, "AdMobHandler.handleMessage");
        }
    }
}
