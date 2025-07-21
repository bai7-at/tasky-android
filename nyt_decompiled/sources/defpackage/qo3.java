package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ho3;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qo3 implements h8 {
    public static final qo3 a = new qo3();
    private static final List b = i.e("__typename");

    private qo3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ho3.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        qt fromJson = rt.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new ho3.h(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ho3.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, hVar.b());
        rt.a.toJson(lu3Var, w41Var, hVar.a());
    }
}
