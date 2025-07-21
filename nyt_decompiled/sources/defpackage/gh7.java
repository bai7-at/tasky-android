package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fh7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class gh7 implements h8 {
    public static final gh7 a = new gh7();
    private static final List b = i.e("playlist");

    private gh7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fh7.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        fh7.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (fh7.e) j8.b(j8.d(jh7.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new fh7.b(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fh7.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("playlist");
        j8.b(j8.d(jh7.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
