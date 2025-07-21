package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tn2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class xn2 implements h8 {
    public static final xn2 a = new xn2();
    private static final List b = i.e("__typename");

    private xn2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tn2.e fromJson(JsonReader jsonReader, w41 w41Var) {
        tn2.k kVar;
        tn2.j jVar;
        tn2.l lVar;
        tn2.i iVar;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        tn2.h hVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("DailyFiveSalutation"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            kVar = do2.a.fromJson(jsonReader, w41Var);
        } else {
            kVar = null;
        }
        if (xa0.c(xa0.e("DailyFiveNumbered"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            jVar = co2.a.fromJson(jsonReader, w41Var);
        } else {
            jVar = null;
        }
        if (xa0.c(xa0.e("DailyFiveTrending"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            lVar = eo2.a.fromJson(jsonReader, w41Var);
        } else {
            lVar = null;
        }
        if (xa0.c(xa0.e("DailyFiveGames"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            iVar = bo2.a.fromJson(jsonReader, w41Var);
        } else {
            iVar = null;
        }
        if (xa0.c(xa0.e("DailyFiveCompletion"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            hVar = ao2.a.fromJson(jsonReader, w41Var);
        }
        return new tn2.e(str, kVar, jVar, lVar, iVar, hVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, eVar.f());
        if (eVar.d() != null) {
            do2.a.toJson(lu3Var, w41Var, eVar.d());
        }
        if (eVar.c() != null) {
            co2.a.toJson(lu3Var, w41Var, eVar.c());
        }
        if (eVar.e() != null) {
            eo2.a.toJson(lu3Var, w41Var, eVar.e());
        }
        if (eVar.b() != null) {
            bo2.a.toJson(lu3Var, w41Var, eVar.b());
        }
        if (eVar.a() != null) {
            ao2.a.toJson(lu3Var, w41Var, eVar.a());
        }
    }
}
