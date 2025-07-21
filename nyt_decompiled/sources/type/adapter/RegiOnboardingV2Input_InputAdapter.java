package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.RegiOnboardingV2Input;

/* loaded from: classes5.dex */
public final class RegiOnboardingV2Input_InputAdapter implements h8 {
    public static final RegiOnboardingV2Input_InputAdapter INSTANCE = new RegiOnboardingV2Input_InputAdapter();

    private RegiOnboardingV2Input_InputAdapter() {
    }

    @Override // defpackage.h8
    public RegiOnboardingV2Input fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, RegiOnboardingV2Input regiOnboardingV2Input) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(regiOnboardingV2Input, "value");
        if (regiOnboardingV2Input.getCompleted() instanceof nk5.c) {
            lu3Var.name("completed");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingV2Input.getCompleted());
        }
        if (regiOnboardingV2Input.getStarted() instanceof nk5.c) {
            lu3Var.name("started");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) regiOnboardingV2Input.getStarted());
        }
    }
}
