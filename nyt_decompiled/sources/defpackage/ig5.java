package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.PrivacyTargetingValue;
import defpackage.cg5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class ig5 implements h8 {
    public static final ig5 a = new ig5();
    private static final List b = i.e("value");

    private ig5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg5.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        PrivacyTargetingValue privacyTargetingValue = null;
        while (jsonReader.l1(b) == 0) {
            privacyTargetingValue = l36.a.fromJson(jsonReader, w41Var);
        }
        if (privacyTargetingValue != null) {
            return new cg5.f(privacyTargetingValue);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, cg5.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("value");
        l36.a.toJson(lu3Var, w41Var, fVar.a());
    }
}
