package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class wia implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long s = ((Long) pla.c().a(mpa.m1)).longValue();
    private final Context a;
    private Application b;
    private final WindowManager c;
    private final PowerManager d;
    private final KeyguardManager e;
    BroadcastReceiver f;
    private WeakReference g;
    final WeakReference h;
    private pja i;
    private final pcb j = new pcb(s);
    private boolean k = false;
    private int l = -1;
    private final HashSet m = new HashSet();
    private final DisplayMetrics n;
    private final Rect r;

    public wia(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.c = windowManager;
        this.d = (PowerManager) applicationContext.getSystemService("power");
        this.e = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.b = application;
            this.i = new pja(application, this);
        }
        this.n = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.r = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.h;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            o(view2);
        }
        this.h = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                n(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int j(int i) {
        return (int) (i / this.n.density);
    }

    private final void k(Activity activity, int i) {
        Window window;
        if (this.h == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.h;
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.l = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0158, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0133, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0135, code lost:
    
        r3 = 1;
        r13 = true;
        r14 = true;
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r35) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wia.l(int):void");
    }

    private final void m() {
        wxf.l.post(new Runnable() { // from class: sia
            @Override // java.lang.Runnable
            public final void run() {
                wia.this.f();
            }
        });
    }

    private final void n(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.g = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f = new tia(this);
            dyf.x().c(this.a, this.f, intentFilter);
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.i);
            } catch (Exception e) {
                fgb.e("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void o(View view) {
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
        } catch (Exception e) {
            fgb.e("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            fgb.e("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.f != null) {
            try {
                dyf.x().d(this.a, this.f);
            } catch (IllegalStateException e3) {
                fgb.e("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                dyf.q().w(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f = null;
        }
        Application application = this.b;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.i);
            } catch (Exception e5) {
                fgb.e("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    final Rect c(Rect rect) {
        return new Rect(j(rect.left), j(rect.top), j(rect.right), j(rect.bottom));
    }

    public final void e(via viaVar) {
        this.m.add(viaVar);
        l(3);
    }

    final /* synthetic */ void f() {
        l(3);
    }

    public final void g(via viaVar) {
        this.m.remove(viaVar);
    }

    public final void h() {
        this.j.a(s);
    }

    public final void i(long j) {
        this.j.a(j);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k(activity, 0);
        l(3);
        m();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        l(3);
        m();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity, 4);
        l(3);
        m();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity, 0);
        l(3);
        m();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l(3);
        m();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity, 0);
        l(3);
        m();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        l(3);
        m();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        l(2);
        m();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        l(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.l = -1;
        n(view);
        l(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.l = -1;
        l(3);
        m();
        o(view);
    }
}
