package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.sd8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class td8 implements h8 {
    public static final td8 a = new td8();
    private static final List b = i.e("__typename");

    private td8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public sd8.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        yr yrVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("LegacyCollection"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            yrVar = zr.a.fromJson(jsonReader, w41Var);
        }
        return new sd8.a(str, yrVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, sd8.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        if (aVar.a() != null) {
            zr.a.toJson(lu3Var, w41Var, aVar.a());
        }
    }
}
