package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* loaded from: classes4.dex */
final class nx6 implements ObservableTransformer {
    private final Observable a;

    private nx6(Observable observable) {
        this.a = observable;
    }

    static nx6 c(Observable observable) {
        return new nx6((Observable) e16.d(observable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource d(Observable observable) {
        return observable.switchMap(new Function() { // from class: mx6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource e;
                e = nx6.this.e(obj);
                return e;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ObservableSource e(Object obj) {
        return this.a;
    }

    @Override // io.reactivex.ObservableTransformer
    public ObservableSource apply(Observable observable) {
        return observable.repeatWhen(new Function() { // from class: lx6
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                ObservableSource d;
                d = nx6.this.d((Observable) obj);
                return d;
            }
        });
    }
}
