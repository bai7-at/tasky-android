package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.hj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mj5 implements h8 {
    public static final mj5 a = new mj5();
    private static final List b = i.e("genericPersonalizedList");

    private mj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public hj5.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        hj5.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (hj5.d) j8.b(j8.d(kj5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new hj5.f(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, hj5.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("genericPersonalizedList");
        j8.b(j8.d(kj5.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.a());
    }
}
