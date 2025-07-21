package defpackage;

import com.nytimes.android.logging.NYTLogger;
import io.reactivex.observers.DisposableObserver;

/* loaded from: classes4.dex */
public abstract class d05 extends DisposableObserver {
    private final String a;

    public d05(Class cls) {
        this.a = cls.getSimpleName();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        NYTLogger.i(th, "Error in " + this.a, new Object[0]);
    }
}
