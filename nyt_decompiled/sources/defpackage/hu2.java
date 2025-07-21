package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bu2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hu2 implements h8 {
    public static final hu2 a = new hu2();
    private static final List b = i.o("connectionsCompanion", "wordleReview", "spellingBeeForum", "featured");

    private hu2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bu2.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        bu2.f fVar = null;
        bu2.r rVar = null;
        bu2.q qVar = null;
        bu2.l lVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                fVar = (bu2.f) j8.b(j8.d(gu2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                rVar = (bu2.r) j8.b(j8.d(su2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                qVar = (bu2.q) j8.b(j8.d(ru2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    return new bu2.g(fVar, rVar, qVar, lVar);
                }
                lVar = (bu2.l) j8.b(j8.d(mu2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bu2.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("connectionsCompanion");
        j8.b(j8.d(gu2.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.a());
        lu3Var.name("wordleReview");
        j8.b(j8.d(su2.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.d());
        lu3Var.name("spellingBeeForum");
        j8.b(j8.d(ru2.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.c());
        lu3Var.name("featured");
        j8.b(j8.d(mu2.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.b());
    }
}
