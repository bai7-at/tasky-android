package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.x55;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class z55 implements h8 {
    public static final z55 a = new z55();
    private static final List b = i.e("__typename");

    private z55() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x55.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        pp3 pp3Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("LegacyCollection"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            pp3Var = qp3.a.fromJson(jsonReader, w41Var);
        }
        return new x55.b(str, pp3Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, x55.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        if (bVar.a() != null) {
            qp3.a.toJson(lu3Var, w41Var, bVar.a());
        }
    }
}
