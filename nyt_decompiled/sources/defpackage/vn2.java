package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tn2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vn2 implements h8 {
    public static final vn2 a = new vn2();
    private static final List b = i.o("__typename", "trackingParams", "channelUri", "node");

    private vn2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tn2.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        String str2 = null;
        tn2.g gVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = (List) j8.b(j8.a(j8.b(j8.d(fo2.a, false, 1, null)))).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                gVar = (tn2.g) j8.b(j8.c(zn2.a, true)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new tn2.b(str, list, str2, gVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, bVar.d());
        lu3Var.name("trackingParams");
        j8.b(j8.a(j8.b(j8.d(fo2.a, false, 1, null)))).toJson(lu3Var, w41Var, bVar.c());
        lu3Var.name("channelUri");
        j8.i.toJson(lu3Var, w41Var, bVar.a());
        lu3Var.name("node");
        j8.b(j8.c(zn2.a, true)).toJson(lu3Var, w41Var, bVar.b());
    }
}
