package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.rf7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class tf7 implements h8 {
    public static final tf7 a = new tf7();
    private static final List b = i.e("legacyCollection");

    private tf7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rf7.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        rf7.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (rf7.e) j8.b(j8.d(vf7.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new rf7.c(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, rf7.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("legacyCollection");
        j8.b(j8.d(vf7.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
