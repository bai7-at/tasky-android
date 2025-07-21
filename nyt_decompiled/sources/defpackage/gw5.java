package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.aw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class gw5 implements h8 {
    public static final gw5 a = new gw5();
    private static final List b = i.e("__typename");

    private gw5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aw5.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        m56 fromJson = p56.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new aw5.g(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, aw5.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, gVar.b());
        p56.a.toJson(lu3Var, w41Var, gVar.a());
    }
}
