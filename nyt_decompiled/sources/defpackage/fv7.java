package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.uu7;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class fv7 implements h8 {
    public static final fv7 a = new fv7();
    private static final List b = i.o("caption", AssetConstants.IMAGE_TYPE);

    private fv7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uu7.k fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        uu7.d dVar = null;
        uu7.h hVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                dVar = (uu7.d) j8.b(j8.d(yu7.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    return new uu7.k(dVar, hVar);
                }
                hVar = (uu7.h) j8.b(j8.c(cv7.a, true)).fromJson(jsonReader, w41Var);
            }
        }
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uu7.k kVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kVar, "value");
        lu3Var.name("caption");
        j8.b(j8.d(yu7.a, false, 1, null)).toJson(lu3Var, w41Var, kVar.a());
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        j8.b(j8.c(cv7.a, true)).toJson(lu3Var, w41Var, kVar.b());
    }
}
