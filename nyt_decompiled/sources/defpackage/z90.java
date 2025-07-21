package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.v90;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class z90 implements h8 {
    public static final z90 a = new z90();
    private static final List b = i.e("__typename");

    private z90() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public v90.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        o90 fromJson = t90.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new v90.c(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, v90.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.b());
        t90.a.toJson(lu3Var, w41Var, cVar.a());
    }
}
