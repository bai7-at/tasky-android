package defpackage;

import io.reactivex.Single;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class a92 {
    final ve2 a;
    final bq5 b;

    public a92(ve2 ve2Var, bq5 bq5Var) {
        this.a = ve2Var;
        this.b = bq5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean b(Object obj, sd0 sd0Var) {
        this.a.e(this.b.a(obj), sd0Var);
        return Boolean.TRUE;
    }

    public Single c(final Object obj, final sd0 sd0Var) {
        return Single.fromCallable(new Callable() { // from class: z82
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean b;
                b = a92.this.b(obj, sd0Var);
                return b;
            }
        });
    }
}
