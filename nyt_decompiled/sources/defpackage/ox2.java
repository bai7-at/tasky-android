package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.nx2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ox2 implements h8 {
    public static final ox2 a = new ox2();
    private static final List b = i.e("lists");

    private ox2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public nx2.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        nx2.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (nx2.e) j8.b(j8.d(rx2.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new nx2.b(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, nx2.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("lists");
        j8.b(j8.d(rx2.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
