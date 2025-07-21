package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fg7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ig7 implements h8 {
    public static final ig7 a = new ig7();
    private static final List b = i.e("mostPopularAssets");

    private ig7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fg7.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        fg7.e eVar = null;
        while (jsonReader.l1(b) == 0) {
            eVar = (fg7.e) j8.b(j8.d(jg7.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new fg7.d(eVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fg7.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("mostPopularAssets");
        j8.b(j8.d(jg7.a, false, 1, null)).toJson(lu3Var, w41Var, dVar.a());
    }
}
