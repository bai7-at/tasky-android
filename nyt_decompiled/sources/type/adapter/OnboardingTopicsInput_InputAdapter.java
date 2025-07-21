package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import com.facebook.AuthenticationTokenClaims;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.OnboardingTopicsInput;

/* loaded from: classes5.dex */
public final class OnboardingTopicsInput_InputAdapter implements h8 {
    public static final OnboardingTopicsInput_InputAdapter INSTANCE = new OnboardingTopicsInput_InputAdapter();

    private OnboardingTopicsInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public OnboardingTopicsInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, OnboardingTopicsInput onboardingTopicsInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(onboardingTopicsInput, "value");
        if (onboardingTopicsInput.getName() instanceof nk5.c) {
            lu3Var.name(AuthenticationTokenClaims.JSON_KEY_NAME);
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) onboardingTopicsInput.getName());
        }
        if (onboardingTopicsInput.getSelected() instanceof nk5.c) {
            lu3Var.name("selected");
            j8.e(j8.l).toJson(lu3Var, w41Var, (nk5.c) onboardingTopicsInput.getSelected());
        }
    }
}
