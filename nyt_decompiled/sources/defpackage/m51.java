package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m51 implements eg8 {
    private static final int f = wf6.glide_custom_view_target_tag;
    private final a a;
    protected final View b;
    private View.OnAttachStateChangeListener c;
    private boolean d;
    private boolean e;

    static final class a {
        static Integer e;
        private final View a;
        private final List b = new ArrayList();
        boolean c;
        private ViewTreeObserverOnPreDrawListenerC0506a d;

        /* renamed from: m51$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0506a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference a;

            ViewTreeObserverOnPreDrawListenerC0506a(a aVar) {
                this.a = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.a = view;
        }

        private static int c(Context context) {
            if (e == null) {
                Display defaultDisplay = ((WindowManager) z06.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return e.intValue();
        }

        private int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.c && this.a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.a.getContext());
        }

        private int f() {
            int paddingTop = this.a.getPaddingTop() + this.a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.a.getPaddingLeft() + this.a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return e(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        private void j(int i, int i2) {
            Iterator it2 = new ArrayList(this.b).iterator();
            while (it2.hasNext()) {
                ((eu7) it2.next()).d(i, i2);
            }
        }

        void a() {
            if (this.b.isEmpty()) {
                return;
            }
            int g = g();
            int f = f();
            if (i(g, f)) {
                j(g, f);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.d);
            }
            this.d = null;
            this.b.clear();
        }

        void d(eu7 eu7Var) {
            int g = g();
            int f = f();
            if (i(g, f)) {
                eu7Var.d(g, f);
                return;
            }
            if (!this.b.contains(eu7Var)) {
                this.b.add(eu7Var);
            }
            if (this.d == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0506a viewTreeObserverOnPreDrawListenerC0506a = new ViewTreeObserverOnPreDrawListenerC0506a(this);
                this.d = viewTreeObserverOnPreDrawListenerC0506a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0506a);
            }
        }

        void k(eu7 eu7Var) {
            this.b.remove(eu7Var);
        }
    }

    public m51(View view) {
        this.b = (View) z06.d(view);
        this.a = new a(view);
    }

    private Object k() {
        return this.b.getTag(f);
    }

    private void l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener == null || this.e) {
            return;
        }
        this.b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.e = true;
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.c;
        if (onAttachStateChangeListener == null || !this.e) {
            return;
        }
        this.b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.e = false;
    }

    private void p(Object obj) {
        this.b.setTag(f, obj);
    }

    @Override // defpackage.b44
    public void a() {
    }

    @Override // defpackage.b44
    public void b() {
    }

    @Override // defpackage.eg8
    public final ey6 c() {
        Object k = k();
        if (k == null) {
            return null;
        }
        if (k instanceof ey6) {
            return (ey6) k;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.eg8
    public final void d(eu7 eu7Var) {
        this.a.d(eu7Var);
    }

    @Override // defpackage.eg8
    public final void e(Drawable drawable) {
        l();
        o(drawable);
    }

    @Override // defpackage.eg8
    public final void g(Drawable drawable) {
        this.a.b();
        n(drawable);
        if (this.d) {
            return;
        }
        m();
    }

    @Override // defpackage.eg8
    public final void h(ey6 ey6Var) {
        p(ey6Var);
    }

    @Override // defpackage.eg8
    public final void i(eu7 eu7Var) {
        this.a.k(eu7Var);
    }

    protected abstract void n(Drawable drawable);

    protected void o(Drawable drawable) {
    }

    @Override // defpackage.b44
    public void onDestroy() {
    }

    public String toString() {
        return "Target for: " + this.b;
    }
}
