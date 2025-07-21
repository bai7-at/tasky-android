package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* loaded from: classes2.dex */
public class ms3 implements bk9 {
    private final Context a;
    private final w42 b;
    private final SchedulerConfig c;

    public ms3(Context context, w42 w42Var, SchedulerConfig schedulerConfig) {
        this.a = context;
        this.b = w42Var;
        this.c = schedulerConfig;
    }

    private boolean d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // defpackage.bk9
    public void a(as8 as8Var, int i) {
        b(as8Var, i, false);
    }

    @Override // defpackage.bk9
    public void b(as8 as8Var, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.a.getSystemService("jobscheduler");
        int c = c(as8Var);
        if (!z && d(jobScheduler, c, i)) {
            ca4.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", as8Var);
            return;
        }
        long E0 = this.b.E0(as8Var);
        JobInfo.Builder c2 = this.c.c(new JobInfo.Builder(c, componentName), as8Var.d(), E0, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", as8Var.b());
        persistableBundle.putInt("priority", x26.a(as8Var.d()));
        if (as8Var.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(as8Var.c(), 0));
        }
        c2.setExtras(persistableBundle);
        ca4.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", as8Var, Integer.valueOf(c), Long.valueOf(this.c.g(as8Var.d(), E0, i)), Long.valueOf(E0), Integer.valueOf(i));
        jobScheduler.schedule(c2.build());
    }

    int c(as8 as8Var) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.a.getPackageName().getBytes(Charset.forName(Constants.DEFAULT_ENCODING)));
        adler32.update(as8Var.b().getBytes(Charset.forName(Constants.DEFAULT_ENCODING)));
        adler32.update(ByteBuffer.allocate(4).putInt(x26.a(as8Var.d())).array());
        if (as8Var.c() != null) {
            adler32.update(as8Var.c());
        }
        return (int) adler32.getValue();
    }
}
