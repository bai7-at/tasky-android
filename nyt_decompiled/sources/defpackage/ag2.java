package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yf2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ag2 implements h8 {
    public static final ag2 a = new ag2();
    private static final List b = i.o("__typename", "hits");

    private ag2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf2.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        yf2.j jVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                jVar = (yf2.j) j8.b(j8.d(jg2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new yf2.b(str, jVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yf2.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("hits");
        j8.b(j8.d(jg2.a, false, 1, null)).toJson(lu3Var, w41Var, bVar.a());
    }
}
