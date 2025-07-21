package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class k27 extends View {
    public static final a f = new a(null);
    public static final int g = 8;
    private static final int[] h = {R.attr.state_pressed, R.attr.state_enabled};
    private static final int[] i = new int[0];
    private kx8 a;
    private Boolean b;
    private Long c;
    private Runnable d;
    private qs2 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public k27(Context context) {
        super(context);
    }

    private final void c(boolean z) {
        kx8 kx8Var = new kx8(z);
        setBackground(kx8Var);
        this.a = kx8Var;
    }

    private final void setRippleState(boolean z) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.c;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z || longValue >= 5) {
            int[] iArr = z ? h : i;
            kx8 kx8Var = this.a;
            if (kx8Var != null) {
                kx8Var.setState(iArr);
            }
        } else {
            Runnable runnable2 = new Runnable() { // from class: j27
                @Override // java.lang.Runnable
                public final void run() {
                    k27.setRippleState$lambda$2(k27.this);
                }
            };
            this.d = runnable2;
            postDelayed(runnable2, 50L);
        }
        this.c = Long.valueOf(currentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(k27 k27Var) {
        kx8 kx8Var = k27Var.a;
        if (kx8Var != null) {
            kx8Var.setState(i);
        }
        k27Var.d = null;
    }

    public final void b(e26 e26Var, boolean z, long j, int i2, long j2, float f2, qs2 qs2Var) {
        if (this.a == null || !zq3.c(Boolean.valueOf(z), this.b)) {
            c(z);
            this.b = Boolean.valueOf(z);
        }
        kx8 kx8Var = this.a;
        zq3.e(kx8Var);
        this.e = qs2Var;
        f(j, i2, j2, f2);
        if (z) {
            kx8Var.setHotspot(fd5.o(e26Var.a()), fd5.p(e26Var.a()));
        } else {
            kx8Var.setHotspot(kx8Var.getBounds().centerX(), kx8Var.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void d() {
        this.e = null;
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.d;
            zq3.e(runnable2);
            runnable2.run();
        } else {
            kx8 kx8Var = this.a;
            if (kx8Var != null) {
                kx8Var.setState(i);
            }
        }
        kx8 kx8Var2 = this.a;
        if (kx8Var2 == null) {
            return;
        }
        kx8Var2.setVisible(false, false);
        unscheduleDrawable(kx8Var2);
    }

    public final void e() {
        setRippleState(false);
    }

    public final void f(long j, int i2, long j2, float f2) {
        kx8 kx8Var = this.a;
        if (kx8Var == null) {
            return;
        }
        kx8Var.c(i2);
        kx8Var.b(j2, f2);
        Rect rect = new Rect(0, 0, dg4.d(zt7.i(j)), dg4.d(zt7.g(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        kx8Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        qs2 qs2Var = this.e;
        if (qs2Var != null) {
            qs2Var.mo865invoke();
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }
}
