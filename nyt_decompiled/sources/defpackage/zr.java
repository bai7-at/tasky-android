package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yr;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class zr implements h8 {
    public static final zr a = new zr();
    private static final List b = i.o("id", "assets");

    private zr() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yr fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        yr.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                aVar = (yr.a) j8.b(j8.d(as.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new yr(str, aVar);
        }
        vr.a(jsonReader, "id");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yr yrVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(yrVar, "value");
        lu3Var.name("id");
        j8.a.toJson(lu3Var, w41Var, yrVar.b());
        lu3Var.name("assets");
        j8.b(j8.d(as.a, false, 1, null)).toJson(lu3Var, w41Var, yrVar.a());
    }
}
