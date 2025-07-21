package type.adapter;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.h8;
import defpackage.lu3;
import defpackage.w41;
import defpackage.zq3;
import type.PersonalizationDeviceType;

/* loaded from: classes5.dex */
public final class PersonalizationDeviceType_ResponseAdapter implements h8 {
    public static final PersonalizationDeviceType_ResponseAdapter INSTANCE = new PersonalizationDeviceType_ResponseAdapter();

    private PersonalizationDeviceType_ResponseAdapter() {
    }

    @Override // defpackage.h8
    public PersonalizationDeviceType fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return PersonalizationDeviceType.Companion.safeValueOf(nextString);
    }

    @Override // defpackage.h8
    public void toJson(lu3 lu3Var, w41 w41Var, PersonalizationDeviceType personalizationDeviceType) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(personalizationDeviceType, "value");
        lu3Var.value(personalizationDeviceType.getRawValue());
    }
}
