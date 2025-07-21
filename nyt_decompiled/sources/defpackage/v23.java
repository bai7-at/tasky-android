package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q23;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class v23 implements h8 {
    public static final v23 a = new v23();
    private static final List b = i.e("genericPersonalizedList");

    private v23() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q23.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        q23.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (q23.d) j8.b(j8.d(t23.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new q23.f(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, q23.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("genericPersonalizedList");
        j8.b(j8.d(t23.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.a());
    }
}
