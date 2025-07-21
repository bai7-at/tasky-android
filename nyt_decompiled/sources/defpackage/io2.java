package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ho2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class io2 implements h8 {
    public static final io2 a = new io2();
    private static final List b = i.e("followStatus");

    private io2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ho2.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.d(jo2.a, false, 1, null)))).fromJson(jsonReader, w41Var);
        }
        return new ho2.b(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ho2.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("followStatus");
        j8.b(j8.a(j8.b(j8.d(jo2.a, false, 1, null)))).toJson(lu3Var, w41Var, bVar.a());
    }
}
