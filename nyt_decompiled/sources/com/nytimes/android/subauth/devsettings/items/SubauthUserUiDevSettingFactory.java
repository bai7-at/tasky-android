package com.nytimes.android.subauth.devsettings.items;

import android.content.Context;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.nytimes.android.devsettings.base.composables.DevSettingUI;
import com.nytimes.android.devsettings.base.group.DevSettingPreferenceGroupExpandable;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItemKt;
import com.nytimes.android.subauth.core.devsettings.SubauthUserUIDebugAPI;
import com.nytimes.android.subauth.core.devsettings.a;
import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride;
import com.nytimes.android.subauth.core.di.DataStoreKt;
import defpackage.ao1;
import defpackage.cc6;
import defpackage.gt2;
import defpackage.hm6;
import defpackage.un1;
import defpackage.ww8;
import defpackage.yn1;
import defpackage.zn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.d;

/* loaded from: classes4.dex */
public final class SubauthUserUiDevSettingFactory {
    public static final SubauthUserUiDevSettingFactory a = new SubauthUserUiDevSettingFactory();

    private SubauthUserUiDevSettingFactory() {
    }

    private final un1 c(Context context) {
        DevSettingSwitchItem a2;
        String string = context.getString(hm6.subauth_override_delete_account_usecase);
        zq3.g(string, "getString(...)");
        a2 = DevSettingSwitchItemKt.a("Toggle Account Delete Use Case", (r23 & 2) != 0 ? null : "DEBUG use case enabled", (r23 & 4) != 0 ? null : "MAIN use case enabled", string, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : new yn1.b("Subauth-User UI - Account Delete"), (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Toggle Account Delete Use Case" : null, (r23 & 512) != 0 ? null : new SubauthUserUiDevSettingFactory$accountDeleteDebugUseCaseOverride$1(DataStoreKt.a(context), string, null));
        return a2;
    }

    private final DevSettingPreferenceGroupExpandable d(String str, List list, final SubauthUserUIDebugAPI subauthUserUIDebugAPI, final Context context) {
        return new DevSettingChoiceListPreferenceItem("Override Account Delete State. Changing the Account delete state will change the resulting action in the Delete Account flow", str, list, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserUiDevSettingFactory$accountDeleteStateOverride$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                DeleteAccountStatusOverride g;
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                SubauthUserUIDebugAPI subauthUserUIDebugAPI2 = SubauthUserUIDebugAPI.this;
                g = SubauthUserUiDevSettingFactory.a.g(context, zn1Var.getPrefValue());
                subauthUserUIDebugAPI2.f(g);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-User UI - Account Delete"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false, 392, null).j(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeleteAccountStatusOverride g(Context context, String str) {
        return zq3.c(str, context.getString(hm6.subauth_no_override)) ? DeleteAccountStatusOverride.NoOverride : zq3.c(str, context.getString(hm6.subauth_override_delete_account_state_success)) ? DeleteAccountStatusOverride.Success : zq3.c(str, context.getString(hm6.subauth_override_delete_account_state_existing_p1_user)) ? DeleteAccountStatusOverride.Error_Existing_P1_User : zq3.c(str, context.getString(hm6.subauth_override_delete_account_state_existing_p3_user)) ? DeleteAccountStatusOverride.Error_Existing_P3_User : zq3.c(str, context.getString(hm6.subauth_override_delete_account_state_error_anon_user)) ? DeleteAccountStatusOverride.Error_Anon_User : zq3.c(str, context.getString(hm6.subauth_override_delete_account_state_error_missing_cookies)) ? DeleteAccountStatusOverride.Error_Missing_Cookies : zq3.c(str, context.getString(hm6.subauth_override_delete_account_state_error_server)) ? DeleteAccountStatusOverride.Error_Server : zq3.c(str, context.getString(hm6.subauth_override_delete_account_state_error_unknown)) ? DeleteAccountStatusOverride.Error_Unknown : DeleteAccountStatusOverride.NoOverride;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LIREErrorStateOverride h(Context context, String str) {
        return zq3.c(str, context.getString(hm6.subauth_no_override)) ? LIREErrorStateOverride.NoOverride : zq3.c(str, context.getString(hm6.subauth_override_error_state_email_first)) ? LIREErrorStateOverride.EmailFirstUnknownError : zq3.c(str, context.getString(hm6.subauth_override_error_state_login)) ? LIREErrorStateOverride.LoginUnknownError : zq3.c(str, context.getString(hm6.subauth_override_error_state_register)) ? LIREErrorStateOverride.RegistrationUnknownError : zq3.c(str, context.getString(hm6.subauth_override_error_state_facebook_sso)) ? LIREErrorStateOverride.FacebookSSOUnknownError : zq3.c(str, context.getString(hm6.subauth_override_error_state_google_sso)) ? LIREErrorStateOverride.GoogleSSOUnknownError : LIREErrorStateOverride.NoOverride;
    }

    public final Set e(Context context, final SubauthUserUIDebugAPI subauthUserUIDebugAPI) {
        zq3.h(context, "context");
        zq3.h(subauthUserUIDebugAPI, "subauthUserUI");
        String[] stringArray = context.getResources().getStringArray(cc6.subauth_custom_nyts_login_override_entries);
        zq3.g(stringArray, "getStringArray(...)");
        List b = ao1.b(d.C0(stringArray), false);
        String string = context.getString(hm6.subauth_custom_nyts_login_override_key);
        yn1.b bVar = new yn1.b("Subauth-User UI - Gameplan");
        zq3.e(string);
        return b0.d(new DevSettingChoiceListPreferenceItem("Override Custom NYT-S Login (Requires Restart)", string, b, null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserUiDevSettingFactory$customLoginWithNYTSDevSettings$1
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                zq3.h(context2, "context");
                zq3.h(zn1Var, "itemChosen");
                SubauthUserUIDebugAPI.this.d(a.a.a(context2, zn1Var.getPrefValue()));
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, bVar, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false, 392, null).j(context));
    }

    public final Set f(Context context, SubauthUserUIDebugAPI subauthUserUIDebugAPI) {
        zq3.h(context, "context");
        zq3.h(subauthUserUIDebugAPI, "subauthUserUI");
        String string = context.getString(hm6.subauth_override_delete_account_state);
        zq3.g(string, "getString(...)");
        String[] stringArray = context.getResources().getStringArray(cc6.subauth_override_delete_account_state_entries);
        zq3.g(stringArray, "getStringArray(...)");
        return b0.j(d(string, ao1.b(d.C0(stringArray), false), subauthUserUIDebugAPI, context), c(context));
    }

    public final Set i(final Context context, final SubauthUserUIDebugAPI subauthUserUIDebugAPI) {
        zq3.h(context, "context");
        zq3.h(subauthUserUIDebugAPI, "subauthUserUI");
        String string = context.getString(hm6.subauth_override_error_state);
        zq3.g(string, "getString(...)");
        String[] stringArray = context.getResources().getStringArray(cc6.subauth_override_error_state_entries);
        zq3.g(stringArray, "getStringArray(...)");
        return b0.d(new DevSettingChoiceListPreferenceItem("Override LIRE Error State. Changing the LIRE Error state will change the resulting action in the LIRE flow", string, ao1.b(d.C0(stringArray), false), null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.items.SubauthUserUiDevSettingFactory$lireBusinessLogicDevSettings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                LIREErrorStateOverride h;
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                SubauthUserUIDebugAPI subauthUserUIDebugAPI2 = SubauthUserUIDebugAPI.this;
                h = SubauthUserUiDevSettingFactory.a.h(context, zn1Var.getPrefValue());
                subauthUserUIDebugAPI2.a(h);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, new yn1.b("Subauth-User UI - LIRE"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false, 392, null).j(context));
    }

    public final Set j(Context context) {
        zq3.h(context, "context");
        SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState[] values = SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (SubauthUserUIDebugAPI.CaliforniaNoticeOverrideState californiaNoticeOverrideState : values) {
            arrayList.add(new zn1(californiaNoticeOverrideState.name(), californiaNoticeOverrideState.name(), null, true, 4, null));
        }
        SubauthUserUIDebugAPI.OfferCheckboxOverrideState[] values2 = SubauthUserUIDebugAPI.OfferCheckboxOverrideState.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (SubauthUserUIDebugAPI.OfferCheckboxOverrideState offerCheckboxOverrideState : values2) {
            arrayList2.add(new zn1(offerCheckboxOverrideState.name(), offerCheckboxOverrideState.name(), null, true, 4, null));
        }
        return b0.j(new DevSettingChoiceListPreferenceItem("Privacy Notice (Change privacy notices visibility on LIRE screens)", "subauthShowNotices", arrayList, null, null, new yn1.b("Subauth-User UI - Privacy Settings"), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false, 152, null).j(context), new DevSettingChoiceListPreferenceItem("Offer Checkbox (Change offer checkbox setup on LIRE Registration screen)", "subauthOfferCheckbox", arrayList2, null, null, new yn1.b("Subauth-User UI - Privacy Settings"), "2", false, false, 408, null).j(context));
    }

    public final Set k(Context context) {
        DevSettingSwitchItem a2;
        zq3.h(context, "context");
        String string = context.getString(hm6.subauth_smart_lock_save_key);
        yn1.b bVar = new yn1.b("Subauth-User UI - Smart Lock");
        zq3.e(string);
        a2 = DevSettingSwitchItemKt.a("Toggle saving credentials to smart lock", (r23 & 2) != 0 ? null : "Enable saving credentials to smart lock", (r23 & 4) != 0 ? null : "Disable saving credentials to smart lock", string, (r23 & 16) != 0 ? false : false, (r23 & 32) != 0 ? false : true, (r23 & 64) != 0 ? DevSettingUI.c.a : null, (r23 & 128) != 0 ? null : bVar, (r23 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? "Toggle saving credentials to smart lock" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, (r23 & 512) != 0 ? null : null);
        return b0.d(a2);
    }

    public final Set l(Context context) {
        zq3.h(context, "context");
        String[] stringArray = context.getResources().getStringArray(cc6.subauth_sso_action_entries);
        zq3.g(stringArray, "getStringArray(...)");
        List b = ao1.b(d.C0(stringArray), false);
        String string = context.getString(hm6.subauth_sso_action_key);
        yn1.b bVar = new yn1.b("Subauth-User UI - LIRE");
        zq3.e(string);
        return b0.d(new DevSettingChoiceListPreferenceItem("Override SSO Action in LIRE Flow", string, b, null, null, bVar, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, false, false, 408, null).j(context));
    }
}
