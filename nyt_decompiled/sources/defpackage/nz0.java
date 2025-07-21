package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class nz0 implements h8 {
    public static final nz0 a = new nz0();
    private static final List b = i.e("__typename");

    private nz0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public mz0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        while (jsonReader.l1(b) == 0) {
            str = (String) j8.a.fromJson(jsonReader, w41Var);
        }
        jsonReader.q();
        jz0 fromJson = kz0.a.fromJson(jsonReader, w41Var);
        if (str != null) {
            return new mz0(str, fromJson);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, mz0 mz0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(mz0Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, mz0Var.b());
        kz0.a.toJson(lu3Var, w41Var, mz0Var.a());
    }
}
