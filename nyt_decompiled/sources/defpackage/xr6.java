package defpackage;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e52;

/* loaded from: classes4.dex */
public final class xr6 {
    private final ET2Scope a;

    public xr6(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final void a(z18 z18Var) {
        zq3.h(z18Var, "asset");
        b(z18Var.o(), Asset.Companion.generateUri(z18Var.e(), z18Var.c()));
    }

    public final void b(String str, String str2) {
        zq3.h(str2, "uri");
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new s42("asset tap", null, null, null, null, null, null, new y32(null, str2, str, null, null, null, 57, null), null, 382, null), new u32(null, "section front", "tap", 1, null), null, 8, null);
    }
}
