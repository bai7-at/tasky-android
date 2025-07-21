package defpackage;

import android.os.Looper;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposables;

/* loaded from: classes3.dex */
public abstract class d16 {
    public static final boolean a(Observer observer) {
        zq3.i(observer, "observer");
        if (zq3.c(Looper.myLooper(), Looper.getMainLooper())) {
            return true;
        }
        observer.onSubscribe(Disposables.empty());
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to be called on the main thread but was ");
        Thread currentThread = Thread.currentThread();
        zq3.d(currentThread, "Thread.currentThread()");
        sb.append(currentThread.getName());
        observer.onError(new IllegalStateException(sb.toString()));
        return false;
    }
}
