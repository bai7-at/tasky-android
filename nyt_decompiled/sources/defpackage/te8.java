package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class te8 implements gb7 {
    private static final String f = h94.i("SystemJobScheduler");
    private final Context a;
    private final JobScheduler b;
    private final re8 c;
    private final WorkDatabase d;
    private final a e;

    public te8(Context context, WorkDatabase workDatabase, a aVar) {
        this(context, workDatabase, aVar, ts3.c(context), new re8(context, aVar.a(), aVar.s()));
    }

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            ts3.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List g = g(context, jobScheduler);
        if (g == null || g.isEmpty()) {
            return;
        }
        Iterator it2 = g.iterator();
        while (it2.hasNext()) {
            e(jobScheduler, ((JobInfo) it2.next()).getId());
        }
    }

    private static void e(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            h94.e().d(f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            ej9 h = h(jobInfo);
            if (h != null && str.equals(h.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> b = ts3.b(jobScheduler);
        if (b == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : b) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static ej9 h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new ej9(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler c = ts3.c(context);
        List<JobInfo> g = g(context, c);
        List c2 = workDatabase.f().c();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                ej9 h = h(jobInfo);
                if (h != null) {
                    hashSet.add(h.b());
                } else {
                    e(c, jobInfo.getId());
                }
            }
        }
        Iterator it2 = c2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it2.next())) {
                h94.e().a(f, "Reconciling jobs");
                z = true;
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                ek9 i = workDatabase.i();
                Iterator it3 = c2.iterator();
                while (it3.hasNext()) {
                    i.p((String) it3.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.gb7
    public void b(String str) {
        List f2 = f(this.a, this.b, str);
        if (f2 == null || f2.isEmpty()) {
            return;
        }
        Iterator it2 = f2.iterator();
        while (it2.hasNext()) {
            e(this.b, ((Integer) it2.next()).intValue());
        }
        this.d.f().g(str);
    }

    @Override // defpackage.gb7
    public void c(dk9... dk9VarArr) {
        bf3 bf3Var = new bf3(this.d);
        for (dk9 dk9Var : dk9VarArr) {
            this.d.beginTransaction();
            try {
                dk9 h = this.d.i().h(dk9Var.a);
                if (h == null) {
                    h94.e().k(f, "Skipping scheduling " + dk9Var.a + " because it's no longer in the DB");
                    this.d.setTransactionSuccessful();
                } else if (h.b != WorkInfo.State.ENQUEUED) {
                    h94.e().k(f, "Skipping scheduling " + dk9Var.a + " because it is no longer enqueued");
                    this.d.setTransactionSuccessful();
                } else {
                    ej9 a = ik9.a(dk9Var);
                    ke8 d = this.d.f().d(a);
                    int e = d != null ? d.c : bf3Var.e(this.e.i(), this.e.g());
                    if (d == null) {
                        this.d.f().e(ne8.a(a, e));
                    }
                    j(dk9Var, e);
                    this.d.setTransactionSuccessful();
                }
            } finally {
                this.d.endTransaction();
            }
        }
    }

    @Override // defpackage.gb7
    public boolean d() {
        return true;
    }

    public void j(dk9 dk9Var, int i) {
        JobInfo a = this.c.a(dk9Var, i);
        h94 e = h94.e();
        String str = f;
        e.a(str, "Scheduling work ID " + dk9Var.a + "Job ID " + i);
        try {
            if (this.b.schedule(a) == 0) {
                h94.e().k(str, "Unable to schedule work ID " + dk9Var.a);
                if (dk9Var.q && dk9Var.r == OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    dk9Var.q = false;
                    h94.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", dk9Var.a));
                    j(dk9Var, i);
                }
            }
        } catch (IllegalStateException e2) {
            String a2 = ts3.a(this.a, this.d, this.e);
            h94.e().c(f, a2);
            IllegalStateException illegalStateException = new IllegalStateException(a2, e2);
            lv0 l = this.e.l();
            if (l == null) {
                throw illegalStateException;
            }
            l.accept(illegalStateException);
        } catch (Throwable th) {
            h94.e().d(f, "Unable to schedule " + dk9Var, th);
        }
    }

    public te8(Context context, WorkDatabase workDatabase, a aVar, JobScheduler jobScheduler, re8 re8Var) {
        this.a = context;
        this.b = jobScheduler;
        this.c = re8Var;
        this.d = workDatabase;
        this.e = aVar;
    }
}
