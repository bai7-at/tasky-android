package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import defpackage.d44;
import defpackage.g02;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class l implements d44 {
    public static final b i = new b(null);
    private static final l j = new l();
    private int a;
    private int b;
    private Handler e;
    private boolean c = true;
    private boolean d = true;
    private final h f = new h(this);
    private final Runnable g = new Runnable() { // from class: s36
        @Override // java.lang.Runnable
        public final void run() {
            l.h(l.this);
        }
    };
    private final m.a h = new d();

    public static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            zq3.h(activity, "activity");
            zq3.h(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d44 a() {
            return l.j;
        }

        public final void b(Context context) {
            zq3.h(context, "context");
            l.j.g(context);
        }

        private b() {
        }
    }

    public static final class c extends g02 {

        public static final class a extends g02 {
            final /* synthetic */ l this$0;

            a(l lVar) {
                this.this$0 = lVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                zq3.h(activity, "activity");
                this.this$0.d();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                zq3.h(activity, "activity");
                this.this$0.e();
            }
        }

        c() {
        }

        @Override // defpackage.g02, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
        }

        @Override // defpackage.g02, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            zq3.h(activity, "activity");
            l.this.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            zq3.h(activity, "activity");
            a.a(activity, new a(l.this));
        }

        @Override // defpackage.g02, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            zq3.h(activity, "activity");
            l.this.f();
        }
    }

    public static final class d implements m.a {
        d() {
        }

        @Override // androidx.lifecycle.m.a
        public void b() {
            l.this.e();
        }

        @Override // androidx.lifecycle.m.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.m.a
        public void onResume() {
            l.this.d();
        }
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(l lVar) {
        zq3.h(lVar, "this$0");
        lVar.i();
        lVar.j();
    }

    public static final d44 k() {
        return i.a();
    }

    public final void c() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 == 0) {
            Handler handler = this.e;
            zq3.e(handler);
            handler.postDelayed(this.g, 700L);
        }
    }

    public final void d() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.i(Lifecycle.Event.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                zq3.e(handler);
                handler.removeCallbacks(this.g);
            }
        }
    }

    public final void e() {
        int i2 = this.a + 1;
        this.a = i2;
        if (i2 == 1 && this.d) {
            this.f.i(Lifecycle.Event.ON_START);
            this.d = false;
        }
    }

    public final void f() {
        this.a--;
        j();
    }

    public final void g(Context context) {
        zq3.h(context, "context");
        this.e = new Handler();
        this.f.i(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        zq3.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    @Override // defpackage.d44
    public Lifecycle getLifecycle() {
        return this.f;
    }

    public final void i() {
        if (this.b == 0) {
            this.c = true;
            this.f.i(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void j() {
        if (this.a == 0 && this.c) {
            this.f.i(Lifecycle.Event.ON_STOP);
            this.d = true;
        }
    }
}
