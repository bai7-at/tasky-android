package com.skydoves.balloon.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAlign;
import defpackage.cc7;
import defpackage.d44;
import defpackage.ge5;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.he5;
import defpackage.hn3;
import defpackage.ie5;
import defpackage.it2;
import defpackage.j40;
import defpackage.je5;
import defpackage.ke5;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class BalloonComposeView extends AbstractComposeView implements j40 {
    private final View i;
    private final d44 j;
    private final Balloon k;
    private final sy4 l;
    private sy4 m;
    private boolean n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BalloonComposeView(android.view.View r8, boolean r9, com.skydoves.balloon.Balloon.a r10, java.util.UUID r11) {
        /*
            r7 = this;
            java.lang.String r0 = "anchorView"
            defpackage.zq3.h(r8, r0)
            java.lang.String r0 = "builder"
            defpackage.zq3.h(r10, r0)
            java.lang.String r0 = "balloonID"
            defpackage.zq3.h(r11, r0)
            android.content.Context r2 = r8.getContext()
            java.lang.String r0 = "getContext(...)"
            defpackage.zq3.g(r2, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.i = r8
            android.view.View r8 = r7.getAnchorView()
            d44 r8 = androidx.lifecycle.ViewTreeLifecycleOwner.a(r8)
            r7.j = r8
            com.skydoves.balloon.Balloon$a r10 = r10.r1(r8)
            com.skydoves.balloon.Balloon$a r10 = r10.n1(r9)
            if (r9 == 0) goto L39
            r10.q1(r7)
        L39:
            com.skydoves.balloon.Balloon r9 = r10.a()
            r7.k = r9
            com.skydoves.balloon.compose.ComposableSingletons$BalloonComposeViewKt r9 = com.skydoves.balloon.compose.ComposableSingletons$BalloonComposeViewKt.a
            it2 r9 = r9.a()
            r10 = 0
            r0 = 2
            sy4 r9 = androidx.compose.runtime.y.j(r9, r10, r0, r10)
            r7.l = r9
            sy4 r9 = androidx.compose.runtime.y.j(r10, r10, r0, r10)
            r7.m = r9
            androidx.lifecycle.ViewTreeLifecycleOwner.b(r7, r8)
            android.view.View r8 = r7.getAnchorView()
            sa9 r8 = androidx.lifecycle.ViewTreeViewModelStoreOwner.a(r8)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.b(r7, r8)
            android.view.View r8 = r7.getAnchorView()
            aa7 r8 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.a(r8)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.b(r7, r8)
            int r8 = defpackage.kg6.compose_view_saveable_id_tag
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "BalloonComposeView:"
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r7.setTag(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.compose.BalloonComposeView.<init>(android.view.View, boolean, com.skydoves.balloon.Balloon$a, java.util.UUID):void");
    }

    private final it2 getContent() {
        return (it2) this.l.getValue();
    }

    private final void setContent(it2 it2Var) {
        this.l.setValue(it2Var);
    }

    @Override // defpackage.j40
    public void a(int i, int i2) {
        getBalloon().E0(getAnchorView(), i, i2);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void b(Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-441221009);
        if ((i & 14) == 0) {
            i2 = (h.S(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-441221009, i2, -1, "com.skydoves.balloon.compose.BalloonComposeView.Content (BalloonComposeView.kt:93)");
            }
            getContent().invoke(this, h, Integer.valueOf(i2 & 14));
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.skydoves.balloon.compose.BalloonComposeView$Content$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    BalloonComposeView.this.b(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    @Override // defpackage.j40
    public void dismiss() {
        getBalloon().A();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = BalloonComposeView.class.getName();
        zq3.g(name, "getName(...)");
        return name;
    }

    public View getAnchorView() {
        return this.i;
    }

    public Balloon getBalloon() {
        return this.k;
    }

    public View getBalloonArrowView() {
        return getBalloon().H();
    }

    public final sy4 getBalloonLayoutInfo$balloon_compose_release() {
        return this.m;
    }

    public ViewGroup getContentView() {
        return getBalloon().M();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.n;
    }

    public final void l() {
        getBalloon().A();
        ViewTreeLifecycleOwner.b(this, null);
        ViewTreeViewModelStoreOwner.b(this, null);
        ViewTreeSavedStateRegistryOwner.b(this, null);
    }

    public final void m(c cVar, it2 it2Var) {
        zq3.h(cVar, "compositionContext");
        zq3.h(it2Var, "content");
        setParentCompositionContext(cVar);
        this.n = true;
        setContent(it2Var);
        if (isAttachedToWindow()) {
            e();
        }
    }

    public void n(BalloonAlign balloonAlign, int i, int i2) {
        zq3.h(balloonAlign, "align");
        getBalloon().Q0(balloonAlign, getAnchorView(), i, i2);
    }

    public final void o(long j) {
        getBalloon().S0(hn3.g(j), hn3.f(j));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = hn3.g(j);
        layoutParams.height = hn3.f(j);
        setLayoutParams(layoutParams);
    }

    public final void setBalloonLayoutInfo$balloon_compose_release(sy4 sy4Var) {
        zq3.h(sy4Var, "<set-?>");
        this.m = sy4Var;
    }

    public void setOnBalloonClickListener(ge5 ge5Var) {
        getBalloon().m0(ge5Var);
    }

    public void setOnBalloonDismissListener(he5 he5Var) {
        getBalloon().p0(he5Var);
    }

    public void setOnBalloonInitializedListener(ie5 ie5Var) {
        getBalloon().s0(ie5Var);
    }

    public void setOnBalloonOutsideTouchListener(je5 je5Var) {
        getBalloon().u0(je5Var);
    }

    public void setOnBalloonOverlayClickListener(ke5 ke5Var) {
        getBalloon().w0(ke5Var);
    }

    public void setOnBalloonOverlayTouchListener(View.OnTouchListener onTouchListener) {
        getBalloon().z0(onTouchListener);
    }

    public void setOnBalloonTouchListener(View.OnTouchListener onTouchListener) {
        getBalloon().B0(onTouchListener);
    }

    public void setOnBalloonClickListener(ss2 ss2Var) {
        zq3.h(ss2Var, "block");
        getBalloon().l0(ss2Var);
    }

    public void setOnBalloonDismissListener(qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        getBalloon().o0(qs2Var);
    }

    public void setOnBalloonInitializedListener(ss2 ss2Var) {
        zq3.h(ss2Var, "block");
        getBalloon().r0(ss2Var);
    }

    public void setOnBalloonOutsideTouchListener(gt2 gt2Var) {
        zq3.h(gt2Var, "block");
        getBalloon().t0(gt2Var);
    }

    @Override // defpackage.j40
    public void setOnBalloonOverlayClickListener(qs2 qs2Var) {
        zq3.h(qs2Var, "block");
        getBalloon().v0(qs2Var);
    }

    public void setOnBalloonOverlayTouchListener(gt2 gt2Var) {
        zq3.h(gt2Var, "block");
        getBalloon().y0(gt2Var);
    }
}
