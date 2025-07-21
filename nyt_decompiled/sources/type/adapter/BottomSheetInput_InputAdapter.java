package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.BottomSheetInput;
import type.DateTime;

/* loaded from: classes5.dex */
public final class BottomSheetInput_InputAdapter implements h8 {
    public static final BottomSheetInput_InputAdapter INSTANCE = new BottomSheetInput_InputAdapter();

    private BottomSheetInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public BottomSheetInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, BottomSheetInput bottomSheetInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bottomSheetInput, "value");
        if (bottomSheetInput.getInteracted() instanceof nk5.c) {
            lu3Var.name("interacted");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) bottomSheetInput.getInteracted());
        }
        if (bottomSheetInput.getLastSeenOn() instanceof nk5.c) {
            lu3Var.name("lastSeenOn");
            j8.e(j8.b(w41Var.h(DateTime.Companion.getType()))).toJson(lu3Var, w41Var, (nk5.c) bottomSheetInput.getLastSeenOn());
        }
        if (bottomSheetInput.getViewCount() instanceof nk5.c) {
            lu3Var.name("viewCount");
            j8.e(j8.k).toJson(lu3Var, w41Var, (nk5.c) bottomSheetInput.getViewCount());
        }
    }
}
