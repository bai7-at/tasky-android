package dev.chrisbanes.snapper;

import defpackage.g14;
import defpackage.iw7;
import defpackage.zq3;

/* loaded from: classes4.dex */
final class a extends iw7 {
    private final g14 a;

    public a(g14 g14Var) {
        zq3.h(g14Var, "lazyListItem");
        this.a = g14Var;
    }

    @Override // defpackage.iw7
    public int a() {
        return this.a.getIndex();
    }

    @Override // defpackage.iw7
    public int b() {
        return this.a.b();
    }

    @Override // defpackage.iw7
    public int c() {
        return this.a.a();
    }
}
