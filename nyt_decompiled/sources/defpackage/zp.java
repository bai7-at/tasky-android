package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tp;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class zp implements h8 {
    public static final zp a = new zp();
    private static final List b = i.e("target");

    private zp() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.i.fromJson(jsonReader, w41Var);
        }
        return new tp.e(str);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tp.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("target");
        j8.i.toJson(lu3Var, w41Var, eVar.a());
    }
}
