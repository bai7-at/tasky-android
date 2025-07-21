package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.zy4;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class az4 implements h8 {
    public static final az4 a = new az4();
    private static final List b = i.e("updateUserPrivacyPrefsV2");

    private az4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public zy4.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        zy4.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (zy4.c) j8.b(j8.d(bz4.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new zy4.b(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, zy4.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("updateUserPrivacyPrefsV2");
        j8.b(j8.d(bz4.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
