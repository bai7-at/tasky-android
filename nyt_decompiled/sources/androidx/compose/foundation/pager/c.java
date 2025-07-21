package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.h;
import defpackage.kn5;
import defpackage.kt2;
import defpackage.ss2;

/* loaded from: classes.dex */
final class c extends LazyLayoutIntervalContent {
    private final kt2 a;
    private final ss2 b;
    private final int c;
    private final androidx.compose.foundation.lazy.layout.a d;

    public c(kt2 kt2Var, ss2 ss2Var, int i) {
        this.a = kt2Var;
        this.b = ss2Var;
        this.c = i;
        h hVar = new h();
        hVar.c(i, new kn5(ss2Var, kt2Var));
        this.d = hVar;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    public androidx.compose.foundation.lazy.layout.a h() {
        return this.d;
    }
}
