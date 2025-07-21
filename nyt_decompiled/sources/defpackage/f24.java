package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.e24;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class f24 implements h8 {
    public static final f24 a = new f24();
    private static final List b = i.e("node");

    private f24() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e24.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        e24.b bVar = null;
        while (jsonReader.l1(b) == 0) {
            bVar = (e24.b) j8.b(j8.c(h24.a, true)).fromJson(jsonReader, w41Var);
        }
        return new e24.a(bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, e24.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("node");
        j8.b(j8.c(h24.a, true)).toJson(lu3Var, w41Var, aVar.a());
    }
}
