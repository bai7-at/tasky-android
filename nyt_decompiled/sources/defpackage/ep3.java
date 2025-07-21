package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ap3;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ep3 implements h8 {
    public static final ep3 a = new ep3();
    private static final List b = i.e("__typename");

    private ep3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ap3.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        r56 fromJson = s66.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new ap3.c(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ap3.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, cVar.b());
        s66.a.toJson(lu3Var, w41Var, cVar.a());
    }
}
