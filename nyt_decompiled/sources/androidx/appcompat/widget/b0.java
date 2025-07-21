package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.x;
import defpackage.nc6;
import defpackage.sn8;
import defpackage.x3;
import defpackage.z3;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes.dex */
public class b0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator l = new DecelerateInterpolator();
    Runnable a;
    private c b;
    x c;
    private Spinner d;
    private boolean e;
    int f;
    int g;
    private int h;
    private int i;
    protected ViewPropertyAnimator j;
    protected final e k;

    class a implements Runnable {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.smoothScrollTo(this.a.getLeft() - ((b0.this.getWidth() - this.a.getWidth()) / 2), 0);
            b0.this.a = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return b0.this.c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) b0.this.c.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return b0.this.f((x3.d) getItem(i), true);
            }
            ((d) view).a((x3.d) getItem(i));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
            ((d) view).b().f();
            int childCount = b0.this.c.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = b0.this.c.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {
        private final int[] a;
        private x3.d b;
        private TextView c;
        private ImageView d;
        private View e;

        public d(Context context, x3.d dVar, boolean z) {
            super(context, null, nc6.actionBarTabStyle);
            int[] iArr = {R.attr.background};
            this.a = iArr;
            this.b = dVar;
            h0 v = h0.v(context, null, iArr, nc6.actionBarTabStyle, 0);
            if (v.s(0)) {
                setBackgroundDrawable(v.g(0));
            }
            v.w();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(x3.d dVar) {
            this.b = dVar;
            c();
        }

        public x3.d b() {
            return this.b;
        }

        public void c() {
            x3.d dVar = this.b;
            View b = dVar.b();
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.e = b;
                TextView textView = this.c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.e;
            if (view != null) {
                removeView(view);
                this.e = null;
            }
            Drawable c = dVar.c();
            CharSequence e = dVar.e();
            if (c != null) {
                if (this.d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.d = appCompatImageView;
                }
                this.d.setImageDrawable(c);
                this.d.setVisibility(0);
            } else {
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.d.setImageDrawable(null);
                }
            }
            boolean isEmpty = TextUtils.isEmpty(e);
            if (isEmpty) {
                TextView textView2 = this.c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.c.setText((CharSequence) null);
                }
            } else {
                if (this.c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, nc6.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.c = appCompatTextView;
                }
                this.c.setText(e);
                this.c.setVisibility(0);
            }
            ImageView imageView3 = this.d;
            if (imageView3 != null) {
                imageView3.setContentDescription(dVar.a());
            }
            sn8.a(this, isEmpty ? dVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (b0.this.f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = b0.this.f;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    protected class e extends AnimatorListenerAdapter {
        private boolean a = false;
        private int b;

        protected e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            b0 b0Var = b0.this;
            b0Var.j = null;
            b0Var.setVisibility(this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b0.this.setVisibility(0);
            this.a = false;
        }
    }

    public b0(Context context) {
        super(context);
        this.k = new e();
        setHorizontalScrollBarEnabled(false);
        z3 b2 = z3.b(context);
        setContentHeight(b2.f());
        this.g = b2.e();
        x e2 = e();
        this.c = e2;
        addView(e2, new ViewGroup.LayoutParams(-2, -1));
    }

    private Spinner d() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, nc6.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new x.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    private x e() {
        x xVar = new x(getContext(), null, nc6.actionBarTabBarStyle);
        xVar.setMeasureWithLargestChildEnabled(true);
        xVar.setGravity(17);
        xVar.setLayoutParams(new x.a(-2, -1));
        return xVar;
    }

    private boolean g() {
        Spinner spinner = this.d;
        return spinner != null && spinner.getParent() == this;
    }

    private void h() {
        if (g()) {
            return;
        }
        if (this.d == null) {
            this.d = d();
        }
        removeView(this.c);
        addView(this.d, new ViewGroup.LayoutParams(-2, -1));
        if (this.d.getAdapter() == null) {
            this.d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.a = null;
        }
        this.d.setSelection(this.i);
    }

    private boolean i() {
        if (!g()) {
            return false;
        }
        removeView(this.d);
        addView(this.c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.d.getSelectedItemPosition());
        return false;
    }

    public void a(x3.d dVar, int i, boolean z) {
        d f = f(dVar, false);
        this.c.addView(f, i, new x.a(0, -1, 1.0f));
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            f.setSelected(true);
        }
        if (this.e) {
            requestLayout();
        }
    }

    public void b(x3.d dVar, boolean z) {
        d f = f(dVar, false);
        this.c.addView(f, new x.a(0, -1, 1.0f));
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            f.setSelected(true);
        }
        if (this.e) {
            requestLayout();
        }
    }

    public void c(int i) {
        View childAt = this.c.getChildAt(i);
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.a = aVar;
        post(aVar);
    }

    d f(x3.d dVar, boolean z) {
        d dVar2 = new d(getContext(), dVar, z);
        if (z) {
            dVar2.setBackgroundDrawable(null);
            dVar2.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
        } else {
            dVar2.setFocusable(true);
            if (this.b == null) {
                this.b = new c();
            }
            dVar2.setOnClickListener(this.b);
        }
        return dVar2;
    }

    public void j() {
        this.c.removeAllViews();
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.e) {
            requestLayout();
        }
    }

    public void k(int i) {
        this.c.removeViewAt(i);
        Spinner spinner = this.d;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.e) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        z3 b2 = z3.b(getContext());
        setContentHeight(b2.f());
        this.g = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((d) view).b().f();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f = -1;
        } else {
            if (childCount > 2) {
                this.f = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f = View.MeasureSpec.getSize(i) / 2;
            }
            this.f = Math.min(this.f, this.g);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        if (z || !this.e) {
            i();
        } else {
            this.c.measure(0, makeMeasureSpec);
            if (this.c.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                h();
            } else {
                i();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.e = z;
    }

    public void setContentHeight(int i) {
        this.h = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.i = i;
        int childCount = this.c.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.c.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                c(i);
            }
            i2++;
        }
        Spinner spinner = this.d;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
