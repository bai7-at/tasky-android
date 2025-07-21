package defpackage;

import com.nytimes.android.logging.NYTLogger;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class d15 {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Throwable th) {
        if (th instanceof UndeliverableException) {
            th = th.getCause();
        }
        if ((th instanceof IOException) || (th instanceof InterruptedException)) {
            NYTLogger.C(th, "RxJavaPlugin Error Handling, irrelevant network problem / API cancellation", new Object[0]);
            return;
        }
        if ((th instanceof NullPointerException) || (th instanceof IllegalArgumentException)) {
            NYTLogger.i(th, "RxJavaPlugin Error Handling, likely a bug in the application", new Object[0]);
            Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        } else if (!(th instanceof IllegalStateException)) {
            NYTLogger.i(th, "RxJavaPlugin Error Handling, Undeliverable exception received, not sure what to do", new Object[0]);
        } else {
            NYTLogger.i(th, "RxJavaPlugin Error Handling, likely a bug in RxJava or in a custom operator", new Object[0]);
            Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
    }

    public static void c() {
        RxJavaPlugins.setErrorHandler(new Consumer() { // from class: c15
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                d15.b((Throwable) obj);
            }
        });
    }
}
