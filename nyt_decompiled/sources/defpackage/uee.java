package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class uee extends hfe {
    final /* synthetic */ afe b;
    final /* synthetic */ dfe c;
    final /* synthetic */ qg8 d;
    final /* synthetic */ yee e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    uee(yee yeeVar, qg8 qg8Var, afe afeVar, dfe dfeVar, qg8 qg8Var2) {
        super(qg8Var);
        this.b = afeVar;
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
        String str3;
        try {
            ?? e = this.e.a.e();
            if (e == 0) {
                return;
            }
            yee yeeVar = this.e;
            str2 = yeeVar.b;
            afe afeVar = this.b;
            str3 = yeeVar.b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", afeVar.e());
            bundle.putString("adFieldEnifd", afeVar.f());
            bundle.putInt("layoutGravity", afeVar.c());
            bundle.putFloat("layoutVerticalMargin", afeVar.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", afeVar.d());
            bundle.putString("deeplinkUrl", null);
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (afeVar.g() != null) {
                bundle.putString("appId", afeVar.g());
            }
            e.L2(str2, bundle, new xee(this.e, this.c));
        } catch (RemoteException e2) {
            yee yeeVar2 = this.e;
            gfeVar = yee.c;
            str = yeeVar2.b;
            gfeVar.b(e2, "show overlay display from: %s", str);
            this.d.d(new RuntimeException(e2));
        }
    }
}
