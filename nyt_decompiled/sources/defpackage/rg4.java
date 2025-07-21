package defpackage;

import androidx.compose.ui.layout.IntrinsicMinMax;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface rg4 {

    public static final class a {
        public static int a(rg4 rg4Var, yq3 yq3Var, List list, int i) {
            return rg4.super.g(yq3Var, list, i);
        }

        public static int b(rg4 rg4Var, yq3 yq3Var, List list, int i) {
            return rg4.super.a(yq3Var, list, i);
        }

        public static int c(rg4 rg4Var, yq3 yq3Var, List list, int i) {
            return rg4.super.i(yq3Var, list, i);
        }

        public static int d(rg4 rg4Var, yq3 yq3Var, List list, int i) {
            return rg4.super.e(yq3Var, list, i);
        }
    }

    default int a(yq3 yq3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bi1((xq3) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), arrayList, iv0.b(0, 0, 0, i, 7, null)).getWidth();
    }

    sg4 d(f fVar, List list, long j);

    default int e(yq3 yq3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bi1((xq3) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), arrayList, iv0.b(0, 0, 0, i, 7, null)).getWidth();
    }

    default int g(yq3 yq3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bi1((xq3) list.get(i2), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), arrayList, iv0.b(0, i, 0, 0, 13, null)).getHeight();
    }

    default int i(yq3 yq3Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new bi1((xq3) list.get(i2), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return d(new androidx.compose.ui.layout.a(yq3Var, yq3Var.getLayoutDirection()), arrayList, iv0.b(0, i, 0, 0, 13, null)).getHeight();
    }
}
