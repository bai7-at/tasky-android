package defpackage;

import com.nytimes.android.external.store3.base.RecordState;
import com.nytimes.android.external.store3.base.impl.StalePolicy;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.PublishSubject;

/* loaded from: classes4.dex */
public abstract class e38 {
    public static void b(c60 c60Var, Object obj) {
        if (c60Var instanceof jl0) {
            ((jl0) c60Var).clear(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean c(Object obj, Object obj2) {
        return obj2.equals(obj);
    }

    public static boolean d(Object obj, c60 c60Var) {
        return (c60Var instanceof jt6) && ((jt6) c60Var).e(obj) == RecordState.STALE;
    }

    public static ObservableTransformer e(PublishSubject publishSubject, final Object obj) {
        return nx6.c(publishSubject.filter(new Predicate() { // from class: d38
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj2) {
                boolean c;
                c = e38.c(obj, obj2);
                return c;
            }
        }));
    }

    public static boolean f(c60 c60Var, StalePolicy stalePolicy, Object obj) {
        return stalePolicy == StalePolicy.NETWORK_BEFORE_STALE && d(obj, c60Var);
    }
}
