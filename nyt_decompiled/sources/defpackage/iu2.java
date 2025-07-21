package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bu2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class iu2 implements h8 {
    public static final iu2 a = new iu2();
    private static final List b = i.e("node");

    private iu2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bu2.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        bu2.m mVar = null;
        while (jsonReader.l1(b) == 0) {
            mVar = (bu2.m) j8.b(j8.c(nu2.a, true)).fromJson(jsonReader, w41Var);
        }
        return new bu2.h(mVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bu2.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(nu2.a, true)).toJson(lu3Var, w41Var, hVar.a());
    }
}
