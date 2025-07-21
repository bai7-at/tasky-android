package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.OnsiteMessagingInput;

/* loaded from: classes5.dex */
public final class OnsiteMessagingInput_InputAdapter implements h8 {
    public static final OnsiteMessagingInput_InputAdapter INSTANCE = new OnsiteMessagingInput_InputAdapter();

    private OnsiteMessagingInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public OnsiteMessagingInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, OnsiteMessagingInput onsiteMessagingInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(onsiteMessagingInput, "value");
        if (onsiteMessagingInput.getName() instanceof nk5.c) {
            lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getName());
        }
        if (onsiteMessagingInput.getVersion() instanceof nk5.c) {
            lu3Var.name("version");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getVersion());
        }
        if (onsiteMessagingInput.getUrl() instanceof nk5.c) {
            lu3Var.name("url");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getUrl());
        }
        if (onsiteMessagingInput.getUri() instanceof nk5.c) {
            lu3Var.name("uri");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getUri());
        }
        if (onsiteMessagingInput.getReferrer() instanceof nk5.c) {
            lu3Var.name("referrer");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getReferrer());
        }
        if (onsiteMessagingInput.getDeviceType() instanceof nk5.c) {
            lu3Var.name("deviceType");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getDeviceType());
        }
        if (onsiteMessagingInput.getPageViewID() instanceof nk5.c) {
            lu3Var.name("pageViewID");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getPageViewID());
        }
        if (onsiteMessagingInput.getCanUseApplePay() instanceof nk5.c) {
            lu3Var.name("canUseApplePay");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getCanUseApplePay());
        }
        if (onsiteMessagingInput.isGamesHybridWebView() instanceof nk5.c) {
            lu3Var.name("isGamesHybridWebView");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.isGamesHybridWebView());
        }
        if (onsiteMessagingInput.getCountry() instanceof nk5.c) {
            lu3Var.name("country");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getCountry());
        }
        if (onsiteMessagingInput.getContinent() instanceof nk5.c) {
            lu3Var.name("continent");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getContinent());
        }
        if (onsiteMessagingInput.getMeter() instanceof nk5.c) {
            lu3Var.name("meter");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getMeter());
        }
        if (onsiteMessagingInput.getJkidd() instanceof nk5.c) {
            lu3Var.name("jkidd");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getJkidd());
        }
        if (onsiteMessagingInput.getSubinfo() instanceof nk5.c) {
            lu3Var.name("subinfo");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getSubinfo());
        }
        if (onsiteMessagingInput.getSamizdat() instanceof nk5.c) {
            lu3Var.name("samizdat");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getSamizdat());
        }
        if (onsiteMessagingInput.getAbra() instanceof nk5.c) {
            lu3Var.name("abra");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getAbra());
        }
        if (onsiteMessagingInput.getOfferEligibility() instanceof nk5.c) {
            lu3Var.name("offerEligibility");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getOfferEligibility());
        }
        if (onsiteMessagingInput.getUserState() instanceof nk5.c) {
            lu3Var.name("userState");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getUserState());
        }
        if (onsiteMessagingInput.getUserstate() instanceof nk5.c) {
            lu3Var.name("userstate");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getUserstate());
        }
        if (onsiteMessagingInput.getAlgoeverything() instanceof nk5.c) {
            lu3Var.name("algoeverything");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getAlgoeverything());
        }
        if (onsiteMessagingInput.getUnits() instanceof nk5.c) {
            lu3Var.name("units");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getUnits());
        }
        if (onsiteMessagingInput.getScenario() instanceof nk5.c) {
            lu3Var.name("scenario");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getScenario());
        }
        if (onsiteMessagingInput.getDebug() instanceof nk5.c) {
            lu3Var.name("debug");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getDebug());
        }
        if (onsiteMessagingInput.getProduction() instanceof nk5.c) {
            lu3Var.name("production");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getProduction());
        }
        if (onsiteMessagingInput.getNow() instanceof nk5.c) {
            lu3Var.name("now");
            j8.e(j8.m).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getNow());
        }
        if (onsiteMessagingInput.getLanguage() instanceof nk5.c) {
            lu3Var.name("language");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getLanguage());
        }
        if (onsiteMessagingInput.getAnonymousEntitlements() instanceof nk5.c) {
            lu3Var.name("anonymousEntitlements");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getAnonymousEntitlements());
        }
        if (onsiteMessagingInput.getAbraIntegration() instanceof nk5.c) {
            lu3Var.name("abraIntegration");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getAbraIntegration());
        }
        if (onsiteMessagingInput.getAbraParameters() instanceof nk5.c) {
            lu3Var.name("abraParameters");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getAbraParameters());
        }
        if (onsiteMessagingInput.getAbraAllocations() instanceof nk5.c) {
            lu3Var.name("abraAllocations");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getAbraAllocations());
        }
        if (onsiteMessagingInput.getAccessException() instanceof nk5.c) {
            lu3Var.name("accessException");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getAccessException());
        }
        if (onsiteMessagingInput.getSubscriberScore() instanceof nk5.c) {
            lu3Var.name("subscriberScore");
            j8.e(j8.j).toJson(lu3Var, w41Var, (nk5.c) onsiteMessagingInput.getSubscriberScore());
        }
    }
}
