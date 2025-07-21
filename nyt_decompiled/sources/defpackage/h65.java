package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.d65;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class h65 implements h8 {
    public static final h65 a = new h65();
    private static final List b = i.e("newsletterSubscriptions");

    private h65() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d65.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        d65.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (d65.d) j8.b(j8.d(g65.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new d65.e(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, d65.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("newsletterSubscriptions");
        j8.b(j8.d(g65.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.a());
    }
}
