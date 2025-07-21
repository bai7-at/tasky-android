package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yr;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bs implements h8 {
    public static final bs a = new bs();
    private static final List b = i.e("node");

    private bs() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yr.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        yr.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (yr.c) j8.b(j8.c(cs.a, true)).fromJson(jsonReader, w41Var);
        }
        return new yr.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yr.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(cs.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
