package com.bumptech.glide.load.engine;

import defpackage.b12;
import defpackage.rr1;
import defpackage.sk5;
import java.io.File;

/* loaded from: classes2.dex */
class d implements rr1.b {
    private final b12 a;
    private final Object b;
    private final sk5 c;

    d(b12 b12Var, Object obj, sk5 sk5Var) {
        this.a = b12Var;
        this.b = obj;
        this.c = sk5Var;
    }

    @Override // rr1.b
    public boolean a(File file) {
        return this.a.b(this.b, file, this.c);
    }
}
