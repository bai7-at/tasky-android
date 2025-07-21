package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import defpackage.al;
import defpackage.d80;
import defpackage.fw4;
import defpackage.kv1;
import defpackage.m27;
import defpackage.mh8;
import defpackage.nn6;
import defpackage.pb9;
import defpackage.qf4;
import defpackage.qh0;
import defpackage.qo0;
import defpackage.sk8;
import defpackage.tf4;
import defpackage.tv1;
import defpackage.uf4;
import defpackage.zh8;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a extends uf4 implements Drawable.Callback, zh8.b {
    private static final int[] i1 = {R.attr.state_enabled};
    private static final ShapeDrawable j1 = new ShapeDrawable(new OvalShape());
    private float A0;
    private float B0;
    private float C0;
    private float D0;
    private float E0;
    private final Context F0;
    private final Paint G0;
    private final Paint H0;
    private final Paint.FontMetrics I0;
    private final RectF J0;
    private final PointF K0;
    private final Path L0;
    private final zh8 M0;
    private ColorStateList N;
    private int N0;
    private int O0;
    private int P0;
    private ColorStateList Q;
    private int Q0;
    private int R0;
    private float S;
    private int S0;
    private boolean T0;
    private int U0;
    private int V0;
    private ColorFilter W0;
    private float X;
    private PorterDuffColorFilter X0;
    private ColorStateList Y;
    private ColorStateList Y0;
    private float Z;
    private PorterDuff.Mode Z0;
    private int[] a1;
    private boolean b1;
    private ColorStateList c1;
    private WeakReference d1;
    private ColorStateList e0;
    private TextUtils.TruncateAt e1;
    private CharSequence f0;
    private boolean f1;
    private boolean g0;
    private int g1;
    private Drawable h0;
    private boolean h1;
    private ColorStateList i0;
    private float j0;
    private boolean k0;
    private boolean l0;
    private Drawable m0;
    private Drawable n0;
    private ColorStateList o0;
    private float p0;
    private CharSequence q0;
    private boolean r0;
    private boolean s0;
    private Drawable t0;
    private ColorStateList u0;
    private fw4 v0;
    private fw4 w0;
    private float x0;
    private float y0;
    private float z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0204a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.X = -1.0f;
        this.G0 = new Paint(1);
        this.I0 = new Paint.FontMetrics();
        this.J0 = new RectF();
        this.K0 = new PointF();
        this.L0 = new Path();
        this.V0 = 255;
        this.Z0 = PorterDuff.Mode.SRC_IN;
        this.d1 = new WeakReference(null);
        M(context);
        this.F0 = context;
        zh8 zh8Var = new zh8(this);
        this.M0 = zh8Var;
        this.f0 = "";
        zh8Var.f().density = context.getResources().getDisplayMetrics().density;
        this.H0 = null;
        int[] iArr = i1;
        setState(iArr);
        k2(iArr);
        this.f1 = true;
        if (m27.a) {
            j1.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (O2()) {
            n0(rect, this.J0);
            RectF rectF = this.J0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.m0.setBounds(0, 0, (int) this.J0.width(), (int) this.J0.height());
            if (m27.a) {
                this.n0.setBounds(this.m0.getBounds());
                this.n0.jumpToCurrentState();
                this.n0.draw(canvas);
            } else {
                this.m0.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        this.G0.setColor(this.R0);
        this.G0.setStyle(Paint.Style.FILL);
        this.J0.set(rect);
        if (!this.h1) {
            canvas.drawRoundRect(this.J0, H0(), H0(), this.G0);
        } else {
            h(new RectF(rect), this.L0);
            super.q(canvas, this.G0, this.L0, s());
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        Paint paint = this.H0;
        if (paint != null) {
            paint.setColor(qo0.p(-16777216, 127));
            canvas.drawRect(rect, this.H0);
            if (N2() || M2()) {
                k0(rect, this.J0);
                canvas.drawRect(this.J0, this.H0);
            }
            if (this.f0 != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.H0);
            }
            if (O2()) {
                n0(rect, this.J0);
                canvas.drawRect(this.J0, this.H0);
            }
            this.H0.setColor(qo0.p(-65536, 127));
            m0(rect, this.J0);
            canvas.drawRect(this.J0, this.H0);
            this.H0.setColor(qo0.p(-16711936, 127));
            o0(rect, this.J0);
            canvas.drawRect(this.J0, this.H0);
        }
    }

    private void D0(Canvas canvas, Rect rect) {
        if (this.f0 != null) {
            Paint.Align s0 = s0(rect, this.K0);
            q0(rect, this.J0);
            if (this.M0.e() != null) {
                this.M0.f().drawableState = getState();
                this.M0.l(this.F0);
            }
            this.M0.f().setTextAlign(s0);
            int i = 0;
            boolean z = Math.round(this.M0.g(g1().toString())) > Math.round(this.J0.width());
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.J0);
            }
            CharSequence charSequence = this.f0;
            if (z && this.e1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.M0.f(), this.J0.width(), this.e1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.K0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.M0.f());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    private boolean M2() {
        return this.s0 && this.t0 != null && this.T0;
    }

    private boolean N2() {
        return this.g0 && this.h0 != null;
    }

    private boolean O2() {
        return this.l0 && this.m0 != null;
    }

    private void P2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void Q2() {
        this.c1 = this.b1 ? m27.a(this.e0) : null;
    }

    private void R2() {
        this.n0 = new RippleDrawable(m27.a(e1()), this.m0, j1);
    }

    private float Y0() {
        Drawable drawable = this.T0 ? this.t0 : this.h0;
        float f = this.j0;
        if (f > 0.0f || drawable == null) {
            return f;
        }
        float ceil = (float) Math.ceil(pb9.e(this.F0, 24));
        return ((float) drawable.getIntrinsicHeight()) <= ceil ? drawable.getIntrinsicHeight() : ceil;
    }

    private float Z0() {
        Drawable drawable = this.T0 ? this.t0 : this.h0;
        float f = this.j0;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private void a2(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            onStateChange(getState());
        }
    }

    private void j0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        kv1.m(drawable, kv1.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.m0) {
            if (drawable.isStateful()) {
                drawable.setState(V0());
            }
            kv1.o(drawable, this.o0);
            return;
        }
        Drawable drawable2 = this.h0;
        if (drawable == drawable2 && this.k0) {
            kv1.o(drawable2, this.i0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void k0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (N2() || M2()) {
            float f = this.x0 + this.y0;
            float Z0 = Z0();
            if (kv1.f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + Z0;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - Z0;
            }
            float Y0 = Y0();
            float exactCenterY = rect.exactCenterY() - (Y0 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + Y0;
        }
    }

    private ColorFilter k1() {
        ColorFilter colorFilter = this.W0;
        return colorFilter != null ? colorFilter : this.X0;
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (O2()) {
            float f = this.E0 + this.D0 + this.p0 + this.C0 + this.B0;
            if (kv1.f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private static boolean m1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.E0 + this.D0;
            if (kv1.f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.p0;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.p0;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.p0;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void o0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (O2()) {
            float f = this.E0 + this.D0 + this.p0 + this.C0 + this.B0;
            if (kv1.f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f0 != null) {
            float l0 = this.x0 + l0() + this.A0;
            float p0 = this.E0 + p0() + this.B0;
            if (kv1.f(this) == 0) {
                rectF.left = rect.left + l0;
                rectF.right = rect.right - p0;
            } else {
                rectF.left = rect.left + p0;
                rectF.right = rect.right - l0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean q1(mh8 mh8Var) {
        return (mh8Var == null || mh8Var.i() == null || !mh8Var.i().isStateful()) ? false : true;
    }

    private float r0() {
        this.M0.f().getFontMetrics(this.I0);
        Paint.FontMetrics fontMetrics = this.I0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean r1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean s1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private boolean t0() {
        return this.s0 && this.t0 != null && this.r0;
    }

    private void t1(AttributeSet attributeSet, int i, int i2) {
        TypedArray i3 = sk8.i(this.F0, attributeSet, nn6.Chip, i, i2, new int[0]);
        this.h1 = i3.hasValue(nn6.Chip_shapeAppearance);
        a2(tf4.a(this.F0, i3, nn6.Chip_chipSurfaceColor));
        E1(tf4.a(this.F0, i3, nn6.Chip_chipBackgroundColor));
        S1(i3.getDimension(nn6.Chip_chipMinHeight, 0.0f));
        if (i3.hasValue(nn6.Chip_chipCornerRadius)) {
            G1(i3.getDimension(nn6.Chip_chipCornerRadius, 0.0f));
        }
        W1(tf4.a(this.F0, i3, nn6.Chip_chipStrokeColor));
        Y1(i3.getDimension(nn6.Chip_chipStrokeWidth, 0.0f));
        x2(tf4.a(this.F0, i3, nn6.Chip_rippleColor));
        C2(i3.getText(nn6.Chip_android_text));
        mh8 f = tf4.f(this.F0, i3, nn6.Chip_android_textAppearance);
        f.l(i3.getDimension(nn6.Chip_android_textSize, f.j()));
        D2(f);
        int i4 = i3.getInt(nn6.Chip_android_ellipsize, 0);
        if (i4 == 1) {
            p2(TextUtils.TruncateAt.START);
        } else if (i4 == 2) {
            p2(TextUtils.TruncateAt.MIDDLE);
        } else if (i4 == 3) {
            p2(TextUtils.TruncateAt.END);
        }
        R1(i3.getBoolean(nn6.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            R1(i3.getBoolean(nn6.Chip_chipIconEnabled, false));
        }
        K1(tf4.d(this.F0, i3, nn6.Chip_chipIcon));
        if (i3.hasValue(nn6.Chip_chipIconTint)) {
            O1(tf4.a(this.F0, i3, nn6.Chip_chipIconTint));
        }
        M1(i3.getDimension(nn6.Chip_chipIconSize, -1.0f));
        n2(i3.getBoolean(nn6.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            n2(i3.getBoolean(nn6.Chip_closeIconEnabled, false));
        }
        b2(tf4.d(this.F0, i3, nn6.Chip_closeIcon));
        l2(tf4.a(this.F0, i3, nn6.Chip_closeIconTint));
        g2(i3.getDimension(nn6.Chip_closeIconSize, 0.0f));
        w1(i3.getBoolean(nn6.Chip_android_checkable, false));
        D1(i3.getBoolean(nn6.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            D1(i3.getBoolean(nn6.Chip_checkedIconEnabled, false));
        }
        y1(tf4.d(this.F0, i3, nn6.Chip_checkedIcon));
        if (i3.hasValue(nn6.Chip_checkedIconTint)) {
            A1(tf4.a(this.F0, i3, nn6.Chip_checkedIconTint));
        }
        A2(fw4.b(this.F0, i3, nn6.Chip_showMotionSpec));
        q2(fw4.b(this.F0, i3, nn6.Chip_hideMotionSpec));
        U1(i3.getDimension(nn6.Chip_chipStartPadding, 0.0f));
        u2(i3.getDimension(nn6.Chip_iconStartPadding, 0.0f));
        s2(i3.getDimension(nn6.Chip_iconEndPadding, 0.0f));
        I2(i3.getDimension(nn6.Chip_textStartPadding, 0.0f));
        F2(i3.getDimension(nn6.Chip_textEndPadding, 0.0f));
        i2(i3.getDimension(nn6.Chip_closeIconStartPadding, 0.0f));
        d2(i3.getDimension(nn6.Chip_closeIconEndPadding, 0.0f));
        I1(i3.getDimension(nn6.Chip_chipEndPadding, 0.0f));
        w2(i3.getDimensionPixelSize(nn6.Chip_android_maxWidth, Integer.MAX_VALUE));
        i3.recycle();
    }

    public static a u0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.t1(attributeSet, i, i2);
        return aVar;
    }

    private void v0(Canvas canvas, Rect rect) {
        if (M2()) {
            k0(rect, this.J0);
            RectF rectF = this.J0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.t0.setBounds(0, 0, (int) this.J0.width(), (int) this.J0.height());
            this.t0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private boolean v1(int[] iArr, int[] iArr2) {
        boolean z;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.N;
        int l = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.N0) : 0);
        boolean z2 = true;
        if (this.N0 != l) {
            this.N0 = l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.Q;
        int l2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.O0) : 0);
        if (this.O0 != l2) {
            this.O0 = l2;
            onStateChange = true;
        }
        int i = qf4.i(l, l2);
        if ((this.P0 != i) | (v() == null)) {
            this.P0 = i;
            W(ColorStateList.valueOf(i));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.Y;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.Q0) : 0;
        if (this.Q0 != colorForState) {
            this.Q0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.c1 == null || !m27.b(iArr)) ? 0 : this.c1.getColorForState(iArr, this.R0);
        if (this.R0 != colorForState2) {
            this.R0 = colorForState2;
            if (this.b1) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.M0.e() == null || this.M0.e().i() == null) ? 0 : this.M0.e().i().getColorForState(iArr, this.S0);
        if (this.S0 != colorForState3) {
            this.S0 = colorForState3;
            onStateChange = true;
        }
        boolean z3 = m1(getState(), R.attr.state_checked) && this.r0;
        if (this.T0 == z3 || this.t0 == null) {
            z = false;
        } else {
            float l0 = l0();
            this.T0 = z3;
            if (l0 != l0()) {
                onStateChange = true;
                z = true;
            } else {
                z = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.Y0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.U0) : 0;
        if (this.U0 != colorForState4) {
            this.U0 = colorForState4;
            this.X0 = tv1.j(this, this.Y0, this.Z0);
        } else {
            z2 = onStateChange;
        }
        if (s1(this.h0)) {
            z2 |= this.h0.setState(iArr);
        }
        if (s1(this.t0)) {
            z2 |= this.t0.setState(iArr);
        }
        if (s1(this.m0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z2 |= this.m0.setState(iArr3);
        }
        if (m27.a && s1(this.n0)) {
            z2 |= this.n0.setState(iArr2);
        }
        if (z2) {
            invalidateSelf();
        }
        if (z) {
            u1();
        }
        return z2;
    }

    private void w0(Canvas canvas, Rect rect) {
        if (this.h1) {
            return;
        }
        this.G0.setColor(this.O0);
        this.G0.setStyle(Paint.Style.FILL);
        this.G0.setColorFilter(k1());
        this.J0.set(rect);
        canvas.drawRoundRect(this.J0, H0(), H0(), this.G0);
    }

    private void x0(Canvas canvas, Rect rect) {
        if (N2()) {
            k0(rect, this.J0);
            RectF rectF = this.J0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.h0.setBounds(0, 0, (int) this.J0.width(), (int) this.J0.height());
            this.h0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.Z <= 0.0f || this.h1) {
            return;
        }
        this.G0.setColor(this.Q0);
        this.G0.setStyle(Paint.Style.STROKE);
        if (!this.h1) {
            this.G0.setColorFilter(k1());
        }
        RectF rectF = this.J0;
        float f = rect.left;
        float f2 = this.Z;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.X - (this.Z / 2.0f);
        canvas.drawRoundRect(this.J0, f3, f3, this.G0);
    }

    private void z0(Canvas canvas, Rect rect) {
        if (this.h1) {
            return;
        }
        this.G0.setColor(this.N0);
        this.G0.setStyle(Paint.Style.FILL);
        this.J0.set(rect);
        canvas.drawRoundRect(this.J0, H0(), H0(), this.G0);
    }

    public void A1(ColorStateList colorStateList) {
        if (this.u0 != colorStateList) {
            this.u0 = colorStateList;
            if (t0()) {
                kv1.o(this.t0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void A2(fw4 fw4Var) {
        this.v0 = fw4Var;
    }

    public void B1(int i) {
        A1(al.a(this.F0, i));
    }

    public void B2(int i) {
        A2(fw4.c(this.F0, i));
    }

    public void C1(int i) {
        D1(this.F0.getResources().getBoolean(i));
    }

    public void C2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f0, charSequence)) {
            return;
        }
        this.f0 = charSequence;
        this.M0.k(true);
        invalidateSelf();
        u1();
    }

    public void D1(boolean z) {
        if (this.s0 != z) {
            boolean M2 = M2();
            this.s0 = z;
            boolean M22 = M2();
            if (M2 != M22) {
                if (M22) {
                    j0(this.t0);
                } else {
                    P2(this.t0);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public void D2(mh8 mh8Var) {
        this.M0.j(mh8Var, this.F0);
    }

    public Drawable E0() {
        return this.t0;
    }

    public void E1(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            onStateChange(getState());
        }
    }

    public void E2(int i) {
        D2(new mh8(this.F0, i));
    }

    public ColorStateList F0() {
        return this.u0;
    }

    public void F1(int i) {
        E1(al.a(this.F0, i));
    }

    public void F2(float f) {
        if (this.B0 != f) {
            this.B0 = f;
            invalidateSelf();
            u1();
        }
    }

    public ColorStateList G0() {
        return this.Q;
    }

    public void G1(float f) {
        if (this.X != f) {
            this.X = f;
            setShapeAppearanceModel(C().w(f));
        }
    }

    public void G2(int i) {
        F2(this.F0.getResources().getDimension(i));
    }

    public float H0() {
        return this.h1 ? F() : this.X;
    }

    public void H1(int i) {
        G1(this.F0.getResources().getDimension(i));
    }

    public void H2(float f) {
        mh8 h1 = h1();
        if (h1 != null) {
            h1.l(f);
            this.M0.f().setTextSize(f);
            a();
        }
    }

    public float I0() {
        return this.E0;
    }

    public void I1(float f) {
        if (this.E0 != f) {
            this.E0 = f;
            invalidateSelf();
            u1();
        }
    }

    public void I2(float f) {
        if (this.A0 != f) {
            this.A0 = f;
            invalidateSelf();
            u1();
        }
    }

    public Drawable J0() {
        Drawable drawable = this.h0;
        if (drawable != null) {
            return kv1.q(drawable);
        }
        return null;
    }

    public void J1(int i) {
        I1(this.F0.getResources().getDimension(i));
    }

    public void J2(int i) {
        I2(this.F0.getResources().getDimension(i));
    }

    public float K0() {
        return this.j0;
    }

    public void K1(Drawable drawable) {
        Drawable J0 = J0();
        if (J0 != drawable) {
            float l0 = l0();
            this.h0 = drawable != null ? kv1.r(drawable).mutate() : null;
            float l02 = l0();
            P2(J0);
            if (N2()) {
                j0(this.h0);
            }
            invalidateSelf();
            if (l0 != l02) {
                u1();
            }
        }
    }

    public void K2(boolean z) {
        if (this.b1 != z) {
            this.b1 = z;
            Q2();
            onStateChange(getState());
        }
    }

    public ColorStateList L0() {
        return this.i0;
    }

    public void L1(int i) {
        K1(al.b(this.F0, i));
    }

    boolean L2() {
        return this.f1;
    }

    public float M0() {
        return this.S;
    }

    public void M1(float f) {
        if (this.j0 != f) {
            float l0 = l0();
            this.j0 = f;
            float l02 = l0();
            invalidateSelf();
            if (l0 != l02) {
                u1();
            }
        }
    }

    public float N0() {
        return this.x0;
    }

    public void N1(int i) {
        M1(this.F0.getResources().getDimension(i));
    }

    public ColorStateList O0() {
        return this.Y;
    }

    public void O1(ColorStateList colorStateList) {
        this.k0 = true;
        if (this.i0 != colorStateList) {
            this.i0 = colorStateList;
            if (N2()) {
                kv1.o(this.h0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float P0() {
        return this.Z;
    }

    public void P1(int i) {
        O1(al.a(this.F0, i));
    }

    public Drawable Q0() {
        Drawable drawable = this.m0;
        if (drawable != null) {
            return kv1.q(drawable);
        }
        return null;
    }

    public void Q1(int i) {
        R1(this.F0.getResources().getBoolean(i));
    }

    public CharSequence R0() {
        return this.q0;
    }

    public void R1(boolean z) {
        if (this.g0 != z) {
            boolean N2 = N2();
            this.g0 = z;
            boolean N22 = N2();
            if (N2 != N22) {
                if (N22) {
                    j0(this.h0);
                } else {
                    P2(this.h0);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public float S0() {
        return this.D0;
    }

    public void S1(float f) {
        if (this.S != f) {
            this.S = f;
            invalidateSelf();
            u1();
        }
    }

    public float T0() {
        return this.p0;
    }

    public void T1(int i) {
        S1(this.F0.getResources().getDimension(i));
    }

    public float U0() {
        return this.C0;
    }

    public void U1(float f) {
        if (this.x0 != f) {
            this.x0 = f;
            invalidateSelf();
            u1();
        }
    }

    public int[] V0() {
        return this.a1;
    }

    public void V1(int i) {
        U1(this.F0.getResources().getDimension(i));
    }

    public ColorStateList W0() {
        return this.o0;
    }

    public void W1(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (this.h1) {
                e0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void X0(RectF rectF) {
        o0(getBounds(), rectF);
    }

    public void X1(int i) {
        W1(al.a(this.F0, i));
    }

    public void Y1(float f) {
        if (this.Z != f) {
            this.Z = f;
            this.G0.setStrokeWidth(f);
            if (this.h1) {
                super.f0(f);
            }
            invalidateSelf();
        }
    }

    public void Z1(int i) {
        Y1(this.F0.getResources().getDimension(i));
    }

    @Override // zh8.b
    public void a() {
        u1();
        invalidateSelf();
    }

    public TextUtils.TruncateAt a1() {
        return this.e1;
    }

    public fw4 b1() {
        return this.w0;
    }

    public void b2(Drawable drawable) {
        Drawable Q0 = Q0();
        if (Q0 != drawable) {
            float p0 = p0();
            this.m0 = drawable != null ? kv1.r(drawable).mutate() : null;
            if (m27.a) {
                R2();
            }
            float p02 = p0();
            P2(Q0);
            if (O2()) {
                j0(this.m0);
            }
            invalidateSelf();
            if (p0 != p02) {
                u1();
            }
        }
    }

    public float c1() {
        return this.z0;
    }

    public void c2(CharSequence charSequence) {
        if (this.q0 != charSequence) {
            this.q0 = d80.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float d1() {
        return this.y0;
    }

    public void d2(float f) {
        if (this.D0 != f) {
            this.D0 = f;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.V0;
        int a = i < 255 ? qh0.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        z0(canvas, bounds);
        w0(canvas, bounds);
        if (this.h1) {
            super.draw(canvas);
        }
        y0(canvas, bounds);
        B0(canvas, bounds);
        x0(canvas, bounds);
        v0(canvas, bounds);
        if (this.f1) {
            D0(canvas, bounds);
        }
        A0(canvas, bounds);
        C0(canvas, bounds);
        if (this.V0 < 255) {
            canvas.restoreToCount(a);
        }
    }

    public ColorStateList e1() {
        return this.e0;
    }

    public void e2(int i) {
        d2(this.F0.getResources().getDimension(i));
    }

    public fw4 f1() {
        return this.v0;
    }

    public void f2(int i) {
        b2(al.b(this.F0, i));
    }

    public CharSequence g1() {
        return this.f0;
    }

    public void g2(float f) {
        if (this.p0 != f) {
            this.p0 = f;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.V0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.W0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.S;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.x0 + l0() + this.A0 + this.M0.g(g1().toString()) + this.B0 + p0() + this.E0), this.g1);
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.h1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.X);
        } else {
            outline.setRoundRect(bounds, this.X);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public mh8 h1() {
        return this.M0.e();
    }

    public void h2(int i) {
        g2(this.F0.getResources().getDimension(i));
    }

    public float i1() {
        return this.B0;
    }

    public void i2(float f) {
        if (this.C0 != f) {
            this.C0 = f;
            invalidateSelf();
            if (O2()) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return r1(this.N) || r1(this.Q) || r1(this.Y) || (this.b1 && r1(this.c1)) || q1(this.M0.e()) || t0() || s1(this.h0) || s1(this.t0) || r1(this.Y0);
    }

    public float j1() {
        return this.A0;
    }

    public void j2(int i) {
        i2(this.F0.getResources().getDimension(i));
    }

    public boolean k2(int[] iArr) {
        if (Arrays.equals(this.a1, iArr)) {
            return false;
        }
        this.a1 = iArr;
        if (O2()) {
            return v1(getState(), iArr);
        }
        return false;
    }

    float l0() {
        if (N2() || M2()) {
            return this.y0 + Z0() + this.z0;
        }
        return 0.0f;
    }

    public boolean l1() {
        return this.b1;
    }

    public void l2(ColorStateList colorStateList) {
        if (this.o0 != colorStateList) {
            this.o0 = colorStateList;
            if (O2()) {
                kv1.o(this.m0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void m2(int i) {
        l2(al.a(this.F0, i));
    }

    public boolean n1() {
        return this.r0;
    }

    public void n2(boolean z) {
        if (this.l0 != z) {
            boolean O2 = O2();
            this.l0 = z;
            boolean O22 = O2();
            if (O2 != O22) {
                if (O22) {
                    j0(this.m0);
                } else {
                    P2(this.m0);
                }
                invalidateSelf();
                u1();
            }
        }
    }

    public boolean o1() {
        return s1(this.m0);
    }

    public void o2(InterfaceC0204a interfaceC0204a) {
        this.d1 = new WeakReference(interfaceC0204a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (N2()) {
            onLayoutDirectionChanged |= kv1.m(this.h0, i);
        }
        if (M2()) {
            onLayoutDirectionChanged |= kv1.m(this.t0, i);
        }
        if (O2()) {
            onLayoutDirectionChanged |= kv1.m(this.m0, i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (N2()) {
            onLevelChange |= this.h0.setLevel(i);
        }
        if (M2()) {
            onLevelChange |= this.t0.setLevel(i);
        }
        if (O2()) {
            onLevelChange |= this.m0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable, zh8.b
    public boolean onStateChange(int[] iArr) {
        if (this.h1) {
            super.onStateChange(iArr);
        }
        return v1(iArr, V0());
    }

    float p0() {
        if (O2()) {
            return this.C0 + this.p0 + this.D0;
        }
        return 0.0f;
    }

    public boolean p1() {
        return this.l0;
    }

    public void p2(TextUtils.TruncateAt truncateAt) {
        this.e1 = truncateAt;
    }

    public void q2(fw4 fw4Var) {
        this.w0 = fw4Var;
    }

    public void r2(int i) {
        q2(fw4.c(this.F0, i));
    }

    Paint.Align s0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f0 != null) {
            float l0 = this.x0 + l0() + this.A0;
            if (kv1.f(this) == 0) {
                pointF.x = rect.left + l0;
            } else {
                pointF.x = rect.right - l0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - r0();
        }
        return align;
    }

    public void s2(float f) {
        if (this.z0 != f) {
            float l0 = l0();
            this.z0 = f;
            float l02 = l0();
            invalidateSelf();
            if (l0 != l02) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.V0 != i) {
            this.V0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.W0 != colorFilter) {
            this.W0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.Y0 != colorStateList) {
            this.Y0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.uf4, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.Z0 != mode) {
            this.Z0 = mode;
            this.X0 = tv1.j(this, this.Y0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (N2()) {
            visible |= this.h0.setVisible(z, z2);
        }
        if (M2()) {
            visible |= this.t0.setVisible(z, z2);
        }
        if (O2()) {
            visible |= this.m0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(int i) {
        s2(this.F0.getResources().getDimension(i));
    }

    protected void u1() {
        InterfaceC0204a interfaceC0204a = (InterfaceC0204a) this.d1.get();
        if (interfaceC0204a != null) {
            interfaceC0204a.a();
        }
    }

    public void u2(float f) {
        if (this.y0 != f) {
            float l0 = l0();
            this.y0 = f;
            float l02 = l0();
            invalidateSelf();
            if (l0 != l02) {
                u1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v2(int i) {
        u2(this.F0.getResources().getDimension(i));
    }

    public void w1(boolean z) {
        if (this.r0 != z) {
            this.r0 = z;
            float l0 = l0();
            if (!z && this.T0) {
                this.T0 = false;
            }
            float l02 = l0();
            invalidateSelf();
            if (l0 != l02) {
                u1();
            }
        }
    }

    public void w2(int i) {
        this.g1 = i;
    }

    public void x1(int i) {
        w1(this.F0.getResources().getBoolean(i));
    }

    public void x2(ColorStateList colorStateList) {
        if (this.e0 != colorStateList) {
            this.e0 = colorStateList;
            Q2();
            onStateChange(getState());
        }
    }

    public void y1(Drawable drawable) {
        if (this.t0 != drawable) {
            float l0 = l0();
            this.t0 = drawable;
            float l02 = l0();
            P2(this.t0);
            j0(this.t0);
            invalidateSelf();
            if (l0 != l02) {
                u1();
            }
        }
    }

    public void y2(int i) {
        x2(al.a(this.F0, i));
    }

    public void z1(int i) {
        y1(al.b(this.F0, i));
    }

    void z2(boolean z) {
        this.f1 = z;
    }
}
