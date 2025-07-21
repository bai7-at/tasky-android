package com.nytimes.android.side.effects;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.Snackbar;
import com.nytimes.android.messaging.dock.DockView;
import com.nytimes.android.side.effects.DynamicBottomSpaceBehavior;
import defpackage.zq3;
import defpackage.zt6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DynamicBottomSpaceBehavior extends CoordinatorLayout.c {
    private final Map a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicBottomSpaceBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
        this.a = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(View view, DynamicBottomSpaceBehavior dynamicBottomSpaceBehavior, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout) {
        zq3.h(view, "$dependency");
        zq3.h(dynamicBottomSpaceBehavior, "this$0");
        zq3.h(coordinatorLayout, "$parent");
        zq3.h(frameLayout, "$child");
        if (view.getVisibility() != 0 && dynamicBottomSpaceBehavior.a.containsKey(zt6.b(view.getClass()))) {
            dynamicBottomSpaceBehavior.onDependentViewRemoved(coordinatorLayout, frameLayout, view);
        }
    }

    private final void j(FrameLayout frameLayout) {
        Integer num;
        Iterator it2 = this.a.values().iterator();
        if (it2.hasNext()) {
            Integer valueOf = Integer.valueOf(Math.abs((int) ((Number) it2.next()).floatValue()));
            while (it2.hasNext()) {
                Integer valueOf2 = Integer.valueOf(Math.abs((int) ((Number) it2.next()).floatValue()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), num != null ? num.intValue() : 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(final CoordinatorLayout coordinatorLayout, final FrameLayout frameLayout, final View view) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(frameLayout, "child");
        zq3.h(view, "dependency");
        if (!(view instanceof Snackbar.SnackbarLayout ? true : view instanceof DockView ? true : view instanceof BottomAppBar)) {
            return false;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: zw1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                DynamicBottomSpaceBehavior.g(view, this, coordinatorLayout, frameLayout);
            }
        });
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, View view) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(frameLayout, "child");
        zq3.h(view, "dependency");
        this.a.put(zt6.b(view.getClass()), Float.valueOf(view.getTranslationY() - view.getHeight()));
        j(frameLayout);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onDependentViewRemoved(CoordinatorLayout coordinatorLayout, FrameLayout frameLayout, View view) {
        zq3.h(coordinatorLayout, "parent");
        zq3.h(frameLayout, "child");
        zq3.h(view, "dependency");
        this.a.remove(zt6.b(view.getClass()));
        j(frameLayout);
    }
}
