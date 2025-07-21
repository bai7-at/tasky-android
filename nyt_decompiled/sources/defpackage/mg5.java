package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.DataProcessingPreferenceUiDirectiveValue;
import defpackage.cg5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class mg5 implements h8 {
    public static final mg5 a = new mg5();
    private static final List b = i.e("value");

    private mg5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg5.i fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        DataProcessingPreferenceUiDirectiveValue dataProcessingPreferenceUiDirectiveValue = null;
        while (jsonReader.l1(b) == 0) {
            dataProcessingPreferenceUiDirectiveValue = r91.a.fromJson(jsonReader, w41Var);
        }
        if (dataProcessingPreferenceUiDirectiveValue != null) {
            return new cg5.i(dataProcessingPreferenceUiDirectiveValue);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, cg5.i iVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(iVar, "value");
        lu3Var.name("value");
        r91.a.toJson(lu3Var, w41Var, iVar.a());
    }
}
