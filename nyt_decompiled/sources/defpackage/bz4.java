package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.zy4;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class bz4 implements h8 {
    public static final bz4 a = new bz4();
    private static final List b = i.o("updatedDirectives", "updatedPref");

    private bz4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public zy4.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        zy4.d dVar = null;
        zy4.e eVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                dVar = (zy4.d) j8.c(cz4.a, true).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                eVar = (zy4.e) j8.c(dz4.a, true).fromJson(jsonReader, w41Var);
            }
        }
        if (dVar == null) {
            vr.a(jsonReader, "updatedDirectives");
            throw new KotlinNothingValueException();
        }
        if (eVar != null) {
            return new zy4.c(dVar, eVar);
        }
        vr.a(jsonReader, "updatedPref");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, zy4.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("updatedDirectives");
        j8.c(cz4.a, true).toJson(lu3Var, w41Var, cVar.a());
        lu3Var.name("updatedPref");
        j8.c(dz4.a, true).toJson(lu3Var, w41Var, cVar.b());
    }
}
