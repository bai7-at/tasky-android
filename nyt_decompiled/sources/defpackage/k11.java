package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public class k11 {
    private final Context a;
    private final uh2 b;
    private final c91 c;
    private l11 f;
    private l11 g;
    private boolean h;
    private i11 i;
    private final df3 j;
    private final ue2 k;
    public final hc0 l;
    private final vc m;
    private final ExecutorService n;
    private final e11 o;
    private final m11 p;
    private final long e = System.currentTimeMillis();
    private final qe5 d = new qe5();

    class a implements Callable {
        final /* synthetic */ pn7 a;

        a(pn7 pn7Var) {
            this.a = pn7Var;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public og8 call() {
            return k11.this.f(this.a);
        }
    }

    class b implements Runnable {
        final /* synthetic */ pn7 a;

        b(pn7 pn7Var) {
            this.a = pn7Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            k11.this.f(this.a);
        }
    }

    class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean d = k11.this.f.d();
                if (!d) {
                    m94.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d);
            } catch (Exception e) {
                m94.f().e("Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    class d implements Callable {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(k11.this.i.s());
        }
    }

    public k11(uh2 uh2Var, df3 df3Var, m11 m11Var, c91 c91Var, hc0 hc0Var, vc vcVar, ue2 ue2Var, ExecutorService executorService) {
        this.b = uh2Var;
        this.c = c91Var;
        this.a = uh2Var.j();
        this.j = df3Var;
        this.p = m11Var;
        this.l = hc0Var;
        this.m = vcVar;
        this.n = executorService;
        this.k = ue2Var;
        this.o = new e11(executorService);
    }

    private void d() {
        try {
            this.h = Boolean.TRUE.equals((Boolean) k29.d(this.o.h(new d())));
        } catch (Exception unused) {
            this.h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public og8 f(pn7 pn7Var) {
        n();
        try {
            this.l.a(new gc0() { // from class: j11
                @Override // defpackage.gc0
                public final void a(String str) {
                    k11.this.k(str);
                }
            });
            if (!pn7Var.b().b.a) {
                m94.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return vg8.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.i.z(pn7Var)) {
                m94.f().k("Previous sessions could not be finalized.");
            }
            return this.i.Q(pn7Var.a());
        } catch (Exception e) {
            m94.f().e("Crashlytics encountered a problem during asynchronous initialization.", e);
            return vg8.d(e);
        } finally {
            m();
        }
    }

    private void h(pn7 pn7Var) {
        Future<?> submit = this.n.submit(new b(pn7Var));
        m94.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            m94.f().e("Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            m94.f().e("Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            m94.f().e("Crashlytics timed out during initialization.", e3);
        }
    }

    public static String i() {
        return "18.2.10";
    }

    static boolean j(String str, boolean z) {
        if (!z) {
            m94.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", InstructionFileId.DOT);
        return false;
    }

    boolean e() {
        return this.f.c();
    }

    public og8 g(pn7 pn7Var) {
        return k29.e(this.n, new a(pn7Var));
    }

    public void k(String str) {
        this.i.U(System.currentTimeMillis() - this.e, str);
    }

    public void l(Throwable th) {
        this.i.T(Thread.currentThread(), th);
    }

    void m() {
        this.o.h(new c());
    }

    void n() {
        this.o.b();
        this.f.a();
        m94.f().i("Initialization marker file was created.");
    }

    public boolean o(fl flVar, pn7 pn7Var) {
        if (!j(flVar.b, CommonUtils.k(this.a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
        String ag0Var = new ag0(this.j).toString();
        try {
            this.g = new l11("crash_marker", this.k);
            this.f = new l11("initialization_marker", this.k);
            p09 p09Var = new p09(ag0Var, this.k, this.o);
            e84 e84Var = new e84(this.k);
            this.i = new i11(this.a, this.o, this.j, this.c, this.k, this.g, flVar, p09Var, e84Var, ul7.g(this.a, this.j, this.k, flVar, e84Var, p09Var, new ut4(1024, new tw6(10)), pn7Var, this.d), this.p, this.m);
            boolean e = e();
            d();
            this.i.x(ag0Var, Thread.getDefaultUncaughtExceptionHandler(), pn7Var);
            if (!e || !CommonUtils.c(this.a)) {
                m94.f().b("Successfully configured exception handler.");
                return true;
            }
            m94.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            h(pn7Var);
            return false;
        } catch (Exception e2) {
            m94.f().e("Crashlytics was not started due to an exception during initialization", e2);
            this.i = null;
            return false;
        }
    }

    public void p(String str, String str2) {
        this.i.O(str, str2);
    }

    public void q(String str) {
        this.i.P(str);
    }
}
