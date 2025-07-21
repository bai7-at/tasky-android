package com.nytimes.subauth.ui.providers;

import android.content.Context;
import androidx.preference.g;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import defpackage.hm6;
import defpackage.kt2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class CustomLoginWithNYTSProvider {
    private static kt2 b;
    public static final CustomLoginWithNYTSProvider a = new CustomLoginWithNYTSProvider();
    private static SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS c = SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.NO_OVERRIDE;
    public static final int d = 8;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.values().length];
            try {
                iArr[SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.FAILURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.FAILURE_WITH_DELAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.SUCCESS_WITH_DELAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    private CustomLoginWithNYTSProvider() {
    }

    public final void a(Context context) {
        zq3.h(context, "context");
        c = com.nytimes.android.subauth.core.devsettings.a.a.a(context, g.b(context).getString(context.getString(hm6.subauth_custom_nyts_login_override_key), null));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, final defpackage.ss2 r7, final defpackage.gt2 r8, defpackage.by0 r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.providers.CustomLoginWithNYTSProvider.b(java.lang.String, ss2, gt2, by0):java.lang.Object");
    }

    public final boolean c() {
        return (b == null && c == SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS.NO_OVERRIDE) ? false : true;
    }

    public final void d(kt2 kt2Var) {
        b = kt2Var;
    }

    public final void e(SubauthUserUIDebugAPI.OverrideCustomLoginWithNYTS overrideCustomLoginWithNYTS) {
        zq3.h(overrideCustomLoginWithNYTS, TransferTable.COLUMN_STATE);
        c = overrideCustomLoginWithNYTS;
    }
}
