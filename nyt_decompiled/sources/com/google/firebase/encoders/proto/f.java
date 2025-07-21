package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import defpackage.t39;
import defpackage.yd2;

/* loaded from: classes3.dex */
class f implements t39 {
    private boolean a = false;
    private boolean b = false;
    private yd2 c;
    private final d d;

    f(d dVar) {
        this.d = dVar;
    }

    private void a() {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    @Override // defpackage.t39
    public t39 b(String str) {
        a();
        this.d.h(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.t39
    public t39 c(boolean z) {
        a();
        this.d.n(this.c, z, this.b);
        return this;
    }

    void d(yd2 yd2Var, boolean z) {
        this.a = false;
        this.c = yd2Var;
        this.b = z;
    }
}
