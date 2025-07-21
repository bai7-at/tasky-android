package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.DateTime;
import type.ViewTrackerInput;

/* loaded from: classes5.dex */
public final class ViewTrackerInput_InputAdapter implements h8 {
    public static final ViewTrackerInput_InputAdapter INSTANCE = new ViewTrackerInput_InputAdapter();

    private ViewTrackerInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public ViewTrackerInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, ViewTrackerInput viewTrackerInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(viewTrackerInput, "value");
        if (viewTrackerInput.getViews() instanceof nk5.c) {
            lu3Var.name("views");
            j8.e(j8.b(j8.a(j8.b(w41Var.h(DateTime.Companion.getType()))))).toJson(lu3Var, w41Var, (nk5.c) viewTrackerInput.getViews());
        }
    }
}
