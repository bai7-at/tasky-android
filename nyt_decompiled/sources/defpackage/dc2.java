package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.wb2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class dc2 implements h8 {
    public static final dc2 a = new dc2();
    private static final List b = i.o("default", "seo");

    private dc2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wb2.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "default");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new wb2.f(str, str2);
        }
        vr.a(jsonReader, "seo");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wb2.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("default");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, fVar.a());
        lu3Var.name("seo");
        h8Var.toJson(lu3Var, w41Var, fVar.b());
    }
}
