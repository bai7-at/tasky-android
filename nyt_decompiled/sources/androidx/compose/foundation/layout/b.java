package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import defpackage.fm1;
import defpackage.vo5;

/* loaded from: classes.dex */
final class b extends Modifier.c implements vo5 {
    private Alignment n;
    private boolean r;

    public b(Alignment alignment, boolean z) {
        this.n = alignment;
        this.r = z;
    }

    public final Alignment e2() {
        return this.n;
    }

    public final boolean f2() {
        return this.r;
    }

    @Override // defpackage.vo5
    /* renamed from: g2, reason: merged with bridge method [inline-methods] */
    public b i(fm1 fm1Var, Object obj) {
        return this;
    }

    public final void h2(Alignment alignment) {
        this.n = alignment;
    }

    public final void i2(boolean z) {
        this.r = z;
    }
}
