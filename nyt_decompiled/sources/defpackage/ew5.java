package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.aw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ew5 implements h8 {
    public static final ew5 a = new ew5();
    private static final List b = i.o("id", "uri", "headlineDefault", "summary", "promotionalMedia", "subscriptionUrls");

    private ew5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aw5.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        aw5.c cVar = null;
        String str3 = null;
        aw5.g gVar = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                cVar = (aw5.c) j8.b(j8.d(cw5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                gVar = (aw5.g) j8.b(j8.c(gw5.a, true)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    break;
                }
                list = j8.a(j8.d(hw5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "id");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "uri");
            throw new KotlinNothingValueException();
        }
        if (str3 == null) {
            vr.a(jsonReader, "summary");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new aw5.e(str, str2, cVar, str3, gVar, list);
        }
        vr.a(jsonReader, "subscriptionUrls");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, aw5.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("id");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, eVar.b());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, eVar.f());
        lu3Var.name("headlineDefault");
        j8.b(j8.d(cw5.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.a());
        lu3Var.name("summary");
        h8Var.toJson(lu3Var, w41Var, eVar.e());
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(gw5.a, true)).toJson(lu3Var, w41Var, eVar.c());
        lu3Var.name("subscriptionUrls");
        j8.a(j8.d(hw5.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.d());
    }
}
