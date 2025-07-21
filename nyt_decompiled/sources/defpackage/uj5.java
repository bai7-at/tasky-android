package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tj5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class uj5 implements h8 {
    public static final uj5 a = new uj5();
    private static final List b = i.o("id", "displayName", "title", "promotionalMedia");

    private uj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tj5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        tj5.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                aVar = (tj5.a) j8.b(j8.c(vj5.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "id");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "displayName");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new tj5(str, str2, str3, aVar);
        }
        vr.a(jsonReader, "title");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tj5 tj5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(tj5Var, "value");
        lu3Var.name("id");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, tj5Var.b());
        lu3Var.name("displayName");
        h8Var.toJson(lu3Var, w41Var, tj5Var.a());
        lu3Var.name("title");
        h8Var.toJson(lu3Var, w41Var, tj5Var.d());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(vj5.a, true)).toJson(lu3Var, w41Var, tj5Var.c());
    }
}
