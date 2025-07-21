package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PrivacyDirectivesJsonAdapter extends JsonAdapter<PrivacyDirectives> {
    private final JsonAdapter<AcceptableTrackersDirectiveV2> acceptableTrackersDirectiveV2Adapter;
    private final JsonAdapter<AdConfigurationDirectiveV2> adConfigurationDirectiveV2Adapter;
    private final JsonAdapter<AdConfigurationDirectiveV3> adConfigurationDirectiveV3Adapter;
    private volatile Constructor<PrivacyDirectives> constructorRef;
    private final JsonAdapter<EmailMarketingOptInUiPrivacyDirective> emailMarketingOptInUiPrivacyDirectiveAdapter;
    private final JsonAdapter<FirstPartyBehavioralTargetingDirective> firstPartyBehavioralTargetingDirectiveAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<ShowCaliforniaNoticesUiDirective> showCaliforniaNoticesUiDirectiveAdapter;
    private final JsonAdapter<ShowDataProcessingConsentUiPrivacyDirective> showDataProcessingConsentUiPrivacyDirectiveAdapter;
    private final JsonAdapter<ShowDataProcessingPreferenceUiPrivacyDirective> showDataProcessingPreferenceUiPrivacyDirectiveAdapter;
    private final JsonAdapter<ShowDataSaleOptOutDirectiveV2> showDataSaleOptOutDirectiveV2Adapter;
    private final JsonAdapter<ShowLimitSensitivePIUiDirective> showLimitSensitivePIUiDirectiveAdapter;
    private final JsonAdapter<ShowTCFUIDirective> showTCFUIDirectiveAdapter;

    public PrivacyDirectivesJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("adConfigurationV2", "adConfigurationV3", "acceptableTrackersV2", "showDataSaleOptOutDirectiveV2", "showDataProcessingConsentDirective", "showDataProcessingPreferenceDirective", "showCaliforniaNoticesUiDirective", "emailMarketingOptInUiPrivacyDirective", "showLimitSensitivePIUiDirective", "showTCFUiDirective", "firstPartyDirective");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<AdConfigurationDirectiveV2> f = iVar.f(AdConfigurationDirectiveV2.class, b0.e(), "adConfigurationV2");
        zq3.g(f, "adapter(...)");
        this.adConfigurationDirectiveV2Adapter = f;
        JsonAdapter<AdConfigurationDirectiveV3> f2 = iVar.f(AdConfigurationDirectiveV3.class, b0.e(), "adConfigurationV3");
        zq3.g(f2, "adapter(...)");
        this.adConfigurationDirectiveV3Adapter = f2;
        JsonAdapter<AcceptableTrackersDirectiveV2> f3 = iVar.f(AcceptableTrackersDirectiveV2.class, b0.e(), "acceptableTrackersV2");
        zq3.g(f3, "adapter(...)");
        this.acceptableTrackersDirectiveV2Adapter = f3;
        JsonAdapter<ShowDataSaleOptOutDirectiveV2> f4 = iVar.f(ShowDataSaleOptOutDirectiveV2.class, b0.e(), "showDataSaleOptOutDirectiveV2");
        zq3.g(f4, "adapter(...)");
        this.showDataSaleOptOutDirectiveV2Adapter = f4;
        JsonAdapter<ShowDataProcessingConsentUiPrivacyDirective> f5 = iVar.f(ShowDataProcessingConsentUiPrivacyDirective.class, b0.e(), "showDataProcessingConsentDirective");
        zq3.g(f5, "adapter(...)");
        this.showDataProcessingConsentUiPrivacyDirectiveAdapter = f5;
        JsonAdapter<ShowDataProcessingPreferenceUiPrivacyDirective> f6 = iVar.f(ShowDataProcessingPreferenceUiPrivacyDirective.class, b0.e(), "showDataProcessingPreferenceDirective");
        zq3.g(f6, "adapter(...)");
        this.showDataProcessingPreferenceUiPrivacyDirectiveAdapter = f6;
        JsonAdapter<ShowCaliforniaNoticesUiDirective> f7 = iVar.f(ShowCaliforniaNoticesUiDirective.class, b0.e(), "showCaliforniaNoticesUiDirective");
        zq3.g(f7, "adapter(...)");
        this.showCaliforniaNoticesUiDirectiveAdapter = f7;
        JsonAdapter<EmailMarketingOptInUiPrivacyDirective> f8 = iVar.f(EmailMarketingOptInUiPrivacyDirective.class, b0.e(), "emailMarketingOptInUiPrivacyDirective");
        zq3.g(f8, "adapter(...)");
        this.emailMarketingOptInUiPrivacyDirectiveAdapter = f8;
        JsonAdapter<ShowLimitSensitivePIUiDirective> f9 = iVar.f(ShowLimitSensitivePIUiDirective.class, b0.e(), "showLimitSensitivePIUiDirective");
        zq3.g(f9, "adapter(...)");
        this.showLimitSensitivePIUiDirectiveAdapter = f9;
        JsonAdapter<ShowTCFUIDirective> f10 = iVar.f(ShowTCFUIDirective.class, b0.e(), "showTCFUiDirective");
        zq3.g(f10, "adapter(...)");
        this.showTCFUIDirectiveAdapter = f10;
        JsonAdapter<FirstPartyBehavioralTargetingDirective> f11 = iVar.f(FirstPartyBehavioralTargetingDirective.class, b0.e(), "firstPartyDirective");
        zq3.g(f11, "adapter(...)");
        this.firstPartyBehavioralTargetingDirectiveAdapter = f11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PrivacyDirectives");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PrivacyDirectives fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        AdConfigurationDirectiveV2 adConfigurationDirectiveV2 = null;
        int i = -1;
        AdConfigurationDirectiveV3 adConfigurationDirectiveV3 = null;
        AcceptableTrackersDirectiveV2 acceptableTrackersDirectiveV2 = null;
        ShowDataSaleOptOutDirectiveV2 showDataSaleOptOutDirectiveV2 = null;
        ShowDataProcessingConsentUiPrivacyDirective showDataProcessingConsentUiPrivacyDirective = null;
        ShowDataProcessingPreferenceUiPrivacyDirective showDataProcessingPreferenceUiPrivacyDirective = null;
        ShowCaliforniaNoticesUiDirective showCaliforniaNoticesUiDirective = null;
        EmailMarketingOptInUiPrivacyDirective emailMarketingOptInUiPrivacyDirective = null;
        ShowLimitSensitivePIUiDirective showLimitSensitivePIUiDirective = null;
        ShowTCFUIDirective showTCFUIDirective = null;
        FirstPartyBehavioralTargetingDirective firstPartyBehavioralTargetingDirective = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    adConfigurationDirectiveV2 = (AdConfigurationDirectiveV2) this.adConfigurationDirectiveV2Adapter.fromJson(jsonReader);
                    if (adConfigurationDirectiveV2 == null) {
                        JsonDataException x = c29.x("adConfigurationV2", "adConfigurationV2", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    i &= -2;
                    break;
                case 1:
                    adConfigurationDirectiveV3 = (AdConfigurationDirectiveV3) this.adConfigurationDirectiveV3Adapter.fromJson(jsonReader);
                    if (adConfigurationDirectiveV3 == null) {
                        JsonDataException x2 = c29.x("adConfigurationV3", "adConfigurationV3", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i &= -3;
                    break;
                case 2:
                    acceptableTrackersDirectiveV2 = (AcceptableTrackersDirectiveV2) this.acceptableTrackersDirectiveV2Adapter.fromJson(jsonReader);
                    if (acceptableTrackersDirectiveV2 == null) {
                        JsonDataException x3 = c29.x("acceptableTrackersV2", "acceptableTrackersV2", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i &= -5;
                    break;
                case 3:
                    showDataSaleOptOutDirectiveV2 = (ShowDataSaleOptOutDirectiveV2) this.showDataSaleOptOutDirectiveV2Adapter.fromJson(jsonReader);
                    if (showDataSaleOptOutDirectiveV2 == null) {
                        JsonDataException x4 = c29.x("showDataSaleOptOutDirectiveV2", "showDataSaleOptOutDirectiveV2", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    i &= -9;
                    break;
                case 4:
                    showDataProcessingConsentUiPrivacyDirective = (ShowDataProcessingConsentUiPrivacyDirective) this.showDataProcessingConsentUiPrivacyDirectiveAdapter.fromJson(jsonReader);
                    if (showDataProcessingConsentUiPrivacyDirective == null) {
                        JsonDataException x5 = c29.x("showDataProcessingConsentDirective", "showDataProcessingConsentDirective", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i &= -17;
                    break;
                case 5:
                    showDataProcessingPreferenceUiPrivacyDirective = (ShowDataProcessingPreferenceUiPrivacyDirective) this.showDataProcessingPreferenceUiPrivacyDirectiveAdapter.fromJson(jsonReader);
                    if (showDataProcessingPreferenceUiPrivacyDirective == null) {
                        JsonDataException x6 = c29.x("showDataProcessingPreferenceDirective", "showDataProcessingPreferenceDirective", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i &= -33;
                    break;
                case 6:
                    showCaliforniaNoticesUiDirective = (ShowCaliforniaNoticesUiDirective) this.showCaliforniaNoticesUiDirectiveAdapter.fromJson(jsonReader);
                    if (showCaliforniaNoticesUiDirective == null) {
                        JsonDataException x7 = c29.x("showCaliforniaNoticesUiDirective", "showCaliforniaNoticesUiDirective", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i &= -65;
                    break;
                case 7:
                    emailMarketingOptInUiPrivacyDirective = (EmailMarketingOptInUiPrivacyDirective) this.emailMarketingOptInUiPrivacyDirectiveAdapter.fromJson(jsonReader);
                    if (emailMarketingOptInUiPrivacyDirective == null) {
                        JsonDataException x8 = c29.x("emailMarketingOptInUiPrivacyDirective", "emailMarketingOptInUiPrivacyDirective", jsonReader);
                        zq3.g(x8, "unexpectedNull(...)");
                        throw x8;
                    }
                    i &= -129;
                    break;
                case 8:
                    showLimitSensitivePIUiDirective = (ShowLimitSensitivePIUiDirective) this.showLimitSensitivePIUiDirectiveAdapter.fromJson(jsonReader);
                    if (showLimitSensitivePIUiDirective == null) {
                        JsonDataException x9 = c29.x("showLimitSensitivePIUiDirective", "showLimitSensitivePIUiDirective", jsonReader);
                        zq3.g(x9, "unexpectedNull(...)");
                        throw x9;
                    }
                    i &= -257;
                    break;
                case 9:
                    showTCFUIDirective = (ShowTCFUIDirective) this.showTCFUIDirectiveAdapter.fromJson(jsonReader);
                    if (showTCFUIDirective == null) {
                        JsonDataException x10 = c29.x("showTCFUiDirective", "showTCFUiDirective", jsonReader);
                        zq3.g(x10, "unexpectedNull(...)");
                        throw x10;
                    }
                    i &= -513;
                    break;
                case 10:
                    firstPartyBehavioralTargetingDirective = (FirstPartyBehavioralTargetingDirective) this.firstPartyBehavioralTargetingDirectiveAdapter.fromJson(jsonReader);
                    if (firstPartyBehavioralTargetingDirective == null) {
                        JsonDataException x11 = c29.x("firstPartyDirective", "firstPartyDirective", jsonReader);
                        zq3.g(x11, "unexpectedNull(...)");
                        throw x11;
                    }
                    i &= -1025;
                    break;
            }
        }
        jsonReader.h();
        if (i == -2048) {
            zq3.f(adConfigurationDirectiveV2, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.AdConfigurationDirectiveV2");
            zq3.f(adConfigurationDirectiveV3, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.AdConfigurationDirectiveV3");
            zq3.f(acceptableTrackersDirectiveV2, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.AcceptableTrackersDirectiveV2");
            zq3.f(showDataSaleOptOutDirectiveV2, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.ShowDataSaleOptOutDirectiveV2");
            zq3.f(showDataProcessingConsentUiPrivacyDirective, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.ShowDataProcessingConsentUiPrivacyDirective");
            zq3.f(showDataProcessingPreferenceUiPrivacyDirective, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.ShowDataProcessingPreferenceUiPrivacyDirective");
            zq3.f(showCaliforniaNoticesUiDirective, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.ShowCaliforniaNoticesUiDirective");
            zq3.f(emailMarketingOptInUiPrivacyDirective, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.EmailMarketingOptInUiPrivacyDirective");
            zq3.f(showLimitSensitivePIUiDirective, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.ShowLimitSensitivePIUiDirective");
            zq3.f(showTCFUIDirective, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.ShowTCFUIDirective");
            zq3.f(firstPartyBehavioralTargetingDirective, "null cannot be cast to non-null type com.nytimes.android.subauth.core.purr.model.FirstPartyBehavioralTargetingDirective");
            return new PrivacyDirectives(adConfigurationDirectiveV2, adConfigurationDirectiveV3, acceptableTrackersDirectiveV2, showDataSaleOptOutDirectiveV2, showDataProcessingConsentUiPrivacyDirective, showDataProcessingPreferenceUiPrivacyDirective, showCaliforniaNoticesUiDirective, emailMarketingOptInUiPrivacyDirective, showLimitSensitivePIUiDirective, showTCFUIDirective, firstPartyBehavioralTargetingDirective);
        }
        Constructor<PrivacyDirectives> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PrivacyDirectives.class.getDeclaredConstructor(AdConfigurationDirectiveV2.class, AdConfigurationDirectiveV3.class, AcceptableTrackersDirectiveV2.class, ShowDataSaleOptOutDirectiveV2.class, ShowDataProcessingConsentUiPrivacyDirective.class, ShowDataProcessingPreferenceUiPrivacyDirective.class, ShowCaliforniaNoticesUiDirective.class, EmailMarketingOptInUiPrivacyDirective.class, ShowLimitSensitivePIUiDirective.class, ShowTCFUIDirective.class, FirstPartyBehavioralTargetingDirective.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PrivacyDirectives newInstance = constructor.newInstance(adConfigurationDirectiveV2, adConfigurationDirectiveV3, acceptableTrackersDirectiveV2, showDataSaleOptOutDirectiveV2, showDataProcessingConsentUiPrivacyDirective, showDataProcessingPreferenceUiPrivacyDirective, showCaliforniaNoticesUiDirective, emailMarketingOptInUiPrivacyDirective, showLimitSensitivePIUiDirective, showTCFUIDirective, firstPartyBehavioralTargetingDirective, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PrivacyDirectives privacyDirectives) {
        zq3.h(hVar, "writer");
        if (privacyDirectives == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("adConfigurationV2");
        this.adConfigurationDirectiveV2Adapter.mo197toJson(hVar, privacyDirectives.getAdConfigurationV2());
        hVar.C("adConfigurationV3");
        this.adConfigurationDirectiveV3Adapter.mo197toJson(hVar, privacyDirectives.getAdConfigurationV3());
        hVar.C("acceptableTrackersV2");
        this.acceptableTrackersDirectiveV2Adapter.mo197toJson(hVar, privacyDirectives.getAcceptableTrackersV2());
        hVar.C("showDataSaleOptOutDirectiveV2");
        this.showDataSaleOptOutDirectiveV2Adapter.mo197toJson(hVar, privacyDirectives.getShowDataSaleOptOutDirectiveV2());
        hVar.C("showDataProcessingConsentDirective");
        this.showDataProcessingConsentUiPrivacyDirectiveAdapter.mo197toJson(hVar, privacyDirectives.getShowDataProcessingConsentDirective());
        hVar.C("showDataProcessingPreferenceDirective");
        this.showDataProcessingPreferenceUiPrivacyDirectiveAdapter.mo197toJson(hVar, privacyDirectives.getShowDataProcessingPreferenceDirective());
        hVar.C("showCaliforniaNoticesUiDirective");
        this.showCaliforniaNoticesUiDirectiveAdapter.mo197toJson(hVar, privacyDirectives.getShowCaliforniaNoticesUiDirective());
        hVar.C("emailMarketingOptInUiPrivacyDirective");
        this.emailMarketingOptInUiPrivacyDirectiveAdapter.mo197toJson(hVar, privacyDirectives.getEmailMarketingOptInUiPrivacyDirective());
        hVar.C("showLimitSensitivePIUiDirective");
        this.showLimitSensitivePIUiDirectiveAdapter.mo197toJson(hVar, privacyDirectives.getShowLimitSensitivePIUiDirective());
        hVar.C("showTCFUiDirective");
        this.showTCFUIDirectiveAdapter.mo197toJson(hVar, privacyDirectives.getShowTCFUiDirective());
        hVar.C("firstPartyDirective");
        this.firstPartyBehavioralTargetingDirectiveAdapter.mo197toJson(hVar, privacyDirectives.getFirstPartyDirective());
        hVar.l();
    }
}
