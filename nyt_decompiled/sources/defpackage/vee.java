package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class vee extends hfe {
    final /* synthetic */ pee b;
    final /* synthetic */ dfe c;
    final /* synthetic */ qg8 d;
    final /* synthetic */ yee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    vee(yee yeeVar, qg8 qg8Var, pee peeVar, dfe dfeVar, qg8 qg8Var2) {
        super(qg8Var);
        this.b = peeVar;
        this.c = dfeVar;
        this.d = qg8Var2;
        this.e = yeeVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, xde] */
    @Override // defpackage.hfe
    protected final void a() {
        gfe gfeVar;
        String str;
        String str2;
        try {
            ?? e = this.e.a.e();
            if (e == 0) {
                return;
            }
            pee peeVar = this.b;
            str2 = this.e.b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", peeVar.b());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", peeVar.a());
            e.y1(bundle, new xee(this.e, this.c));
        } catch (RemoteException e2) {
            yee yeeVar = this.e;
            gfeVar = yee.c;
            str = yeeVar.b;
            gfeVar.b(e2, "dismiss overlay display from: %s", str);
            this.d.d(new RuntimeException(e2));
        }
    }
}
