package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ls5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class rs5 implements h8 {
    public static final rs5 a = new rs5();
    private static final List b = i.o("metadata", "edges");

    private rs5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ls5.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ls5.e eVar = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                eVar = (ls5.e) j8.b(j8.d(ps5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new ls5.g(eVar, list);
                }
                list = (List) j8.b(j8.a(j8.b(j8.d(ns5.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ls5.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("metadata");
        j8.b(j8.d(ps5.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.b());
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(ns5.a, false, 1, null)))).toJson(lu3Var, w41Var, gVar.a());
    }
}
