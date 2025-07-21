package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.UserIdentifier;

/* loaded from: classes5.dex */
public final class UserIdentifier_InputAdapter implements h8 {
    public static final UserIdentifier_InputAdapter INSTANCE = new UserIdentifier_InputAdapter();

    private UserIdentifier_InputAdapter() {
    }

    @Override // defpackage.h8
    public UserIdentifier fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, UserIdentifier userIdentifier) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(userIdentifier, "value");
        lu3Var.name("token");
        j8.a.toJson(lu3Var, w41Var, userIdentifier.getToken());
        if (userIdentifier.getDemographicsToken() instanceof nk5.c) {
            lu3Var.name("demographicsToken");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) userIdentifier.getDemographicsToken());
        }
        if (userIdentifier.getProfileToken() instanceof nk5.c) {
            lu3Var.name("profileToken");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) userIdentifier.getProfileToken());
        }
    }
}
