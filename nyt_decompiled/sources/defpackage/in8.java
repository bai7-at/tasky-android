package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.ToggleableUiDirectiveValue;

/* loaded from: classes4.dex */
public final class in8 implements h8 {
    public static final in8 a = new in8();

    private in8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ToggleableUiDirectiveValue fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return ToggleableUiDirectiveValue.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ToggleableUiDirectiveValue toggleableUiDirectiveValue) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(toggleableUiDirectiveValue, "value");
        lu3Var.value(toggleableUiDirectiveValue.getRawValue());
    }
}
