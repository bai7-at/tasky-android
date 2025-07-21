package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tn2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class eo2 implements h8 {
    public static final eo2 a = new eo2();
    private static final List b = i.o("__typename", "assets");

    private eo2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tn2.l fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                list = j8.a(j8.c(un2.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        jsonReader.q();
        ko2 fromJson = mo2.a.fromJson(jsonReader, w41Var);
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new tn2.l(str, list, fromJson);
        }
        vr.a(jsonReader, "assets");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.l lVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(lVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, lVar.c());
        lu3Var.name("assets");
        j8.a(j8.c(un2.a, true)).toJson(lu3Var, w41Var, lVar.a());
        mo2.a.toJson(lu3Var, w41Var, lVar.b());
    }
}
