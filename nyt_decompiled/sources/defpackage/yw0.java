package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tw0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class yw0 implements h8 {
    public static final yw0 a = new yw0();
    private static final List b = i.e("node");

    private yw0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tw0.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        tw0.h hVar = null;
        while (jsonReader.l1(b) == 0) {
            hVar = (tw0.h) j8.b(j8.c(bx0.a, true)).fromJson(jsonReader, w41Var);
        }
        return new tw0.e(hVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tw0.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(bx0.a, true)).toJson(lu3Var, w41Var, eVar.a());
    }
}
