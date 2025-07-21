package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uq1;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vq1 implements h8 {
    public static final vq1 a = new vq1();
    private static final List b = i.e("__typename");

    private vq1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uq1.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq1 zq1Var;
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        er1 er1Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Block_Beta"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            zq1Var = br1.a.fromJson(jsonReader, w41Var);
        } else {
            zq1Var = null;
        }
        if (xa0.c(xa0.e("PersonalizedBlock_Beta"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            er1Var = gr1.a.fromJson(jsonReader, w41Var);
        }
        return new uq1.a(str, zq1Var, er1Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uq1.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.c());
        if (aVar.a() != null) {
            br1.a.toJson(lu3Var, w41Var, aVar.a());
        }
        if (aVar.b() != null) {
            gr1.a.toJson(lu3Var, w41Var, aVar.b());
        }
    }
}
