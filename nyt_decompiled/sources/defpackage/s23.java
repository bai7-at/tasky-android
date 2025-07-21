package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q23;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class s23 implements h8 {
    public static final s23 a = new s23();
    private static final List b = i.o("trackingParams", "node");

    private s23() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q23.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        q23.e eVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                list = (List) j8.b(j8.a(j8.b(j8.d(w23.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new q23.c(list, eVar);
                }
                eVar = (q23.e) j8.b(j8.c(u23.a, true)).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, q23.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(w23.a, false, 1, null)))).toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("node");
        j8.b(j8.c(u23.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
