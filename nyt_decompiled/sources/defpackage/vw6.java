package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uw6;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vw6 implements h8 {
    public static final vw6 a = new vw6();
    private static final List b = i.e("removeUserInterests");

    private vw6() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uw6.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        uw6.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (uw6.c) j8.b(j8.d(ww6.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new uw6.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uw6.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("removeUserInterests");
        j8.b(j8.d(ww6.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
