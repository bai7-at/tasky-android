package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.z8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class b9 implements h8 {
    public static final b9 a = new b9();
    private static final List b = i.e("addUserInterests");

    private b9() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public z8.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        z8.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (z8.a) j8.b(j8.d(a9.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new z8.c(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, z8.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("addUserInterests");
        j8.b(j8.d(a9.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
