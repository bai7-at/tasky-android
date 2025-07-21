package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
abstract class c extends CoordinatorLayout.c {
    private d a;
    private int b;
    private int c;

    public c() {
        this.b = 0;
        this.c = 0;
    }

    public int e() {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.c();
        }
        return 0;
    }

    protected void f(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.C(view, i);
    }

    public boolean g(int i) {
        d dVar = this.a;
        if (dVar != null) {
            return dVar.f(i);
        }
        this.b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        f(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new d(view);
        }
        this.a.d();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.f(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 == 0) {
            return true;
        }
        this.a.e(i3);
        this.c = 0;
        return true;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
    }
}
