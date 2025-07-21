package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tw0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vw0 implements h8 {
    public static final vw0 a = new vw0();
    private static final List b = i.e("hits");

    private vw0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tw0.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        tw0.f fVar = null;
        while (jsonReader.l1(b) == 0) {
            fVar = (tw0.f) j8.b(j8.d(zw0.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new tw0.b(fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tw0.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("hits");
        j8.b(j8.d(zw0.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
