package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.AcceptableTrackersDirectiveValue;

/* loaded from: classes4.dex */
public final class n2 implements h8 {
    public static final n2 a = new n2();

    private n2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AcceptableTrackersDirectiveValue fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return AcceptableTrackersDirectiveValue.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, AcceptableTrackersDirectiveValue acceptableTrackersDirectiveValue) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(acceptableTrackersDirectiveValue, "value");
        lu3Var.value(acceptableTrackersDirectiveValue.getRawValue());
    }
}
