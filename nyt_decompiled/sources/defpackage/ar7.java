package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.ShowDataSaleOptOutUiPrivacyDirectiveValueV2;

/* loaded from: classes4.dex */
public final class ar7 implements h8 {
    public static final ar7 a = new ar7();

    private ar7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ShowDataSaleOptOutUiPrivacyDirectiveValueV2 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String nextString = jsonReader.nextString();
        zq3.e(nextString);
        return ShowDataSaleOptOutUiPrivacyDirectiveValueV2.Companion.a(nextString);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ShowDataSaleOptOutUiPrivacyDirectiveValueV2 showDataSaleOptOutUiPrivacyDirectiveValueV2) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(showDataSaleOptOutUiPrivacyDirectiveValueV2, "value");
        lu3Var.value(showDataSaleOptOutUiPrivacyDirectiveValueV2.getRawValue());
    }
}
