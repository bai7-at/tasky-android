package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.aj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class cj5 implements h8 {
    public static final cj5 a = new cj5();
    private static final List b = i.e("__typename");

    private cj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aj5.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        tj5 tj5Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Person"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            tj5Var = uj5.a.fromJson(jsonReader, w41Var);
        }
        return new aj5.b(str, tj5Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, aj5.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        if (bVar.a() != null) {
            uj5.a.toJson(lu3Var, w41Var, bVar.a());
        }
    }
}
