package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import defpackage.h21;
import defpackage.r18;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class i11 {
    static final FilenameFilter s = new FilenameFilter() { // from class: h11
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean J;
            J = i11.J(file, str);
            return J;
        }
    };
    private final Context a;
    private final c91 b;
    private final l11 c;
    private final p09 d;
    private final e11 e;
    private final df3 f;
    private final ue2 g;
    private final fl h;
    private final e84 i;
    private final m11 j;
    private final vc k;
    private final ul7 l;
    private h21 m;
    private pn7 n = null;
    final qg8 o = new qg8();
    final qg8 p = new qg8();
    final qg8 q = new qg8();
    final AtomicBoolean r = new AtomicBoolean(false);

    class a implements h21.a {
        a() {
        }

        @Override // h21.a
        public void a(pn7 pn7Var, Thread thread, Throwable th) {
            i11.this.G(pn7Var, thread, th);
        }
    }

    class b implements Callable {
        final /* synthetic */ long a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;
        final /* synthetic */ pn7 d;
        final /* synthetic */ boolean e;

        class a implements bc8 {
            final /* synthetic */ Executor a;
            final /* synthetic */ String b;

            a(Executor executor, String str) {
                this.a = executor;
                this.b = str;
            }

            @Override // defpackage.bc8
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public og8 then(com.google.firebase.crashlytics.internal.settings.c cVar) {
                if (cVar != null) {
                    return vg8.g(i11.this.M(), i11.this.l.w(this.a, b.this.e ? this.b : null));
                }
                m94.f().k("Received null app settings, cannot send reports at crash time.");
                return vg8.e(null);
            }
        }

        b(long j, Throwable th, Thread thread, pn7 pn7Var, boolean z) {
            this.a = j;
            this.b = th;
            this.c = thread;
            this.d = pn7Var;
            this.e = z;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public og8 call() {
            long F = i11.F(this.a);
            String C = i11.this.C();
            if (C == null) {
                m94.f().d("Tried to write a fatal exception while no session was open.");
                return vg8.e(null);
            }
            i11.this.c.a();
            i11.this.l.r(this.b, this.c, C, F);
            i11.this.w(this.a);
            i11.this.t(this.d);
            i11.this.v(new ag0(i11.this.f).toString());
            if (!i11.this.b.d()) {
                return vg8.e(null);
            }
            Executor c = i11.this.e.c();
            return this.d.a().s(c, new a(c, C));
        }
    }

    class c implements bc8 {
        c() {
        }

        @Override // defpackage.bc8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public og8 then(Void r1) {
            return vg8.e(Boolean.TRUE);
        }
    }

    class d implements bc8 {
        final /* synthetic */ og8 a;

        class a implements Callable {
            final /* synthetic */ Boolean a;

            /* renamed from: i11$d$a$a, reason: collision with other inner class name */
            class C0487a implements bc8 {
                final /* synthetic */ Executor a;

                C0487a(Executor executor) {
                    this.a = executor;
                }

                @Override // defpackage.bc8
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public og8 then(com.google.firebase.crashlytics.internal.settings.c cVar) {
                    if (cVar == null) {
                        m94.f().k("Received null app settings at app startup. Cannot send cached reports");
                        return vg8.e(null);
                    }
                    i11.this.M();
                    i11.this.l.v(this.a);
                    i11.this.q.e(null);
                    return vg8.e(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public og8 call() {
                if (this.a.booleanValue()) {
                    m94.f().b("Sending cached crash reports...");
                    i11.this.b.c(this.a.booleanValue());
                    Executor c = i11.this.e.c();
                    return d.this.a.s(c, new C0487a(c));
                }
                m94.f().i("Deleting cached crash reports...");
                i11.r(i11.this.K());
                i11.this.l.u();
                i11.this.q.e(null);
                return vg8.e(null);
            }
        }

        d(og8 og8Var) {
            this.a = og8Var;
        }

        @Override // defpackage.bc8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public og8 then(Boolean bool) {
            return i11.this.e.i(new a(bool));
        }
    }

    class e implements Callable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        e(long j, String str) {
            this.a = j;
            this.b = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (i11.this.I()) {
                return null;
            }
            i11.this.i.g(this.a, this.b);
            return null;
        }
    }

    class f implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;

        f(long j, Throwable th, Thread thread) {
            this.a = j;
            this.b = th;
            this.c = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i11.this.I()) {
                return;
            }
            long F = i11.F(this.a);
            String C = i11.this.C();
            if (C == null) {
                m94.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                i11.this.l.s(this.b, this.c, C, F);
            }
        }
    }

    class g implements Callable {
        final /* synthetic */ String a;

        g(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            i11.this.v(this.a);
            return null;
        }
    }

    class h implements Callable {
        final /* synthetic */ long a;

        h(long j) {
            this.a = j;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            i11.this.k.a("_ae", bundle);
            return null;
        }
    }

    i11(Context context, e11 e11Var, df3 df3Var, c91 c91Var, ue2 ue2Var, l11 l11Var, fl flVar, p09 p09Var, e84 e84Var, ul7 ul7Var, m11 m11Var, vc vcVar) {
        this.a = context;
        this.e = e11Var;
        this.f = df3Var;
        this.b = c91Var;
        this.g = ue2Var;
        this.c = l11Var;
        this.h = flVar;
        this.d = p09Var;
        this.i = e84Var;
        this.j = m11Var;
        this.k = vcVar;
        this.l = ul7Var;
    }

    private static boolean A() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context B() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String C() {
        SortedSet n = this.l.n();
        if (n.isEmpty()) {
            return null;
        }
        return (String) n.first();
    }

    private static long D() {
        return F(System.currentTimeMillis());
    }

    static List E(f25 f25Var, String str, ue2 ue2Var, byte[] bArr) {
        File n = ue2Var.n(str, "user-data");
        File n2 = ue2Var.n(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new wf0("logs_file", "logs", bArr));
        arrayList.add(new zd2("crash_meta_file", "metadata", f25Var.c()));
        arrayList.add(new zd2("session_meta_file", "session", f25Var.f()));
        arrayList.add(new zd2("app_meta_file", "app", f25Var.d()));
        arrayList.add(new zd2("device_meta_file", "device", f25Var.a()));
        arrayList.add(new zd2("os_meta_file", "os", f25Var.e()));
        arrayList.add(new zd2("minidump_file", "minidump", f25Var.b()));
        arrayList.add(new zd2("user_meta_file", "user", n));
        arrayList.add(new zd2("keys_file", "keys", n2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long F(long j) {
        return j / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean J(File file, String str) {
        return str.startsWith(".ae");
    }

    private og8 L(long j) {
        if (A()) {
            m94.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return vg8.e(null);
        }
        m94.f().b("Logging app exception event to Firebase Analytics");
        return vg8.c(new ScheduledThreadPoolExecutor(1), new h(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public og8 M() {
        ArrayList arrayList = new ArrayList();
        for (File file : K()) {
            try {
                arrayList.add(L(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                m94.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return vg8.f(arrayList);
    }

    private og8 R() {
        if (this.b.d()) {
            m94.f().b("Automatic data collection is enabled. Allowing upload.");
            this.o.e(Boolean.FALSE);
            return vg8.e(Boolean.TRUE);
        }
        m94.f().b("Automatic data collection is disabled.");
        m94.f().i("Notifying that unsent reports are available.");
        this.o.e(Boolean.TRUE);
        og8 r = this.b.g().r(new c());
        m94.f().b("Waiting for send/deleteUnsentReports to be called.");
        return k29.i(r, this.p.a());
    }

    private void S(String str) {
        List historicalProcessExitReasons;
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            m94.f().i("ANR feature enabled, but device is API " + i);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.l.t(str, historicalProcessExitReasons, new e84(this.g, str), p09.i(str, this.g, this.e));
        } else {
            m94.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    private static r18.a o(df3 df3Var, fl flVar) {
        return r18.a.b(df3Var.f(), flVar.e, flVar.f, df3Var.a(), DeliveryMechanism.determineFrom(flVar.c).getId(), flVar.g);
    }

    private static r18.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return r18.b.c(CommonUtils.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), CommonUtils.s(), statFs.getBlockCount() * statFs.getBlockSize(), CommonUtils.y(context), CommonUtils.m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static r18.c q(Context context) {
        return r18.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, CommonUtils.z(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((File) it2.next()).delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void u(boolean z, pn7 pn7Var) {
        ArrayList arrayList = new ArrayList(this.l.n());
        if (arrayList.size() <= z) {
            m94.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (pn7Var.b().b.b) {
            S(str);
        } else {
            m94.f().i("ANR feature disabled.");
        }
        if (this.j.c(str)) {
            y(str);
        }
        this.l.i(D(), z != 0 ? (String) arrayList.get(0) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(String str) {
        long D = D();
        m94.f().b("Opening a new session with ID " + str);
        this.j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", k11.i()), D, r18.b(o(this.f, this.h), q(B()), p(B())));
        this.i.e(str);
        this.l.o(str, D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(long j) {
        try {
            if (this.g.d(".ae" + j).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            m94.f().l("Could not create app exception marker file.", e2);
        }
    }

    private void y(String str) {
        m94.f().i("Finalizing native report for session " + str);
        f25 a2 = this.j.a(str);
        File b2 = a2.b();
        if (b2 == null || !b2.exists()) {
            m94.f().k("No minidump data found for session " + str);
            return;
        }
        long lastModified = b2.lastModified();
        e84 e84Var = new e84(this.g, str);
        File h2 = this.g.h(str);
        if (!h2.isDirectory()) {
            m94.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        w(lastModified);
        List E = E(a2, str, this.g, e84Var.b());
        e25.b(h2, E);
        m94.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.l.h(str, E);
        e84Var.a();
    }

    void G(pn7 pn7Var, Thread thread, Throwable th) {
        H(pn7Var, thread, th, false);
    }

    synchronized void H(pn7 pn7Var, Thread thread, Throwable th, boolean z) {
        m94.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            k29.d(this.e.i(new b(System.currentTimeMillis(), th, thread, pn7Var, z)));
        } catch (TimeoutException unused) {
            m94.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e2) {
            m94.f().e("Error handling uncaught exception", e2);
        }
    }

    boolean I() {
        h21 h21Var = this.m;
        return h21Var != null && h21Var.a();
    }

    List K() {
        return this.g.e(s);
    }

    void N(String str) {
        this.e.h(new g(str));
    }

    void O(String str, String str2) {
        try {
            this.d.l(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context != null && CommonUtils.w(context)) {
                throw e2;
            }
            m94.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    void P(String str) {
        this.d.m(str);
    }

    og8 Q(og8 og8Var) {
        if (this.l.l()) {
            m94.f().i("Crash reports are available to be sent.");
            return R().r(new d(og8Var));
        }
        m94.f().i("No crash reports are available to be sent.");
        this.o.e(Boolean.FALSE);
        return vg8.e(null);
    }

    void T(Thread thread, Throwable th) {
        this.e.g(new f(System.currentTimeMillis(), th, thread));
    }

    void U(long j, String str) {
        this.e.h(new e(j, str));
    }

    boolean s() {
        if (!this.c.c()) {
            String C = C();
            return C != null && this.j.c(C);
        }
        m94.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void t(pn7 pn7Var) {
        u(false, pn7Var);
    }

    void x(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, pn7 pn7Var) {
        this.n = pn7Var;
        N(str);
        h21 h21Var = new h21(new a(), pn7Var, uncaughtExceptionHandler, this.j);
        this.m = h21Var;
        Thread.setDefaultUncaughtExceptionHandler(h21Var);
    }

    boolean z(pn7 pn7Var) {
        this.e.b();
        if (I()) {
            m94.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        m94.f().i("Finalizing previously open sessions.");
        try {
            u(true, pn7Var);
            m94.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            m94.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }
}
