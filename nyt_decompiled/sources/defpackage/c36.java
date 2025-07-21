package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.a36;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class c36 implements h8 {
    public static final c36 a = new c36();
    private static final List b = i.e("user");

    private c36() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a36.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        a36.f fVar = null;
        while (jsonReader.l1(b) == 0) {
            fVar = (a36.f) j8.b(j8.d(f36.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new a36.c(fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, a36.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("user");
        j8.b(j8.d(f36.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
