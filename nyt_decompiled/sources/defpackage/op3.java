package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.mp3;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class op3 implements h8 {
    public static final op3 a = new op3();
    private static final List b = i.e("__typename");

    private op3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public mp3.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        wp3 wp3Var = null;
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (xa0.c(xa0.e("Image"), w41Var.c, str, w41Var.d, null)) {
            jsonReader.q();
            wp3Var = zp3.a.fromJson(jsonReader, w41Var);
        }
        return new mp3.a(str, wp3Var);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, mp3.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        if (aVar.a() != null) {
            zp3.a.toJson(lu3Var, w41Var, aVar.a());
        }
    }
}
