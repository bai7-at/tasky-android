package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.j8;
import defpackage.lu3;
import defpackage.nk5;
import defpackage.w41;
import defpackage.zq3;
import type.YourPlacesGlobalUpdateInput;

/* loaded from: classes5.dex */
public final class YourPlacesGlobalUpdateInput_InputAdapter implements h8 {
    public static final YourPlacesGlobalUpdateInput_InputAdapter INSTANCE = new YourPlacesGlobalUpdateInput_InputAdapter();

    private YourPlacesGlobalUpdateInput_InputAdapter() {
    }

    @Override // defpackage.h8
    public YourPlacesGlobalUpdateInput fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, YourPlacesGlobalUpdateInput yourPlacesGlobalUpdateInput) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(yourPlacesGlobalUpdateInput, "value");
        if (yourPlacesGlobalUpdateInput.getPlaceSelections() instanceof nk5.c) {
            lu3Var.name("placeSelections");
            j8.e(j8.b(j8.a(j8.i))).toJson(lu3Var, w41Var, (nk5.c) yourPlacesGlobalUpdateInput.getPlaceSelections());
        }
    }
}
