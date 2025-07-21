package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import io.embrace.android.embracesdk.config.behavior.BackgroundActivityBehavior;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class j4d {
    private static volatile j4d j;
    private final String a;
    protected final Clock b;
    protected final ExecutorService c;
    private final qm d;
    private final List e;
    private int f;
    private boolean g;
    private final String h;
    private volatile sdb i;

    protected j4d(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !o(str2, str3)) {
            this.a = "FA";
        } else {
            this.a = str;
        }
        this.b = DefaultClock.getInstance();
        s7b.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new efc(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.d = new qm(this);
        this.e = new ArrayList();
        try {
            if (i8f.c(context, "google_app_id", wie.a(context)) != null && !k()) {
                this.h = null;
                this.g = true;
                Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (o(str2, str3)) {
            this.h = str2;
        } else {
            this.h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        n(new o1c(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new f3d(this));
        }
    }

    protected static final boolean k() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (z) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", exc);
    }

    private final void m(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        n(new apc(this, l, str, str2, bundle, z, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(hrc hrcVar) {
        this.c.execute(hrcVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(String str, String str2) {
        return (str2 == null || str == null || k()) ? false : true;
    }

    public static j4d v(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (j == null) {
            synchronized (j4d.class) {
                try {
                    if (j == null) {
                        j = new j4d(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return j;
    }

    public final String A() {
        m9b m9bVar = new m9b();
        n(new h9c(this, m9bVar));
        return m9bVar.l3(500L);
    }

    public final String B() {
        m9b m9bVar = new m9b();
        n(new x5c(this, m9bVar));
        return m9bVar.l3(500L);
    }

    public final List C(String str, String str2) {
        m9b m9bVar = new m9b();
        n(new lsb(this, str, str2, m9bVar));
        List list = (List) m9b.n4(m9bVar.Q1(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map D(String str, String str2, boolean z) {
        m9b m9bVar = new m9b();
        n(new qbc(this, str, str2, z, m9bVar));
        Bundle Q1 = m9bVar.Q1(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
        if (Q1 == null || Q1.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(Q1.size());
        for (String str3 : Q1.keySet()) {
            Object obj = Q1.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void H(String str) {
        n(new s2c(this, str));
    }

    public final void I(String str, String str2, Bundle bundle) {
        n(new grb(this, str, str2, bundle));
    }

    public final void J(String str) {
        n(new w3c(this, str));
    }

    public final void K(String str, Bundle bundle) {
        m(null, str, bundle, false, true, null);
    }

    public final void L(String str, String str2, Bundle bundle) {
        m(str, str2, bundle, true, true, null);
    }

    public final void a(int i, String str, Object obj, Object obj2, Object obj3) {
        n(new wcc(this, false, 5, str, obj, null, null));
    }

    public final void b(x4f x4fVar) {
        Preconditions.checkNotNull(x4fVar);
        synchronized (this.e) {
            for (int i = 0; i < this.e.size(); i++) {
                try {
                    if (x4fVar.equals(((Pair) this.e.get(i)).first)) {
                        Log.w(this.a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ntc ntcVar = new ntc(x4fVar);
            this.e.add(new Pair(x4fVar, ntcVar));
            if (this.i != null) {
                try {
                    this.i.registerOnMeasurementEventListener(ntcVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            n(new umc(this, ntcVar));
        }
    }

    public final void c(Bundle bundle) {
        n(new aqb(this, bundle));
    }

    public final void d(Bundle bundle) {
        n(new cxb(this, bundle));
    }

    public final void e(Activity activity, String str, String str2) {
        n(new uub(this, activity, str, str2));
    }

    public final void f(Boolean bool) {
        n(new yvb(this, bool));
    }

    public final void g(String str) {
        n(new ptb(this, str));
    }

    public final void h(String str, String str2, Object obj, boolean z) {
        n(new dqc(this, str, str2, obj, z));
    }

    public final int p(String str) {
        m9b m9bVar = new m9b();
        n(new igc(this, str, m9bVar));
        Integer num = (Integer) m9b.n4(m9bVar.Q1(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long q() {
        m9b m9bVar = new m9b();
        n(new d8c(this, m9bVar));
        Long l = (Long) m9b.n4(m9bVar.Q1(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.b.currentTimeMillis()).nextLong();
        int i = this.f + 1;
        this.f = i;
        return nextLong + i;
    }

    public final Bundle r(Bundle bundle, boolean z) {
        m9b m9bVar = new m9b();
        n(new aec(this, bundle, m9bVar));
        if (z) {
            return m9bVar.Q1(BackgroundActivityBehavior.MIN_BACKGROUND_ACTIVITY_DURATION_DEFAULT);
        }
        return null;
    }

    public final qm s() {
        return this.d;
    }

    protected final sdb u(Context context, boolean z) {
        try {
            return scb.asInterface(DynamiteModule.e(context, DynamiteModule.e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            this.l(e, true, false);
            return null;
        }
    }

    public final String x() {
        return this.h;
    }

    public final String y() {
        m9b m9bVar = new m9b();
        n(new z6c(this, m9bVar));
        return m9bVar.l3(50L);
    }

    public final String z() {
        m9b m9bVar = new m9b();
        n(new lac(this, m9bVar));
        return m9bVar.l3(500L);
    }
}
