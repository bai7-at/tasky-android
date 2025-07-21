package com.nytimes.android.messaging.dock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.nytimes.android.utils.DeviceUtils;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class DockBehavior extends CoordinatorLayout.c {
    public static final int $stable = 8;
    private int panelInitialPosition;
    private int statusBarHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DockBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
        this.statusBarHeight = DeviceUtils.r(context);
        this.panelInitialPosition = DeviceUtils.n(context) + this.statusBarHeight;
    }

    private final boolean shouldChangeColors(View view) {
        return view.getTranslationY() > 0.0f;
    }

    public void updatePosition(int i) {
        this.panelInitialPosition = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, DockView dockView, View view) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(dockView, "child");
        zq3.h(view, "dependency");
        return view instanceof BottomAppBar;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, DockView dockView, View view) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(dockView, "child");
        zq3.h(view, "dependency");
        dockView.setTranslationY(view.getTranslationY() - view.getHeight());
        if (shouldChangeColors(view)) {
            dockView.activate();
        }
        return super.onDependentViewChanged(coordinatorLayout, (View) dockView, view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, DockView dockView, View view, View view2, int i) {
        zq3.h(coordinatorLayout, "coordinatorLayout");
        zq3.h(dockView, "child");
        zq3.h(view, "directTargetChild");
        zq3.h(view2, "target");
        return i == 2 || super.onStartNestedScroll(coordinatorLayout, (View) dockView, view, view2, i);
    }
}
