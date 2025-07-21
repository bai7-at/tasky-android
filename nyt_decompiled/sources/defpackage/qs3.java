package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import java.util.List;

/* loaded from: classes.dex */
final class qs3 {
    public static final qs3 a = new qs3();

    private qs3() {
    }

    public final List a(JobScheduler jobScheduler) {
        zq3.h(jobScheduler, "jobScheduler");
        List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
        zq3.g(allPendingJobs, "jobScheduler.allPendingJobs");
        return allPendingJobs;
    }
}
