package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.lu3;
import defpackage.w41;
import defpackage.zq3;
import type.PersonalizationAppType;

/* loaded from: classes5.dex */
public final class PersonalizationAppType_ResponseAdapter implements h8 {
    public static final PersonalizationAppType_ResponseAdapter INSTANCE = new PersonalizationAppType_ResponseAdapter();

    private PersonalizationAppType_ResponseAdapter() {
    }

    @Override // defpackage.h8
    public PersonalizationAppType fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return PersonalizationAppType.Companion.safeValueOf(nextString);
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, PersonalizationAppType personalizationAppType) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(personalizationAppType, "value");
        lu3Var.value(personalizationAppType.getRawValue());
    }
}
