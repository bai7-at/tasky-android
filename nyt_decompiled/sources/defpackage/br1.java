package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.zq1;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class br1 implements h8 {
    public static final br1 a = new br1();
    private static final List b = i.o("__typename", "dataId", "title", "link", "dataSource", "assets");

    private br1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public zq1 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        zq1.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                str4 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else if (l1 == 4) {
                str5 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 5) {
                    break;
                }
                aVar = (zq1.a) j8.b(j8.d(ar1.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new zq1(str, str2, str3, str4, str5, aVar);
        }
        vr.a(jsonReader, "dataId");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, zq1 zq1Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(zq1Var, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, zq1Var.f());
        lu3Var.name("dataId");
        h8Var.toJson(lu3Var, w41Var, zq1Var.b());
        lu3Var.name("title");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, zq1Var.e());
        lu3Var.name("link");
        ya5Var.toJson(lu3Var, w41Var, zq1Var.d());
        lu3Var.name("dataSource");
        ya5Var.toJson(lu3Var, w41Var, zq1Var.c());
        lu3Var.name("assets");
        j8.b(j8.d(ar1.a, false, 1, null)).toJson(lu3Var, w41Var, zq1Var.a());
    }
}
