package com.skydoves.balloon.radius;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.skydoves.balloon.internals.ViewPropertyKt;
import defpackage.gb9;
import defpackage.iv3;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes4.dex */
public final class RadiusLayout extends FrameLayout {
    static final /* synthetic */ iv3[] c = {zt6.f(new MutablePropertyReference1Impl(RadiusLayout.class, "radius", "getRadius()F", 0))};
    private final Path a;
    private final gb9 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        zq3.h(canvas, "canvas");
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
    }

    public final float getRadius() {
        return ((Number) this.b.getValue(this, c[0])).floatValue();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.addRoundRect(new RectF(0.0f, 0.0f, i, i2), getRadius(), getRadius(), Path.Direction.CW);
    }

    public final void setRadius(float f) {
        this.b.a(this, c[0], Float.valueOf(f));
    }

    public /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadiusLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        this.a = new Path();
        this.b = ViewPropertyKt.a(this, Float.valueOf(0.0f));
    }
}
