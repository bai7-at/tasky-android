package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bu2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ku2 implements h8 {
    public static final ku2 a = new ku2();
    private static final List b = i.e("node");

    private ku2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bu2.j fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        bu2.o oVar = null;
        while (jsonReader.l1(b) == 0) {
            oVar = (bu2.o) j8.b(j8.c(pu2.a, true)).fromJson(jsonReader, w41Var);
        }
        return new bu2.j(oVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bu2.j jVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(pu2.a, true)).toJson(lu3Var, w41Var, jVar.a());
    }
}
