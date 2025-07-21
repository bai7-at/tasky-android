package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yf2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class lg2 implements h8 {
    public static final lg2 a = new lg2();
    private static final List b = i.o("__typename", "ordering");

    private lg2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf2.l fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                list = j8.a(j8.k).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new yf2.l(str, list);
        }
        vr.a(jsonReader, "ordering");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yf2.l lVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(lVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, lVar.b());
        lu3Var.name("ordering");
        j8.a(j8.k).toJson(lu3Var, w41Var, lVar.a());
    }
}
