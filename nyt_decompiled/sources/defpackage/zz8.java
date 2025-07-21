package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yz8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class zz8 implements h8 {
    public static final zz8 a = new zz8();
    private static final List b = i.e("value");

    private zz8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yz8.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.i.fromJson(jsonReader, w41Var);
        }
        return new yz8.a(str);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yz8.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("value");
        j8.i.toJson(lu3Var, w41Var, aVar.a());
    }
}
