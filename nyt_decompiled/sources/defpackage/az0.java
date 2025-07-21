package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yy0;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class az0 implements h8 {
    public static final az0 a = new az0();
    private static final List b = i.o("id", "crops", "caption", "credit");

    private az0() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yy0 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        yy0.a aVar = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = j8.a(j8.b(j8.d(bz0.a, false, 1, null))).fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                aVar = (yy0.a) j8.b(j8.d(zy0.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 3) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "id");
            throw new KotlinNothingValueException();
        }
        if (list == null) {
            vr.a(jsonReader, "crops");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new yy0(str, list, aVar, str2);
        }
        vr.a(jsonReader, "credit");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yy0 yy0Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(yy0Var, "value");
        lu3Var.name("id");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, yy0Var.d());
        lu3Var.name("crops");
        j8.a(j8.b(j8.d(bz0.a, false, 1, null))).toJson(lu3Var, w41Var, yy0Var.c());
        lu3Var.name("caption");
        j8.b(j8.d(zy0.a, false, 1, null)).toJson(lu3Var, w41Var, yy0Var.a());
        lu3Var.name("credit");
        h8Var.toJson(lu3Var, w41Var, yy0Var.b());
    }
}
