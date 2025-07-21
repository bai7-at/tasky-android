package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bu2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class su2 implements h8 {
    public static final su2 a = new su2();
    private static final List b = i.e("assets");

    private su2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bu2.r fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        bu2.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (bu2.a) j8.b(j8.d(cu2.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new bu2.r(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bu2.r rVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(rVar, "value");
        lu3Var.name("assets");
        j8.b(j8.d(cu2.a, false, 1, null)).toJson(lu3Var, w41Var, rVar.a());
    }
}
