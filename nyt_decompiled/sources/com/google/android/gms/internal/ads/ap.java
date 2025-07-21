package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.a7g;
import defpackage.fhe;
import defpackage.ndf;
import defpackage.wad;

/* loaded from: classes3.dex */
public final class ap {
    private final xm a;

    public ap(Context context, o6 o6Var) {
        this.a = new xm(context, o6Var);
    }

    public final ap a(final ndf ndfVar) {
        xm xmVar = this.a;
        wad.f(!xmVar.q);
        ndfVar.getClass();
        xmVar.f = new fhe() { // from class: d9f
            @Override // defpackage.fhe
            public final Object zza() {
                return ndf.this;
            }
        };
        return this;
    }

    public final ap b(final a7g a7gVar) {
        xm xmVar = this.a;
        wad.f(!xmVar.q);
        a7gVar.getClass();
        xmVar.e = new fhe() { // from class: l9f
            @Override // defpackage.fhe
            public final Object zza() {
                return a7g.this;
            }
        };
        return this;
    }

    public final bp c() {
        xm xmVar = this.a;
        wad.f(!xmVar.q);
        xmVar.q = true;
        return new bp(xmVar);
    }
}
