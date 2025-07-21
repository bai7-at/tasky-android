package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public class j6f extends Handler {
    private final Looper a;

    public j6f(Looper looper) {
        super(looper);
        this.a = Looper.getMainLooper();
    }

    public j6f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.a = Looper.getMainLooper();
    }
}
