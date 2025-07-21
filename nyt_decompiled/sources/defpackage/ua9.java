package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.xa9;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ua9 implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final a d = new a(null);
    private static final Map e = new HashMap();
    private final WeakReference a;
    private final Handler b;
    private final AtomicBoolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity) {
            zq3.h(activity, "activity");
            int hashCode = activity.hashCode();
            Map b = ua9.b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b.get(valueOf);
            if (obj == null) {
                obj = new ua9(activity, null);
                b.put(valueOf, obj);
            }
            ua9.c((ua9) obj);
        }

        public final void b(Activity activity) {
            zq3.h(activity, "activity");
            ua9 ua9Var = (ua9) ua9.b().remove(Integer.valueOf(activity.hashCode()));
            if (ua9Var == null) {
                return;
            }
            ua9.d(ua9Var);
        }

        private a() {
        }
    }

    public /* synthetic */ ua9(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (c11.d(ua9.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            c11.b(th, ua9.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(ua9 ua9Var) {
        if (c11.d(ua9.class)) {
            return;
        }
        try {
            ua9Var.g();
        } catch (Throwable th) {
            c11.b(th, ua9.class);
        }
    }

    public static final /* synthetic */ void d(ua9 ua9Var) {
        if (c11.d(ua9.class)) {
            return;
        }
        try {
            ua9Var.h();
        } catch (Throwable th) {
            c11.b(th, ua9.class);
        }
    }

    private final void e() {
        if (c11.d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: ta9
                @Override // java.lang.Runnable
                public final void run() {
                    ua9.f(ua9.this);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.b.post(runnable);
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(ua9 ua9Var) {
        if (c11.d(ua9.class)) {
            return;
        }
        try {
            zq3.h(ua9Var, "this$0");
            try {
                sl slVar = sl.a;
                View e2 = sl.e((Activity) ua9Var.a.get());
                Activity activity = (Activity) ua9Var.a.get();
                if (e2 != null && activity != null) {
                    for (View view : dc8.a(e2)) {
                        if (!yj7.g(view)) {
                            String d2 = dc8.d(view);
                            if (d2.length() > 0 && d2.length() <= 300) {
                                xa9.a aVar = xa9.e;
                                String localClassName = activity.getLocalClassName();
                                zq3.g(localClassName, "activity.localClassName");
                                aVar.d(view, e2, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            c11.b(th, ua9.class);
        }
    }

    private final void g() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (this.c.getAndSet(true)) {
                return;
            }
            sl slVar = sl.a;
            View e2 = sl.e((Activity) this.a.get());
            if (e2 == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private final void h() {
        if (c11.d(this)) {
            return;
        }
        try {
            if (this.c.getAndSet(false)) {
                sl slVar = sl.a;
                View e2 = sl.e((Activity) this.a.get());
                if (e2 == null) {
                    return;
                }
                ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (c11.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th) {
            c11.b(th, this);
        }
    }

    private ua9(Activity activity) {
        this.a = new WeakReference(activity);
        this.b = new Handler(Looper.getMainLooper());
        this.c = new AtomicBoolean(false);
    }
}
