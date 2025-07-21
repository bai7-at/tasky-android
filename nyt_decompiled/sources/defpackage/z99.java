package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
abstract class z99 {

    static class a {
        static int a(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        static void b(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    static void a(ViewGroup viewGroup, boolean z) {
        a.b(viewGroup, z);
    }
}
