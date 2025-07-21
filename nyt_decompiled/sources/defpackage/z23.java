package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.x23;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class z23 implements h8 {
    public static final z23 a = new z23();
    private static final List b = i.o("trackingParams", "node");

    private z23() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x23.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        x23.d dVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                list = (List) j8.b(j8.a(j8.b(j8.d(d33.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new x23.c(list, dVar);
                }
                dVar = (x23.d) j8.b(j8.c(a33.a, true)).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, x23.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(d33.a, false, 1, null)))).toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("node");
        j8.b(j8.c(a33.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
