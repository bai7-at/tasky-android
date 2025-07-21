package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tw0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ax0 implements h8 {
    public static final ax0 a = new ax0();
    private static final List b = i.e("directAnswer");

    private ax0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tw0.g fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        tw0.d dVar = null;
        while (jsonReader.l1(b) == 0) {
            dVar = (tw0.d) j8.b(j8.d(xw0.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new tw0.g(dVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tw0.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("directAnswer");
        j8.b(j8.d(xw0.a, false, 1, null)).toJson(lu3Var, w41Var, gVar.a());
    }
}
