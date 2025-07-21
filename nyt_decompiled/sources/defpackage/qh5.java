package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ph5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qh5 implements h8 {
    public static final qh5 a = new qh5();
    private static final List b = i.e("home");

    private qh5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ph5.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ph5.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (ph5.c) j8.b(j8.c(rh5.a, true)).fromJson(jsonReader, w41Var);
        }
        return new ph5.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ph5.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("home");
        j8.b(j8.c(rh5.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
