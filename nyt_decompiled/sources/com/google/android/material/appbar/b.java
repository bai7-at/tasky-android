package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ch9;
import defpackage.hg4;
import defpackage.k99;
import defpackage.p23;
import java.util.List;

/* loaded from: classes3.dex */
abstract class b extends c {
    final Rect d;
    final Rect e;
    private int f;
    private int g;

    public b() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    private static int n(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.google.android.material.appbar.c
    protected void f(CoordinatorLayout coordinatorLayout, View view, int i) {
        View h = h(coordinatorLayout.l(view));
        if (h == null) {
            super.f(coordinatorLayout, view, i);
            this.f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, h.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + h.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        ch9 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && k99.u(coordinatorLayout) && !k99.u(view)) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.e;
        p23.a(n(fVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int i2 = i(h);
        view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
        this.f = rect2.top - h.getBottom();
    }

    abstract View h(List list);

    final int i(View view) {
        if (this.g == 0) {
            return 0;
        }
        float j = j(view);
        int i = this.g;
        return hg4.b((int) (j * i), 0, i);
    }

    abstract float j(View view);

    public final int k() {
        return this.g;
    }

    int l(View view) {
        return view.getMeasuredHeight();
    }

    final int m() {
        return this.f;
    }

    public final void o(int i) {
        this.g = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View h;
        ch9 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (h = h(coordinatorLayout.l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (k99.u(h) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int l = size + l(h);
        int measuredHeight = h.getMeasuredHeight();
        if (p()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            l -= measuredHeight;
        }
        coordinatorLayout.D(view, i, i2, View.MeasureSpec.makeMeasureSpec(l, i5 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i4);
        return true;
    }

    protected boolean p() {
        return false;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
