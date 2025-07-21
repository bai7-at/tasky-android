package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.e;
import com.comscore.streaming.ContentType;
import defpackage.al;
import defpackage.fo6;
import defpackage.hk8;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lb;
import defpackage.nc6;
import defpackage.rm6;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property u0 = new a(Float.class, "thumbPos");
    private static final int[] v0 = {R.attr.state_checked};
    private float B;
    private float H;
    private VelocityTracker L;
    private int M;
    float N;
    private int Q;
    private int S;
    private Drawable a;
    private ColorStateList b;
    private PorterDuff.Mode c;
    private boolean d;
    private boolean e;
    private int e0;
    private Drawable f;
    private int f0;
    private ColorStateList g;
    private int g0;
    private PorterDuff.Mode h;
    private int h0;
    private boolean i;
    private int i0;
    private boolean j;
    private boolean j0;
    private int k;
    private final TextPaint k0;
    private int l;
    private ColorStateList l0;
    private int m;
    private Layout m0;
    private boolean n;
    private Layout n0;
    private TransformationMethod o0;
    ObjectAnimator p0;
    private final t q0;
    private CharSequence r;
    private l r0;
    private CharSequence s;
    private c s0;
    private CharSequence t;
    private final Rect t0;
    private CharSequence u;
    private boolean w;
    private int x;
    private int y;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.N);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    static class b {
        static void a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    static class c extends e.f {
        private final Reference a;

        c(SwitchCompat switchCompat) {
            this.a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nc6.switchStyle);
    }

    private void a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) u0, z ? 1.0f : 0.0f);
        this.p0 = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.p0, true);
        this.p0.start();
    }

    private void b() {
        Drawable drawable = this.a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable mutate = kv1.r(drawable).mutate();
                this.a = mutate;
                if (this.d) {
                    kv1.o(mutate, this.b);
                }
                if (this.e) {
                    kv1.p(this.a, this.c);
                }
                if (this.a.isStateful()) {
                    this.a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = kv1.r(drawable).mutate();
                this.f = mutate;
                if (this.i) {
                    kv1.o(mutate, this.g);
                }
                if (this.j) {
                    kv1.p(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.p0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod f = getEmojiTextViewHelper().f(this.o0);
        return f != null ? f.getTransformation(charSequence, this) : charSequence;
    }

    private l getEmojiTextViewHelper() {
        if (this.r0 == null) {
            this.r0 = new l(this);
        }
        return this.r0;
    }

    private boolean getTargetCheckedState() {
        return this.N > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((k0.b(this) ? 1.0f - this.N : this.N) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.t0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.a;
        Rect d = drawable2 != null ? w.d(drawable2) : w.c;
        return ((((this.Q - this.e0) - rect.left) - rect.right) - d.left) - d.right;
    }

    private boolean h(float f, float f2) {
        if (this.a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.a.getPadding(this.t0);
        int i = this.g0;
        int i2 = this.y;
        int i3 = i - i2;
        int i4 = (this.f0 + thumbOffset) - i2;
        int i5 = this.e0 + i4;
        Rect rect = this.t0;
        return f > ((float) i4) && f < ((float) (((i5 + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.i0 + i2));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.k0, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.t;
            if (charSequence == null) {
                charSequence = getResources().getString(rm6.abc_capital_off);
            }
            k99.D0(this, charSequence);
        }
    }

    private void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.r;
            if (charSequence == null) {
                charSequence = getResources().getString(rm6.abc_capital_on);
            }
            k99.D0(this, charSequence);
        }
    }

    private void o(int i, int i2) {
        n(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    private void p() {
        if (this.s0 == null && this.r0.b() && androidx.emoji2.text.e.k()) {
            androidx.emoji2.text.e c2 = androidx.emoji2.text.e.c();
            int g = c2.g();
            if (g == 3 || g == 0) {
                c cVar = new c(this);
                this.s0 = cVar;
                c2.v(cVar);
            }
        }
    }

    private void q(MotionEvent motionEvent) {
        this.x = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.L.computeCurrentVelocity(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            float xVelocity = this.L.getXVelocity();
            if (Math.abs(xVelocity) <= this.M) {
                z = getTargetCheckedState();
            } else if (!k0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        e(motionEvent);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.t = charSequence;
        this.u = g(charSequence);
        this.n0 = null;
        if (this.w) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.r = charSequence;
        this.s = g(charSequence);
        this.m0 = null;
        if (this.w) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.t0;
        int i3 = this.f0;
        int i4 = this.g0;
        int i5 = this.h0;
        int i6 = this.i0;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        Rect d = drawable != null ? w.d(drawable) : w.c;
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.e0 + rect.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                kv1.l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.a;
        if (drawable != null) {
            kv1.k(drawable, f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            kv1.k(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!k0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.Q;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (k0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.Q;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hk8.o(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.w;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.t;
    }

    public CharSequence getTextOn() {
        return this.r;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    protected final float getThumbPosition() {
        return this.N;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    void j() {
        setTextOnInternal(this.r);
        setTextOffInternal(this.t);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.p0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.p0.end();
        this.p0 = null;
    }

    public void m(Context context, int i) {
        h0 t = h0.t(context, i, fo6.TextAppearance);
        ColorStateList c2 = t.c(fo6.TextAppearance_android_textColor);
        if (c2 != null) {
            this.l0 = c2;
        } else {
            this.l0 = getTextColors();
        }
        int f = t.f(fo6.TextAppearance_android_textSize, 0);
        if (f != 0) {
            float f2 = f;
            if (f2 != this.k0.getTextSize()) {
                this.k0.setTextSize(f2);
                requestLayout();
            }
        }
        o(t.k(fo6.TextAppearance_android_typeface, -1), t.k(fo6.TextAppearance_android_textStyle, -1));
        if (t.a(fo6.TextAppearance_textAllCaps, false)) {
            this.o0 = new lb(getContext());
        } else {
            this.o0 = null;
        }
        setTextOnInternal(this.r);
        setTextOffInternal(this.t);
        t.w();
    }

    public void n(Typeface typeface, int i) {
        if (i <= 0) {
            this.k0.setFakeBoldText(false);
            this.k0.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            this.k0.setFakeBoldText((i2 & 1) != 0);
            this.k0.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, v0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.t0;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.g0;
        int i2 = this.i0;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = w.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.m0 : this.n0;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.l0;
            if (colorStateList != null) {
                this.k0.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.k0.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i3 + i4) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.r : this.t;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.a != null) {
            Rect rect = this.t0;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = w.d(this.a);
            i5 = Math.max(0, d.left - rect.left);
            i10 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (k0.b(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.Q + i6) - i5) - i10;
        } else {
            width = (getWidth() - getPaddingRight()) - i10;
            i6 = (width - this.Q) + i5 + i10;
        }
        int gravity = getGravity() & ContentType.LONG_FORM_ON_DEMAND;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i7 = this.S;
            i8 = paddingTop - (i7 / 2);
        } else {
            if (gravity == 80) {
                i9 = getHeight() - getPaddingBottom();
                i8 = i9 - this.S;
                this.f0 = i6;
                this.g0 = i8;
                this.i0 = i9;
                this.h0 = width;
            }
            i8 = getPaddingTop();
            i7 = this.S;
        }
        i9 = i7 + i8;
        this.f0 = i6;
        this.g0 = i8;
        this.i0 = i9;
        this.h0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.w) {
            if (this.m0 == null) {
                this.m0 = i(this.s);
            }
            if (this.n0 == null) {
                this.n0 = i(this.u);
            }
        }
        Rect rect = this.t0;
        Drawable drawable = this.a;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.e0 = Math.max(this.w ? Math.max(this.m0.getWidth(), this.n0.getWidth()) + (this.k * 2) : 0, i3);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect d = w.d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = this.j0 ? Math.max(this.l, (this.e0 * 2) + i6 + i7) : this.l;
        int max2 = Math.max(i5, i4);
        this.Q = max;
        this.S = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.r : this.t;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.L
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.x
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.B
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.k0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.N
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.N
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.B = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.B
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.H
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.x = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.B = r0
            r6.H = r3
            return r1
        L89:
            int r0 = r6.x
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.x = r0
            android.view.VelocityTracker r0 = r6.L
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.x = r1
            r6.B = r0
            r6.H = r2
        Lb7:
            boolean r6 = super.onTouchEvent(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && k99.P(this)) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hk8.p(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().e(z);
        setTextOnInternal(this.r);
        setTextOffInternal(this.t);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z) {
        this.j0 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.w != z) {
            this.w = z;
            requestLayout();
            if (z) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.k0.getTypeface() == null || this.k0.getTypeface().equals(typeface)) && (this.k0.getTypeface() != null || typeface == null)) {
            return;
        }
        this.k0.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f) {
        this.N = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(al.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(al.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.L = VelocityTracker.obtain();
        this.j0 = true;
        this.t0 = new Rect();
        d0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.k0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        h0 v = h0.v(context, attributeSet, fo6.SwitchCompat, i, 0);
        k99.j0(this, context, fo6.SwitchCompat, attributeSet, v.r(), i, 0);
        Drawable g = v.g(fo6.SwitchCompat_android_thumb);
        this.a = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.g(fo6.SwitchCompat_track);
        this.f = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        setTextOnInternal(v.p(fo6.SwitchCompat_android_textOn));
        setTextOffInternal(v.p(fo6.SwitchCompat_android_textOff));
        this.w = v.a(fo6.SwitchCompat_showText, true);
        this.k = v.f(fo6.SwitchCompat_thumbTextPadding, 0);
        this.l = v.f(fo6.SwitchCompat_switchMinWidth, 0);
        this.m = v.f(fo6.SwitchCompat_switchPadding, 0);
        this.n = v.a(fo6.SwitchCompat_splitTrack, false);
        ColorStateList c2 = v.c(fo6.SwitchCompat_thumbTint);
        if (c2 != null) {
            this.b = c2;
            this.d = true;
        }
        PorterDuff.Mode e = w.e(v.k(fo6.SwitchCompat_thumbTintMode, -1), null);
        if (this.c != e) {
            this.c = e;
            this.e = true;
        }
        if (this.d || this.e) {
            b();
        }
        ColorStateList c3 = v.c(fo6.SwitchCompat_trackTint);
        if (c3 != null) {
            this.g = c3;
            this.i = true;
        }
        PorterDuff.Mode e2 = w.e(v.k(fo6.SwitchCompat_trackTintMode, -1), null);
        if (this.h != e2) {
            this.h = e2;
            this.j = true;
        }
        if (this.i || this.j) {
            c();
        }
        int n = v.n(fo6.SwitchCompat_switchTextAppearance, 0);
        if (n != 0) {
            m(context, n);
        }
        t tVar = new t(this);
        this.q0 = tVar;
        tVar.m(attributeSet, i);
        v.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.y = viewConfiguration.getScaledTouchSlop();
        this.M = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
