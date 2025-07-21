package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.u55;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class v55 implements h8 {
    public static final v55 a = new v55();
    private static final List b = i.e("__typename");

    private v55() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public u55.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        mp3 mp3Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("LegacyCollection"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            mp3Var = np3.a.fromJson(jsonReader, w41Var);
        }
        return new u55.a(str, mp3Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, u55.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        if (aVar.a() != null) {
            np3.a.toJson(lu3Var, w41Var, aVar.a());
        }
    }
}
