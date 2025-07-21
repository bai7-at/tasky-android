package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.nk5;

/* loaded from: classes4.dex */
public final class wx8 implements h8 {
    public static final wx8 a = new wx8();

    private wx8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public vx8 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        throw new IllegalStateException("Input type used in output position");
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, vx8 vx8Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(vx8Var, "value");
        if (vx8Var.g() instanceof nk5.c) {
            lu3Var.name("userIdentifier");
            j8.e(j8.b(j8.d(i09.a, false, 1, null))).toJson(lu3Var, w41Var, (nk5.c) vx8Var.g());
        }
        lu3Var.name("settingName");
        y09.a.toJson(lu3Var, w41Var, vx8Var.d());
        if (vx8Var.e() instanceof nk5.c) {
            lu3Var.name("settingNameV2");
            j8.e(j8.b(x09.a)).toJson(lu3Var, w41Var, (nk5.c) vx8Var.e());
        }
        lu3Var.name("newValue");
        z09.a.toJson(lu3Var, w41Var, vx8Var.b());
        lu3Var.name("sourceName");
        j8.a.toJson(lu3Var, w41Var, vx8Var.f());
        lu3Var.name("agentPrefs");
        j8.a(j8.d(v09.a, false, 1, null)).toJson(lu3Var, w41Var, vx8Var.a());
        lu3Var.name("platformDoNotTrackIsOn");
        j8.f.toJson(lu3Var, w41Var, Boolean.valueOf(vx8Var.c()));
    }
}
