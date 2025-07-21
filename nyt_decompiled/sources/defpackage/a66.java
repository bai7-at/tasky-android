package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.s56;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class a66 implements h8 {
    public static final a66 a = new a66();
    private static final List b = i.o("__typename", "promotionalMedia");

    private a66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s56.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        s56.j jVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                jVar = (s56.j) j8.b(j8.c(c66.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        jsonReader.q();
        s56.e fromJson = x56.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new s56.h(str, jVar, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, s56.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, hVar.c());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(c66.a, true)).toJson(lu3Var, w41Var, hVar.b());
        x56.a.toJson(lu3Var, w41Var, hVar.a());
    }
}
