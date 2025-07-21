package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.k99;
import defpackage.lh4;
import defpackage.s72;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c {
    private int a;

    public ExpandableBehavior() {
        this.a = 0;
    }

    protected s72 e(CoordinatorLayout coordinatorLayout, View view) {
        List l = coordinatorLayout.l(view);
        int size = l.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) l.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                lh4.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        lh4.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (k99.P(view)) {
            return false;
        }
        e(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }
}
