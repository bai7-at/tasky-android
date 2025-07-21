package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.aj5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bj5 implements h8 {
    public static final bj5 a = new bj5();
    private static final List b = i.e("creators");

    private bj5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public aj5.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.c(cj5.a, true)).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new aj5.a(list);
        }
        vr.a(jsonReader, "creators");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, aj5.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("creators");
        j8.a(j8.c(cj5.a, true)).toJson(lu3Var, w41Var, aVar.a());
    }
}
