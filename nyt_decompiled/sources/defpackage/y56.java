package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.s56;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class y56 implements h8 {
    public static final y56 a = new y56();
    private static final List b = i.o("__typename", "assetID", "slides", "promotionalMedia");

    private y56() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s56.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        List list = null;
        s56.i iVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                list = j8.a(j8.b(j8.d(g66.a, false, 1, null))).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                iVar = (s56.i) j8.b(j8.c(b66.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "assetID");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new s56.f(str, str2, list, iVar);
        }
        vr.a(jsonReader, "slides");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, s56.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, fVar.d());
        lu3Var.name("assetID");
        h8Var.toJson(lu3Var, w41Var, fVar.a());
        lu3Var.name("slides");
        j8.a(j8.b(j8.d(g66.a, false, 1, null))).toJson(lu3Var, w41Var, fVar.c());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(b66.a, true)).toJson(lu3Var, w41Var, fVar.b());
    }
}
