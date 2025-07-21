package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import defpackage.dr8;
import java.util.Map;

/* loaded from: classes.dex */
public class dj0 extends dr8 {
    private static final String[] m0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property n0 = new a(PointF.class, "topLeft");
    private static final Property o0 = new b(PointF.class, "bottomRight");
    private static final Property p0 = new c(PointF.class, "bottomRight");
    private static final Property q0 = new d(PointF.class, "topLeft");
    private static final Property r0 = new e(PointF.class, "position");
    private static final lt6 s0 = new lt6();
    private boolean l0 = false;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            qb9.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            qb9.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class e extends Property {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            qb9.d(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    class f extends AnimatorListenerAdapter {
        final /* synthetic */ i a;
        private final i mViewBounds;

        f(i iVar) {
            this.a = iVar;
            this.mViewBounds = iVar;
        }
    }

    private static class g extends AnimatorListenerAdapter implements dr8.f {
        private final View a;
        private final Rect b;
        private final boolean c;
        private final Rect d;
        private final boolean e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final int m;
        private boolean n;

        g(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.a = view;
            this.b = rect;
            this.c = z;
            this.d = rect2;
            this.e = z2;
            this.f = i;
            this.g = i2;
            this.h = i3;
            this.i = i4;
            this.j = i5;
            this.k = i6;
            this.l = i7;
            this.m = i8;
        }

        @Override // dr8.f
        public void a(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
        }

        @Override // dr8.f
        public void d(dr8 dr8Var) {
            this.n = true;
        }

        @Override // dr8.f
        public void e(dr8 dr8Var) {
            Rect rect = (Rect) this.a.getTag(tf6.transition_clip);
            this.a.setTag(tf6.transition_clip, null);
            this.a.setClipBounds(rect);
        }

        @Override // dr8.f
        public void g(dr8 dr8Var) {
            this.a.setTag(tf6.transition_clip, this.a.getClipBounds());
            this.a.setClipBounds(this.e ? null : this.d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.n) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.c) {
                    rect = this.b;
                }
            } else if (!this.e) {
                rect = this.d;
            }
            this.a.setClipBounds(rect);
            if (z) {
                qb9.d(this.a, this.f, this.g, this.h, this.i);
            } else {
                qb9.d(this.a, this.j, this.k, this.l, this.m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            int max = Math.max(this.h - this.f, this.l - this.j);
            int max2 = Math.max(this.i - this.g, this.m - this.k);
            int i = z ? this.j : this.f;
            int i2 = z ? this.k : this.g;
            qb9.d(this.a, i, i2, max + i, max2 + i2);
            this.a.setClipBounds(z ? this.d : this.b);
        }
    }

    private static class h extends nr8 {
        boolean a = false;
        final ViewGroup b;

        h(ViewGroup viewGroup) {
            this.b = viewGroup;
        }

        @Override // dr8.f
        public void b(dr8 dr8Var) {
            if (!this.a) {
                z99.a(this.b, false);
            }
            dr8Var.U(this);
        }

        @Override // defpackage.nr8, dr8.f
        public void d(dr8 dr8Var) {
            z99.a(this.b, false);
            this.a = true;
        }

        @Override // defpackage.nr8, dr8.f
        public void e(dr8 dr8Var) {
            z99.a(this.b, true);
        }

        @Override // defpackage.nr8, dr8.f
        public void g(dr8 dr8Var) {
            z99.a(this.b, false);
        }
    }

    private static class i {
        private int a;
        private int b;
        private int c;
        private int d;
        private final View e;
        private int f;
        private int g;

        i(View view) {
            this.e = view;
        }

        private void b() {
            qb9.d(this.e, this.a, this.b, this.c, this.d);
            this.f = 0;
            this.g = 0;
        }

        void a(PointF pointF) {
            this.c = Math.round(pointF.x);
            this.d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f == i) {
                b();
            }
        }

        void c(PointF pointF) {
            this.a = Math.round(pointF.x);
            this.b = Math.round(pointF.y);
            int i = this.f + 1;
            this.f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    private void j0(wr8 wr8Var) {
        View view = wr8Var.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        wr8Var.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        wr8Var.a.put("android:changeBounds:parent", wr8Var.b.getParent());
        if (this.l0) {
            wr8Var.a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // defpackage.dr8
    public String[] F() {
        return m0;
    }

    @Override // defpackage.dr8
    public void f(wr8 wr8Var) {
        j0(wr8Var);
    }

    @Override // defpackage.dr8
    public void i(wr8 wr8Var) {
        Rect rect;
        j0(wr8Var);
        if (!this.l0 || (rect = (Rect) wr8Var.b.getTag(tf6.transition_clip)) == null) {
            return;
        }
        wr8Var.a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dr8
    public Animator n(ViewGroup viewGroup, wr8 wr8Var, wr8 wr8Var2) {
        int i2;
        View view;
        int i3;
        int i4;
        int i5;
        ObjectAnimator a2;
        int i6;
        ObjectAnimator objectAnimator;
        Animator c2;
        if (wr8Var == null || wr8Var2 == null) {
            return null;
        }
        Map map = wr8Var.a;
        Map map2 = wr8Var2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = wr8Var2.b;
        Rect rect = (Rect) wr8Var.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) wr8Var2.a.get("android:changeBounds:bounds");
        int i7 = rect.left;
        int i8 = rect2.left;
        int i9 = rect.top;
        int i10 = rect2.top;
        int i11 = rect.right;
        int i12 = rect2.right;
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        int i15 = i11 - i7;
        int i16 = i13 - i9;
        int i17 = i12 - i8;
        int i18 = i14 - i10;
        Rect rect3 = (Rect) wr8Var.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) wr8Var2.a.get("android:changeBounds:clip");
        if ((i15 == 0 || i16 == 0) && (i17 == 0 || i18 == 0)) {
            i2 = 0;
        } else {
            i2 = (i7 == i8 && i9 == i10) ? 0 : 1;
            if (i11 != i12 || i13 != i14) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.l0) {
            view = view2;
            qb9.d(view, i7, i9, Math.max(i15, i17) + i7, i9 + Math.max(i16, i18));
            if (i7 == i8 && i9 == i10) {
                i3 = i12;
                i4 = i11;
                i5 = i9;
                a2 = null;
            } else {
                i3 = i12;
                i4 = i11;
                i5 = i9;
                a2 = vb5.a(view, r0, v().a(i7, i9, i8, i10));
            }
            boolean z = rect3 == null;
            if (z) {
                i6 = 0;
                rect3 = new Rect(0, 0, i15, i16);
            } else {
                i6 = 0;
            }
            Rect rect5 = rect3;
            int i19 = rect4 == null ? 1 : i6;
            Rect rect6 = i19 != 0 ? new Rect(i6, i6, i17, i18) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimator = null;
            } else {
                view.setClipBounds(rect5);
                objectAnimator = ObjectAnimator.ofObject(view, "clipBounds", s0, rect5, rect6);
                g gVar = new g(view, rect5, z, rect6, i19, i7, i5, i4, i13, i8, i10, i3, i14);
                objectAnimator.addListener(gVar);
                a(gVar);
            }
            c2 = vr8.c(a2, objectAnimator);
        } else {
            view = view2;
            qb9.d(view, i7, i9, i11, i13);
            if (i2 != 2) {
                c2 = (i7 == i8 && i9 == i10) ? vb5.a(view, p0, v().a(i11, i13, i12, i14)) : vb5.a(view, q0, v().a(i7, i9, i8, i10));
            } else if (i15 == i17 && i16 == i18) {
                c2 = vb5.a(view, r0, v().a(i7, i9, i8, i10));
            } else {
                i iVar = new i(view);
                ObjectAnimator a3 = vb5.a(iVar, n0, v().a(i7, i9, i8, i10));
                ObjectAnimator a4 = vb5.a(iVar, o0, v().a(i11, i13, i12, i14));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a3, a4);
                animatorSet.addListener(new f(iVar));
                c2 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            z99.a(viewGroup4, true);
            x().a(new h(viewGroup4));
        }
        return c2;
    }
}
