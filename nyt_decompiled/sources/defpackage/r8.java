package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class r8 implements h8 {
    public static final r8 a = new r8();
    private static final List b = i.e("message");

    private r8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q8.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.i.fromJson(jsonReader, w41Var);
        }
        return new q8.b(str);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, q8.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("message");
        j8.i.toJson(lu3Var, w41Var, bVar.a());
    }
}
