package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.jz0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class kz0 implements h8 {
    public static final kz0 a = new kz0();
    private static final List b = i.o("__typename", "promotionalHeadline", "promotionalSummary", "promotionalMedia");

    private kz0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public jz0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        jz0.a aVar = null;
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
                aVar = (jz0.a) j8.b(j8.c(lz0.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "promotionalHeadline");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new jz0(str, str2, str3, aVar);
        }
        vr.a(jsonReader, "promotionalSummary");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, jz0 jz0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(jz0Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, jz0Var.d());
        lu3Var.name("promotionalHeadline");
        h8Var.toJson(lu3Var, w41Var, jz0Var.a());
        lu3Var.name("promotionalSummary");
        h8Var.toJson(lu3Var, w41Var, jz0Var.c());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(lz0.a, true)).toJson(lu3Var, w41Var, jz0Var.b());
    }
}
