package com.nytimes.android.readerhybrid;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.dg4;
import defpackage.j35;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class a extends WebView {
    private j35 a;
    private int b;
    private float c;
    private final int d;
    private float e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        this.d = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
        this.f = true;
        this.i = true;
    }

    private final float b() {
        if (getContentHeight() == 0) {
            return 0.0f;
        }
        return (this.b - getTop()) / getContentHeight();
    }

    public final boolean c(MotionEvent motionEvent) {
        zq3.h(motionEvent, "motionEvent");
        return super.onTouchEvent(motionEvent);
    }

    public final boolean getDisallowTouchIntercept() {
        return this.i;
    }

    public final boolean getForceClamping() {
        return this.h;
    }

    public final j35 getNestedScrollingDelegate() {
        return this.a;
    }

    public final int getSavedScrollPosition() {
        return dg4.d(getTop() + ((getContentHeight() - getTop()) * this.c));
    }

    public final int getScrollPercentage() {
        return (int) (((getScrollY() + getMeasuredHeight()) / computeVerticalScrollRange()) * 100);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        if (z) {
            this.g = true;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        zq3.h(parcelable, TransferTable.COLUMN_STATE);
        HybridSavedState hybridSavedState = parcelable instanceof HybridSavedState ? (HybridSavedState) parcelable : null;
        this.c = hybridSavedState != null ? hybridSavedState.a() : 0.0f;
        super.onRestoreInstanceState(((View.BaseSavedState) parcelable).getSuperState());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        HybridSavedState hybridSavedState = new HybridSavedState(super.onSaveInstanceState());
        hybridSavedState.b(b());
        return hybridSavedState;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.b = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r0 != 3) goto L36;
     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "motionEvent"
            defpackage.zq3.h(r6, r0)
            int r0 = r6.getAction()
            r1 = 0
            if (r0 == 0) goto L63
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L49
            r4 = 2
            if (r0 == r4) goto L17
            r4 = 3
            if (r0 == r4) goto L49
            goto L7c
        L17:
            float r0 = r6.getX()
            float r2 = r5.e
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r5.d
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L7c
            android.view.ViewParent r0 = r5.getParent()
            boolean r2 = r0 instanceof androidx.swiperefreshlayout.widget.SwipeRefreshLayout
            if (r2 == 0) goto L34
            r1 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r1
        L34:
            if (r1 == 0) goto L39
            r1.setEnabled(r3)
        L39:
            boolean r0 = r5.g
            if (r0 != 0) goto L41
            boolean r0 = r5.h
            if (r0 == 0) goto L43
        L41:
            r5.i = r3
        L43:
            boolean r0 = r5.i
            r5.requestDisallowInterceptTouchEvent(r0)
            goto L7c
        L49:
            android.view.ViewParent r0 = r5.getParent()
            boolean r4 = r0 instanceof androidx.swiperefreshlayout.widget.SwipeRefreshLayout
            if (r4 == 0) goto L54
            r1 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r1
        L54:
            if (r1 == 0) goto L5b
            boolean r0 = r5.f
            r1.setEnabled(r0)
        L5b:
            r5.requestDisallowInterceptTouchEvent(r3)
            r5.i = r2
            r5.g = r3
            goto L7c
        L63:
            android.view.ViewParent r0 = r5.getParent()
            boolean r2 = r0 instanceof androidx.swiperefreshlayout.widget.SwipeRefreshLayout
            if (r2 == 0) goto L6e
            r1 = r0
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r1
        L6e:
            if (r1 == 0) goto L76
            boolean r0 = r1.isEnabled()
            r5.f = r0
        L76:
            float r0 = r6.getX()
            r5.e = r0
        L7c:
            j35 r0 = r5.a
            if (r0 == 0) goto L85
            boolean r5 = r0.c(r6, r5)
            goto L89
        L85:
            boolean r5 = super.onTouchEvent(r6)
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.readerhybrid.a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setDisallowTouchIntercept(boolean z) {
        this.i = z;
    }

    public final void setForceClamping(boolean z) {
        this.h = z;
    }

    public final void setNestedScrollingDelegate(j35 j35Var) {
        this.a = j35Var;
    }
}
