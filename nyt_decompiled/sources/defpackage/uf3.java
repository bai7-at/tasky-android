package defpackage;

import androidx.compose.ui.graphics.colorspace.c;
import androidx.compose.ui.graphics.colorspace.e;

/* loaded from: classes.dex */
public abstract class uf3 {
    public static final sf3 a(int i, int i2, int i3, boolean z, c cVar) {
        return AbstractC0565if.a(i, i2, i3, z, cVar);
    }

    public static /* synthetic */ sf3 b(int i, int i2, int i3, boolean z, c cVar, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = tf3.b.b();
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            cVar = e.a.w();
        }
        return a(i, i2, i3, z, cVar);
    }
}
