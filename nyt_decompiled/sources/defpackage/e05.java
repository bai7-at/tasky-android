package defpackage;

import com.nytimes.android.logging.NYTLogger;
import io.reactivex.observers.DisposableSingleObserver;

/* loaded from: classes4.dex */
public abstract class e05 extends DisposableSingleObserver {
    private final String a;

    public e05(Class cls) {
        this.a = cls.getSimpleName();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        NYTLogger.i(th, "Error in " + this.a, new Object[0]);
    }
}
