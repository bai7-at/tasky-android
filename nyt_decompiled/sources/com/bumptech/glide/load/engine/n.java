package com.bumptech.glide.load.engine;

import defpackage.ov3;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class n {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    n() {
    }

    private Map b(boolean z) {
        return z ? this.b : this.a;
    }

    i a(ov3 ov3Var, boolean z) {
        return (i) b(z).get(ov3Var);
    }

    void c(ov3 ov3Var, i iVar) {
        b(iVar.p()).put(ov3Var, iVar);
    }

    void d(ov3 ov3Var, i iVar) {
        Map b = b(iVar.p());
        if (iVar.equals(b.get(ov3Var))) {
            b.remove(ov3Var);
        }
    }
}
