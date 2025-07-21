package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import defpackage.d35;
import defpackage.dg4;
import defpackage.ez3;
import defpackage.fd5;
import defpackage.g35;

/* loaded from: classes.dex */
public abstract class b {
    private static final a a = new a();

    public static final class a implements d35 {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, LayoutNode layoutNode) {
        long e = ez3.e(layoutNode.l());
        int d = dg4.d(fd5.o(e));
        int d2 = dg4.d(fd5.p(e));
        view.layout(d, d2, view.getMeasuredWidth() + d, view.getMeasuredHeight() + d2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i) {
        return i * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f) {
        return f * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i) {
        return i == 0 ? g35.a.a() : g35.a.b();
    }
}
