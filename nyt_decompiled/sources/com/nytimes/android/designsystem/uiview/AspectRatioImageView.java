package com.nytimes.android.designsystem.uiview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.dg4;
import defpackage.pn6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AspectRatioImageView extends AppCompatImageView {
    public static final a Companion = new a(null);
    private double d;
    private int e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    public final void c(int i, int i2) {
        setAspectRatio(i2 / i);
    }

    public final int getAspectRatioOption() {
        return this.e;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        super.onMeasure(i, i2);
        if (this.d != -1.0d && (measuredWidth = getMeasuredWidth()) > 0) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(dg4.c(measuredWidth * this.d), 1073741824));
        }
    }

    public final void setAspectRatio(double d) {
        this.d = d;
        setAspectRatioOption(-1);
    }

    public final void setAspectRatioOption(int i) {
        this.e = i;
        Double valueOf = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : Double.valueOf(0.6666666666666666d) : Double.valueOf(0.5d) : Double.valueOf(0.5625d) : Double.valueOf(-1.0d);
        if (valueOf != null) {
            this.d = valueOf.doubleValue();
        }
    }

    public /* synthetic */ AspectRatioImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        this.d = -1.0d;
        int[] iArr = pn6.AspectRatioImageView;
        zq3.g(iArr, "AspectRatioImageView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        zq3.g(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setAspectRatioOption(obtainStyledAttributes.getInt(pn6.AspectRatioImageView_aspectRatioOption, 0));
        obtainStyledAttributes.recycle();
    }
}
