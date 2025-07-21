package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.d65;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class f65 implements h8 {
    public static final f65 a = new f65();
    private static final List b = i.o("productCode", "freeTrialSignupTime", "isFreeTrial");

    private f65() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d65.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Integer num = null;
        Boolean bool = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                num = (Integer) j8.k.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                bool = (Boolean) j8.f.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "productCode");
            throw new KotlinNothingValueException();
        }
        if (bool != null) {
            return new d65.c(str, num, bool.booleanValue());
        }
        vr.a(jsonReader, "isFreeTrial");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, d65.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("productCode");
        j8.a.toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("freeTrialSignupTime");
        j8.k.toJson(lu3Var, w41Var, cVar.a());
        lu3Var.name("isFreeTrial");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(cVar.c()));
    }
}
