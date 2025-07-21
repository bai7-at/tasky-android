package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class xo9 extends Drawable implements Drawable.Callback {
    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private wo9 i;
    private Drawable j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int r;

    public xo9(Drawable drawable, Drawable drawable2) {
        this(null);
        drawable = drawable == null ? vo9.a : drawable;
        this.j = drawable;
        drawable.setCallback(this);
        wo9 wo9Var = this.i;
        wo9Var.b = drawable.getChangingConfigurations() | wo9Var.b;
        drawable2 = drawable2 == null ? vo9.a : drawable2;
        this.k = drawable2;
        drawable2.setCallback(this);
        this.i.b |= drawable2.getChangingConfigurations();
    }

    public final Drawable a() {
        return this.k;
    }

    public final void b(int i) {
        this.c = this.d;
        this.f = 0;
        this.e = 250;
        this.a = 1;
        invalidateSelf();
    }

    public final boolean c() {
        if (!this.l) {
            boolean z = false;
            if (this.j.getConstantState() != null && this.k.getConstantState() != null) {
                z = true;
            }
            this.m = z;
            this.l = true;
        }
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r0 == 0) goto L22;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            int r0 = r6.a
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L38
            if (r0 == r1) goto La
            goto L41
        La:
            long r0 = r6.b
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L41
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r6.b
            long r0 = r0 - r4
            int r4 = r6.e
            float r4 = (float) r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L25
            goto L26
        L25:
            r3 = r2
        L26:
            if (r3 == 0) goto L2a
            r6.a = r2
        L2a:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r6.c
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r6.f = r0
            goto L41
        L38:
            long r3 = android.os.SystemClock.uptimeMillis()
            r6.b = r3
            r6.a = r1
            r3 = r2
        L41:
            int r0 = r6.f
            boolean r1 = r6.g
            android.graphics.drawable.Drawable r4 = r6.j
            android.graphics.drawable.Drawable r5 = r6.k
            if (r3 == 0) goto L60
            if (r1 == 0) goto L50
            if (r0 != 0) goto L55
            goto L51
        L50:
            r2 = r0
        L51:
            r4.draw(r7)
            r0 = r2
        L55:
            int r6 = r6.d
            if (r0 != r6) goto L5f
            r5.setAlpha(r6)
            r5.draw(r7)
        L5f:
            return
        L60:
            if (r1 == 0) goto L68
            int r2 = r6.d
            int r2 = r2 - r0
            r4.setAlpha(r2)
        L68:
            r4.draw(r7)
            if (r1 == 0) goto L72
            int r1 = r6.d
            r4.setAlpha(r1)
        L72:
            if (r0 <= 0) goto L7f
            r5.setAlpha(r0)
            r5.draw(r7)
            int r7 = r6.d
            r5.setAlpha(r7)
        L7f:
            r6.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo9.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        wo9 wo9Var = this.i;
        return wo9Var.b | changingConfigurations | wo9Var.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!c()) {
            return null;
        }
        this.i.a = getChangingConfigurations();
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.j.getIntrinsicHeight(), this.k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.j.getIntrinsicWidth(), this.k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.n) {
            this.r = Drawable.resolveOpacity(this.j.getOpacity(), this.k.getOpacity());
            this.n = true;
        }
        return this.r;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.h && super.mutate() == this) {
            if (!c()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.j.mutate();
            this.k.mutate();
            this.h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.j.setBounds(rect);
        this.k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f == this.d) {
            this.f = i;
        }
        this.d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        this.k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    xo9(wo9 wo9Var) {
        this.a = 0;
        this.d = 255;
        this.f = 0;
        this.g = true;
        this.i = new wo9(wo9Var);
    }
}
