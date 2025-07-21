package io.opentelemetry.sdk.trace;

import defpackage.gp8;
import defpackage.hv;
import defpackage.jp8;
import defpackage.pr0;

/* loaded from: classes5.dex */
class h implements jp8 {
    private final pr0 a;
    private final String b;
    private String c;
    private String d;

    h(pr0 pr0Var, String str) {
        this.a = pr0Var;
        this.b = str;
    }

    @Override // defpackage.jp8
    public jp8 a(String str) {
        this.c = str;
        return this;
    }

    @Override // defpackage.jp8
    public gp8 build() {
        return (gp8) this.a.j(this.b, this.c, this.d, hv.d());
    }
}
