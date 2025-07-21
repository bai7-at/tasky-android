package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.uu7;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class bv7 implements h8 {
    public static final bv7 a = new bv7();
    private static final List b = i.o("default", "seo");

    private bv7() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public uu7.g fromJson(JsonReader jsonReader, w41 w41Var) {
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
            return new uu7.g(str, str2);
        }
        vr.a(jsonReader, "seo");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, uu7.g gVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(gVar, "value");
        lu3Var.name("default");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, gVar.a());
        lu3Var.name("seo");
        h8Var.toJson(lu3Var, w41Var, gVar.b());
    }
}
