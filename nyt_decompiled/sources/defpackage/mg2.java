package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yf2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mg2 implements h8 {
    public static final mg2 a = new mg2();
    private static final List b = i.o("__typename", "promotionalHeadline");

    private mg2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf2.m fromJson(JsonReader jsonReader, w41 w41Var) {
        tf2 tf2Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        og2 og2Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Article"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            tf2Var = uf2.a.fromJson(jsonReader, w41Var);
        } else {
            tf2Var = null;
        }
        if (xa0.c(xa0.e("Interactive"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            og2Var = pg2.a.fromJson(jsonReader, w41Var);
        }
        if (str2 != null) {
            return new yf2.m(str, str2, tf2Var, og2Var);
        }
        vr.a(jsonReader, "promotionalHeadline");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yf2.m mVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(mVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, mVar.d());
        lu3Var.name("promotionalHeadline");
        h8Var.toJson(lu3Var, w41Var, mVar.c());
        if (mVar.a() != null) {
            uf2.a.toJson(lu3Var, w41Var, mVar.a());
        }
        if (mVar.b() != null) {
            pg2.a.toJson(lu3Var, w41Var, mVar.b());
        }
    }
}
