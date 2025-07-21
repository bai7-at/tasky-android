package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.x23;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class c33 implements h8 {
    public static final c33 a = new c33();
    private static final List b = i.e("personalizedList");

    private c33() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public x23.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        x23.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (x23.e) j8.b(j8.d(b33.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new x23.f(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, x23.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("personalizedList");
        j8.b(j8.d(b33.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.a());
    }
}
