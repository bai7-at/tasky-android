package androidx.compose.ui.text.font;

import defpackage.cn2;
import defpackage.dn2;
import defpackage.mm2;

/* loaded from: classes.dex */
public abstract class g {
    public static final d a(int i, o oVar, int i2, int i3) {
        return new u(i, oVar, i2, new dn2(new cn2[0]), i3, null);
    }

    public static /* synthetic */ d b(int i, o oVar, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            oVar = o.b.f();
        }
        if ((i4 & 4) != 0) {
            i2 = l.b.b();
        }
        if ((i4 & 8) != 0) {
            i3 = j.a.b();
        }
        return a(i, oVar, i2, i3);
    }

    public static final e c(d dVar) {
        return mm2.b(dVar);
    }
}
