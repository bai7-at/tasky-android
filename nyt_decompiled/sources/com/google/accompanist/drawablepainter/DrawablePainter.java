package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.compose.runtime.b0;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.ae;
import defpackage.c04;
import defpackage.dg4;
import defpackage.fv1;
import defpackage.ov6;
import defpackage.ph0;
import defpackage.qn0;
import defpackage.qs2;
import defpackage.sy4;
import defpackage.uo6;
import defpackage.wd;
import defpackage.zq3;
import defpackage.zt7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.c;

/* loaded from: classes2.dex */
public final class DrawablePainter extends Painter implements ov6 {
    private final Drawable g;
    private final sy4 h;
    private final sy4 i;
    private final c04 j;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            a = iArr;
        }
    }

    public DrawablePainter(Drawable drawable) {
        long c;
        zq3.h(drawable, "drawable");
        this.g = drawable;
        this.h = b0.e(0, null, 2, null);
        c = DrawablePainterKt.c(drawable);
        this.i = b0.e(zt7.c(c), null, 2, null);
        this.j = c.a(new qs2() { // from class: com.google.accompanist.drawablepainter.DrawablePainter$callback$2

            public static final class a implements Drawable.Callback {
                final /* synthetic */ DrawablePainter a;

                a(DrawablePainter drawablePainter) {
                    this.a = drawablePainter;
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void invalidateDrawable(Drawable drawable) {
                    int r;
                    long c;
                    zq3.h(drawable, QueryKeys.SUBDOMAIN);
                    DrawablePainter drawablePainter = this.a;
                    r = drawablePainter.r();
                    drawablePainter.u(r + 1);
                    DrawablePainter drawablePainter2 = this.a;
                    c = DrawablePainterKt.c(drawablePainter2.s());
                    drawablePainter2.v(c);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                    Handler d;
                    zq3.h(drawable, QueryKeys.SUBDOMAIN);
                    zq3.h(runnable, "what");
                    d = DrawablePainterKt.d();
                    d.postAtTime(runnable, j);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    Handler d;
                    zq3.h(drawable, QueryKeys.SUBDOMAIN);
                    zq3.h(runnable, "what");
                    d = DrawablePainterKt.d();
                    d.removeCallbacks(runnable);
                }
            }

            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a mo865invoke() {
                return new a(DrawablePainter.this);
            }
        });
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final Drawable.Callback q() {
        return (Drawable.Callback) this.j.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        return ((Number) this.h.getValue()).intValue();
    }

    private final long t() {
        return ((zt7) this.i.getValue()).m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i) {
        this.h.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(long j) {
        this.i.setValue(zt7.c(j));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean a(float f) {
        this.g.setAlpha(uo6.m(dg4.d(f * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean b(qn0 qn0Var) {
        this.g.setColorFilter(qn0Var != null ? ae.b(qn0Var) : null);
        return true;
    }

    @Override // defpackage.ov6
    public void c() {
        this.g.setCallback(q());
        this.g.setVisible(true, true);
        Object obj = this.g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // defpackage.ov6
    public void d() {
        e();
    }

    @Override // defpackage.ov6
    public void e() {
        Object obj = this.g;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.g.setVisible(false, false);
        this.g.setCallback(null);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected boolean f(LayoutDirection layoutDirection) {
        zq3.h(layoutDirection, "layoutDirection");
        Drawable drawable = this.g;
        int i = a.a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return drawable.setLayoutDirection(i2);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public long k() {
        return t();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    protected void m(fv1 fv1Var) {
        zq3.h(fv1Var, "<this>");
        ph0 c = fv1Var.i1().c();
        r();
        this.g.setBounds(0, 0, dg4.d(zt7.i(fv1Var.b())), dg4.d(zt7.g(fv1Var.b())));
        try {
            c.t();
            this.g.draw(wd.d(c));
        } finally {
            c.k();
        }
    }

    public final Drawable s() {
        return this.g;
    }
}
