package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class dk5 implements h8 {
    public static final dk5 a = new dk5();
    private static final List b = i.e("edges");

    private dk5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xj5.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.d(zj5.a, false, 1, null)))).fromJson(jsonReader, w41Var);
        }
        return new xj5.g(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xj5.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(zj5.a, false, 1, null)))).toJson(lu3Var, w41Var, gVar.a());
    }
}
