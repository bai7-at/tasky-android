package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kw6;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class lw6 implements h8 {
    public static final lw6 a = new lw6();
    private static final List b = i.e("removeFromReadingList");

    private lw6() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw6.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        kw6.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (kw6.d) j8.b(j8.d(nw6.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new kw6.b(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kw6.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("removeFromReadingList");
        j8.b(j8.d(nw6.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
