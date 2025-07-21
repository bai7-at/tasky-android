package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q23;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class r23 implements h8 {
    public static final r23 a = new r23();
    private static final List b = i.e("recommended");

    private r23() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q23.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        q23.f fVar = null;
        while (jsonReader.l1(b) == 0) {
            fVar = (q23.f) j8.b(j8.d(v23.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new q23.b(fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, q23.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("recommended");
        j8.b(j8.d(v23.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
