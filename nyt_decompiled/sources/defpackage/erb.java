package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: classes2.dex */
public final class erb {
    private final View a;
    private Activity b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final ViewTreeObserver.OnGlobalLayoutListener f;

    public erb(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.b = activity;
        this.a = view;
        this.f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver f(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void g() {
        if (this.c) {
            return;
        }
        Activity activity = this.b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            ViewTreeObserver f = f(activity);
            if (f != null) {
                f.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f;
        dyf.z();
        ihb.a(view, onGlobalLayoutListener2);
        this.c = true;
    }

    private final void h() {
        Activity activity = this.b;
        if (activity != null && this.c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            ViewTreeObserver f = f(activity);
            if (f != null) {
                f.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.c = false;
        }
    }

    public final void a() {
        this.e = false;
        h();
    }

    public final void b() {
        this.e = true;
        if (this.d) {
            g();
        }
    }

    public final void c() {
        this.d = true;
        if (this.e) {
            g();
        }
    }

    public final void d() {
        this.d = false;
        h();
    }

    public final void e(Activity activity) {
        this.b = activity;
    }
}
