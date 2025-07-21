package io.opentelemetry.sdk.trace;

import defpackage.gp8;
import defpackage.lm3;
import defpackage.lp8;
import defpackage.vx7;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class g implements gp8 {
    private final l a;
    private final lm3 b;

    g(l lVar, lm3 lm3Var) {
        this.a = lVar;
        this.b = lm3Var;
    }

    @Override // defpackage.gp8
    public vx7 a(String str) {
        if (str == null || str.trim().isEmpty()) {
            str = "<unspecified span name>";
        }
        if (this.a.g()) {
            return lp8.a().get(this.b.e()).a(str);
        }
        lm3 lm3Var = this.b;
        l lVar = this.a;
        return new f(str, lm3Var, lVar, lVar.f());
    }
}
