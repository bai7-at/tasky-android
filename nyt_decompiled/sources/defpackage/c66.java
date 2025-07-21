package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.s56;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class c66 implements h8 {
    public static final c66 a = new c66();
    private static final List b = i.e("__typename");

    private c66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s56.j fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        xy fromJson = yy.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new s56.j(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, s56.j jVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, jVar.b());
        yy.a.toJson(lu3Var, w41Var, jVar.a());
    }
}
