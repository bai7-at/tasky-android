package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xy;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yy implements h8 {
    public static final yy a = new yy();
    private static final List b = i.e("__typename");

    private yy() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xy fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        xy.b bVar = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            bVar = az.a.fromJson(jsonReader, w41Var);
        }
        return new xy(str, bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xy xyVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(xyVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, xyVar.b());
        if (xyVar.a() != null) {
            az.a.toJson(lu3Var, w41Var, xyVar.a());
        }
    }
}
