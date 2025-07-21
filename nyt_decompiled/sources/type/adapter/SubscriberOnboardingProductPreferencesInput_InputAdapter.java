package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.SubscriberOnboardingProductPreferencesInput;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingProductPreferencesInput_InputAdapter implements h8 {
    public static final SubscriberOnboardingProductPreferencesInput_InputAdapter INSTANCE = new SubscriberOnboardingProductPreferencesInput_InputAdapter();

    private SubscriberOnboardingProductPreferencesInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public SubscriberOnboardingProductPreferencesInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, SubscriberOnboardingProductPreferencesInput subscriberOnboardingProductPreferencesInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(subscriberOnboardingProductPreferencesInput, "value");
        if (subscriberOnboardingProductPreferencesInput.getAthletic() instanceof nk5.c) {
            lu3Var.name("athletic");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingProductPreferencesInput.getAthletic());
        }
        if (subscriberOnboardingProductPreferencesInput.getAudio() instanceof nk5.c) {
            lu3Var.name(AssetConstants.AUDIO_TYPE);
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingProductPreferencesInput.getAudio());
        }
        if (subscriberOnboardingProductPreferencesInput.getCooking() instanceof nk5.c) {
            lu3Var.name("cooking");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingProductPreferencesInput.getCooking());
        }
        if (subscriberOnboardingProductPreferencesInput.getGames() instanceof nk5.c) {
            lu3Var.name("games");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingProductPreferencesInput.getGames());
        }
        if (subscriberOnboardingProductPreferencesInput.getNews() instanceof nk5.c) {
            lu3Var.name("news");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingProductPreferencesInput.getNews());
        }
        if (subscriberOnboardingProductPreferencesInput.getWirecutter() instanceof nk5.c) {
            lu3Var.name("wirecutter");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingProductPreferencesInput.getWirecutter());
        }
    }
}
