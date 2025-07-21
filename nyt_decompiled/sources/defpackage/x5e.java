package defpackage;

import com.google.android.gms.internal.ads.zb;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class x5e {
    private static final j64 d = zb.h(null);
    private final kke a;
    private final ScheduledExecutorService b;
    private final y5e c;

    public x5e(kke kkeVar, ScheduledExecutorService scheduledExecutorService, y5e y5eVar) {
        this.a = kkeVar;
        this.b = scheduledExecutorService;
        this.c = y5eVar;
    }

    public final k5e a(Object obj, j64... j64VarArr) {
        return new k5e(this, obj, Arrays.asList(j64VarArr), null);
    }

    public final w5e b(Object obj, j64 j64Var) {
        return new w5e(this, obj, j64Var, Collections.singletonList(j64Var), j64Var);
    }

    protected abstract String f(Object obj);
}
