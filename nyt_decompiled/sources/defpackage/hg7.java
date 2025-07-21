package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fg7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hg7 implements h8 {
    public static final hg7 a = new hg7();
    private static final List b = i.e("node");

    private hg7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fg7.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        fg7.f fVar = null;
        while (jsonReader.l1(b) == 0) {
            fVar = (fg7.f) j8.b(j8.c(kg7.a, true)).fromJson(jsonReader, w41Var);
        }
        return new fg7.c(fVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fg7.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(kg7.a, true)).toJson(lu3Var, w41Var, cVar.a());
    }
}
