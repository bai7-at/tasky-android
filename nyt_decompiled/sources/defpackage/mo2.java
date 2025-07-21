package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mo2 implements h8 {
    public static final mo2 a = new mo2();
    private static final List b = i.e("channels");

    private mo2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ko2 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.d(lo2.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new ko2(list);
        }
        vr.a(jsonReader, "channels");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ko2 ko2Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(ko2Var, "value");
        lu3Var.name("channels");
        j8.a(j8.d(lo2.a, false, 1, null)).toJson(lu3Var, w41Var, ko2Var.a());
    }
}
