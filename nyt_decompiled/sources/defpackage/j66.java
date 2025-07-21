package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.r56;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class j66 implements h8 {
    public static final j66 a = new j66();
    private static final List b = i.e("promotionalMedia");

    private j66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public r56.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        r56.i iVar = null;
        while (jsonReader.l1(b) == 0) {
            iVar = (r56.i) j8.b(j8.c(r66.a, true)).fromJson(jsonReader, w41Var);
        }
        return new r56.b(iVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, r56.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(r66.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
