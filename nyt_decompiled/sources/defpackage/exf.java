package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes3.dex */
final class exf extends Handler {
    final /* synthetic */ gxf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    exf(gxf gxfVar, Looper looper) {
        super(looper);
        this.a = gxfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        gxf.d(this.a, message);
    }
}
