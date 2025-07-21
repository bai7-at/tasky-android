package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ec6;
import defpackage.id6;
import defpackage.tn6;
import defpackage.zm6;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] h = {R.attr.colorBackground};
    private static final c i;
    private boolean a;
    private boolean b;
    int c;
    int d;
    final Rect e;
    final Rect f;
    private final b g;

    class a implements b {
        private Drawable a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean b() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable c() {
            return this.a;
        }

        @Override // androidx.cardview.widget.b
        public void d(int i, int i2, int i3, int i4) {
            CardView.this.f.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.e;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        i = aVar;
        aVar.k();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ec6.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return i.e(this.g);
    }

    public float getCardElevation() {
        return i.i(this.g);
    }

    public int getContentPaddingBottom() {
        return this.e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.e.left;
    }

    public int getContentPaddingRight() {
        return this.e.right;
    }

    public int getContentPaddingTop() {
        return this.e.top;
    }

    public float getMaxCardElevation() {
        return i.d(this.g);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return i.b(this.g);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (i instanceof androidx.cardview.widget.a) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.l(this.g)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.f(this.g)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        i.m(this.g, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f) {
        i.c(this.g, f);
    }

    public void setMaxCardElevation(float f) {
        i.n(this.g, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.d = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.c = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            i.g(this.g);
        }
    }

    public void setRadius(float f) {
        i.a(this.g, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            i.j(this.g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.e = rect;
        this.f = new Rect();
        a aVar = new a();
        this.g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tn6.CardView, i2, zm6.CardView);
        if (obtainStyledAttributes.hasValue(tn6.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(tn6.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(h);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(id6.cardview_light_background) : getResources().getColor(id6.cardview_dark_background));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(tn6.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(tn6.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(tn6.CardView_cardMaxElevation, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(tn6.CardView_cardUseCompatPadding, false);
        this.b = obtainStyledAttributes.getBoolean(tn6.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(tn6.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(tn6.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(tn6.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(tn6.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(tn6.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = obtainStyledAttributes.getDimensionPixelSize(tn6.CardView_android_minWidth, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(tn6.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        i.h(aVar, context, colorStateList, dimension, dimension2, f);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        i.m(this.g, colorStateList);
    }
}
