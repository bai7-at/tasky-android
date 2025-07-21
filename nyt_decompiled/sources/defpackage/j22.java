package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class j22 implements h8 {
    public static final j22 a = new j22();
    private static final List b = i.e("crops");

    private j22() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public h22 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.b(j8.d(i22.a, false, 1, null))).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new h22(list);
        }
        vr.a(jsonReader, "crops");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, h22 h22Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(h22Var, "value");
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(i22.a, false, 1, null))).toJson(lu3Var, w41Var, h22Var.a());
    }
}
