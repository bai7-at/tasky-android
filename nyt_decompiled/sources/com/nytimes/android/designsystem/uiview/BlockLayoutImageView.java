package com.nytimes.android.designsystem.uiview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class BlockLayoutImageView extends AppCompatImageView {
    private boolean d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlockLayoutImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    @Override // android.view.View
    public void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        zq3.h(bitmap, "bm");
        this.d = true;
        super.setImageBitmap(bitmap);
        this.d = false;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.d = true;
        super.setImageDrawable(drawable);
        this.d = false;
    }

    public /* synthetic */ BlockLayoutImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockLayoutImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
    }
}
