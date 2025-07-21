package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
final class b extends c {
    final SideSheetBehavior a;

    b(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i) {
        float e = e();
        return (e - i) / (e - d());
    }

    @Override // com.google.android.material.sidesheet.c
    int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return Math.max(0, (e() - this.a.z()) - this.a.G());
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.a.J();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return this.a.J();
    }

    @Override // com.google.android.material.sidesheet.c
    int g() {
        return d();
    }

    @Override // com.google.android.material.sidesheet.c
    int h(View view) {
        return view.getLeft() - this.a.G();
    }

    @Override // com.google.android.material.sidesheet.c
    public int i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // com.google.android.material.sidesheet.c
    int j() {
        return 0;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(float f) {
        return f < 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(View view) {
        return view.getLeft() > (e() + d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(float f, float f2) {
        return d.a(f, f2) && Math.abs(f) > ((float) this.a.K());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean n(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.a.E())) > this.a.F();
    }

    @Override // com.google.android.material.sidesheet.c
    void o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // com.google.android.material.sidesheet.c
    void p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int J = this.a.J();
        if (i <= J) {
            marginLayoutParams.rightMargin = J - i;
        }
    }
}
