package androidx.compose.foundation.text;

import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fi8;
import defpackage.fm1;
import defpackage.zq3;

/* loaded from: classes.dex */
final class d {
    private LayoutDirection a;
    private fm1 b;
    private e.b c;
    private j d;
    private Object e;
    private long f = a();

    public d(LayoutDirection layoutDirection, fm1 fm1Var, e.b bVar, j jVar, Object obj) {
        this.a = layoutDirection;
        this.b = fm1Var;
        this.c = bVar;
        this.d = jVar;
        this.e = obj;
    }

    private final long a() {
        return fi8.b(this.d, this.b, this.c, null, 0, 24, null);
    }

    public final long b() {
        return this.f;
    }

    public final void c(LayoutDirection layoutDirection, fm1 fm1Var, e.b bVar, j jVar, Object obj) {
        if (layoutDirection == this.a && zq3.c(fm1Var, this.b) && zq3.c(bVar, this.c) && zq3.c(jVar, this.d) && zq3.c(obj, this.e)) {
            return;
        }
        this.a = layoutDirection;
        this.b = fm1Var;
        this.c = bVar;
        this.d = jVar;
        this.e = obj;
        this.f = a();
    }
}
