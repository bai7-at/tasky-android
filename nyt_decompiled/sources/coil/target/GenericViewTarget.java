package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.d44;
import defpackage.ei1;
import defpackage.lb9;
import defpackage.sr8;

/* loaded from: classes.dex */
public abstract class GenericViewTarget<T extends View> implements lb9, sr8, ei1 {
    private boolean a;

    @Override // defpackage.dg8
    public void a(Drawable drawable) {
        g(drawable);
    }

    @Override // defpackage.dg8
    public void b(Drawable drawable) {
        g(drawable);
    }

    @Override // defpackage.dg8
    public void c(Drawable drawable) {
        g(drawable);
    }

    @Override // defpackage.sr8
    public abstract Drawable d();

    public abstract void e(Drawable drawable);

    protected final void f() {
        Object d = d();
        Animatable animatable = d instanceof Animatable ? (Animatable) d : null;
        if (animatable == null) {
            return;
        }
        if (this.a) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    protected final void g(Drawable drawable) {
        Object d = d();
        Animatable animatable = d instanceof Animatable ? (Animatable) d : null;
        if (animatable != null) {
            animatable.stop();
        }
        e(drawable);
        f();
    }

    @Override // defpackage.ei1
    public void onStart(d44 d44Var) {
        this.a = true;
        f();
    }

    @Override // defpackage.ei1
    public void onStop(d44 d44Var) {
        this.a = false;
        f();
    }
}
