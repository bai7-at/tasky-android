package defpackage;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class rq9 extends ysd {
    final /* synthetic */ o37 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    rq9(o37 o37Var, Looper looper) {
        super(looper);
        this.a = o37Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        o37.d(this.a, message);
    }
}
