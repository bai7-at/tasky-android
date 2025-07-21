package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.w66;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class z66 implements h8 {
    public static final z66 a = new z66();
    private static final List b = i.e(AssetConstants.IMAGE_TYPE);

    private z66() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public w66.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        w66.b bVar = null;
        while (jsonReader.l1(b) == 0) {
            bVar = (w66.b) j8.b(j8.d(y66.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new w66.c(bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, w66.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        j8.b(j8.d(y66.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
