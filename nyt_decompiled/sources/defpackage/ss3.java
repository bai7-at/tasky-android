package defpackage;

import android.app.job.JobScheduler;

/* loaded from: classes.dex */
final class ss3 {
    public static final ss3 a = new ss3();

    private ss3() {
    }

    public final JobScheduler a(JobScheduler jobScheduler) {
        JobScheduler forNamespace;
        zq3.h(jobScheduler, "jobScheduler");
        forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        zq3.g(forNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return forNamespace;
    }
}
