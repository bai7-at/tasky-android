package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.o;

/* loaded from: classes.dex */
public abstract class a {
    public static final o a(o.a aVar) {
        return aVar.k();
    }

    public static final int b(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final int c(o oVar, int i) {
        return b(oVar.compareTo(a(o.b)) >= 0, l.f(i, l.b.a()));
    }
}
