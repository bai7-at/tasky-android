package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* loaded from: classes3.dex */
final class wee extends hfe {
    final /* synthetic */ ffe b;
    final /* synthetic */ int c;
    final /* synthetic */ dfe d;
    final /* synthetic */ qg8 e;
    final /* synthetic */ yee f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    wee(yee yeeVar, qg8 qg8Var, ffe ffeVar, int i, dfe dfeVar, qg8 qg8Var2) {
        super(qg8Var);
        this.b = ffeVar;
        this.c = i;
        this.d = dfeVar;
        this.e = qg8Var2;
        this.f = yeeVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, xde] */
    @Override // defpackage.hfe
    protected final void a() {
        gfe gfeVar;
        String str;
        String str2;
        try {
            ?? e = this.f.a.e();
            if (e == 0) {
                return;
            }
            ffe ffeVar = this.b;
            str2 = this.f.b;
            int i = this.c;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", ffeVar.b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", ffeVar.a());
            e.M0(bundle, new xee(this.f, this.d));
        } catch (RemoteException e2) {
            int i2 = this.c;
            gfeVar = yee.c;
            Integer valueOf = Integer.valueOf(i2);
            str = this.f.b;
            gfeVar.b(e2, "switchDisplayMode overlay display to %d from: %s", valueOf, str);
            this.e.d(new RuntimeException(e2));
        }
    }
}
