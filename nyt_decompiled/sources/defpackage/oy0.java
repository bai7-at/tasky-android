package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ly0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class oy0 implements h8 {
    public static final oy0 a = new oy0();
    private static final List b = i.e("legacyCollection");

    private oy0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ly0.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ly0.f fVar = null;
        while (jsonReader.l1(b) == 0) {
            fVar = (ly0.f) j8.b(j8.d(qy0.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new ly0.d(fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ly0.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("legacyCollection");
        j8.b(j8.d(qy0.a, false, 1, null)).toJson(lu3Var, w41Var, dVar.a());
    }
}
