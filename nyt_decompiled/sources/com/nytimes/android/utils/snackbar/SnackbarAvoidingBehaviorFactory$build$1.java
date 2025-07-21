package com.nytimes.android.utils.snackbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SnackbarAvoidingBehaviorFactory$build$1 extends CoordinatorLayout.c {
    final /* synthetic */ View a;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(view, "child");
        zq3.h(view2, "dependency");
        return view2 instanceof Snackbar.SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(view, "child");
        zq3.h(view2, "dependency");
        this.a.setTranslationY((view2.getVisibility() != 4 ? Math.min(0.0f, view2.getTranslationY() - view2.getHeight()) : 0.0f) + 1);
        return true;
    }
}
