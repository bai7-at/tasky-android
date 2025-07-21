package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.h3;
import defpackage.k3;
import defpackage.k99;
import defpackage.v99;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c {
    v99 a;
    c b;
    private boolean c;
    private boolean d;
    private boolean f;
    private float e = 0.0f;
    int g = 2;
    float h = 0.5f;
    float i = 0.0f;
    float j = 0.5f;
    private final v99.c k = new a();

    class a extends v99.c {
        private int a;
        private int b = -1;

        a() {
        }

        private boolean n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.h);
            }
            boolean z = k99.x(view) == 1;
            int i = SwipeDismissBehavior.this.g;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f <= 0.0f) {
                    return false;
                }
            } else if (f >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // v99.c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            boolean z = k99.x(view) == 1;
            int i3 = SwipeDismissBehavior.this.g;
            if (i3 == 0) {
                if (z) {
                    width = this.a - view.getWidth();
                    width2 = this.a;
                } else {
                    width = this.a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.a - view.getWidth();
                width2 = this.a + view.getWidth();
            } else if (z) {
                width = this.a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.a - view.getWidth();
                width2 = this.a;
            }
            return SwipeDismissBehavior.h(width, i, width2);
        }

        @Override // v99.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // v99.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // v99.c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.d = false;
            }
        }

        @Override // v99.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // v99.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = view.getWidth() * SwipeDismissBehavior.this.i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.j;
            float abs = Math.abs(i - this.a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.g(0.0f, 1.0f - SwipeDismissBehavior.j(width, width2, abs), 1.0f));
            }
        }

        @Override // v99.c
        public void l(View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i2 = this.a;
                    if (left >= i2) {
                        i = i2 + width;
                        z = true;
                    }
                }
                i = this.a - width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.F(i, view.getTop())) {
                k99.d0(view, new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // v99.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.f(view);
        }
    }

    class b implements k3 {
        b() {
        }

        @Override // defpackage.k3
        public boolean a(View view, k3.a aVar) {
            if (!SwipeDismissBehavior.this.f(view)) {
                return false;
            }
            boolean z = k99.x(view) == 1;
            int i = SwipeDismissBehavior.this.g;
            k99.V(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i);
    }

    private class d implements Runnable {
        private final View a;
        private final boolean b;

        d(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            v99 v99Var = SwipeDismissBehavior.this.a;
            if (v99Var != null && v99Var.k(true)) {
                k99.d0(this.a, this);
            } else {
                if (!this.b || (cVar = SwipeDismissBehavior.this.b) == null) {
                    return;
                }
                cVar.a(this.a);
            }
        }
    }

    static float g(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    static int h(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void i(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.f ? v99.l(viewGroup, this.e, this.k) : v99.m(viewGroup, this.k);
        }
    }

    static float j(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void o(View view) {
        k99.f0(view, Constants.MB);
        if (f(view)) {
            k99.h0(view, h3.a.y, null, new b());
        }
    }

    public boolean f(View view) {
        return true;
    }

    public void k(float f) {
        this.j = g(0.0f, f, 1.0f);
    }

    public void l(c cVar) {
        this.b = cVar;
    }

    public void m(float f) {
        this.i = g(0.0f, f, 1.0f);
    }

    public void n(int i) {
        this.g = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.v(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        i(coordinatorLayout);
        return !this.d && this.a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, view, i);
        if (k99.v(view) == 0) {
            k99.v0(view, 1);
            o(view);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.z(motionEvent);
        return true;
    }
}
