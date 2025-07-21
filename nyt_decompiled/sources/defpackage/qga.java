package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class qga implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final Handler m = new Handler(Looper.getMainLooper());
    private final Context a;
    private Application b;
    private final PowerManager c;
    private final KeyguardManager d;
    private BroadcastReceiver e;
    private final cga f;
    private WeakReference g;
    private WeakReference h;
    private ufa i;
    private byte j = -1;
    private int k = -1;
    private long l = -3;

    public qga(Context context, cga cgaVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f = cgaVar;
        this.c = (PowerManager) applicationContext.getSystemService("power");
        this.d = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.b = application;
            this.i = new ufa(application, this);
        }
        f(null);
    }

    private final void g(Activity activity, int i) {
        Window window;
        if (this.h == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View d = d();
        if (d == null || peekDecorView == null || d.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
    
        if ((r9.flags & 524288) != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006a, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r10 = this;
            r0 = 1
            java.lang.ref.WeakReference r1 = r10.h
            if (r1 != 0) goto L7
            goto Lbe
        L7:
            android.view.View r1 = r10.d()
            r2 = -1
            r3 = -3
            if (r1 != 0) goto L15
            r10.l = r3
            r10.j = r2
            return
        L15:
            int r5 = r1.getVisibility()
            r6 = 0
            if (r5 == 0) goto L1e
            r5 = r0
            goto L1f
        L1e:
            r5 = r6
        L1f:
            boolean r7 = r1.isShown()
            if (r7 != 0) goto L27
            r5 = r5 | 2
        L27:
            android.os.PowerManager r7 = r10.c
            if (r7 == 0) goto L33
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L33
            r5 = r5 | 4
        L33:
            cga r7 = r10.f
            boolean r7 = r7.a()
            if (r7 != 0) goto L84
            android.app.KeyguardManager r7 = r10.d
            if (r7 == 0) goto L82
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L82
            int r7 = defpackage.mga.b
            android.view.View r7 = r1.getRootView()
            if (r7 != 0) goto L4e
            r7 = r1
        L4e:
            android.content.Context r7 = r7.getContext()
        L52:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            r9 = 0
            if (r8 == 0) goto L6a
            r8 = 10
            if (r6 >= r8) goto L6a
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L62
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6b
        L62:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + r0
            goto L52
        L6a:
            r7 = r9
        L6b:
            if (r7 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r0 = r7.getWindow()
            if (r0 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r9 = r0.getAttributes()
        L79:
            if (r9 == 0) goto L82
            int r0 = r9.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r6
            if (r0 != 0) goto L84
        L82:
            r5 = r5 | 8
        L84:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 != 0) goto L91
            r5 = r5 | 16
        L91:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getLocalVisibleRect(r0)
            if (r0 != 0) goto L9e
            r5 = r5 | 32
        L9e:
            int r0 = r1.getWindowVisibility()
            int r1 = r10.k
            if (r1 == r2) goto La7
            r0 = r1
        La7:
            if (r0 == 0) goto Lab
            r5 = r5 | 64
        Lab:
            byte r0 = r10.j
            if (r0 == r5) goto Lbe
            byte r0 = (byte) r5
            r10.j = r0
            if (r5 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lbc:
            r10.l = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qga.h():void");
    }

    private final void i() {
        m.post(new oga(this));
    }

    private final void j(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            pga pgaVar = new pga(this);
            this.e = pgaVar;
            this.a.registerReceiver(pgaVar, intentFilter);
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.i);
            } catch (Exception unused) {
            }
        }
    }

    private final void k(View view) {
        try {
            WeakReference weakReference = this.g;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.g = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.e;
        if (broadcastReceiver != null) {
            try {
                this.a.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.e = null;
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.i);
            } catch (Exception unused4) {
            }
        }
    }

    public final long c() {
        if (this.l <= -2 && d() == null) {
            this.l = -3L;
        }
        return this.l;
    }

    final View d() {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    final void f(View view) {
        long j;
        View d = d();
        if (d != null) {
            d.removeOnAttachStateChangeListener(this);
            k(d);
        }
        this.h = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                j(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.l = j;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        g(activity, 0);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        g(activity, 4);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        g(activity, 0);
        h();
        i();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        g(activity, 0);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.k = -1;
        j(view);
        h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.k = -1;
        h();
        i();
        k(view);
    }
}
