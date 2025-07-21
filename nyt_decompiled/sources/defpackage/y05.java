package defpackage;

import io.reactivex.Observable;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public abstract class y05 {
    public static Observable b(final Object obj) {
        return Observable.fromCallable(new Callable() { // from class: x05
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object c;
                c = y05.c(obj);
                return c;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object c(Object obj) {
        return obj;
    }
}
