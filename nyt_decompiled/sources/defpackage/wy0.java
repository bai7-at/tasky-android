package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uy0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wy0 implements h8 {
    public static final wy0 a = new wy0();
    private static final List b = i.e("anyWork");

    private wy0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uy0.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        uy0.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (uy0.a) j8.b(j8.c(vy0.a, true)).fromJson(jsonReader, w41Var);
        }
        return new uy0.c(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uy0.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("anyWork");
        j8.b(j8.c(vy0.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
