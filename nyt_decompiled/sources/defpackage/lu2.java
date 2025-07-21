package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bu2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class lu2 implements h8 {
    public static final lu2 a = new lu2();
    private static final List b = i.e("node");

    private lu2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bu2.k fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        bu2.p pVar = null;
        while (jsonReader.l1(b) == 0) {
            pVar = (bu2.p) j8.b(j8.c(qu2.a, true)).fromJson(jsonReader, w41Var);
        }
        return new bu2.k(pVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bu2.k kVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(qu2.a, true)).toJson(lu3Var, w41Var, kVar.a());
    }
}
