package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tn2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bo2 implements h8 {
    public static final bo2 a = new bo2();
    private static final List b = i.o("__typename", "kicker", "assets");

    private bo2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tn2.i fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = j8.a(j8.d(vn2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        jsonReader.q();
        ko2 fromJson = mo2.a.fromJson(jsonReader, w41Var);
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "kicker");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new tn2.i(str, str2, list, fromJson);
        }
        vr.a(jsonReader, "assets");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.i iVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(iVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, iVar.d());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, iVar.c());
        lu3Var.name("assets");
        j8.a(j8.d(vn2.a, false, 1, null)).toJson(lu3Var, w41Var, iVar.a());
        mo2.a.toJson(lu3Var, w41Var, iVar.b());
    }
}
