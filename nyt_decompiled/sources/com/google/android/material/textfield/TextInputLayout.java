package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.amazonaws.event.ProgressEvent;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.al;
import defpackage.bg6;
import defpackage.d80;
import defpackage.ea2;
import defpackage.fn6;
import defpackage.h3;
import defpackage.hi;
import defpackage.hk8;
import defpackage.hw4;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.ld6;
import defpackage.mx0;
import defpackage.oo7;
import defpackage.or8;
import defpackage.pb9;
import defpackage.qf4;
import defpackage.tf4;
import defpackage.uf4;
import defpackage.vj6;
import defpackage.w2;
import defpackage.wm1;
import defpackage.zd6;
import defpackage.ze4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int b1 = fn6.Widget_Design_TextInputLayout;
    private static final int[][] c1 = {new int[]{R.attr.state_pressed}, new int[0]};
    private Typeface A0;
    private int B;
    private Drawable B0;
    private int C0;
    private final LinkedHashSet D0;
    private Drawable E0;
    private int F0;
    private Drawable G0;
    private ea2 H;
    private ColorStateList H0;
    private ColorStateList I0;
    private int J0;
    private int K0;
    private ea2 L;
    private int L0;
    private ColorStateList M;
    private ColorStateList M0;
    private ColorStateList N;
    private int N0;
    private int O0;
    private int P0;
    private ColorStateList Q;
    private int Q0;
    private int R0;
    private ColorStateList S;
    int S0;
    private boolean T0;
    final com.google.android.material.internal.a U0;
    private boolean V0;
    private boolean W0;
    private ValueAnimator X0;
    private boolean Y0;
    private boolean Z0;
    private final FrameLayout a;
    private boolean a1;
    private final z b;
    private final r c;
    EditText d;
    private CharSequence e;
    private boolean e0;
    private int f;
    private CharSequence f0;
    private int g;
    private boolean g0;
    private int h;
    private uf4 h0;
    private int i;
    private uf4 i0;
    private final u j;
    private StateListDrawable j0;
    boolean k;
    private boolean k0;
    private int l;
    private uf4 l0;
    private boolean m;
    private uf4 m0;
    private e n;
    private oo7 n0;
    private boolean o0;
    private final int p0;
    private int q0;
    private TextView r;
    private int r0;
    private int s;
    private int s0;
    private int t;
    private int t0;
    private CharSequence u;
    private int u0;
    private int v0;
    private boolean w;
    private int w0;
    private TextView x;
    private final Rect x0;
    private ColorStateList y;
    private final Rect y0;
    private final RectF z0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        CharSequence error;
        boolean isEndIconChecked;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.error) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.error, parcel, i);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }
    }

    class a implements TextWatcher {
        int a;
        final /* synthetic */ EditText b;

        a(EditText editText) {
            this.b = editText;
            this.a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.u0(!r0.Z0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.k) {
                textInputLayout.k0(editable);
            }
            if (TextInputLayout.this.w) {
                TextInputLayout.this.y0(editable);
            }
            int lineCount = this.b.getLineCount();
            int i = this.a;
            if (lineCount != i) {
                if (lineCount < i) {
                    int y = k99.y(this.b);
                    int i2 = TextInputLayout.this.S0;
                    if (y != i2) {
                        this.b.setMinimumHeight(i2);
                    }
                }
                this.a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.c.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.U0.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends w2 {
        private final TextInputLayout d;

        public d(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            EditText editText = this.d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean P = this.d.P();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : "";
            this.d.b.A(h3Var);
            if (!isEmpty) {
                h3Var.L0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                h3Var.L0(charSequence);
                if (!P && placeholderText != null) {
                    h3Var.L0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                h3Var.L0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                h3Var.r0(charSequence);
                h3Var.I0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            h3Var.w0(counterMaxLength);
            if (z) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                h3Var.n0(error);
            }
            View t = this.d.j.t();
            if (t != null) {
                h3Var.t0(t);
            }
            this.d.c.m().o(view, h3Var);
        }

        @Override // defpackage.w2
        public void i(View view, AccessibilityEvent accessibilityEvent) {
            super.i(view, accessibilityEvent);
            this.d.c.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.textInputStyle);
    }

    private ea2 A() {
        ea2 ea2Var = new ea2();
        ea2Var.Z(hw4.f(getContext(), lc6.motionDurationShort2, 87));
        ea2Var.b0(hw4.g(getContext(), lc6.motionEasingLinearInterpolator, hi.a));
        return ea2Var;
    }

    private boolean B() {
        return this.e0 && !TextUtils.isEmpty(this.f0) && (this.h0 instanceof h);
    }

    private void C() {
        Iterator it2 = this.D0.iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).a(this);
        }
    }

    private void D(Canvas canvas) {
        uf4 uf4Var;
        if (this.m0 == null || (uf4Var = this.l0) == null) {
            return;
        }
        uf4Var.draw(canvas);
        if (this.d.isFocused()) {
            Rect bounds = this.m0.getBounds();
            Rect bounds2 = this.l0.getBounds();
            float F = this.U0.F();
            int centerX = bounds2.centerX();
            bounds.left = hi.c(centerX, bounds2.left, F);
            bounds.right = hi.c(centerX, bounds2.right, F);
            this.m0.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.e0) {
            this.U0.l(canvas);
        }
    }

    private void F(boolean z) {
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.X0.cancel();
        }
        if (z && this.W0) {
            l(0.0f);
        } else {
            this.U0.y0(0.0f);
        }
        if (B() && ((h) this.h0).m0()) {
            y();
        }
        this.T0 = true;
        L();
        this.b.l(true);
        this.c.H(true);
    }

    private uf4 G(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(zd6.mtrl_shape_corner_size_small_component);
        float f2 = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.d;
        float popupElevation = editText instanceof v ? ((v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(zd6.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(zd6.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        oo7 m = oo7.a().B(f2).F(f2).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        EditText editText2 = this.d;
        uf4 m2 = uf4.m(getContext(), popupElevation, editText2 instanceof v ? ((v) editText2).getDropDownBackgroundTintList() : null);
        m2.setShapeAppearanceModel(m);
        m2.Y(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return m2;
    }

    private static Drawable H(uf4 uf4Var, int i, int i2, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{qf4.j(i2, i, 0.1f), i}), uf4Var, uf4Var);
    }

    private int I(int i, boolean z) {
        return i + ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.d.getCompoundPaddingLeft() : this.c.y() : this.b.c());
    }

    private int J(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.d.getCompoundPaddingRight() : this.b.c() : this.c.y());
    }

    private static Drawable K(Context context, uf4 uf4Var, int i, int[][] iArr) {
        int c2 = qf4.c(context, lc6.colorSurface, "TextInputLayout");
        uf4 uf4Var2 = new uf4(uf4Var.C());
        int j = qf4.j(i, c2, 0.1f);
        uf4Var2.W(new ColorStateList(iArr, new int[]{j, 0}));
        uf4Var2.setTint(c2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j, c2});
        uf4 uf4Var3 = new uf4(uf4Var.C());
        uf4Var3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, uf4Var2, uf4Var3), uf4Var});
    }

    private void L() {
        TextView textView = this.x;
        if (textView == null || !this.w) {
            return;
        }
        textView.setText((CharSequence) null);
        or8.b(this.a, this.L);
        this.x.setVisibility(4);
    }

    private boolean Q() {
        return d0() || (this.r != null && this.m);
    }

    private boolean S() {
        return this.q0 == 1 && this.d.getMinLines() <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int T(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U() {
        this.d.requestLayout();
    }

    private void V() {
        p();
        r0();
        A0();
        h0();
        k();
        if (this.q0 != 0) {
            t0();
        }
        b0();
    }

    private void W() {
        if (B()) {
            RectF rectF = this.z0;
            this.U0.o(rectF, this.d.getWidth(), this.d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.s0);
            ((h) this.h0).p0(rectF);
        }
    }

    private void X() {
        if (!B() || this.T0) {
            return;
        }
        y();
        W();
    }

    private static void Y(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                Y((ViewGroup) childAt, z);
            }
        }
    }

    private void a0() {
        TextView textView = this.x;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void b0() {
        EditText editText = this.d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i = this.q0;
                if (i == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private boolean e0() {
        return (this.c.G() || ((this.c.A() && M()) || this.c.w() != null)) && this.c.getMeasuredWidth() > 0;
    }

    private boolean f0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.b.getMeasuredWidth() > 0;
    }

    private void g0() {
        if (this.x == null || !this.w || TextUtils.isEmpty(this.u)) {
            return;
        }
        this.x.setText(this.u);
        or8.b(this.a, this.H);
        this.x.setVisibility(0);
        this.x.bringToFront();
        announceForAccessibility(this.u);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.h0;
        }
        int d2 = qf4.d(this.d, lc6.colorControlHighlight);
        int i = this.q0;
        if (i == 2) {
            return K(getContext(), this.h0, d2, c1);
        }
        if (i == 1) {
            return H(this.h0, this.w0, d2, c1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.j0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.j0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.j0.addState(new int[0], G(false));
        }
        return this.j0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.i0 == null) {
            this.i0 = G(true);
        }
        return this.i0;
    }

    private void h0() {
        if (this.q0 == 1) {
            if (tf4.h(getContext())) {
                this.r0 = getResources().getDimensionPixelSize(zd6.material_font_2_0_box_collapsed_padding_top);
            } else if (tf4.g(getContext())) {
                this.r0 = getResources().getDimensionPixelSize(zd6.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void i0(Rect rect) {
        uf4 uf4Var = this.l0;
        if (uf4Var != null) {
            int i = rect.bottom;
            uf4Var.setBounds(rect.left, i - this.t0, rect.right, i);
        }
        uf4 uf4Var2 = this.m0;
        if (uf4Var2 != null) {
            int i2 = rect.bottom;
            uf4Var2.setBounds(rect.left, i2 - this.u0, rect.right, i2);
        }
    }

    private void j() {
        TextView textView = this.x;
        if (textView != null) {
            this.a.addView(textView);
            this.x.setVisibility(0);
        }
    }

    private void j0() {
        if (this.r != null) {
            EditText editText = this.d;
            k0(editText == null ? null : editText.getText());
        }
    }

    private void k() {
        if (this.d == null || this.q0 != 1) {
            return;
        }
        if (tf4.h(getContext())) {
            EditText editText = this.d;
            k99.B0(editText, k99.C(editText), getResources().getDimensionPixelSize(zd6.material_filled_edittext_font_2_0_padding_top), k99.B(this.d), getResources().getDimensionPixelSize(zd6.material_filled_edittext_font_2_0_padding_bottom));
        } else if (tf4.g(getContext())) {
            EditText editText2 = this.d;
            k99.B0(editText2, k99.C(editText2), getResources().getDimensionPixelSize(zd6.material_filled_edittext_font_1_3_padding_top), k99.B(this.d), getResources().getDimensionPixelSize(zd6.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private static void l0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? vj6.character_counter_overflowed_content_description : vj6.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void m() {
        uf4 uf4Var = this.h0;
        if (uf4Var == null) {
            return;
        }
        oo7 C = uf4Var.C();
        oo7 oo7Var = this.n0;
        if (C != oo7Var) {
            this.h0.setShapeAppearanceModel(oo7Var);
        }
        if (w()) {
            this.h0.c0(this.s0, this.v0);
        }
        int q = q();
        this.w0 = q;
        this.h0.W(ColorStateList.valueOf(q));
        n();
        r0();
    }

    private void m0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.r;
        if (textView != null) {
            c0(textView, this.m ? this.s : this.t);
            if (!this.m && (colorStateList2 = this.M) != null) {
                this.r.setTextColor(colorStateList2);
            }
            if (!this.m || (colorStateList = this.N) == null) {
                return;
            }
            this.r.setTextColor(colorStateList);
        }
    }

    private void n() {
        if (this.l0 == null || this.m0 == null) {
            return;
        }
        if (x()) {
            this.l0.W(this.d.isFocused() ? ColorStateList.valueOf(this.J0) : ColorStateList.valueOf(this.v0));
            this.m0.W(ColorStateList.valueOf(this.v0));
        }
        invalidate();
    }

    private void n0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.Q;
        if (colorStateList2 == null) {
            colorStateList2 = qf4.g(getContext(), lc6.colorControlActivated);
        }
        EditText editText = this.d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = kv1.r(this.d.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.S) != null) {
            colorStateList2 = colorStateList;
        }
        kv1.o(mutate, colorStateList2);
    }

    private void o(RectF rectF) {
        float f2 = rectF.left;
        int i = this.p0;
        rectF.left = f2 - i;
        rectF.right += i;
    }

    private void p() {
        int i = this.q0;
        if (i == 0) {
            this.h0 = null;
            this.l0 = null;
            this.m0 = null;
            return;
        }
        if (i == 1) {
            this.h0 = new uf4(this.n0);
            this.l0 = new uf4();
            this.m0 = new uf4();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.q0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.e0 || (this.h0 instanceof h)) {
                this.h0 = new uf4(this.n0);
            } else {
                this.h0 = h.k0(this.n0);
            }
            this.l0 = null;
            this.m0 = null;
        }
    }

    private int q() {
        return this.q0 == 1 ? qf4.i(qf4.e(this, lc6.colorSurface, 0), this.w0) : this.w0;
    }

    private void q0() {
        k99.p0(this.d, getEditTextBoxBackground());
    }

    private Rect r(Rect rect) {
        if (this.d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.y0;
        boolean i = pb9.i(this);
        rect2.bottom = rect.bottom;
        int i2 = this.q0;
        if (i2 == 1) {
            rect2.left = I(rect.left, i);
            rect2.top = rect.top + this.r0;
            rect2.right = J(rect.right, i);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = I(rect.left, i);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, i);
            return rect2;
        }
        rect2.left = rect.left + this.d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.d.getPaddingRight();
        return rect2;
    }

    private int s(Rect rect, Rect rect2, float f2) {
        return S() ? (int) (rect2.top + f2) : rect.bottom - this.d.getCompoundPaddingBottom();
    }

    private boolean s0() {
        int max;
        if (this.d == null || this.d.getMeasuredHeight() >= (max = Math.max(this.c.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            return false;
        }
        this.d.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.d = editText;
        int i = this.f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.h);
        }
        int i2 = this.g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.k0 = false;
        V();
        setTextInputAccessibilityDelegate(new d(this));
        this.U0.N0(this.d.getTypeface());
        this.U0.v0(this.d.getTextSize());
        this.U0.q0(this.d.getLetterSpacing());
        int gravity = this.d.getGravity();
        this.U0.j0((gravity & (-113)) | 48);
        this.U0.u0(gravity);
        this.S0 = k99.y(editText);
        this.d.addTextChangedListener(new a(editText));
        if (this.H0 == null) {
            this.H0 = this.d.getHintTextColors();
        }
        if (this.e0) {
            if (TextUtils.isEmpty(this.f0)) {
                CharSequence hint = this.d.getHint();
                this.e = hint;
                setHint(hint);
                this.d.setHint((CharSequence) null);
            }
            this.g0 = true;
        }
        n0();
        if (this.r != null) {
            k0(this.d.getText());
        }
        p0();
        this.j.f();
        this.b.bringToFront();
        this.c.bringToFront();
        C();
        this.c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        v0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f0)) {
            return;
        }
        this.f0 = charSequence;
        this.U0.K0(charSequence);
        if (this.T0) {
            return;
        }
        W();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.w == z) {
            return;
        }
        if (z) {
            j();
        } else {
            a0();
            this.x = null;
        }
        this.w = z;
    }

    private int t(Rect rect, float f2) {
        return S() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.d.getCompoundPaddingTop();
    }

    private void t0() {
        if (this.q0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.a.getLayoutParams();
            int v = v();
            if (v != layoutParams.topMargin) {
                layoutParams.topMargin = v;
                this.a.requestLayout();
            }
        }
    }

    private Rect u(Rect rect) {
        if (this.d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.y0;
        float C = this.U0.C();
        rect2.left = rect.left + this.d.getCompoundPaddingLeft();
        rect2.top = t(rect, C);
        rect2.right = rect.right - this.d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, C);
        return rect2;
    }

    private int v() {
        float r;
        if (!this.e0) {
            return 0;
        }
        int i = this.q0;
        if (i == 0) {
            r = this.U0.r();
        } else {
            if (i != 2) {
                return 0;
            }
            r = this.U0.r() / 2.0f;
        }
        return (int) r;
    }

    private void v0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        boolean z3 = false;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.d;
        if (editText2 != null && editText2.hasFocus()) {
            z3 = true;
        }
        ColorStateList colorStateList2 = this.H0;
        if (colorStateList2 != null) {
            this.U0.d0(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.H0;
            this.U0.d0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.R0) : this.R0));
        } else if (d0()) {
            this.U0.d0(this.j.r());
        } else if (this.m && (textView = this.r) != null) {
            this.U0.d0(textView.getTextColors());
        } else if (z3 && (colorStateList = this.I0) != null) {
            this.U0.i0(colorStateList);
        }
        if (z4 || !this.V0 || (isEnabled() && z3)) {
            if (z2 || this.T0) {
                z(z);
                return;
            }
            return;
        }
        if (z2 || !this.T0) {
            F(z);
        }
    }

    private boolean w() {
        return this.q0 == 2 && x();
    }

    private void w0() {
        EditText editText;
        if (this.x == null || (editText = this.d) == null) {
            return;
        }
        this.x.setGravity(editText.getGravity());
        this.x.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
    }

    private boolean x() {
        return this.s0 > -1 && this.v0 != 0;
    }

    private void x0() {
        EditText editText = this.d;
        y0(editText == null ? null : editText.getText());
    }

    private void y() {
        if (B()) {
            ((h) this.h0).n0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(Editable editable) {
        if (this.n.a(editable) != 0 || this.T0) {
            L();
        } else {
            g0();
        }
    }

    private void z(boolean z) {
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.X0.cancel();
        }
        if (z && this.W0) {
            l(1.0f);
        } else {
            this.U0.y0(1.0f);
        }
        this.T0 = false;
        if (B()) {
            W();
        }
        x0();
        this.b.l(false);
        this.c.H(false);
    }

    private void z0(boolean z, boolean z2) {
        int defaultColor = this.M0.getDefaultColor();
        int colorForState = this.M0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.M0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.v0 = colorForState2;
        } else if (z2) {
            this.v0 = colorForState;
        } else {
            this.v0 = defaultColor;
        }
    }

    void A0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.h0 == null || this.q0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.v0 = this.R0;
        } else if (d0()) {
            if (this.M0 != null) {
                z0(z2, z);
            } else {
                this.v0 = getErrorCurrentTextColors();
            }
        } else if (!this.m || (textView = this.r) == null) {
            if (z2) {
                this.v0 = this.L0;
            } else if (z) {
                this.v0 = this.K0;
            } else {
                this.v0 = this.J0;
            }
        } else if (this.M0 != null) {
            z0(z2, z);
        } else {
            this.v0 = textView.getCurrentTextColor();
        }
        n0();
        this.c.I();
        Z();
        if (this.q0 == 2) {
            int i = this.s0;
            if (z2 && isEnabled()) {
                this.s0 = this.u0;
            } else {
                this.s0 = this.t0;
            }
            if (this.s0 != i) {
                X();
            }
        }
        if (this.q0 == 1) {
            if (!isEnabled()) {
                this.w0 = this.O0;
            } else if (z && !z2) {
                this.w0 = this.Q0;
            } else if (z2) {
                this.w0 = this.P0;
            } else {
                this.w0 = this.N0;
            }
        }
        m();
    }

    public boolean M() {
        return this.c.F();
    }

    public boolean N() {
        return this.j.A();
    }

    public boolean O() {
        return this.j.B();
    }

    final boolean P() {
        return this.T0;
    }

    public boolean R() {
        return this.g0;
    }

    public void Z() {
        this.b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.a.addView(view, layoutParams2);
        this.a.setLayoutParams(layoutParams);
        t0();
        setEditText((EditText) view);
    }

    void c0(TextView textView, int i) {
        try {
            hk8.m(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        hk8.m(textView, fn6.TextAppearance_AppCompat_Caption);
        textView.setTextColor(mx0.c(getContext(), ld6.design_error));
    }

    boolean d0() {
        return this.j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z = this.g0;
            this.g0 = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.g0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.a.getChildCount());
        for (int i2 = 0; i2 < this.a.getChildCount(); i2++) {
            View childAt = this.a.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.Z0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.Z0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.Y0) {
            return;
        }
        this.Y0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.U0;
        boolean I0 = aVar != null ? aVar.I0(drawableState) : false;
        if (this.d != null) {
            u0(k99.P(this) && isEnabled());
        }
        p0();
        A0();
        if (I0) {
            invalidate();
        }
        this.Y0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    uf4 getBoxBackground() {
        int i = this.q0;
        if (i == 1 || i == 2) {
            return this.h0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.w0;
    }

    public int getBoxBackgroundMode() {
        return this.q0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.r0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return pb9.i(this) ? this.n0.j().a(this.z0) : this.n0.l().a(this.z0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return pb9.i(this) ? this.n0.l().a(this.z0) : this.n0.j().a(this.z0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return pb9.i(this) ? this.n0.r().a(this.z0) : this.n0.t().a(this.z0);
    }

    public float getBoxCornerRadiusTopStart() {
        return pb9.i(this) ? this.n0.t().a(this.z0) : this.n0.r().a(this.z0);
    }

    public int getBoxStrokeColor() {
        return this.L0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.M0;
    }

    public int getBoxStrokeWidth() {
        return this.t0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.u0;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.k && this.m && (textView = this.r) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.N;
    }

    public ColorStateList getCounterTextColor() {
        return this.M;
    }

    public ColorStateList getCursorColor() {
        return this.Q;
    }

    public ColorStateList getCursorErrorColor() {
        return this.S;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.H0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.c.n();
    }

    public int getEndIconMinSize() {
        return this.c.o();
    }

    public int getEndIconMode() {
        return this.c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.c.r();
    }

    public CharSequence getError() {
        if (this.j.A()) {
            return this.j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.c.s();
    }

    public CharSequence getHelperText() {
        if (this.j.B()) {
            return this.j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.j.u();
    }

    public CharSequence getHint() {
        if (this.e0) {
            return this.f0;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.U0.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.U0.w();
    }

    public ColorStateList getHintTextColor() {
        return this.I0;
    }

    public e getLengthCounter() {
        return this.n;
    }

    public int getMaxEms() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.w) {
            return this.u;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.B;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.y;
    }

    public CharSequence getPrefixText() {
        return this.b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b();
    }

    public TextView getPrefixTextView() {
        return this.b.d();
    }

    public oo7 getShapeAppearanceModel() {
        return this.n0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.b.f();
    }

    public int getStartIconMinSize() {
        return this.b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h();
    }

    public CharSequence getSuffixText() {
        return this.c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.x();
    }

    public TextView getSuffixTextView() {
        return this.c.z();
    }

    public Typeface getTypeface() {
        return this.A0;
    }

    public void i(f fVar) {
        this.D0.add(fVar);
        if (this.d != null) {
            fVar.a(this);
        }
    }

    void k0(Editable editable) {
        int a2 = this.n.a(editable);
        boolean z = this.m;
        int i = this.l;
        if (i == -1) {
            this.r.setText(String.valueOf(a2));
            this.r.setContentDescription(null);
            this.m = false;
        } else {
            this.m = a2 > i;
            l0(getContext(), this.r, a2, this.l, this.m);
            if (z != this.m) {
                m0();
            }
            this.r.setText(d80.c().j(getContext().getString(vj6.character_counter_pattern, Integer.valueOf(a2), Integer.valueOf(this.l))));
        }
        if (this.d == null || z == this.m) {
            return;
        }
        u0(false);
        A0();
        p0();
    }

    void l(float f2) {
        if (this.U0.F() == f2) {
            return;
        }
        if (this.X0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.X0 = valueAnimator;
            valueAnimator.setInterpolator(hw4.g(getContext(), lc6.motionEasingEmphasizedInterpolator, hi.b));
            this.X0.setDuration(hw4.f(getContext(), lc6.motionDurationMedium4, 167));
            this.X0.addUpdateListener(new c());
        }
        this.X0.setFloatValues(this.U0.F(), f2);
        this.X0.start();
    }

    boolean o0() {
        boolean z;
        if (this.d == null) {
            return false;
        }
        boolean z2 = true;
        if (f0()) {
            int measuredWidth = this.b.getMeasuredWidth() - this.d.getPaddingLeft();
            if (this.B0 == null || this.C0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.B0 = colorDrawable;
                this.C0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a2 = hk8.a(this.d);
            Drawable drawable = a2[0];
            Drawable drawable2 = this.B0;
            if (drawable != drawable2) {
                hk8.h(this.d, drawable2, a2[1], a2[2], a2[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.B0 != null) {
                Drawable[] a3 = hk8.a(this.d);
                hk8.h(this.d, null, a3[1], a3[2], a3[3]);
                this.B0 = null;
                z = true;
            }
            z = false;
        }
        if (e0()) {
            int measuredWidth2 = this.c.z().getMeasuredWidth() - this.d.getPaddingRight();
            CheckableImageButton k = this.c.k();
            if (k != null) {
                measuredWidth2 = measuredWidth2 + k.getMeasuredWidth() + ze4.b((ViewGroup.MarginLayoutParams) k.getLayoutParams());
            }
            Drawable[] a4 = hk8.a(this.d);
            Drawable drawable3 = this.E0;
            if (drawable3 == null || this.F0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.E0 = colorDrawable2;
                    this.F0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a4[2];
                Drawable drawable5 = this.E0;
                if (drawable4 != drawable5) {
                    this.G0 = drawable4;
                    hk8.h(this.d, a4[0], a4[1], drawable5, a4[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.F0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                hk8.h(this.d, a4[0], a4[1], this.E0, a4[3]);
            }
        } else {
            if (this.E0 == null) {
                return z;
            }
            Drawable[] a5 = hk8.a(this.d);
            if (a5[2] == this.E0) {
                hk8.h(this.d, a5[0], a5[1], this.G0, a5[3]);
            } else {
                z2 = z;
            }
            this.E0 = null;
        }
        return z2;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.U0.Y(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.a1 = false;
        boolean s0 = s0();
        boolean o0 = o0();
        if (s0 || o0) {
            this.d.post(new Runnable() { // from class: pi8
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.U();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            Rect rect = this.x0;
            wm1.a(this, editText, rect);
            i0(rect);
            if (this.e0) {
                this.U0.v0(this.d.getTextSize());
                int gravity = this.d.getGravity();
                this.U0.j0((gravity & (-113)) | 48);
                this.U0.u0(gravity);
                this.U0.f0(r(rect));
                this.U0.p0(u(rect));
                this.U0.a0();
                if (!B() || this.T0) {
                    return;
                }
                W();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.a1) {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.a1 = true;
        }
        w0();
        this.c.x0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.o0) {
            float a2 = this.n0.r().a(this.z0);
            float a3 = this.n0.t().a(this.z0);
            oo7 m = oo7.a().A(this.n0.s()).E(this.n0.q()).r(this.n0.k()).v(this.n0.i()).B(a3).F(a2).s(this.n0.l().a(this.z0)).w(this.n0.j().a(this.z0)).m();
            this.o0 = z;
            setShapeAppearanceModel(m);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (d0()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = this.c.E();
        return savedState;
    }

    void p0() {
        Drawable background;
        TextView textView;
        EditText editText = this.d;
        if (editText == null || this.q0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (androidx.appcompat.widget.w.a(background)) {
            background = background.mutate();
        }
        if (d0()) {
            background.setColorFilter(androidx.appcompat.widget.j.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.m && (textView = this.r) != null) {
            background.setColorFilter(androidx.appcompat.widget.j.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            kv1.c(background);
            this.d.refreshDrawableState();
        }
    }

    void r0() {
        EditText editText = this.d;
        if (editText == null || this.h0 == null) {
            return;
        }
        if ((this.k0 || editText.getBackground() == null) && this.q0 != 0) {
            q0();
            this.k0 = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            this.N0 = i;
            this.P0 = i;
            this.Q0 = i;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(mx0.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.N0 = defaultColor;
        this.w0 = defaultColor;
        this.O0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.P0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.Q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.q0) {
            return;
        }
        this.q0 = i;
        if (this.d != null) {
            V();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.r0 = i;
    }

    public void setBoxCornerFamily(int i) {
        this.n0 = this.n0.v().z(i, this.n0.r()).D(i, this.n0.t()).q(i, this.n0.j()).u(i, this.n0.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i) {
        if (this.L0 != i) {
            this.L0 = i;
            A0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.J0 = colorStateList.getDefaultColor();
            this.R0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.L0 != colorStateList.getDefaultColor()) {
            this.L0 = colorStateList.getDefaultColor();
        }
        A0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            A0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.t0 = i;
        A0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.u0 = i;
        A0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.k != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.r = appCompatTextView;
                appCompatTextView.setId(bg6.textinput_counter);
                Typeface typeface = this.A0;
                if (typeface != null) {
                    this.r.setTypeface(typeface);
                }
                this.r.setMaxLines(1);
                this.j.e(this.r, 2);
                ze4.d((ViewGroup.MarginLayoutParams) this.r.getLayoutParams(), getResources().getDimensionPixelOffset(zd6.mtrl_textinput_counter_margin_start));
                m0();
                j0();
            } else {
                this.j.C(this.r, 2);
                this.r = null;
            }
            this.k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.l != i) {
            if (i > 0) {
                this.l = i;
            } else {
                this.l = -1;
            }
            if (this.k) {
                j0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.s != i) {
            this.s = i;
            m0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            m0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.t != i) {
            this.t = i;
            m0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            m0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            n0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (Q()) {
                n0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.H0 = colorStateList;
        this.I0 = colorStateList;
        if (this.d != null) {
            u0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Y(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.N(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.O(z);
    }

    public void setEndIconContentDescription(int i) {
        this.c.P(i);
    }

    public void setEndIconDrawable(int i) {
        this.c.R(i);
    }

    public void setEndIconMinSize(int i) {
        this.c.T(i);
    }

    public void setEndIconMode(int i) {
        this.c.U(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.c.Z(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.c.a0(z);
    }

    public void setError(CharSequence charSequence) {
        if (!this.j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.j.w();
        } else {
            this.j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        this.j.E(i);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.j.F(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.j.G(z);
    }

    public void setErrorIconDrawable(int i) {
        this.c.b0(i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.c.g0(mode);
    }

    public void setErrorTextAppearance(int i) {
        this.j.H(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.V0 != z) {
            this.V0 = z;
            u0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.j.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.j.K(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.j.J(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.e0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(ProgressEvent.PART_COMPLETED_EVENT_CODE);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.W0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.e0) {
            this.e0 = z;
            if (z) {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f0)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.g0 = true;
            } else {
                this.g0 = false;
                if (!TextUtils.isEmpty(this.f0) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f0);
                }
                setHintInternal(null);
            }
            if (this.d != null) {
                t0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.U0.g0(i);
        this.I0 = this.U0.p();
        if (this.d != null) {
            u0(false);
            t0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            if (this.H0 == null) {
                this.U0.i0(colorStateList);
            }
            this.I0 = colorStateList;
            if (this.d != null) {
                u0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.n = eVar;
    }

    public void setMaxEms(int i) {
        this.g = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        this.c.i0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        this.c.k0(i);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.c.m0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.x == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.x = appCompatTextView;
            appCompatTextView.setId(bg6.textinput_placeholder);
            k99.v0(this.x, 2);
            ea2 A = A();
            this.H = A;
            A.g0(67L);
            this.L = A();
            setPlaceholderTextAppearance(this.B);
            setPlaceholderTextColor(this.y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.w) {
                setPlaceholderTextEnabled(true);
            }
            this.u = charSequence;
        }
        x0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.B = i;
        TextView textView = this.x;
        if (textView != null) {
            hk8.m(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            TextView textView = this.x;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.b.o(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.b.p(colorStateList);
    }

    public void setShapeAppearanceModel(oo7 oo7Var) {
        uf4 uf4Var = this.h0;
        if (uf4Var == null || uf4Var.C() == oo7Var) {
            return;
        }
        this.n0 = oo7Var;
        m();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.q(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? al.b(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        this.b.t(i);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.b.y(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.b.z(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i) {
        this.c.q0(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.d;
        if (editText != null) {
            k99.l0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.A0) {
            this.A0 = typeface;
            this.U0.N0(typeface);
            this.j.N(typeface);
            TextView textView = this.r;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void u0(boolean z) {
        v0(z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.c.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.s(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
