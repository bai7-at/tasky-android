package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.hj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ij5 implements h8 {
    public static final ij5 a = new ij5();
    private static final List b = i.e("recommended");

    private ij5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public hj5.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        hj5.f fVar = null;
        while (jsonReader.l1(b) == 0) {
            fVar = (hj5.f) j8.b(j8.d(mj5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new hj5.b(fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, hj5.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("recommended");
        j8.b(j8.d(mj5.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
