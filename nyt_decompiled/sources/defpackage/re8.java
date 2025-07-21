package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import defpackage.gv0;
import java.util.Iterator;

/* loaded from: classes.dex */
class re8 {
    private static final String d = h94.i("SystemJobInfoConverter");
    private final ComponentName a;
    private final zl0 b;
    private final boolean c;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    re8(Context context, zl0 zl0Var, boolean z) {
        this.b = zl0Var;
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.c = z;
    }

    private static JobInfo.TriggerContentUri b(gv0.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.a(), cVar.b() ? 1 : 0);
    }

    static int c(NetworkType networkType) {
        int i = a.a[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        h94.e().a(d, "API version too low. Cannot convert network type value " + networkType);
        return 1;
    }

    static void d(JobInfo.Builder builder, NetworkType networkType) {
        if (Build.VERSION.SDK_INT < 30 || networkType != NetworkType.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(networkType));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(dk9 dk9Var, int i) {
        String k;
        gv0 gv0Var = dk9Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", dk9Var.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", dk9Var.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", dk9Var.n());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.a).setRequiresCharging(gv0Var.i()).setRequiresDeviceIdle(gv0Var.j()).setExtras(persistableBundle);
        NetworkRequest d2 = gv0Var.d();
        if (d2 != null) {
            se8.a(extras, d2);
        } else {
            d(extras, gv0Var.f());
        }
        if (!gv0Var.j()) {
            extras.setBackoffCriteria(dk9Var.m, dk9Var.l == BackoffPolicy.LINEAR ? 0 : 1);
        }
        long max = Math.max(dk9Var.c() - this.b.currentTimeMillis(), 0L);
        if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!dk9Var.q && this.c) {
            extras.setImportantWhileForeground(true);
        }
        if (gv0Var.g()) {
            Iterator it2 = gv0Var.c().iterator();
            while (it2.hasNext()) {
                extras.addTriggerContentUri(b((gv0.c) it2.next()));
            }
            extras.setTriggerContentUpdateDelay(gv0Var.b());
            extras.setTriggerContentMaxDelay(gv0Var.a());
        }
        extras.setPersisted(false);
        int i2 = Build.VERSION.SDK_INT;
        extras.setRequiresBatteryNotLow(gv0Var.h());
        extras.setRequiresStorageNotLow(gv0Var.k());
        boolean z = dk9Var.k > 0;
        boolean z2 = max > 0;
        if (i2 >= 31 && dk9Var.q && !z && !z2) {
            extras.setExpedited(true);
        }
        if (i2 >= 35 && (k = dk9Var.k()) != null) {
            extras.setTraceTag(k);
        }
        return extras.build();
    }
}
