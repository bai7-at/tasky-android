package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.xy;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class az implements h8 {
    public static final az a = new az();
    private static final List b = i.e("crops");

    private az() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public xy.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        List list = null;
        while (jsonReader.l1(b) == 0) {
            list = j8.a(j8.b(j8.d(zy.a, false, 1, null))).fromJson(jsonReader, w41Var);
        }
        if (list != null) {
            return new xy.b(list);
        }
        vr.a(jsonReader, "crops");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, xy.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(zy.a, false, 1, null))).toJson(lu3Var, w41Var, bVar.a());
    }
}
