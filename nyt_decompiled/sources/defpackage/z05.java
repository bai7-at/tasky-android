package defpackage;

import android.content.Context;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.base.group.DevSettingGroupExpandable;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.devsettings.purr.directive.PurrCacheDevSettings;
import com.nytimes.android.subauth.devsettings.purr.directive.PurrDirectiveDevSettings;
import com.nytimes.android.subauth.devsettings.purr.env.PurrCCPADevSettings;
import com.nytimes.android.subauth.devsettings.purr.env.PurrEnvDevSettings;
import com.nytimes.android.subauth.devsettings.purr.tcf.PurrTCFDevSettings;
import kotlin.collections.b0;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class z05 {
    public static final z05 a = new z05();

    private z05() {
    }

    public final wn1 a(a aVar, PurrDirectiveOverrider purrDirectiveOverrider, Context context) {
        zq3.h(aVar, "purrManager");
        zq3.h(purrDirectiveOverrider, "purrDirectiveOverrider");
        zq3.h(context, "context");
        PurrDirectiveDevSettings purrDirectiveDevSettings = PurrDirectiveDevSettings.a;
        un1 b = purrDirectiveDevSettings.b(aVar, purrDirectiveOverrider, context, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        un1 e = purrDirectiveDevSettings.e("2");
        PurrCacheDevSettings purrCacheDevSettings = PurrCacheDevSettings.a;
        return new DevSettingGroupExpandable("Privacy Dev Settings", i.X0(b0.j(b, e, purrCacheDevSettings.b(aVar, "3"), purrCacheDevSettings.c(context, aVar, "4"), m96.a.a("5"), PurrCCPADevSettings.a.a(aVar, "6"))), null, false, r41.a.a(), null, false, false, 236, null);
    }

    public final wn1 b(a aVar, Context context) {
        zq3.h(aVar, "purrManager");
        zq3.h(context, "context");
        PurrEnvDevSettings purrEnvDevSettings = PurrEnvDevSettings.a;
        un1 c = purrEnvDevSettings.c(context, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        un1 d = purrEnvDevSettings.d(context, aVar, "2");
        un1 b = purrEnvDevSettings.b(aVar, "3");
        h96 h96Var = h96.a;
        return new DevSettingGroupExpandable("Privacy Env Dev Settings", i.X0(b0.j(c, d, b, h96Var.e(context, "4"), h96Var.d(context, "5"), h96Var.c("6"), h96Var.b("7"), h96Var.a("8"), h96Var.f(context, "9"))), null, false, r41.a.a(), null, false, false, 236, null);
    }

    public final wn1 c(a aVar, Context context) {
        zq3.h(aVar, "purrManager");
        zq3.h(context, "context");
        PurrTCFDevSettings purrTCFDevSettings = PurrTCFDevSettings.a;
        return new DevSettingGroupExpandable("TCF Dev Settings", i.X0(b0.j(purrTCFDevSettings.h(context, aVar, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), purrTCFDevSettings.g(context, aVar, "2"), purrTCFDevSettings.e(context, aVar, "3"), purrTCFDevSettings.f(context, aVar, "4"), purrTCFDevSettings.c(context, aVar, "5"), purrTCFDevSettings.d(context, aVar, "6"))), null, false, r41.a.a(), null, false, false, 236, null);
    }
}
