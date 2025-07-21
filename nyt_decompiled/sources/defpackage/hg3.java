package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.dg3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class hg3 implements h8 {
    public static final hg3 a = new hg3();
    private static final List b = i.e(AssetConstants.IMAGE_TYPE);

    private hg3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dg3.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        dg3.b bVar = null;
        while (jsonReader.l1(b) == 0) {
            bVar = (dg3.b) j8.b(j8.d(fg3.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new dg3.c(bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, dg3.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        j8.b(j8.d(fg3.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
