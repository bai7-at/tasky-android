package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.kr7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mr7 implements h8 {
    public static final mr7 a = new mr7();
    private static final List b = i.o("__typename", "node", "trackingParams");

    private mr7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public kr7.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        kr7.c cVar = null;
        List list = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                cVar = (kr7.c) j8.b(j8.c(nr7.a, true)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                list = (List) j8.b(j8.a(j8.b(j8.d(pr7.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new kr7.b(str, cVar, list);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, kr7.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.c());
        lu3Var.name("node");
        j8.b(j8.c(nr7.a, true)).toJson(lu3Var, w41Var, bVar.a());
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(pr7.a, false, 1, null)))).toJson(lu3Var, w41Var, bVar.b());
    }
}
