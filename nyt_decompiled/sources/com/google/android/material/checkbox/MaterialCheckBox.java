package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.h0;
import defpackage.al;
import defpackage.bg6;
import defpackage.bh;
import defpackage.fn6;
import defpackage.jt0;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.lh4;
import defpackage.nn6;
import defpackage.pb9;
import defpackage.qf4;
import defpackage.tv1;
import defpackage.vh;
import defpackage.vj6;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class MaterialCheckBox extends f {
    private static final int M = fn6.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] N = {lc6.state_indeterminate};
    private static final int[] Q;
    private static final int[][] S;
    private static final int e0;
    private CompoundButton.OnCheckedChangeListener B;
    private final vh H;
    private final bh L;
    private final LinkedHashSet e;
    private final LinkedHashSet f;
    private ColorStateList g;
    private boolean h;
    private boolean i;
    private boolean j;
    private CharSequence k;
    private Drawable l;
    private Drawable m;
    private boolean n;
    ColorStateList r;
    ColorStateList s;
    private PorterDuff.Mode t;
    private int u;
    private int[] w;
    private boolean x;
    private CharSequence y;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int checkedState;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        private String a() {
            int i = this.checkedState;
            return i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.checkedState));
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.checkedState = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    class a extends bh {
        a() {
        }

        @Override // defpackage.bh
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.r;
            if (colorStateList != null) {
                kv1.o(drawable, colorStateList);
            }
        }

        @Override // defpackage.bh
        public void c(Drawable drawable) {
            super.c(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.r;
            if (colorStateList != null) {
                kv1.n(drawable, colorStateList.getColorForState(materialCheckBox.w, MaterialCheckBox.this.r.getDefaultColor()));
            }
        }
    }

    static {
        int i = lc6.state_error;
        Q = new int[]{i};
        S = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        e0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.checkboxStyle);
    }

    private boolean c(h0 h0Var) {
        return h0Var.n(nn6.MaterialCheckBox_android_button, 0) == e0 && h0Var.n(nn6.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    private void e() {
        this.l = tv1.c(this.l, this.r, jt0.c(this));
        this.m = tv1.c(this.m, this.s, this.t);
        g();
        h();
        super.setButtonDrawable(tv1.a(this.l, this.m));
        refreshDrawableState();
    }

    private void f() {
        if (Build.VERSION.SDK_INT < 30 || this.y != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void g() {
        vh vhVar;
        if (this.n) {
            vh vhVar2 = this.H;
            if (vhVar2 != null) {
                vhVar2.f(this.L);
                this.H.b(this.L);
            }
            Drawable drawable = this.l;
            if (!(drawable instanceof AnimatedStateListDrawable) || (vhVar = this.H) == null) {
                return;
            }
            ((AnimatedStateListDrawable) drawable).addTransition(bg6.checked, bg6.unchecked, vhVar, false);
            ((AnimatedStateListDrawable) this.l).addTransition(bg6.indeterminate, bg6.unchecked, this.H, false);
        }
    }

    private String getButtonStateDescription() {
        int i = this.u;
        return i == 1 ? getResources().getString(vj6.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(vj6.mtrl_checkbox_state_description_unchecked) : getResources().getString(vj6.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int[][] iArr = S;
            int[] iArr2 = new int[iArr.length];
            int d = qf4.d(this, lc6.colorControlActivated);
            int d2 = qf4.d(this, lc6.colorError);
            int d3 = qf4.d(this, lc6.colorSurface);
            int d4 = qf4.d(this, lc6.colorOnSurface);
            iArr2[0] = qf4.j(d3, d2, 1.0f);
            iArr2[1] = qf4.j(d3, d, 1.0f);
            iArr2[2] = qf4.j(d3, d4, 0.54f);
            iArr2[3] = qf4.j(d3, d4, 0.38f);
            iArr2[4] = qf4.j(d3, d4, 0.38f);
            this.g = new ColorStateList(iArr, iArr2);
        }
        return this.g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.r;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void h() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.l;
        if (drawable != null && (colorStateList2 = this.r) != null) {
            kv1.o(drawable, colorStateList2);
        }
        Drawable drawable2 = this.m;
        if (drawable2 == null || (colorStateList = this.s) == null) {
            return;
        }
        kv1.o(drawable2, colorStateList);
    }

    private void i() {
    }

    public boolean d() {
        return this.j;
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.l;
    }

    public Drawable getButtonIconDrawable() {
        return this.m;
    }

    public ColorStateList getButtonIconTintList() {
        return this.s;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.t;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.r;
    }

    public int getCheckedState() {
        return this.u;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.u == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && this.r == null && this.s == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, N);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, Q);
        }
        this.w = tv1.e(onCreateDrawableState);
        i();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.i || !TextUtils.isEmpty(getText()) || (a2 = jt0.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (pb9.i(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            kv1.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && d()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.checkedState);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checkedState = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.f, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(al.b(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.m = drawable;
        e();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(al.b(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.s == colorStateList) {
            return;
        }
        this.s = colorStateList;
        e();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.t == mode) {
            return;
        }
        this.t = mode;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.r == colorStateList) {
            return;
        }
        this.r = colorStateList;
        e();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        e();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.u != i) {
            this.u = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            f();
            if (this.x) {
                return;
            }
            this.x = true;
            LinkedHashSet linkedHashSet = this.f;
            if (linkedHashSet != null) {
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    lh4.a(it2.next());
                    throw null;
                }
            }
            if (this.u != 2 && (onCheckedChangeListener = this.B) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.x = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        i();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.j == z) {
            return;
        }
        this.j = z;
        refreshDrawableState();
        Iterator it2 = this.e.iterator();
        if (it2.hasNext()) {
            lh4.a(it2.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.B = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.y = charSequence;
        if (charSequence == null) {
            f();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        if (z) {
            jt0.d(this, getMaterialThemeColorsTintList());
        } else {
            jt0.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCheckBox(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.M
            android.content.Context r9 = defpackage.bg4.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.e = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f = r9
            android.content.Context r9 = r8.getContext()
            int r0 = defpackage.hf6.mtrl_checkbox_button_checked_unchecked
            vh r9 = defpackage.vh.a(r9, r0)
            r8.H = r9
            com.google.android.material.checkbox.MaterialCheckBox$a r9 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r9.<init>()
            r8.L = r9
            android.content.Context r9 = r8.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.jt0.a(r8)
            r8.l = r0
            android.content.res.ColorStateList r0 = r8.getSuperButtonTintList()
            r8.r = r0
            r6 = 0
            r8.setSupportButtonTintList(r6)
            int[] r2 = defpackage.nn6.MaterialCheckBox
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r9
            r1 = r10
            r3 = r11
            androidx.appcompat.widget.h0 r10 = defpackage.sk8.j(r0, r1, r2, r3, r4, r5)
            int r11 = defpackage.nn6.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r11 = r10.g(r11)
            r8.m = r11
            android.graphics.drawable.Drawable r11 = r8.l
            r0 = 1
            if (r11 == 0) goto L7c
            boolean r11 = defpackage.sk8.g(r9)
            if (r11 == 0) goto L7c
            boolean r11 = r8.c(r10)
            if (r11 == 0) goto L7c
            super.setButtonDrawable(r6)
            int r11 = defpackage.hf6.mtrl_checkbox_button
            android.graphics.drawable.Drawable r11 = defpackage.al.b(r9, r11)
            r8.l = r11
            r8.n = r0
            android.graphics.drawable.Drawable r11 = r8.m
            if (r11 != 0) goto L7c
            int r11 = defpackage.hf6.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r11 = defpackage.al.b(r9, r11)
            r8.m = r11
        L7c:
            int r11 = defpackage.nn6.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r9 = defpackage.tf4.b(r9, r10, r11)
            r8.s = r9
            int r9 = defpackage.nn6.MaterialCheckBox_buttonIconTintMode
            r11 = -1
            int r9 = r10.k(r9, r11)
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = defpackage.pb9.k(r9, r11)
            r8.t = r9
            int r9 = defpackage.nn6.MaterialCheckBox_useMaterialThemeColors
            boolean r9 = r10.a(r9, r7)
            r8.h = r9
            int r9 = defpackage.nn6.MaterialCheckBox_centerIfNoTextEnabled
            boolean r9 = r10.a(r9, r0)
            r8.i = r9
            int r9 = defpackage.nn6.MaterialCheckBox_errorShown
            boolean r9 = r10.a(r9, r7)
            r8.j = r9
            int r9 = defpackage.nn6.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r9 = r10.p(r9)
            r8.k = r9
            int r9 = defpackage.nn6.MaterialCheckBox_checkedState
            boolean r9 = r10.s(r9)
            if (r9 == 0) goto Lc4
            int r9 = defpackage.nn6.MaterialCheckBox_checkedState
            int r9 = r10.k(r9, r7)
            r8.setCheckedState(r9)
        Lc4:
            r10.w()
            r8.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.appcompat.widget.f, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.l = drawable;
        this.n = false;
        e();
    }
}
