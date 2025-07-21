package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class db7 implements pa1 {
    private final pa1 a;
    private final ExecutorService b;
    private final InternalLogger c;

    public db7(pa1 pa1Var, ExecutorService executorService, InternalLogger internalLogger) {
        zq3.h(pa1Var, "delegateWriter");
        zq3.h(executorService, "executorService");
        zq3.h(internalLogger, "internalLogger");
        this.a = pa1Var;
        this.b = executorService;
        this.c = internalLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(db7 db7Var, Object obj) {
        zq3.h(db7Var, "this$0");
        zq3.h(obj, "$element");
        db7Var.a.a(obj);
    }

    @Override // defpackage.pa1
    public void a(final Object obj) {
        zq3.h(obj, "element");
        ConcurrencyExtKt.c(this.b, "Data writing", this.c, new Runnable() { // from class: cb7
            @Override // java.lang.Runnable
            public final void run() {
                db7.c(db7.this, obj);
            }
        });
    }
}
