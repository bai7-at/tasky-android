package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
abstract class bh0 {
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
