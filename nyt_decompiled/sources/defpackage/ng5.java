package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.ShowDataSaleOptOutUiPrivacyDirectiveValueV2;
import defpackage.cg5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ng5 implements h8 {
    public static final ng5 a = new ng5();
    private static final List b = i.e("value");

    private ng5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg5.j fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ShowDataSaleOptOutUiPrivacyDirectiveValueV2 showDataSaleOptOutUiPrivacyDirectiveValueV2 = null;
        while (jsonReader.l1(b) == 0) {
            showDataSaleOptOutUiPrivacyDirectiveValueV2 = ar7.a.fromJson(jsonReader, w41Var);
        }
        if (showDataSaleOptOutUiPrivacyDirectiveValueV2 != null) {
            return new cg5.j(showDataSaleOptOutUiPrivacyDirectiveValueV2);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, cg5.j jVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jVar, "value");
        lu3Var.name("value");
        ar7.a.toJson(lu3Var, w41Var, jVar.a());
    }
}
