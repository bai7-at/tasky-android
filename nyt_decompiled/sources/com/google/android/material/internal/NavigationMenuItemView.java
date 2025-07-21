package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.x;
import com.amazonaws.event.ProgressEvent;
import defpackage.bg6;
import defpackage.h3;
import defpackage.hf6;
import defpackage.hk8;
import defpackage.k99;
import defpackage.kv1;
import defpackage.m07;
import defpackage.nc6;
import defpackage.sn8;
import defpackage.w2;
import defpackage.xi6;
import defpackage.xo2;
import defpackage.zd6;

/* loaded from: classes3.dex */
public class NavigationMenuItemView extends xo2 implements k.a {
    private static final int[] i0 = {R.attr.state_checked};
    private int B;
    private boolean H;
    boolean L;
    boolean M;
    private final CheckedTextView N;
    private FrameLayout Q;
    private g S;
    private ColorStateList e0;
    private boolean f0;
    private Drawable g0;
    private final w2 h0;

    class a extends w2 {
        a() {
        }

        @Override // defpackage.w2
        public void g(View view, h3 h3Var) {
            super.g(view, h3Var);
            h3Var.c0(NavigationMenuItemView.this.L);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void B() {
        if (D()) {
            this.N.setVisibility(8);
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                x.a aVar = (x.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.Q.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.N.setVisibility(0);
        FrameLayout frameLayout2 = this.Q;
        if (frameLayout2 != null) {
            x.a aVar2 = (x.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.Q.setLayoutParams(aVar2);
        }
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(nc6.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(i0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.S.getTitle() == null && this.S.getIcon() == null && this.S.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.Q == null) {
                this.Q = (FrameLayout) ((ViewStub) findViewById(bg6.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.Q.removeAllViews();
            this.Q.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i) {
        this.S = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            k99.p0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        sn8.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        g gVar = this.S;
        if (gVar != null && gVar.isCheckable() && this.S.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, i0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.L != z) {
            this.L = z;
            this.h0.m(this.N, ProgressEvent.PART_COMPLETED_EVENT_CODE);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.N.setChecked(z);
        CheckedTextView checkedTextView = this.N;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.M) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f0) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = kv1.r(drawable).mutate();
                kv1.o(drawable, this.e0);
            }
            int i = this.B;
            drawable.setBounds(0, 0, i, i);
        } else if (this.H) {
            if (this.g0 == null) {
                Drawable e = m07.e(getResources(), hf6.navigation_empty_icon, getContext().getTheme());
                this.g0 = e;
                if (e != null) {
                    int i2 = this.B;
                    e.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.g0;
        }
        hk8.h(this.N, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.N.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.B = i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.e0 = colorStateList;
        this.f0 = colorStateList != null;
        g gVar = this.S;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.N.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.H = z;
    }

    public void setTextAppearance(int i) {
        hk8.m(this.N, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.N.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.N.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.M = true;
        a aVar = new a();
        this.h0 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(xi6.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(zd6.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(bg6.design_menu_item_text);
        this.N = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        k99.l0(checkedTextView, aVar);
    }
}
