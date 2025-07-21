package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.g22;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class o22 implements h8 {
    public static final o22 a = new o22();
    private static final List b = i.o("__typename", "title", AssetConstants.IMAGE_TYPE);

    private o22() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public g22.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        g22.b bVar = null;
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
                bVar = (g22.b) j8.b(j8.c(n22.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new g22.c(str, str2, bVar);
        }
        vr.a(jsonReader, "title");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, g22.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, cVar.c());
        lu3Var.name("title");
        h8Var.toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        j8.b(j8.c(n22.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
