package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;

/* loaded from: classes4.dex */
public final class m33 extends RecyclerView.n {
    private final int[] a;
    private final int b;
    private Drawable c;
    private int d;

    public m33(Context context) {
        zq3.h(context, "context");
        int[] iArr = {R.attr.listDivider};
        this.a = iArr;
        this.b = context.getResources().getDimensionPixelSize(ae6.eight);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        zq3.g(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.c = obtainStyledAttributes.getDrawable(0);
        ww8 ww8Var = ww8.a;
        obtainStyledAttributes.recycle();
    }

    private final void j(Canvas canvas, RecyclerView recyclerView) {
        Drawable drawable = this.c;
        if (drawable != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                zq3.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.p pVar = (RecyclerView.p) layoutParams;
                int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + this.d;
                drawable.setBounds(right, ((childAt.getTop() - ((ViewGroup.MarginLayoutParams) pVar).topMargin) - this.d) + this.b, drawable.getIntrinsicWidth() + right, ((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin) + this.d) - this.b);
                drawable.draw(canvas);
            }
        }
    }

    private final void k(Canvas canvas, RecyclerView recyclerView) {
        Drawable drawable;
        if (recyclerView.getChildCount() == 0 || (drawable = this.c) == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            zq3.f(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.p pVar = (RecyclerView.p) layoutParams;
            int left = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) pVar).leftMargin) - this.d;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + this.d;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + this.d;
            drawable.setBounds(left, bottom, right, drawable.getIntrinsicHeight() + bottom);
            drawable.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        zq3.h(rect, "outRect");
        zq3.h(view, "view");
        zq3.h(recyclerView, "parent");
        zq3.h(zVar, TransferTable.COLUMN_STATE);
        int i = this.d;
        rect.set(i, i, i, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        zq3.h(canvas, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.h(recyclerView, "parent");
        zq3.h(zVar, TransferTable.COLUMN_STATE);
        k(canvas, recyclerView);
        j(canvas, recyclerView);
    }
}
