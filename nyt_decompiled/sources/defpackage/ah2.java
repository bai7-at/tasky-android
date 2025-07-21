package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xg2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ah2 implements h8 {
    public static final ah2 a = new ah2();
    private static final List b = i.e("promotionalMedia");

    private ah2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xg2.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        xg2.i iVar = null;
        while (jsonReader.l1(b) == 0) {
            iVar = (xg2.i) j8.b(j8.c(hh2.a, true)).fromJson(jsonReader, w41Var);
        }
        return new xg2.b(iVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xg2.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(hh2.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
