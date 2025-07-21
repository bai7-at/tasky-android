package androidx.compose.material;

import android.view.View;
import android.view.ViewTreeObserver;
import defpackage.qs2;

/* loaded from: classes.dex */
final class m implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final View a;
    private final qs2 b;
    private boolean c;

    public m(View view, qs2 qs2Var) {
        this.a = view;
        this.b = qs2Var;
        view.addOnAttachStateChangeListener(this);
        b();
    }

    private final void b() {
        if (this.c || !this.a.isAttachedToWindow()) {
            return;
        }
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.c = true;
    }

    private final void c() {
        if (this.c) {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c = false;
        }
    }

    public final void a() {
        c();
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.b.mo865invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        b();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
