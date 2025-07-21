package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.pz0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class sz0 implements h8 {
    public static final sz0 a = new sz0();
    private static final List b = i.e(AssetConstants.IMAGE_TYPE);

    private sz0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public pz0.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        pz0.a aVar = null;
        while (jsonReader.l1(b) == 0) {
            aVar = (pz0.a) j8.b(j8.c(rz0.a, true)).fromJson(jsonReader, w41Var);
        }
        return new pz0.b(aVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, pz0.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name(AssetConstants.IMAGE_TYPE);
        j8.b(j8.c(rz0.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
