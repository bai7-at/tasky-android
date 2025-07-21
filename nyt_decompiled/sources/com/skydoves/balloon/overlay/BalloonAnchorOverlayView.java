package com.skydoves.balloon.overlay;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.skydoves.balloon.internals.ViewPropertyKt;
import defpackage.e40;
import defpackage.f40;
import defpackage.g40;
import defpackage.gb9;
import defpackage.iv3;
import defpackage.px0;
import defpackage.zq3;
import defpackage.zt6;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes4.dex */
public final class BalloonAnchorOverlayView extends View {
    static final /* synthetic */ iv3[] l = {zt6.f(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "anchorView", "getAnchorView()Landroid/view/View;", 0)), zt6.f(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "anchorViewList", "getAnchorViewList()Ljava/util/List;", 0)), zt6.f(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayColor", "getOverlayColor()I", 0)), zt6.f(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayPaddingColor", "getOverlayPaddingColor()I", 0)), zt6.f(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayPadding", "getOverlayPadding()F", 0)), zt6.f(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "overlayPosition", "getOverlayPosition()Landroid/graphics/Point;", 0)), zt6.f(new MutablePropertyReference1Impl(BalloonAnchorOverlayView.class, "balloonOverlayShape", "getBalloonOverlayShape()Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", 0))};
    private final gb9 a;
    private final gb9 b;
    private final gb9 c;
    private final gb9 d;
    private final gb9 e;
    private final gb9 f;
    private final gb9 g;
    private Bitmap h;
    private final Paint i;
    private final Paint j;
    private boolean k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zq3.h(context, "context");
    }

    private final void a(View view, Canvas canvas) {
        if (view != null) {
            view.getGlobalVisibleRect(new Rect());
            RectF rectF = getOverlayPosition() != null ? new RectF(r1.x - getOverlayPadding(), (r1.y - getOverlayPadding()) + getStatusBarHeight(), r1.x + view.getWidth() + getOverlayPadding(), r1.y + view.getHeight() + getOverlayPadding() + getStatusBarHeight()) : new RectF(r0.left - getOverlayPadding(), r0.top - getOverlayPadding(), r0.right + getOverlayPadding(), r0.bottom + getOverlayPadding());
            float overlayPadding = getOverlayPadding() / 2;
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(overlayPadding, overlayPadding);
            g40 balloonOverlayShape = getBalloonOverlayShape();
            if (balloonOverlayShape instanceof e40) {
                canvas.drawOval(rectF, this.i);
                canvas.drawOval(rectF2, this.j);
                return;
            }
            if (!(balloonOverlayShape instanceof f40)) {
                throw new NoWhenBranchMatchedException();
            }
            f40 f40Var = (f40) balloonOverlayShape;
            Pair a = f40Var.a();
            if (a != null) {
                canvas.drawRoundRect(rectF, ((Number) a.c()).floatValue(), ((Number) a.d()).floatValue(), this.i);
                canvas.drawRoundRect(rectF2, ((Number) a.c()).floatValue() - overlayPadding, ((Number) a.d()).floatValue() - overlayPadding, this.j);
            }
            Pair b = f40Var.b();
            if (b != null) {
                Context context = getContext();
                zq3.g(context, "getContext(...)");
                float c = px0.c(context, ((Number) b.c()).intValue());
                Context context2 = getContext();
                zq3.g(context2, "getContext(...)");
                canvas.drawRoundRect(rectF, c, px0.c(context2, ((Number) b.d()).intValue()), this.i);
                Context context3 = getContext();
                zq3.g(context3, "getContext(...)");
                float c2 = px0.c(context3, ((Number) b.c()).intValue()) - overlayPadding;
                Context context4 = getContext();
                zq3.g(context4, "getContext(...)");
                canvas.drawRoundRect(rectF2, c2, px0.c(context4, ((Number) b.d()).intValue()) - overlayPadding, this.j);
            }
        }
    }

    private final void c() {
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        View anchorView = getAnchorView();
        if (anchorView == null || anchorView.getWidth() != 0) {
            View anchorView2 = getAnchorView();
            if (anchorView2 == null || anchorView2.getHeight() != 0) {
                Bitmap bitmap = this.h;
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                this.h = createBitmap;
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = this.i;
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
                paint.setColor(getOverlayColor());
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.i);
                Paint paint2 = this.i;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                paint2.setColor(0);
                Paint paint3 = this.j;
                paint3.setColor(getOverlayPaddingColor());
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setStrokeWidth(getOverlayPadding());
                List<View> anchorViewList = getAnchorViewList();
                if (anchorViewList == null || anchorViewList.isEmpty()) {
                    a(getAnchorView(), canvas);
                } else {
                    List<View> anchorViewList2 = getAnchorViewList();
                    if (anchorViewList2 != null) {
                        Iterator<T> it2 = anchorViewList2.iterator();
                        while (it2.hasNext()) {
                            a((View) it2.next(), canvas);
                        }
                    }
                }
                this.k = false;
            }
        }
    }

    private final int getStatusBarHeight() {
        Rect rect = new Rect();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return 0;
        }
        ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    public final void b() {
        this.k = true;
        invalidate();
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Bitmap bitmap;
        zq3.h(canvas, "canvas");
        if (this.k || (bitmap = this.h) == null || (bitmap != null && bitmap.isRecycled())) {
            c();
        }
        Bitmap bitmap2 = this.h;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
    }

    public final View getAnchorView() {
        return (View) this.a.getValue(this, l[0]);
    }

    public final List<View> getAnchorViewList() {
        return (List) this.b.getValue(this, l[1]);
    }

    public final g40 getBalloonOverlayShape() {
        return (g40) this.g.getValue(this, l[6]);
    }

    public final int getOverlayColor() {
        return ((Number) this.c.getValue(this, l[2])).intValue();
    }

    public final float getOverlayPadding() {
        return ((Number) this.e.getValue(this, l[4])).floatValue();
    }

    public final int getOverlayPaddingColor() {
        return ((Number) this.d.getValue(this, l[3])).intValue();
    }

    public final Point getOverlayPosition() {
        return (Point) this.f.getValue(this, l[5]);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.k = true;
    }

    public final void setAnchorView(View view) {
        this.a.a(this, l[0], view);
    }

    public final void setAnchorViewList(List<? extends View> list) {
        this.b.a(this, l[1], list);
    }

    public final void setBalloonOverlayShape(g40 g40Var) {
        zq3.h(g40Var, "<set-?>");
        this.g.a(this, l[6], g40Var);
    }

    public final void setOverlayColor(int i) {
        this.c.a(this, l[2], Integer.valueOf(i));
    }

    public final void setOverlayPadding(float f) {
        this.e.a(this, l[4], Float.valueOf(f));
    }

    public final void setOverlayPaddingColor(int i) {
        this.d.a(this, l[3], Integer.valueOf(i));
    }

    public final void setOverlayPosition(Point point) {
        this.f.a(this, l[5], point);
    }

    public /* synthetic */ BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BalloonAnchorOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        zq3.h(context, "context");
        this.a = ViewPropertyKt.a(this, null);
        this.b = ViewPropertyKt.a(this, null);
        this.c = ViewPropertyKt.a(this, 0);
        this.d = ViewPropertyKt.a(this, 0);
        this.e = ViewPropertyKt.a(this, Float.valueOf(0.0f));
        this.f = ViewPropertyKt.a(this, null);
        this.g = ViewPropertyKt.a(this, e40.a);
        Paint paint = new Paint(1);
        this.i = paint;
        Paint paint2 = new Paint(1);
        this.j = paint2;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setDither(true);
    }
}
