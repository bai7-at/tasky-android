package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.nx2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qx2 implements h8 {
    public static final qx2 a = new qx2();
    private static final List b = i.o("metadata", "edges");

    private qx2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx2.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        nx2.f fVar = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                fVar = (nx2.f) j8.b(j8.d(sx2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new nx2.d(fVar, list);
                }
                list = (List) j8.b(j8.a(j8.b(j8.d(px2.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, nx2.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("metadata");
        j8.b(j8.d(sx2.a, false, 1, null)).toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(px2.a, false, 1, null)))).toJson(lu3Var, w41Var, dVar.a());
    }
}
