package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public class ft5 extends RecyclerView.n {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public ft5(Context context) {
        this.a = context.getResources().getDimensionPixelSize(ee6.sf_photo_video_lede_top_padding);
        this.b = context.getResources().getDimensionPixelSize(ee6.sf_photo_video_lede_bottom_padding);
        int integer = context.getResources().getInteger(nh6.section_photo_video_grid_columns);
        this.f = context.getResources().getDimensionPixelSize(ee6.sf_photo_video_top_padding);
        this.g = context.getResources().getDimensionPixelSize(ee6.sf_photo_video_bottom_padding);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(ee6.sf_photo_video_padding);
        this.c = dimensionPixelSize;
        int i = dimensionPixelSize / integer;
        this.d = i;
        this.e = dimensionPixelSize - i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        int i;
        int i2;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int o = recyclerView.getAdapter().o(gridLayoutManager.l0(view));
        int Z2 = gridLayoutManager.Z2();
        if (o == 1) {
            rect.set(0, this.a, 0, this.b);
            return;
        }
        if (Z2 == 1) {
            int i3 = this.c;
            rect.set(i3, this.f, i3, this.g);
            return;
        }
        GridLayoutManager.b bVar = (GridLayoutManager.b) view.getLayoutParams();
        if (bVar.e() == 0) {
            i = this.c;
            i2 = this.d;
        } else if (bVar.e() == Z2 - 1) {
            i = this.d;
            i2 = this.c;
        } else {
            i = this.e;
            i2 = i;
        }
        rect.set(i, this.f, i2, this.g);
    }
}
