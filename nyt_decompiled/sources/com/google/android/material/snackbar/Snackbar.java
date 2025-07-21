package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import defpackage.gx0;
import defpackage.lc6;
import defpackage.xi6;

/* loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar {
    private static final int[] J;
    private static final int[] K;
    private final AccessibilityManager H;
    private boolean I;

    public static final class SnackbarLayout extends BaseTransientBottomBar.s {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        int i = lc6.snackbarButtonStyle;
        J = new int[]{i};
        K = new int[]{i, lc6.snackbarTextViewStyle};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, gx0 gx0Var) {
        super(context, viewGroup, view, gx0Var);
        this.H = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static ViewGroup i0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button j0() {
        return k0().getActionView();
    }

    private SnackbarContentLayout k0() {
        return (SnackbarContentLayout) this.i.getChildAt(0);
    }

    private TextView l0() {
        return k0().getMessageView();
    }

    private static boolean m0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(K);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        A(1);
    }

    public static Snackbar o0(View view, CharSequence charSequence, int i) {
        return p0(null, view, charSequence, i);
    }

    private static Snackbar p0(Context context, View view, CharSequence charSequence, int i) {
        ViewGroup i0 = i0(view);
        if (i0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = i0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(m0(context) ? xi6.mtrl_layout_snackbar_include : xi6.design_layout_snackbar_include, i0, false);
        Snackbar snackbar = new Snackbar(context, i0, snackbarContentLayout, snackbarContentLayout);
        snackbar.r0(charSequence);
        snackbar.V(i);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int D() {
        int D = super.D();
        if (D == -2) {
            return -2;
        }
        return this.H.getRecommendedTimeoutMillis(D, (this.I ? 4 : 0) | 3);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void Z() {
        super.Z();
    }

    public Snackbar q0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button j0 = j0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            j0.setVisibility(8);
            j0.setOnClickListener(null);
            this.I = false;
        } else {
            this.I = true;
            j0.setVisibility(0);
            j0.setText(charSequence);
            j0.setOnClickListener(new View.OnClickListener() { // from class: sv7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.this.n0(onClickListener, view);
                }
            });
        }
        return this;
    }

    public Snackbar r0(CharSequence charSequence) {
        l0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void z() {
        super.z();
    }
}
