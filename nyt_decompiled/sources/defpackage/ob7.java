package defpackage;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* loaded from: classes2.dex */
public final class ob7 implements ca2 {
    private final p76 a;

    public ob7(p76 p76Var) {
        this.a = p76Var;
    }

    public static SchedulerConfig a(ul0 ul0Var) {
        return (SchedulerConfig) a16.c(nb7.a(ul0Var), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static ob7 b(p76 p76Var) {
        return new ob7(p76Var);
    }

    @Override // defpackage.p76
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SchedulerConfig get() {
        return a((ul0) this.a.get());
    }
}
