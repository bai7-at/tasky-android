package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q03;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class r03 implements h8 {
    public static final r03 a = new r03();
    private static final List b = i.e("user");

    private r03() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q03.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        q03.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (q03.d) j8.b(j8.d(t03.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new q03.b(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, q03.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("user");
        j8.b(j8.d(t03.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
