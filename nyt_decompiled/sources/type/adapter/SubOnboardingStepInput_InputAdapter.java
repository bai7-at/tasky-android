package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.DateTime;
import type.SubOnboardingStepInput;

/* loaded from: classes5.dex */
public final class SubOnboardingStepInput_InputAdapter implements h8 {
    public static final SubOnboardingStepInput_InputAdapter INSTANCE = new SubOnboardingStepInput_InputAdapter();

    private SubOnboardingStepInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public SubOnboardingStepInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, SubOnboardingStepInput subOnboardingStepInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(subOnboardingStepInput, "value");
        if (subOnboardingStepInput.getCompleted() instanceof nk5.c) {
            lu3Var.name("completed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subOnboardingStepInput.getCompleted());
        }
        if (subOnboardingStepInput.getInteracted() instanceof nk5.c) {
            lu3Var.name("interacted");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) subOnboardingStepInput.getInteracted());
        }
        if (subOnboardingStepInput.getLastSeenOn() instanceof nk5.c) {
            lu3Var.name("lastSeenOn");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) subOnboardingStepInput.getLastSeenOn());
        }
        if (subOnboardingStepInput.getViewCount() instanceof nk5.c) {
            lu3Var.name("viewCount");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) subOnboardingStepInput.getViewCount());
        }
    }
}
