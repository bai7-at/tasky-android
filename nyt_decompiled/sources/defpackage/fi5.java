package defpackage;

import io.opentelemetry.sdk.trace.i;

/* loaded from: classes5.dex */
public final class fi5 {
    private sx0 a = sx0.a();
    private i b;
    private jd7 c;
    private bd7 d;

    fi5() {
    }

    public ei5 a() {
        i iVar = this.b;
        if (iVar == null) {
            iVar = i.h().c();
        }
        jd7 jd7Var = this.c;
        if (jd7Var == null) {
            jd7Var = jd7.i().a();
        }
        bd7 bd7Var = this.d;
        if (bd7Var == null) {
            bd7Var = bd7.h().c();
        }
        return new ei5(iVar, jd7Var, bd7Var, this.a);
    }

    public fi5 b(bd7 bd7Var) {
        this.d = bd7Var;
        return this;
    }

    public fi5 c(i iVar) {
        this.b = iVar;
        return this;
    }
}
