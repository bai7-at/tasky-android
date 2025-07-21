package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class uh2 {
    private static final Object k = new Object();
    private static final Executor l = new d();
    static final Map m = new so();
    private final Context a;
    private final String b;
    private final aj2 c;
    private final ur0 d;
    private final d04 g;
    private final q76 h;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final List i = new CopyOnWriteArrayList();
    private final List j = new CopyOnWriteArrayList();

    public interface b {
        void onBackgroundStateChanged(boolean z);
    }

    private static class c implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference a = new AtomicReference();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    c cVar = new c();
                    if (kz4.a(a, null, cVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (uh2.k) {
                try {
                    Iterator it2 = new ArrayList(uh2.m.values()).iterator();
                    while (it2.hasNext()) {
                        uh2 uh2Var = (uh2) it2.next();
                        if (uh2Var.e.get()) {
                            uh2Var.x(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class d implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.post(runnable);
        }
    }

    private static class e extends BroadcastReceiver {
        private static AtomicReference b = new AtomicReference();
        private final Context a;

        public e(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                e eVar = new e(context);
                if (kz4.a(b, null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (uh2.k) {
                try {
                    Iterator it2 = uh2.m.values().iterator();
                    while (it2.hasNext()) {
                        ((uh2) it2.next()).o();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected uh2(final Context context, String str, aj2 aj2Var) {
        this.a = (Context) Preconditions.checkNotNull(context);
        this.b = Preconditions.checkNotEmpty(str);
        this.c = (aj2) Preconditions.checkNotNull(aj2Var);
        lj2.b("Firebase");
        lj2.b("ComponentDiscovery");
        List b2 = zq0.c(context, ComponentDiscoveryService.class).b();
        lj2.a();
        lj2.b("Runtime");
        ur0 e2 = ur0.i(l).d(b2).c(new FirebaseCommonRegistrar()).b(nq0.q(context, Context.class, new Class[0])).b(nq0.q(this, uh2.class, new Class[0])).b(nq0.q(aj2Var, aj2.class, new Class[0])).g(new dr0()).e();
        this.d = e2;
        lj2.a();
        this.g = new d04(new q76() { // from class: sh2
            @Override // defpackage.q76
            public final Object get() {
                d91 u;
                u = uh2.this.u(context);
                return u;
            }
        });
        this.h = e2.d(com.google.firebase.heartbeatinfo.a.class);
        g(new b() { // from class: th2
            @Override // uh2.b
            public final void onBackgroundStateChanged(boolean z) {
                uh2.this.v(z);
            }
        });
        lj2.a();
    }

    private void h() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public static uh2 k() {
        uh2 uh2Var;
        synchronized (k) {
            try {
                uh2Var = (uh2) m.get("[DEFAULT]");
                if (uh2Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uh2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (!m09.a(this.a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + l());
            e.b(this.a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + l());
        this.d.l(t());
        ((com.google.firebase.heartbeatinfo.a) this.h.get()).n();
    }

    public static uh2 p(Context context) {
        synchronized (k) {
            try {
                if (m.containsKey("[DEFAULT]")) {
                    return k();
                }
                aj2 a2 = aj2.a(context);
                if (a2 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return q(context, a2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static uh2 q(Context context, aj2 aj2Var) {
        return r(context, aj2Var, "[DEFAULT]");
    }

    public static uh2 r(Context context, aj2 aj2Var, String str) {
        uh2 uh2Var;
        c.b(context);
        String w = w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map map = m;
            Preconditions.checkState(!map.containsKey(w), "FirebaseApp name " + w + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            uh2Var = new uh2(context, w, aj2Var);
            map.put(w, uh2Var);
        }
        uh2Var.o();
        return uh2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ d91 u(Context context) {
        return new d91(context, n(), (h86) this.d.a(h86.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(boolean z) {
        if (z) {
            return;
        }
        ((com.google.firebase.heartbeatinfo.a) this.h.get()).n();
    }

    private static String w(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it2 = this.i.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).onBackgroundStateChanged(z);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof uh2) {
            return this.b.equals(((uh2) obj).l());
        }
        return false;
    }

    public void g(b bVar) {
        h();
        if (this.e.get() && BackgroundDetector.getInstance().isInBackground()) {
            bVar.onBackgroundStateChanged(true);
        }
        this.i.add(bVar);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public Object i(Class cls) {
        h();
        return this.d.a(cls);
    }

    public Context j() {
        h();
        return this.a;
    }

    public String l() {
        h();
        return this.b;
    }

    public aj2 m() {
        h();
        return this.c;
    }

    public String n() {
        return Base64Utils.encodeUrlSafeNoPadding(l().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(m().c().getBytes(Charset.defaultCharset()));
    }

    public boolean s() {
        h();
        return ((d91) this.g.get()).b();
    }

    public boolean t() {
        return "[DEFAULT]".equals(l());
    }

    public String toString() {
        return Objects.toStringHelper(this).add(AuthenticationTokenClaims.JSON_KEY_NAME, this.b).add("options", this.c).toString();
    }
}
