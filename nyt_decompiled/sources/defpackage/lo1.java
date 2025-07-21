package defpackage;

import android.app.Application;
import defpackage.l95;

/* loaded from: classes4.dex */
public final class lo1 implements e9 {
    private final Application a;

    public lo1(Application application) {
        zq3.h(application, "context");
        this.a = application;
    }

    private final l95.a d(String str, String str2, String str3) {
        return new l95.a(ie6.ic_save, this.a.getString(cm6.articleSave), v95.a(this.a, "SAVE", str, str2, str3));
    }

    static /* synthetic */ l95.a e(lo1 lo1Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return lo1Var.d(str, str2, str3);
    }

    private final l95.a f(String str, String str2, String str3) {
        return new l95.a(ie6.ic_share, this.a.getString(wl6.action_share), v95.a(this.a, "SHARE", str, str2, str3));
    }

    static /* synthetic */ l95.a g(lo1 lo1Var, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return lo1Var.f(str, str2, str3);
    }

    @Override // defpackage.e9
    public void a(l95.e eVar, String str, String str2) {
        zq3.h(eVar, "builder");
        zq3.h(str, "url");
        eVar.b(g(this, null, str, str2, 1, null));
    }

    @Override // defpackage.e9
    public void b(l95.e eVar, String str) {
        zq3.h(eVar, "builder");
        zq3.h(str, "uri");
        eVar.b(e(this, str, null, null, 6, null));
    }

    @Override // defpackage.e9
    public void c(l95.e eVar, String str) {
        zq3.h(eVar, "builder");
        zq3.h(str, "url");
        eVar.b(e(this, null, str, null, 5, null));
    }
}
