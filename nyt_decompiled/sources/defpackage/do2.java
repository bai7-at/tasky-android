package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tn2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class do2 implements h8 {
    public static final do2 a = new do2();
    private static final List b = i.o("__typename", "headline", "summary");

    private do2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tn2.k fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.i.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str3 = (String) j8.i.fromJson(jsonReader, w41Var);
            }
        }
        if (str != null) {
            return new tn2.k(str, str2, str3);
        }
        vr.a(jsonReader, "__typename");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tn2.k kVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kVar, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, kVar.c());
        lu3Var.name("headline");
        ya5 ya5Var = j8.i;
        ya5Var.toJson(lu3Var, w41Var, kVar.a());
        lu3Var.name("summary");
        ya5Var.toJson(lu3Var, w41Var, kVar.b());
    }
}
