package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.ToggleableUiDirectiveValue;
import defpackage.cg5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class og5 implements h8 {
    public static final og5 a = new og5();
    private static final List b = i.e("value");

    private og5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg5.k fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        ToggleableUiDirectiveValue toggleableUiDirectiveValue = null;
        while (jsonReader.l1(b) == 0) {
            toggleableUiDirectiveValue = in8.a.fromJson(jsonReader, w41Var);
        }
        if (toggleableUiDirectiveValue != null) {
            return new cg5.k(toggleableUiDirectiveValue);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, cg5.k kVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kVar, "value");
        lu3Var.name("value");
        in8.a.toJson(lu3Var, w41Var, kVar.a());
    }
}
