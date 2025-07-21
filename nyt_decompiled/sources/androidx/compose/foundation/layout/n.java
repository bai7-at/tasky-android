package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import defpackage.fm1;
import defpackage.l37;
import defpackage.vo5;

/* loaded from: classes.dex */
public final class n extends Modifier.c implements vo5 {
    private Alignment.c n;

    public n(Alignment.c cVar) {
        this.n = cVar;
    }

    @Override // defpackage.vo5
    /* renamed from: e2, reason: merged with bridge method [inline-methods] */
    public l37 i(fm1 fm1Var, Object obj) {
        l37 l37Var = obj instanceof l37 ? (l37) obj : null;
        if (l37Var == null) {
            l37Var = new l37(0.0f, false, null, 7, null);
        }
        l37Var.d(f.a.b(this.n));
        return l37Var;
    }

    public final void f2(Alignment.c cVar) {
        this.n = cVar;
    }
}
