package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.dg3;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ig3 implements h8 {
    public static final ig3 a = new ig3();
    private static final List b = i.e("url");

    private ig3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public dg3.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        if (str != null) {
            return new dg3.d(str);
        }
        vr.a(jsonReader, "url");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, dg3.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("url");
        j8.a.toJson(lu3Var, w41Var, dVar.a());
    }
}
