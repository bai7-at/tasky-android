package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.e52;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class w87 {
    private final ET2Scope a;

    public w87(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    public final void a(s87 s87Var, boolean z, String str) {
        String str2;
        zq3.h(s87Var, "saveable");
        zq3.h(str, "section");
        ET2Scope eT2Scope = this.a;
        e52.e eVar = new e52.e();
        s42 s42Var = new s42(z ? "save" : "unsave", null, null, null, null, null, null, new y32(null, s87Var.getUri(), s87Var.getUrl(), null, null, null, 57, null), null, 382, null);
        String str3 = AssetConstants.ARTICLE_TYPE;
        if (!h.w(str, AssetConstants.ARTICLE_TYPE, true)) {
            str3 = "for you";
            if (!h.w(str, "for you", true)) {
                str3 = AppsFlyerProperties.CHANNEL;
                if (!h.w(str, AppsFlyerProperties.CHANNEL, true)) {
                    str3 = "saves hub";
                    if (!h.w(str, "saves hub", true)) {
                        str3 = "RV hub";
                        if (!h.w(str, "RV hub", true)) {
                            str2 = "section front";
                            ET2PageScope.DefaultImpls.a(eT2Scope, eVar, s42Var, new u32(null, str2, "tap", 1, null), null, 8, null);
                        }
                    }
                }
            }
        }
        str2 = str3;
        ET2PageScope.DefaultImpls.a(eT2Scope, eVar, s42Var, new u32(null, str2, "tap", 1, null), null, 8, null);
    }

    public final void b(s87 s87Var, String str, boolean z) {
        zq3.h(s87Var, "saveable");
        zq3.h(str, "section");
        a(s87Var, z, str);
    }
}
