package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import defpackage.b64;
import defpackage.bg4;
import defpackage.fn6;
import defpackage.k99;
import defpackage.kv1;
import defpackage.lc6;
import defpackage.ne4;
import defpackage.nn6;
import defpackage.qf4;
import defpackage.sk8;
import defpackage.tf4;
import defpackage.uf4;
import defpackage.xi6;
import defpackage.zd6;
import java.util.List;

/* loaded from: classes3.dex */
public class v extends androidx.appcompat.widget.d {
    private final b64 e;
    private final AccessibilityManager f;
    private final Rect g;
    private final int h;
    private final float i;
    private ColorStateList j;
    private int k;
    private ColorStateList l;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            v vVar = v.this;
            v.this.l(i < 0 ? vVar.e.v() : vVar.getAdapter().getItem(i));
            AdapterView.OnItemClickListener onItemClickListener = v.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = v.this.e.y();
                    i = v.this.e.x();
                    j = v.this.e.w();
                }
                onItemClickListener.onItemClick(v.this.e.p(), view, i, j);
            }
            v.this.e.dismiss();
        }
    }

    private class b extends ArrayAdapter {
        private ColorStateList a;
        private ColorStateList b;

        b(Context context, int i, String[] strArr) {
            super(context, i, strArr);
            f();
        }

        private ColorStateList a() {
            if (!c() || !d()) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{qf4.i(v.this.k, v.this.l.getColorForState(iArr2, 0)), qf4.i(v.this.k, v.this.l.getColorForState(iArr, 0)), v.this.k});
        }

        private Drawable b() {
            if (!c()) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(v.this.k);
            if (this.b == null) {
                return colorDrawable;
            }
            kv1.o(colorDrawable, this.a);
            return new RippleDrawable(this.b, colorDrawable, null);
        }

        private boolean c() {
            return v.this.k != 0;
        }

        private boolean d() {
            return v.this.l != null;
        }

        private ColorStateList e() {
            if (!d()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{v.this.l.getColorForState(iArr, 0), 0});
        }

        void f() {
            this.b = e();
            this.a = a();
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                k99.p0(textView, v.this.getText().toString().contentEquals(textView.getText()) ? b() : null);
            }
            return view2;
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, lc6.autoCompleteTextViewStyle);
    }

    private TextInputLayout f() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean g() {
        return i() || h();
    }

    private boolean h() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = this.f.getEnabledAccessibilityServiceList(16)) != null) {
            for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = this.f;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int j() {
        ListAdapter adapter = getAdapter();
        TextInputLayout f = f();
        int i = 0;
        if (adapter == null || f == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.e.x()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, f);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable h = this.e.h();
        if (h != null) {
            h.getPadding(this.g);
            Rect rect = this.g;
            i2 += rect.left + rect.right;
        }
        return i2 + f.getEndIconView().getMeasuredWidth();
    }

    private void k() {
        TextInputLayout f = f();
        if (f != null) {
            f.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (g()) {
            this.e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout f = f();
        return (f == null || !f.R()) ? super.getHint() : f.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout f = f();
        if (f != null && f.R() && super.getHint() == null && ne4.b()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), j()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        if (g()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.e.n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        b64 b64Var = this.e;
        if (b64Var != null) {
            b64Var.g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof uf4) {
            ((uf4) dropDownBackground).W(this.j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.M(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        k();
    }

    public void setSimpleItemSelectedColor(int i) {
        this.k = i;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).f();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (g()) {
            this.e.a();
        } else {
            super.showDropDown();
        }
    }

    public v(Context context, AttributeSet attributeSet, int i) {
        super(bg4.c(context, attributeSet, i, 0), attributeSet, i);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray i2 = sk8.i(context2, attributeSet, nn6.MaterialAutoCompleteTextView, i, fn6.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (i2.hasValue(nn6.MaterialAutoCompleteTextView_android_inputType) && i2.getInt(nn6.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.h = i2.getResourceId(nn6.MaterialAutoCompleteTextView_simpleItemLayout, xi6.mtrl_auto_complete_simple_item);
        this.i = i2.getDimensionPixelOffset(nn6.MaterialAutoCompleteTextView_android_popupElevation, zd6.mtrl_exposed_dropdown_menu_popup_elevation);
        if (i2.hasValue(nn6.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.j = ColorStateList.valueOf(i2.getColor(nn6.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.k = i2.getColor(nn6.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.l = tf4.a(context2, i2, nn6.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f = (AccessibilityManager) context2.getSystemService("accessibility");
        b64 b64Var = new b64(context2);
        this.e = b64Var;
        b64Var.J(true);
        b64Var.D(this);
        b64Var.I(2);
        b64Var.n(getAdapter());
        b64Var.L(new a());
        if (i2.hasValue(nn6.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(i2.getResourceId(nn6.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        i2.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.h, strArr));
    }
}
