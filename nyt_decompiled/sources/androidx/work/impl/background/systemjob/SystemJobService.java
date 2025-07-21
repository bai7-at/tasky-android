package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import defpackage.ej9;
import defpackage.h94;
import defpackage.jj9;
import defpackage.lj9;
import defpackage.n62;
import defpackage.pj9;
import defpackage.q08;
import defpackage.r08;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements n62 {
    private static final String e = h94.i("SystemJobService");
    private pj9 a;
    private final Map b = new HashMap();
    private final r08 c = r08.d(false);
    private jj9 d;

    static class a {
        static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    static class b {
        static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    static class c {
        static int a(JobParameters jobParameters) {
            return SystemJobService.c(jobParameters.getStopReason());
        }
    }

    private static void b(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    static int c(int i) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i;
            default:
                return -512;
        }
    }

    private static ej9 d(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ej9(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.n62
    public void a(ej9 ej9Var, boolean z) {
        b("onExecuted");
        h94.e().a(e, ej9Var.b() + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.b.remove(ej9Var);
        this.c.c(ej9Var);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            pj9 p = pj9.p(getApplicationContext());
            this.a = p;
            androidx.work.impl.a r = p.r();
            this.d = new lj9(r, this.a.v());
            r.e(this);
        } catch (IllegalStateException e2) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
            h94.e().k(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        pj9 pj9Var = this.a;
        if (pj9Var != null) {
            pj9Var.r().p(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        b("onStartJob");
        if (this.a == null) {
            h94.e().a(e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        ej9 d = d(jobParameters);
        if (d == null) {
            h94.e().c(e, "WorkSpec id not found!");
            return false;
        }
        if (this.b.containsKey(d)) {
            h94.e().a(e, "Job is already being executed by SystemJobService: " + d);
            return false;
        }
        h94.e().a(e, "onStartJob for " + d);
        this.b.put(d, jobParameters);
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.a = Arrays.asList(a.a(jobParameters));
        }
        aVar.c = b.a(jobParameters);
        this.d.c(this.c.f(d), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        b("onStopJob");
        if (this.a == null) {
            h94.e().a(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        ej9 d = d(jobParameters);
        if (d == null) {
            h94.e().c(e, "WorkSpec id not found!");
            return false;
        }
        h94.e().a(e, "onStopJob for " + d);
        this.b.remove(d);
        q08 c2 = this.c.c(d);
        if (c2 != null) {
            this.d.b(c2, Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512);
        }
        return !this.a.r().j(d.b());
    }
}
