package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.n59;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class v59 implements h8 {
    public static final v59 a = new v59();
    private static final List b = i.o("__typename", "sourceId", "uri", "headline");

    private v59() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n59.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        n59.f fVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                fVar = (n59.f) j8.b(j8.d(t59.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "sourceId");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new n59.h(str, str2, str3, fVar);
        }
        vr.a(jsonReader, "uri");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, n59.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, hVar.d());
        lu3Var.name("sourceId");
        h8Var.toJson(lu3Var, w41Var, hVar.b());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, hVar.c());
        lu3Var.name("headline");
        j8.b(j8.d(t59.a, false, 1, null)).toJson(lu3Var, w41Var, hVar.a());
    }
}
