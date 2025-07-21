package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dr8;

/* loaded from: classes.dex */
public abstract class gc9 extends dr8 {
    private static final String[] m0 = {"android:visibility:visibility", "android:visibility:parent"};
    private int l0 = 3;

    private static class a extends AnimatorListenerAdapter implements dr8.f {
        private final View a;
        private final int b;
        private final ViewGroup c;
        private final boolean d;
        private boolean e;
        boolean f = false;

        a(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            i(true);
        }

        private void h() {
            if (!this.f) {
                qb9.f(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            z99.a(viewGroup, z);
        }

        @Override // dr8.f
        public void a(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            dr8Var.U(this);
        }

        @Override // dr8.f
        public void d(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void e(dr8 dr8Var) {
            i(true);
            if (this.f) {
                return;
            }
            qb9.f(this.a, 0);
        }

        @Override // dr8.f
        public void g(dr8 dr8Var) {
            i(false);
            if (this.f) {
                return;
            }
            qb9.f(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                qb9.f(this.a, 0);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements dr8.f {
        private final ViewGroup a;
        private final View b;
        private final View c;
        private boolean d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        private void h() {
            this.c.setTag(tf6.save_overlay_view, null);
            this.a.getOverlay().remove(this.b);
            this.d = false;
        }

        @Override // dr8.f
        public void a(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            dr8Var.U(this);
        }

        @Override // dr8.f
        public void d(dr8 dr8Var) {
            if (this.d) {
                h();
            }
        }

        @Override // dr8.f
        public void e(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void g(dr8 dr8Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.a.getOverlay().remove(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.b.getParent() == null) {
                this.a.getOverlay().add(this.b);
            } else {
                gc9.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                this.c.setTag(tf6.save_overlay_view, this.b);
                this.a.getOverlay().add(this.b);
                this.d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            h();
        }
    }

    private static class c {
        boolean a;
        boolean b;
        int c;
        int d;
        ViewGroup e;
        ViewGroup f;

        c() {
        }
    }

    private void j0(wr8 wr8Var) {
        wr8Var.a.put("android:visibility:visibility", Integer.valueOf(wr8Var.b.getVisibility()));
        wr8Var.a.put("android:visibility:parent", wr8Var.b.getParent());
        int[] iArr = new int[2];
        wr8Var.b.getLocationOnScreen(iArr);
        wr8Var.a.put("android:visibility:screenLocation", iArr);
    }

    private c k0(wr8 wr8Var, wr8 wr8Var2) {
        c cVar = new c();
        cVar.a = false;
        cVar.b = false;
        if (wr8Var == null || !wr8Var.a.containsKey("android:visibility:visibility")) {
            cVar.c = -1;
            cVar.e = null;
        } else {
            cVar.c = ((Integer) wr8Var.a.get("android:visibility:visibility")).intValue();
            cVar.e = (ViewGroup) wr8Var.a.get("android:visibility:parent");
        }
        if (wr8Var2 == null || !wr8Var2.a.containsKey("android:visibility:visibility")) {
            cVar.d = -1;
            cVar.f = null;
        } else {
            cVar.d = ((Integer) wr8Var2.a.get("android:visibility:visibility")).intValue();
            cVar.f = (ViewGroup) wr8Var2.a.get("android:visibility:parent");
        }
        if (wr8Var != null && wr8Var2 != null) {
            int i = cVar.c;
            int i2 = cVar.d;
            if (i == i2 && cVar.e == cVar.f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.b = false;
                    cVar.a = true;
                } else if (i2 == 0) {
                    cVar.b = true;
                    cVar.a = true;
                }
            } else if (cVar.f == null) {
                cVar.b = false;
                cVar.a = true;
            } else if (cVar.e == null) {
                cVar.b = true;
                cVar.a = true;
            }
        } else if (wr8Var == null && cVar.d == 0) {
            cVar.b = true;
            cVar.a = true;
        } else if (wr8Var2 == null && cVar.c == 0) {
            cVar.b = false;
            cVar.a = true;
        }
        return cVar;
    }

    @Override // defpackage.dr8
    public String[] F() {
        return m0;
    }

    @Override // defpackage.dr8
    public boolean H(wr8 wr8Var, wr8 wr8Var2) {
        if (wr8Var == null && wr8Var2 == null) {
            return false;
        }
        if (wr8Var != null && wr8Var2 != null && wr8Var2.a.containsKey("android:visibility:visibility") != wr8Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c k0 = k0(wr8Var, wr8Var2);
        if (k0.a) {
            return k0.c == 0 || k0.d == 0;
        }
        return false;
    }

    @Override // defpackage.dr8
    public void f(wr8 wr8Var) {
        j0(wr8Var);
    }

    @Override // defpackage.dr8
    public void i(wr8 wr8Var) {
        j0(wr8Var);
    }

    public Animator l0(ViewGroup viewGroup, wr8 wr8Var, int i, wr8 wr8Var2, int i2) {
        if ((this.l0 & 1) != 1 || wr8Var2 == null) {
            return null;
        }
        if (wr8Var == null) {
            View view = (View) wr8Var2.b.getParent();
            if (k0(t(view, false), G(view, false)).a) {
                return null;
            }
        }
        return n0(viewGroup, wr8Var2.b, wr8Var, wr8Var2);
    }

    @Override // defpackage.dr8
    public Animator n(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        c k0 = k0(wr8Var, wr8Var2);
        if (!k0.a) {
            return null;
        }
        if (k0.e == null && k0.f == null) {
            return null;
        }
        return k0.b ? l0(viewGroup, wr8Var, k0.c, wr8Var2, k0.d) : o0(viewGroup, wr8Var, k0.c, wr8Var2, k0.d);
    }

    public abstract Animator n0(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0083, code lost:
    
        if (r10.H != false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator o0(android.view.ViewGroup r11, defpackage.wr8 r12, int r13, defpackage.wr8 r14, int r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc9.o0(android.view.ViewGroup, wr8, int, wr8, int):android.animation.Animator");
    }

    public abstract Animator p0(ViewGroup viewGroup, View view, wr8 wr8Var, wr8 wr8Var2);

    public void q0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.l0 = i;
    }
}
