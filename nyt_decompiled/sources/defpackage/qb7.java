package defpackage;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* loaded from: classes2.dex */
public final class qb7 implements ca2 {
    private final p76 a;
    private final p76 b;
    private final p76 c;
    private final p76 d;

    public qb7(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        this.a = p76Var;
        this.b = p76Var2;
        this.c = p76Var3;
        this.d = p76Var4;
    }

    public static qb7 a(p76 p76Var, p76 p76Var2, p76 p76Var3, p76 p76Var4) {
        return new qb7(p76Var, p76Var2, p76Var3, p76Var4);
    }

    public static bk9 c(Context context, w42 w42Var, SchedulerConfig schedulerConfig, ul0 ul0Var) {
        return (bk9) a16.c(pb7.a(context, w42Var, schedulerConfig, ul0Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.p76
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bk9 get() {
        return c((Context) this.a.get(), (w42) this.b.get(), (SchedulerConfig) this.c.get(), (ul0) this.d.get());
    }
}
