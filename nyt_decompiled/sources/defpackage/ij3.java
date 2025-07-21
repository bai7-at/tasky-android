package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.hj3;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class ij3 implements h8 {
    public static final ij3 a = new ij3();
    private static final List b = i.o("__typename", "trackingParams", "channelUri", "node");

    private ij3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public hj3 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        String str2 = null;
        hj3.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = (List) j8.b(j8.a(j8.b(j8.d(kj3.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                aVar = (hj3.a) j8.b(j8.c(jj3.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new hj3(str, list, str2, aVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, hj3 hj3Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hj3Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, hj3Var.d());
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(kj3.a, false, 1, null)))).toJson(lu3Var, w41Var, hj3Var.c());
        lu3Var.name("channelUri");
        j8.i.toJson(lu3Var, w41Var, hj3Var.a());
        lu3Var.name("node");
        j8.b(j8.c(jj3.a, true)).toJson(lu3Var, w41Var, hj3Var.b());
    }
}
