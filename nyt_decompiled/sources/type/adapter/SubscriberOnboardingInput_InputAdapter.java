package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.DateTime;
import type.SubscriberOnboardingInput;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingInput_InputAdapter implements h8 {
    public static final SubscriberOnboardingInput_InputAdapter INSTANCE = new SubscriberOnboardingInput_InputAdapter();

    private SubscriberOnboardingInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public SubscriberOnboardingInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, SubscriberOnboardingInput subscriberOnboardingInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(subscriberOnboardingInput, "value");
        if (subscriberOnboardingInput.getCompleted() instanceof nk5.c) {
            lu3Var.name("completed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingInput.getCompleted());
        }
        if (subscriberOnboardingInput.getNeverShow() instanceof nk5.c) {
            lu3Var.name("neverShow");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingInput.getNeverShow());
        }
        if (subscriberOnboardingInput.getSavedArticle() instanceof nk5.c) {
            lu3Var.name("savedArticle");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingInput.getSavedArticle());
        }
        if (subscriberOnboardingInput.getSnoozed() instanceof nk5.c) {
            lu3Var.name("snoozed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingInput.getSnoozed());
        }
        if (subscriberOnboardingInput.getSnoozedOn() instanceof nk5.c) {
            lu3Var.name("snoozedOn");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingInput.getSnoozedOn());
        }
        if (subscriberOnboardingInput.getStarted() instanceof nk5.c) {
            lu3Var.name("started");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingInput.getStarted());
        }
    }
}
