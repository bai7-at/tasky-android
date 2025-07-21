package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tw0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class xw0 implements h8 {
    public static final xw0 a = new xw0();
    private static final List b = i.o("url", "headline", "summary", "thumbnailUrl");

    private xw0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tw0.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str3 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                str4 = (String) j8.i.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new tw0.d(str, str2, str3, str4);
        }
        vr.a(jsonReader, "headline");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tw0.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("url");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, dVar.d());
        lu3Var.name("headline");
        h8Var.toJson(lu3Var, w41Var, dVar.a());
        lu3Var.name("summary");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, dVar.b());
        lu3Var.name("thumbnailUrl");
        ya5Var.toJson(lu3Var, w41Var, dVar.c());
    }
}
