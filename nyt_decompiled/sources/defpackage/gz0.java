package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.fz0;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class gz0 implements h8 {
    public static final gz0 a = new gz0();
    private static final List b = i.e("newsletterProduct");

    private gz0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fz0.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        fz0.b bVar = null;
        while (jsonReader.l1(b) == 0) {
            bVar = (fz0.b) j8.b(j8.d(iz0.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new fz0.a(bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, fz0.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("newsletterProduct");
        j8.b(j8.d(iz0.a, false, 1, null)).toJson(lu3Var, w41Var, aVar.a());
    }
}
