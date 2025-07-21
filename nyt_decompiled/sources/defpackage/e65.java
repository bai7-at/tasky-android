package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.d65;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class e65 implements h8 {
    public static final e65 a = new e65();
    private static final List b = i.e("user");

    private e65() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d65.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        d65.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (d65.e) j8.b(j8.d(h65.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new d65.b(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, d65.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("user");
        j8.b(j8.d(h65.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
