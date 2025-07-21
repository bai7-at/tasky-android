package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.w41;
import defpackage.zq3;
import type.SetUserInterestsInput;

/* loaded from: classes5.dex */
public final class SetUserInterestsInput_InputAdapter implements h8 {
    public static final SetUserInterestsInput_InputAdapter INSTANCE = new SetUserInterestsInput_InputAdapter();

    private SetUserInterestsInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public SetUserInterestsInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, SetUserInterestsInput setUserInterestsInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(setUserInterestsInput, "value");
        lu3Var.name("interestIds");
        j8.a(j8.k).toJson(lu3Var, w41Var, setUserInterestsInput.getInterestIds());
    }
}
