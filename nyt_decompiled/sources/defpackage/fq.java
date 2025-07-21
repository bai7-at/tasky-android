package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.eq;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class fq implements h8 {
    public static final fq a = new fq();
    private static final List b = i.o("headline", "bylines", "summary", "kicker", "wordCount");

    private fq() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public eq fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        eq.b bVar = null;
        List list = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                bVar = (eq.b) j8.b(j8.d(hq.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = j8.a(j8.b(j8.d(gq.a, false, 1, null))).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
                    break;
                }
                num = (Integer) j8.k.fromJson(jsonReader, w41Var);
            }
        }
        if (list == null) {
            vr.a(jsonReader, "bylines");
            throw new KotlinNothingValueException();
        }
        if (str == null) {
            vr.a(jsonReader, "summary");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new eq(bVar, list, str, str2, num);
        }
        vr.a(jsonReader, "kicker");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, eq eqVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eqVar, "value");
        lu3Var.name("headline");
        j8.b(j8.d(hq.a, false, 1, null)).toJson(lu3Var, w41Var, eqVar.b());
        lu3Var.name("bylines");
        j8.a(j8.b(j8.d(gq.a, false, 1, null))).toJson(lu3Var, w41Var, eqVar.a());
        lu3Var.name("summary");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, eqVar.d());
        lu3Var.name("kicker");
        h8Var.toJson(lu3Var, w41Var, eqVar.c());
        lu3Var.name("wordCount");
        j8.k.toJson(lu3Var, w41Var, eqVar.e());
    }
}
