package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qu implements h8 {
    public static final qu a = new qu();
    private static final List b = i.e("__typename");

    private qu() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public pu fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        c86 fromJson = d86.a.fromJson(jsonReader, w41Var);
        jsonReader.q();
        u21 fromJson2 = v21.a.fromJson(jsonReader, w41Var);
        jsonReader.q();
        t66 fromJson3 = v66.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new pu(str, fromJson, fromJson2, fromJson3);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, pu puVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(puVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, puVar.d());
        d86.a.toJson(lu3Var, w41Var, puVar.c());
        v21.a.toJson(lu3Var, w41Var, puVar.a());
        v66.a.toJson(lu3Var, w41Var, puVar.b());
    }
}
