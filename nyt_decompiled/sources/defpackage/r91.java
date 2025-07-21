package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.DataProcessingPreferenceUiDirectiveValue;

/* loaded from: classes4.dex */
public final class r91 implements h8 {
    public static final r91 a = new r91();

    private r91() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DataProcessingPreferenceUiDirectiveValue fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return DataProcessingPreferenceUiDirectiveValue.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, DataProcessingPreferenceUiDirectiveValue dataProcessingPreferenceUiDirectiveValue) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dataProcessingPreferenceUiDirectiveValue, "value");
        lu3Var.value(dataProcessingPreferenceUiDirectiveValue.getRawValue());
    }
}
