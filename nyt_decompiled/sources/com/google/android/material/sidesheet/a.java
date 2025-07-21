package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
final class a extends c {
    final SideSheetBehavior a;

    a(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i) {
        float e = e();
        return (i - e) / (d() - e);
    }

    @Override // com.google.android.material.sidesheet.c
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return Math.max(0, this.a.I() + this.a.G());
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return (-this.a.z()) - this.a.G();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return this.a.G();
    }

    @Override // com.google.android.material.sidesheet.c
    int g() {
        return -this.a.z();
    }

    @Override // com.google.android.material.sidesheet.c
    int h(View view) {
        return view.getRight() + this.a.G();
    }

    @Override // com.google.android.material.sidesheet.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.c
    int j() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(float f) {
        return f > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(View view) {
        return view.getRight() < (d() - e()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(float f, float f2) {
        return d.a(f, f2) && Math.abs(f) > ((float) this.a.K());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean n(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.a.E())) > this.a.F();
    }

    @Override // com.google.android.material.sidesheet.c
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // com.google.android.material.sidesheet.c
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.J()) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
