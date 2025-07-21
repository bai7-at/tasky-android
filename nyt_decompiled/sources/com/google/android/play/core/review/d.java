package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.n6f;
import defpackage.qg8;
import defpackage.r8f;
import defpackage.s8f;

/* loaded from: classes3.dex */
final class d extends s8f {
    final /* synthetic */ qg8 b;
    final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, qg8 qg8Var, qg8 qg8Var2) {
        super(qg8Var);
        this.c = gVar;
        this.b = qg8Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, dtd] */
    @Override // defpackage.s8f
    protected final void a() {
        n6f n6fVar;
        String str;
        String str2;
        String str3;
        try {
            ?? e = this.c.a.e();
            str2 = this.c.b;
            Bundle a = r8f.a();
            g gVar = this.c;
            qg8 qg8Var = this.b;
            str3 = gVar.b;
            e.q5(str2, a, new f(gVar, qg8Var, str3));
        } catch (RemoteException e2) {
            n6fVar = g.c;
            str = this.c.b;
            n6fVar.c(e2, "error requesting in-app review for %s", str);
            this.b.d(new RuntimeException(e2));
        }
    }
}
