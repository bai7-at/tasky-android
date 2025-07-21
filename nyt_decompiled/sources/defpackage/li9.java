package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ki9;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class li9 implements h8 {
    public static final li9 a = new li9();
    private static final List b = i.e("theRecommendation");

    private li9() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ki9.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ki9.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (ki9.d) j8.b(j8.c(ni9.a, true)).fromJson(jsonReader, w41Var);
        }
        return new ki9.b(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ki9.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("theRecommendation");
        j8.b(j8.c(ni9.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
