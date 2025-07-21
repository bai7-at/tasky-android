package defpackage;

import android.content.Context;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e52;

/* loaded from: classes2.dex */
public final class qd4 {
    private final jc a;
    private final ET2Scope b;

    public qd4(jc jcVar, ET2Scope eT2Scope) {
        zq3.h(jcVar, "analyticsClient");
        zq3.h(eT2Scope, "et2Scope");
        this.a = jcVar;
        this.b = eT2Scope;
    }

    public final void a(Context context, de4 de4Var, boolean z) {
        zq3.h(context, "context");
        zq3.h(de4Var, "tabFactory");
        if (z) {
            int h = this.a.h();
            if (h == 0) {
                this.a.s("Background");
            } else {
                if (h != 2) {
                    return;
                }
                jc jcVar = this.a;
                String string = context.getString(de4Var.f().e());
                zq3.g(string, "getString(...)");
                jcVar.A(string);
            }
        }
    }

    public final void b(String str) {
        zq3.h(str, "currentTab");
        ET2PageScope.DefaultImpls.a(this.b, new e52.e(), new s42("return to top", null, null, null, null, null, null, null, null, 510, null), new u32(null, str, "tap", 1, null), null, 8, null);
    }

    public final void c(de4 de4Var, String str) {
        zq3.h(de4Var, "tabFactory");
        zq3.h(str, "previousTab");
        ET2PageScope.DefaultImpls.a(this.b, new e52.e(), new s42("tab tap", null, null, null, null, null, null, new y32(null, null, null, de4Var.c(), null, null, 55, null), null, 382, null), new u32(null, str, "tap", 1, null), null, 8, null);
    }

    public final void d(String str) {
        zq3.h(str, "numOfUpdate");
        ET2PageScope.DefaultImpls.a(this.b, new e52.d(), new s42("interests-tab-badge", str, "bottom-bar", null, null, null, null, null, "navigation", 248, null), null, null, 12, null);
    }
}
