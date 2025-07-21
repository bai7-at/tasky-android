package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
abstract class lhb {
    private final WeakReference a;

    public lhb(View view) {
        this.a = new WeakReference(view);
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    protected final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.a.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void d() {
        ViewTreeObserver c = c();
        if (c != null) {
            a(c);
        }
    }

    public final void e() {
        ViewTreeObserver c = c();
        if (c != null) {
            b(c);
        }
    }
}
