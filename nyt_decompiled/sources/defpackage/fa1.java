package defpackage;

import com.datadog.android.api.InternalLogger;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class fa1 implements ha1 {
    private final ExecutorService a;
    private final InternalLogger b;
    private final pb1 c;
    private final qb1 d;

    public fa1(ExecutorService executorService, InternalLogger internalLogger, pb1 pb1Var, qb1 qb1Var) {
        zq3.h(executorService, "executorService");
        zq3.h(internalLogger, "internalLogger");
        zq3.h(pb1Var, "dataStoreFileReader");
        zq3.h(qb1Var, "datastoreFileWriter");
        this.a = executorService;
        this.b = internalLogger;
        this.c = pb1Var;
        this.d = qb1Var;
    }
}
