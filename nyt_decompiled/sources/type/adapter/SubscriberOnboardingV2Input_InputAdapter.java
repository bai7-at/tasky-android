package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.DateTime;
import type.SubscriberOnboardingV2Input;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingV2Input_InputAdapter implements h8 {
    public static final SubscriberOnboardingV2Input_InputAdapter INSTANCE = new SubscriberOnboardingV2Input_InputAdapter();

    private SubscriberOnboardingV2Input_InputAdapter() {
    }

    @Override // defpackage.h8
    public SubscriberOnboardingV2Input fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, SubscriberOnboardingV2Input subscriberOnboardingV2Input) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(subscriberOnboardingV2Input, "value");
        if (subscriberOnboardingV2Input.getCompleted() instanceof nk5.c) {
            lu3Var.name("completed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getCompleted());
        }
        if (subscriberOnboardingV2Input.getInteracted() instanceof nk5.c) {
            lu3Var.name("interacted");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getInteracted());
        }
        if (subscriberOnboardingV2Input.getLastSeenOn() instanceof nk5.c) {
            lu3Var.name("lastSeenOn");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getLastSeenOn());
        }
        if (subscriberOnboardingV2Input.getNeverShow() instanceof nk5.c) {
            lu3Var.name("neverShow");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getNeverShow());
        }
        if (subscriberOnboardingV2Input.getPointOfOrigin() instanceof nk5.c) {
            lu3Var.name("pointOfOrigin");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getPointOfOrigin());
        }
        if (subscriberOnboardingV2Input.getSavedArticle() instanceof nk5.c) {
            lu3Var.name("savedArticle");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getSavedArticle());
        }
        if (subscriberOnboardingV2Input.getSnoozed() instanceof nk5.c) {
            lu3Var.name("snoozed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getSnoozed());
        }
        if (subscriberOnboardingV2Input.getSnoozedOn() instanceof nk5.c) {
            lu3Var.name("snoozedOn");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getSnoozedOn());
        }
        if (subscriberOnboardingV2Input.getStarted() instanceof nk5.c) {
            lu3Var.name("started");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getStarted());
        }
        if (subscriberOnboardingV2Input.getViewCount() instanceof nk5.c) {
            lu3Var.name("viewCount");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) subscriberOnboardingV2Input.getViewCount());
        }
    }
}
