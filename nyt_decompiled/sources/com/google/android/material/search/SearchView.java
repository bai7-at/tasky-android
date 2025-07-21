package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.kf4;
import defpackage.lh4;

/* loaded from: classes3.dex */
public abstract class SearchView extends FrameLayout implements CoordinatorLayout.b, kf4 {

    public static class Behavior extends CoordinatorLayout.c {
        public Behavior() {
        }

        public boolean e(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            lh4.a(view);
            return e(coordinatorLayout, null, view2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
