package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u21;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class v21 implements h8 {
    public static final v21 a = new v21();
    private static final List b = i.o("headline", "summary", "kicker");

    private v21() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u21 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        u21.a aVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                aVar = (u21.a) j8.b(j8.d(w21.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "summary");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new u21(aVar, str, str2);
        }
        vr.a(jsonReader, "kicker");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u21 u21Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(u21Var, "value");
        lu3Var.name("headline");
        j8.b(j8.d(w21.a, false, 1, null)).toJson(lu3Var, w41Var, u21Var.a());
        lu3Var.name("summary");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, u21Var.c());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, u21Var.b());
    }
}
