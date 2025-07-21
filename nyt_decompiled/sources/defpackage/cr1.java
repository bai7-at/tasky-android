package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.zq1;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class cr1 implements h8 {
    public static final cr1 a = new cr1();
    private static final List b = i.o("__typename", "node");

    private cr1() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public zq1.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        zq1.c cVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                cVar = (zq1.c) j8.b(j8.c(dr1.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new zq1.b(str, cVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, zq1.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.b());
        lu3Var.name("node");
        j8.b(j8.c(dr1.a, true)).toJson(lu3Var, w41Var, bVar.a());
    }
}
