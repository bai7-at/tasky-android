package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.x23;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class b33 implements h8 {
    public static final b33 a = new b33();
    private static final List b = i.e("edges");

    private b33() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x23.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.d(z23.a, false, 1, null)))).fromJson(jsonReader, w41Var);
        }
        return new x23.e(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, x23.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(z23.a, false, 1, null)))).toJson(lu3Var, w41Var, eVar.a());
    }
}
