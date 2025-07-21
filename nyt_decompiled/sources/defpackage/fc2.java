package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.wb2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class fc2 implements h8 {
    public static final fc2 a = new fc2();
    private static final List b = i.e("__typename");

    private fc2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wb2.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        qt fromJson = rt.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new wb2.h(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wb2.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, hVar.b());
        rt.a.toJson(lu3Var, w41Var, hVar.a());
    }
}
