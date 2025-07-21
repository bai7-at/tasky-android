package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class ts3 {
    private static final String a;

    static {
        String i = h94.i("SystemJobScheduler");
        zq3.g(i, "tagWithPrefix(\"SystemJobScheduler\")");
        a = i;
    }

    public static final String a(Context context, WorkDatabase workDatabase, a aVar) {
        String str;
        zq3.h(context, "context");
        zq3.h(workDatabase, "workDatabase");
        zq3.h(aVar, "configuration");
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 31 ? 150 : 100;
        int size = workDatabase.i().e().size();
        String str2 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i >= 34) {
            JobScheduler c = c(context);
            List b = b(c);
            if (b != null) {
                List g = te8.g(context, c);
                int size2 = g != null ? b.size() - g.size() : 0;
                String str3 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                zq3.f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List g2 = te8.g(context, (JobScheduler) systemService);
                int size3 = g2 != null ? g2.size() : 0;
                if (size3 != 0) {
                    str3 = size3 + " from WorkManager in the default namespace";
                }
                str2 = i.u0(i.q(b.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str3), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List g3 = te8.g(context, c(context));
            if (g3 != null) {
                str2 = g3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler " + i2 + " job limit exceeded.\nIn JobScheduler there are " + str2 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + aVar.h() + '.';
    }

    public static final List b(JobScheduler jobScheduler) {
        zq3.h(jobScheduler, "<this>");
        try {
            return qs3.a.a(jobScheduler);
        } catch (Throwable th) {
            h94.e().d(a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler c(Context context) {
        zq3.h(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        zq3.f(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? ss3.a.a(jobScheduler) : jobScheduler;
    }
}
