package defpackage;

import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2SimpleScope;
import defpackage.e52;
import defpackage.q96;

/* loaded from: classes4.dex */
public final class q86 {
    private final ET2SimpleScope a;

    public q86(ET2SimpleScope eT2SimpleScope) {
        zq3.h(eT2SimpleScope, "et2Scope");
        this.a = eT2SimpleScope;
    }

    private final void b(q96.a aVar) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.d(), new ue4(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, aVar.b()), du8.a("label", aVar.a())), null, null, 12, null);
    }

    private final void c(q96.b bVar) {
        ET2PageScope.DefaultImpls.a(this.a, new e52.e(), new ue4(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, bVar.b()), du8.a("label", bVar.a()), du8.a("element", new ue4(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, bVar.c()), du8.a("label", bVar.c())))), null, null, 12, null);
    }

    public final void a(q96 q96Var) {
        zq3.h(q96Var, "event");
        if (q96Var instanceof q96.a) {
            b((q96.a) q96Var);
        } else if (q96Var instanceof q96.b) {
            c((q96.b) q96Var);
        }
    }
}
