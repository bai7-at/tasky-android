package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.SubscriberOnboardingGamesPreferencesInput;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingGamesPreferencesInput_InputAdapter implements h8 {
    public static final SubscriberOnboardingGamesPreferencesInput_InputAdapter INSTANCE = new SubscriberOnboardingGamesPreferencesInput_InputAdapter();

    private SubscriberOnboardingGamesPreferencesInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public SubscriberOnboardingGamesPreferencesInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, SubscriberOnboardingGamesPreferencesInput subscriberOnboardingGamesPreferencesInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(subscriberOnboardingGamesPreferencesInput, "value");
        if (subscriberOnboardingGamesPreferencesInput.getConnections() instanceof nk5.c) {
            lu3Var.name("connections");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingGamesPreferencesInput.getConnections());
        }
        if (subscriberOnboardingGamesPreferencesInput.getCrossword() instanceof nk5.c) {
            lu3Var.name("crossword");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingGamesPreferencesInput.getCrossword());
        }
        if (subscriberOnboardingGamesPreferencesInput.getSpellingBee() instanceof nk5.c) {
            lu3Var.name("spellingBee");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingGamesPreferencesInput.getSpellingBee());
        }
        if (subscriberOnboardingGamesPreferencesInput.getTheMini() instanceof nk5.c) {
            lu3Var.name("theMini");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingGamesPreferencesInput.getTheMini());
        }
        if (subscriberOnboardingGamesPreferencesInput.getTiles() instanceof nk5.c) {
            lu3Var.name("tiles");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingGamesPreferencesInput.getTiles());
        }
        if (subscriberOnboardingGamesPreferencesInput.getWordle() instanceof nk5.c) {
            lu3Var.name("wordle");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingGamesPreferencesInput.getWordle());
        }
    }
}
