package com.nytimes.android.menu.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.e99;
import defpackage.ei1;
import defpackage.nq4;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class RealTooltipView extends FrameLayout implements nq4, ei1 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealTooltipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    @Override // defpackage.nq4
    public View getGetView() {
        return this;
    }

    public /* synthetic */ RealTooltipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealTooltipView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        e99.b(LayoutInflater.from(context), this);
    }
}
