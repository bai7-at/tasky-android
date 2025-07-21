package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.es;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class fs implements h8 {
    public static final fs a = new fs();
    private static final List b = i.e("headline");

    private fs() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public es fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        es.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (es.a) j8.b(j8.d(gs.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new es(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, es esVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(esVar, "value");
        lu3Var.name("headline");
        j8.b(j8.d(gs.a, false, 1, null)).toJson(lu3Var, w41Var, esVar.a());
    }
}
