package com.nytimes.android.subauth.core.devsettings;

import android.content.Context;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import defpackage.hm6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class a {
    public static final a a = new a();

    private a() {
    }

    public final SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS a(Context context, String str) {
        zq3.h(context, "context");
        return zq3.c(str, context.getString(hm6.subauth_custom_nyts_login_success)) ? SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.SUCCESS : zq3.c(str, context.getString(hm6.subauth_custom_nyts_login_success_with_delay)) ? SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.SUCCESS_WITH_DELAY : zq3.c(str, context.getString(hm6.subauth_custom_nyts_login_failure)) ? SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.FAILURE : zq3.c(str, context.getString(hm6.subauth_custom_nyts_login_failure_with_delay)) ? SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.FAILURE_WITH_DELAY : SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.NO_OVERRIDE;
    }
}
