package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.sectionfront.layoutmanager.SpannableGridLayoutManager;

/* loaded from: classes2.dex */
public class l33 extends RecyclerView.n {
    private final Drawable a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;

    public l33(Context context, int i) {
        Resources resources = context.getResources();
        this.a = resources.getDrawable(ie6.section_front_separator);
        this.b = resources.getDimensionPixelSize(de6.section_front_divider_width_and_height);
        this.c = resources.getDimensionPixelSize(ee6.section_front_divider_right_margin);
        this.d = resources.getDimensionPixelSize(ee6.section_front_divider_top_margin);
        this.e = resources.getDimensionPixelSize(ee6.section_front_divider_bottom_margin);
        this.f = i;
    }

    private void j(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (l(childAt)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int bottom = childAt.getBottom() + marginLayoutParams.bottomMargin;
                int left = childAt.getLeft() - marginLayoutParams.leftMargin;
                int right = childAt.getRight() + marginLayoutParams.rightMargin;
                if (marginLayoutParams instanceof SpannableGridLayoutManager.c ? ((SpannableGridLayoutManager.c) marginLayoutParams).g : false) {
                    right -= this.c;
                }
                this.a.setBounds(left, bottom, right, this.b + bottom);
                this.a.draw(canvas);
            }
        }
    }

    private void k(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (l(childAt) && !m()) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                if (!(marginLayoutParams instanceof SpannableGridLayoutManager.c ? ((SpannableGridLayoutManager.c) marginLayoutParams).f : false)) {
                    int top = (childAt.getTop() - marginLayoutParams.topMargin) + this.d;
                    int left = childAt.getLeft() - marginLayoutParams.leftMargin;
                    this.a.setBounds(left, top, this.b + left, (childAt.getBottom() + marginLayoutParams.bottomMargin) - this.e);
                    this.a.draw(canvas);
                }
            }
        }
    }

    private boolean l(View view) {
        return view.getVisibility() != 8;
    }

    private boolean m() {
        return this.f == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        boolean l = l(view);
        rect.set((!l || m()) ? 0 : this.b, 0, 0, l ? this.b : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        j(canvas, recyclerView);
        k(canvas, recyclerView);
    }
}
