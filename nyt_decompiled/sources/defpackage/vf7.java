package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.rf7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vf7 implements h8 {
    public static final vf7 a = new vf7();
    private static final List b = i.o("uri", "section", "subsection", "assets");

    private vf7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public rf7.e fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        rf7.g gVar = null;
        rf7.h hVar = null;
        rf7.a aVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                gVar = (rf7.g) j8.b(j8.d(xf7.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                hVar = (rf7.h) j8.b(j8.d(yf7.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                aVar = (rf7.a) j8.b(j8.d(sf7.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new rf7.e(str, gVar, hVar, aVar);
        }
        vr.a(jsonReader, "uri");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, rf7.e eVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(eVar, "value");
        lu3Var.name("uri");
        j8.a.toJson(lu3Var, w41Var, eVar.d());
        lu3Var.name("section");
        j8.b(j8.d(xf7.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.b());
        lu3Var.name("subsection");
        j8.b(j8.d(yf7.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.c());
        lu3Var.name("assets");
        j8.b(j8.d(sf7.a, false, 1, null)).toJson(lu3Var, w41Var, eVar.a());
    }
}
