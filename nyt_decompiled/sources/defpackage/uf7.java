package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.rf7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class uf7 implements h8 {
    public static final uf7 a = new uf7();
    private static final List b = i.e("node");

    private uf7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rf7.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        rf7.f fVar = null;
        while (jsonReader.l1(b) == 0) {
            fVar = (rf7.f) j8.b(j8.c(wf7.a, true)).fromJson(jsonReader, w41Var);
        }
        return new rf7.d(fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, rf7.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(wf7.a, true)).toJson(lu3Var, w41Var, dVar.a());
    }
}
