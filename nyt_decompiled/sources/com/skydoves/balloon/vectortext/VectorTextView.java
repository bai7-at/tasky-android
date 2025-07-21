package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.h49;
import defpackage.ik8;
import defpackage.ll1;
import defpackage.wn6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class VectorTextView extends AppCompatTextView {
    private h49 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        r(context, attributeSet);
    }

    private final void r(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wn6.VectorTextView);
            zq3.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setDrawableTextViewParams(new h49(ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawableStart, RecyclerView.UNDEFINED_DURATION)), ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawableEnd, RecyclerView.UNDEFINED_DURATION)), ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawableBottom, RecyclerView.UNDEFINED_DURATION)), ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawableTop, RecyclerView.UNDEFINED_DURATION)), null, null, null, null, false, null, null, null, null, ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawablePadding, RecyclerView.UNDEFINED_DURATION)), ll1.a(obtainStyledAttributes.getColor(wn6.VectorTextView_balloon_drawableTintColor, RecyclerView.UNDEFINED_DURATION)), ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawableWidth, RecyclerView.UNDEFINED_DURATION)), ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawableHeight, RecyclerView.UNDEFINED_DURATION)), ll1.a(obtainStyledAttributes.getResourceId(wn6.VectorTextView_balloon_drawableSquareSize, RecyclerView.UNDEFINED_DURATION)), 8176, null));
            obtainStyledAttributes.recycle();
        }
    }

    public final h49 getDrawableTextViewParams() {
        return this.h;
    }

    public final void s(boolean z) {
        h49 h49Var = this.h;
        if (h49Var != null) {
            h49Var.A(z);
            ik8.a(this, h49Var);
        }
    }

    public final void setDrawableTextViewParams(h49 h49Var) {
        if (h49Var != null) {
            ik8.a(this, h49Var);
        } else {
            h49Var = null;
        }
        this.h = h49Var;
    }
}
