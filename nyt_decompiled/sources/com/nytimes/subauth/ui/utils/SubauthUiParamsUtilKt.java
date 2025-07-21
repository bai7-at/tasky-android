package com.nytimes.subauth.ui.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration;
import com.nytimes.android.subauth.core.purr.directive.PurrEmailMarketingOptInUiDirective;
import com.nytimes.android.subauth.core.purr.directive.PurrShowCaliforniaNoticesUiDirective;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import com.nytimes.subauth.ui.models.SubauthUiParams;
import defpackage.hm6;
import defpackage.mm6;
import defpackage.ul8;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes4.dex */
public abstract class SubauthUiParamsUtilKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SubauthUserUIDebugAPI.OfferCheckboxOverrideState.values().length];
            try {
                iArr[SubauthUserUIDebugAPI.OfferCheckboxOverrideState.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.OfferCheckboxOverrideState.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.OfferCheckboxOverrideState.UNCHECKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubauthUserUIDebugAPI.OfferCheckboxOverrideState.DO_NOT_DISPLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[SubauthUserUIDebugAPI.SSOActionOverrideState.values().length];
            try {
                iArr2[SubauthUserUIDebugAPI.SSOActionOverrideState.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_REGISTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LINKED_REGILITE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            b = iArr2;
            int[] iArr3 = new int[SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState.values().length];
            try {
                iArr3[SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState.NO_OVERRIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState.HIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    private static final SubauthUiParams a(SubauthUiParams subauthUiParams, Context context, SharedPreferences sharedPreferences) {
        SubauthUiParams a2;
        SubauthUiParams a3;
        int i = a.c[f(sharedPreferences, context).ordinal()];
        if (i == 1) {
            return subauthUiParams;
        }
        if (i == 2) {
            a2 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : true, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : false, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : false, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : null);
            return a2;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        a3 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : false, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : false, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : false, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : null);
        return a3;
    }

    private static final SubauthUiParams b(SubauthUiParams subauthUiParams, Context context, SharedPreferences sharedPreferences) {
        SubauthUiParams a2;
        SubauthUiParams a3;
        SubauthUiParams a4;
        int i = a.a[i(sharedPreferences, context).ordinal()];
        if (i == 1) {
            return subauthUiParams;
        }
        if (i == 2) {
            a2 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : false, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : true, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : true, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : null);
            return a2;
        }
        if (i == 3) {
            a3 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : false, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : true, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : false, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : null);
            return a3;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        a4 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : false, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : false, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : false, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : null);
        return a4;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.nytimes.subauth.ui.models.SubauthUiParams r16, com.nytimes.android.subauth.core.purr.a r17, com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider r18, defpackage.by0 r19) {
        /*
            r0 = r19
            boolean r1 = r0 instanceof com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt$applyPurrToSubauthUserUI$1
            if (r1 == 0) goto L15
            r1 = r0
            com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt$applyPurrToSubauthUserUI$1 r1 = (com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt$applyPurrToSubauthUserUI$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt$applyPurrToSubauthUserUI$1 r1 = new com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt$applyPurrToSubauthUserUI$1
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.h()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L34
            java.lang.Object r2 = r1.L$1
            com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider r2 = (com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider) r2
            java.lang.Object r1 = r1.L$0
            com.nytimes.subauth.ui.models.SubauthUiParams r1 = (com.nytimes.subauth.ui.models.SubauthUiParams) r1
            kotlin.f.b(r0)
            r3 = r1
            goto L55
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            kotlin.f.b(r0)
            r0 = r16
            r1.L$0 = r0
            r3 = r18
            r1.L$1 = r3
            r1.label = r4
            r4 = r17
            java.lang.Object r1 = r4.a(r1)
            if (r1 != r2) goto L52
            return r2
        L52:
            r2 = r3
            r3 = r0
            r0 = r1
        L55:
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r0 = (com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration) r0
            com.nytimes.android.subauth.core.purr.directive.PrivacyConfiguration r0 = r2.applyOverrides(r0)
            boolean r4 = h(r0)
            boolean r6 = j(r0)
            boolean r7 = g(r0)
            r14 = 1010(0x3f2, float:1.415E-42)
            r15 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            com.nytimes.subauth.ui.models.SubauthUiParams r0 = com.nytimes.subauth.ui.models.SubauthUiParams.b(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.subauth.ui.utils.SubauthUiParamsUtilKt.c(com.nytimes.subauth.ui.models.SubauthUiParams, com.nytimes.android.subauth.core.purr.a, com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider, by0):java.lang.Object");
    }

    private static final SubauthUiParams d(SubauthUiParams subauthUiParams, Context context, SharedPreferences sharedPreferences) {
        SubauthUiParams a2;
        SubauthUiParams a3;
        SubauthUiParams a4;
        int i = a.b[k(sharedPreferences, context).ordinal()];
        if (i == 1) {
            return subauthUiParams;
        }
        if (i == 2) {
            a2 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : false, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : false, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : false, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LOGIN);
            return a2;
        }
        if (i == 3) {
            a3 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : false, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : false, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : false, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_REGISTER);
            return a3;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        a4 = subauthUiParams.a((r22 & 1) != 0 ? subauthUiParams.showCaliforniaNotices : false, (r22 & 2) != 0 ? subauthUiParams.isForceLogin : false, (r22 & 4) != 0 ? subauthUiParams.showOfferCheckbox : false, (r22 & 8) != 0 ? subauthUiParams.isOfferCheckboxChecked : false, (r22 & 16) != 0 ? subauthUiParams.regiInterface : null, (r22 & 32) != 0 ? subauthUiParams.enableLIRENetworkDelay : false, (r22 & 64) != 0 ? subauthUiParams.shouldShowEmailSupportButton : false, (r22 & 128) != 0 ? subauthUiParams.lireErrorStateOverride : null, (r22 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? subauthUiParams.deleteAccountStateOverride : null, (r22 & 512) != 0 ? subauthUiParams.ssoActionOverride : SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LINKED_REGILITE);
        return a4;
    }

    public static final SubauthUiParams e(SubauthUiParams subauthUiParams, Context context, SharedPreferences sharedPreferences) {
        zq3.h(subauthUiParams, "<this>");
        zq3.h(context, "context");
        zq3.h(sharedPreferences, "prefs");
        return d(a(b(subauthUiParams, context, sharedPreferences), context, sharedPreferences), context, sharedPreferences);
    }

    private static final SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState f(SharedPreferences sharedPreferences, Context context) {
        SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState californiaNoticeOverrideState = null;
        String string = sharedPreferences.getString(context.getString(mm6.subauthPrivacyNoticePref), null);
        if (string != null) {
            SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState[] values = SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState californiaNoticeOverrideState2 = values[i];
                if (zq3.c(californiaNoticeOverrideState2.name(), string)) {
                    californiaNoticeOverrideState = californiaNoticeOverrideState2;
                    break;
                }
                i++;
            }
            if (californiaNoticeOverrideState != null) {
                return californiaNoticeOverrideState;
            }
        }
        return SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState.NO_OVERRIDE;
    }

    private static final boolean g(PrivacyConfiguration privacyConfiguration) {
        PurrEmailMarketingOptInUiDirective purrEmailMarketingOptInUiDirective = (PurrEmailMarketingOptInUiDirective) privacyConfiguration.getDirective(PurrEmailMarketingOptInUiDirective.class);
        if (purrEmailMarketingOptInUiDirective != null) {
            return purrEmailMarketingOptInUiDirective.getValue() == EmailMarketingOptInDirectiveValue.CHECKED;
        }
        ul8.a.d("Email Marketing Opt In directive not found", new Object[0]);
        return false;
    }

    private static final boolean h(PrivacyConfiguration privacyConfiguration) {
        PurrShowCaliforniaNoticesUiDirective purrShowCaliforniaNoticesUiDirective = (PurrShowCaliforniaNoticesUiDirective) privacyConfiguration.getDirective(PurrShowCaliforniaNoticesUiDirective.class);
        if (purrShowCaliforniaNoticesUiDirective != null) {
            return purrShowCaliforniaNoticesUiDirective.getValue() == ToggleableDirectiveValue.SHOW;
        }
        ul8.a.d("California Notices directive not found", new Object[0]);
        return false;
    }

    private static final SubauthUserUIDebugAPI.OfferCheckboxOverrideState i(SharedPreferences sharedPreferences, Context context) {
        SubauthUserUIDebugAPI.OfferCheckboxOverrideState offerCheckboxOverrideState = null;
        String string = sharedPreferences.getString(context.getString(mm6.subauthOfferCheckboxPref), null);
        if (string != null) {
            SubauthUserUIDebugAPI.OfferCheckboxOverrideState[] values = SubauthUserUIDebugAPI.OfferCheckboxOverrideState.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                SubauthUserUIDebugAPI.OfferCheckboxOverrideState offerCheckboxOverrideState2 = values[i];
                if (zq3.c(offerCheckboxOverrideState2.name(), string)) {
                    offerCheckboxOverrideState = offerCheckboxOverrideState2;
                    break;
                }
                i++;
            }
            if (offerCheckboxOverrideState != null) {
                return offerCheckboxOverrideState;
            }
        }
        return SubauthUserUIDebugAPI.OfferCheckboxOverrideState.NO_OVERRIDE;
    }

    private static final boolean j(PrivacyConfiguration privacyConfiguration) {
        PurrEmailMarketingOptInUiDirective purrEmailMarketingOptInUiDirective = (PurrEmailMarketingOptInUiDirective) privacyConfiguration.getDirective(PurrEmailMarketingOptInUiDirective.class);
        if (purrEmailMarketingOptInUiDirective != null) {
            return purrEmailMarketingOptInUiDirective.getValue() != EmailMarketingOptInDirectiveValue.DO_NOT_DISPLAY;
        }
        ul8.a.d("Email Marketing Opt In directive not found", new Object[0]);
        return false;
    }

    private static final SubauthUserUIDebugAPI.SSOActionOverrideState k(SharedPreferences sharedPreferences, Context context) {
        String string = sharedPreferences.getString(context.getString(hm6.subauth_sso_action_key), "");
        return zq3.c(string, context.getString(hm6.subauth_sso_action_login)) ? SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LOGIN : zq3.c(string, context.getString(hm6.subauth_sso_action_register)) ? SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_REGISTER : zq3.c(string, context.getString(hm6.subauth_sso_action_regilite)) ? SubauthUserUIDebugAPI.SSOActionOverrideState.ACTION_LINKED_REGILITE : SubauthUserUIDebugAPI.SSOActionOverrideState.NO_OVERRIDE;
    }
}
