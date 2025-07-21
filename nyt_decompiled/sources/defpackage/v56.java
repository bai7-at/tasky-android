package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.s56;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class v56 implements h8 {
    public static final v56 a = new v56();
    private static final List b = i.e("promotionalMedia");

    private v56() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public s56.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        s56.k kVar = null;
        while (jsonReader.l1(b) == 0) {
            kVar = (s56.k) j8.b(j8.c(d66.a, true)).fromJson(jsonReader, w41Var);
        }
        return new s56.c(kVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, s56.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(d66.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
