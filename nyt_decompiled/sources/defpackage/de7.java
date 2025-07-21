package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.be7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class de7 implements h8 {
    public static final de7 a = new de7();
    private static final List b = i.e("promotionalMedia");

    private de7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public be7 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        be7.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (be7.a) j8.b(j8.c(ce7.a, true)).fromJson(jsonReader, w41Var);
        }
        return new be7(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, be7 be7Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(be7Var, "value");
        lu3Var.name("promotionalMedia");
        j8.b(j8.c(ce7.a, true)).toJson(lu3Var, w41Var, be7Var.a());
    }
}
