package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xj5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class gk5 implements h8 {
    public static final gk5 a = new gk5();
    private static final List b = i.e("personalizedList");

    private gk5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xj5.j fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        xj5.g gVar = null;
        while (jsonReader.l1(b) == 0) {
            gVar = (xj5.g) j8.b(j8.d(dk5.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new xj5.j(gVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xj5.j jVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jVar, "value");
        lu3Var.name("personalizedList");
        j8.b(j8.d(dk5.a, false, 1, null)).toJson(lu3Var, w41Var, jVar.a());
    }
}
