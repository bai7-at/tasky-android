package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tq4;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ar4 implements h8 {
    public static final ar4 a = new ar4();
    private static final List b = i.e("__typename");

    private ar4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tq4.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        ur4 fromJson = vr4.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new tq4.f(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tq4.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, fVar.b());
        vr4.a.toJson(lu3Var, w41Var, fVar.a());
    }
}
