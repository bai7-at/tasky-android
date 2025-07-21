package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.DateTime;
import type.ViewedTrustModuleInput;

/* loaded from: classes5.dex */
public final class ViewedTrustModuleInput_InputAdapter implements h8 {
    public static final ViewedTrustModuleInput_InputAdapter INSTANCE = new ViewedTrustModuleInput_InputAdapter();

    private ViewedTrustModuleInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public ViewedTrustModuleInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, ViewedTrustModuleInput viewedTrustModuleInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(viewedTrustModuleInput, "value");
        if (viewedTrustModuleInput.getLastSeen() instanceof nk5.c) {
            lu3Var.name("lastSeen");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) viewedTrustModuleInput.getLastSeen());
        }
        if (viewedTrustModuleInput.getTrustModule() instanceof nk5.c) {
            lu3Var.name("trustModule");
            j8.e(j8.i).toJson(lu3Var, w41Var, (nk5.c) viewedTrustModuleInput.getTrustModule());
        }
    }
}
