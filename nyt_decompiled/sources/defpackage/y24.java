package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u24;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class y24 implements h8 {
    public static final y24 a = new y24();
    private static final List b = i.e("edges");

    private y24() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u24.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = (List) j8.b(j8.a(j8.b(j8.d(v24.a, false, 1, null)))).fromJson(jsonReader, w41Var);
        }
        return new u24.c(list);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u24.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("edges");
        j8.b(j8.a(j8.b(j8.d(v24.a, false, 1, null)))).toJson(lu3Var, w41Var, cVar.a());
    }
}
