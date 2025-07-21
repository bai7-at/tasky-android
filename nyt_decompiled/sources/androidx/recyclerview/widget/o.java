package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
abstract class o {
    static int a(RecyclerView.z zVar, l lVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.O() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.l0(view) - oVar.l0(view2)) + 1;
        }
        return Math.min(lVar.n(), lVar.d(view2) - lVar.g(view));
    }

    static int b(RecyclerView.z zVar, l lVar, View view, View view2, RecyclerView.o oVar, boolean z, boolean z2) {
        if (oVar.O() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (zVar.b() - Math.max(oVar.l0(view), oVar.l0(view2))) - 1) : Math.max(0, Math.min(oVar.l0(view), oVar.l0(view2)));
        if (z) {
            return Math.round((max * (Math.abs(lVar.d(view2) - lVar.g(view)) / (Math.abs(oVar.l0(view) - oVar.l0(view2)) + 1))) + (lVar.m() - lVar.g(view)));
        }
        return max;
    }

    static int c(RecyclerView.z zVar, l lVar, View view, View view2, RecyclerView.o oVar, boolean z) {
        if (oVar.O() == 0 || zVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zVar.b();
        }
        return (int) (((lVar.d(view2) - lVar.g(view)) / (Math.abs(oVar.l0(view) - oVar.l0(view2)) + 1)) * zVar.b());
    }
}
