package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes3.dex */
final class pce implements hnd {
    private Message a;
    private kde b;

    /* synthetic */ pce(tbe tbeVar) {
    }

    private final void c() {
        this.a = null;
        this.b = null;
        kde.g(this);
    }

    public final pce a(Message message, kde kdeVar) {
        this.a = message;
        this.b = kdeVar;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.a;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        c();
        return sendMessageAtFrontOfQueue;
    }

    @Override // defpackage.hnd
    public final void zza() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        c();
    }
}
