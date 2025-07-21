package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.ConcurrencyExtKt;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class ma1 implements by8 {
    private final String a;
    private final ScheduledThreadPoolExecutor b;
    private final InternalLogger c;
    private final la1 d;

    public ma1(String str, f28 f28Var, na1 na1Var, tx0 tx0Var, v35 v35Var, oe8 oe8Var, cy8 cy8Var, int i, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, InternalLogger internalLogger) {
        zq3.h(str, "featureName");
        zq3.h(f28Var, "storage");
        zq3.h(na1Var, "dataUploader");
        zq3.h(tx0Var, "contextProvider");
        zq3.h(v35Var, "networkInfoProvider");
        zq3.h(oe8Var, "systemInfoProvider");
        zq3.h(cy8Var, "uploadSchedulerStrategy");
        zq3.h(scheduledThreadPoolExecutor, "scheduledThreadPoolExecutor");
        zq3.h(internalLogger, "internalLogger");
        this.a = str;
        this.b = scheduledThreadPoolExecutor;
        this.c = internalLogger;
        this.d = new la1(str, scheduledThreadPoolExecutor, f28Var, na1Var, tx0Var, v35Var, oe8Var, cy8Var, i, internalLogger);
    }

    @Override // defpackage.by8
    public void a() {
        this.b.remove(this.d);
    }

    @Override // defpackage.by8
    public void b() {
        ConcurrencyExtKt.a(this.b, this.a + ": data upload", this.c, this.d);
    }
}
