package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.oy2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vy2 implements h8 {
    public static final vy2 a = new vy2();
    private static final List b = i.o("__typename", "readingListAssetsConnection");

    private vy2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public oy2.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        oy2.g gVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                gVar = (oy2.g) j8.b(j8.d(uy2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new oy2.h(str, gVar);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, oy2.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, hVar.b());
        lu3Var.name("readingListAssetsConnection");
        j8.b(j8.d(uy2.a, false, 1, null)).toJson(lu3Var, w41Var, hVar.a());
    }
}
