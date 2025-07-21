package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.nytimes.android.eventtracker.context.PageContext;
import defpackage.e52;
import defpackage.e58;

/* loaded from: classes4.dex */
public final class xl1 {
    private final s52 a;
    private PageContext b;

    public xl1(s52 s52Var) {
        zq3.h(s52Var, "eventTrackerWrapper");
        this.a = s52Var;
    }

    public final void a(e58 e58Var) {
        zq3.h(e58Var, "event");
        if (e58Var instanceof e58.b) {
            c((e58.b) e58Var);
        } else if (e58Var instanceof e58.a) {
            b((e58.a) e58Var);
        } else if (e58Var instanceof e58.c) {
            d((e58.c) e58Var);
        }
    }

    public final void b(e58.a aVar) {
        zq3.h(aVar, "event");
        PageContext pageContext = this.b;
        if (pageContext != null) {
            this.a.a(pageContext, new e52.d(), new ue4(du8.a("eventData", new ue4(du8.a("pageType", aVar.c()))), du8.a("module", new ue4(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, aVar.b()), du8.a("label", aVar.a())))).a());
        }
    }

    public final void c(e58.b bVar) {
        zq3.h(bVar, "event");
        PageContext pageContext = this.b;
        if (pageContext != null) {
            this.a.a(pageContext, new e52.e(), new ue4(du8.a("eventData", new ue4(du8.a("pageType", bVar.f()), du8.a(TransferTable.COLUMN_TYPE, bVar.a()))), du8.a("module", new ue4(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, bVar.e()), du8.a("label", bVar.d()), du8.a("element", new ue4(du8.a(AuthenticationTokenClaims.JSON_KEY_NAME, bVar.c()), du8.a("label", bVar.b())))))).a());
        }
    }

    public final void d(e58.c cVar) {
        zq3.h(cVar, "event");
        PageContext pageContext = new PageContext(null, null, null, null, 0, 31, null);
        this.b = pageContext;
        this.a.a(pageContext, new e52.g(), new ue4(du8.a("native_app", new ue4(du8.a("asset", new ue4(du8.a("section", cVar.a()), du8.a(TransferTable.COLUMN_TYPE, cVar.b())))))).a());
    }
}
