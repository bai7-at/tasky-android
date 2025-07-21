package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.em7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class fm7 implements h8 {
    public static final fm7 a = new fm7();
    private static final List b = i.e("setUserState");

    private fm7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public em7.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        em7.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (em7.c) j8.b(j8.c(gm7.a, true)).fromJson(jsonReader, w41Var);
        }
        return new em7.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, em7.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("setUserState");
        j8.b(j8.c(gm7.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
