package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.mf5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class of5 implements h8 {
    public static final of5 a = new of5();
    private static final List b = i.o("__typename", "url", "code", "remaining", "contents");

    private of5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public mf5 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        mf5.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                num = (Integer) j8.k.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
                    break;
                }
                aVar = (mf5.a) j8.b(j8.d(nf5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new mf5(str, str2, str3, num, aVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, mf5 mf5Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(mf5Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, mf5Var.e());
        lu3Var.name("url");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, mf5Var.d());
        lu3Var.name("code");
        ya5Var.toJson(lu3Var, w41Var, mf5Var.a());
        lu3Var.name("remaining");
        j8.k.toJson(lu3Var, w41Var, mf5Var.c());
        lu3Var.name("contents");
        j8.b(j8.d(nf5.a, false, 1, null)).toJson(lu3Var, w41Var, mf5Var.b());
    }
}
