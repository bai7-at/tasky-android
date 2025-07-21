package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.v;
import com.google.firebase.messaging.z;
import defpackage.a42;
import defpackage.bc8;
import defpackage.bs8;
import defpackage.c32;
import defpackage.e91;
import defpackage.gh4;
import defpackage.hi2;
import defpackage.ji2;
import defpackage.og8;
import defpackage.q76;
import defpackage.qg8;
import defpackage.uh2;
import defpackage.vf5;
import defpackage.vg8;
import defpackage.xa8;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class FirebaseMessaging {
    private static final long m = TimeUnit.HOURS.toSeconds(8);
    private static z n;
    static bs8 o;
    static ScheduledExecutorService p;
    private final uh2 a;
    private final hi2 b;
    private final Context c;
    private final m d;
    private final v e;
    private final a f;
    private final Executor g;
    private final Executor h;
    private final og8 i;
    private final o j;
    private boolean k;
    private final Application.ActivityLifecycleCallbacks l;

    /* JADX INFO: Access modifiers changed from: private */
    class a {
        private final xa8 a;
        private boolean b;
        private a42 c;
        private Boolean d;

        a(xa8 xa8Var) {
            this.a = xa8Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(c32 c32Var) {
            if (c()) {
                FirebaseMessaging.this.B();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j = FirebaseMessaging.this.a.j();
            SharedPreferences sharedPreferences = j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean e = e();
                this.d = e;
                if (e == null) {
                    a42 a42Var = new a42() { // from class: com.google.firebase.messaging.k
                        @Override // defpackage.a42
                        public final void a(c32 c32Var) {
                            FirebaseMessaging.a.this.d(c32Var);
                        }
                    };
                    this.c = a42Var;
                    this.a.b(e91.class, a42Var);
                }
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }

        synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.d;
            } catch (Throwable th) {
                throw th;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.s();
        }
    }

    FirebaseMessaging(uh2 uh2Var, ji2 ji2Var, q76 q76Var, q76 q76Var2, hi2 hi2Var, bs8 bs8Var, xa8 xa8Var) {
        this(uh2Var, ji2Var, q76Var, q76Var2, hi2Var, bs8Var, xa8Var, new o(uh2Var.j()));
    }

    private synchronized void A() {
        if (!this.k) {
            C(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (D(o())) {
            A();
        }
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(uh2 uh2Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) uh2Var.i(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    private static synchronized z l(Context context) {
        z zVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (n == null) {
                    n = new z(context);
                }
                zVar = n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zVar;
    }

    private String m() {
        return "[DEFAULT]".equals(this.a.l()) ? "" : this.a.n();
    }

    public static bs8 p() {
        return o;
    }

    private void q(String str) {
        if ("[DEFAULT]".equals(this.a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new e(this.c).k(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ og8 t(final String str, final z.a aVar) {
        return this.d.e().s(new gh4(), new bc8() { // from class: com.google.firebase.messaging.j
            @Override // defpackage.bc8
            public final og8 then(Object obj) {
                og8 u;
                u = FirebaseMessaging.this.u(str, aVar, (String) obj);
                return u;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ og8 u(String str, z.a aVar, String str2) {
        l(this.c).f(m(), str, str2, this.j.a());
        if (aVar == null || !str2.equals(aVar.a)) {
            q(str2);
        }
        return vg8.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(qg8 qg8Var) {
        try {
            qg8Var.c(i());
        } catch (Exception e) {
            qg8Var.b(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w() {
        if (r()) {
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(e0 e0Var) {
        if (r()) {
            e0Var.o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y() {
        r.c(this.c);
    }

    synchronized void C(long j) {
        j(new a0(this, Math.min(Math.max(30L, 2 * j), m)), j);
        this.k = true;
    }

    boolean D(z.a aVar) {
        return aVar == null || aVar.b(this.j.a());
    }

    String i() {
        final z.a o2 = o();
        if (!D(o2)) {
            return o2.a;
        }
        final String c = o.c(this.a);
        try {
            return (String) vg8.a(this.e.b(c, new v.a() { // from class: com.google.firebase.messaging.i
                @Override // com.google.firebase.messaging.v.a
                public final og8 start() {
                    og8 t;
                    t = FirebaseMessaging.this.t(c, o2);
                    return t;
                }
            }));
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    void j(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (p == null) {
                    p = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                p.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    Context k() {
        return this.c;
    }

    public og8 n() {
        final qg8 qg8Var = new qg8();
        this.g.execute(new Runnable() { // from class: ni2
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.v(qg8Var);
            }
        });
        return qg8Var.a();
    }

    z.a o() {
        return l(this.c).d(m(), o.c(this.a));
    }

    public boolean r() {
        return this.f.c();
    }

    boolean s() {
        return this.j.g();
    }

    synchronized void z(boolean z) {
        this.k = z;
    }

    FirebaseMessaging(uh2 uh2Var, ji2 ji2Var, q76 q76Var, q76 q76Var2, hi2 hi2Var, bs8 bs8Var, xa8 xa8Var, o oVar) {
        this(uh2Var, ji2Var, hi2Var, bs8Var, xa8Var, oVar, new m(uh2Var, oVar, q76Var, q76Var2, hi2Var), f.d(), f.a());
    }

    FirebaseMessaging(uh2 uh2Var, ji2 ji2Var, hi2 hi2Var, bs8 bs8Var, xa8 xa8Var, o oVar, m mVar, Executor executor, Executor executor2) {
        this.k = false;
        o = bs8Var;
        this.a = uh2Var;
        this.b = hi2Var;
        this.f = new a(xa8Var);
        Context j = uh2Var.j();
        this.c = j;
        g gVar = new g();
        this.l = gVar;
        this.j = oVar;
        this.h = executor;
        this.d = mVar;
        this.e = new v(executor);
        this.g = executor2;
        Context j2 = uh2Var.j();
        if (j2 instanceof Application) {
            ((Application) j2).registerActivityLifecycleCallbacks(gVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + j2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (ji2Var != null) {
            ji2Var.a(new ji2.a() { // from class: ki2
            });
        }
        executor2.execute(new Runnable() { // from class: li2
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.w();
            }
        });
        og8 e = e0.e(this, oVar, mVar, j, f.e());
        this.i = e;
        e.g(executor2, new vf5() { // from class: com.google.firebase.messaging.h
            @Override // defpackage.vf5
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.x((e0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: mi2
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.y();
            }
        });
    }
}
