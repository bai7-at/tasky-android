package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tp;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class up implements h8 {
    public static final up a = new up();
    private static final List b = i.o("__typename", "hybridBody");

    private up() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        tp.b bVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                bVar = (tp.b) j8.b(j8.d(wp.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        jsonReader.q();
        gp fromJson = jp.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new tp(str, bVar, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tp tpVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(tpVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, tpVar.c());
        lu3Var.name("hybridBody");
        j8.b(j8.d(wp.a, false, 1, null)).toJson(lu3Var, w41Var, tpVar.b());
        jp.a.toJson(lu3Var, w41Var, tpVar.a());
    }
}
