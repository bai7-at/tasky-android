package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.ho3;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import type.Sensitivity;
import type.adapter.Sensitivity_ResponseAdapter;

/* loaded from: classes3.dex */
public final class jo3 implements h8 {
    public static final jo3 a = new jo3();
    private static final List b = i.e("sensitivity");

    private jo3() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ho3.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        Sensitivity sensitivity = null;
        while (jsonReader.l1(b) == 0) {
            sensitivity = Sensitivity_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
        }
        if (sensitivity != null) {
            return new ho3.b(sensitivity);
        }
        vr.a(jsonReader, "sensitivity");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, ho3.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("sensitivity");
        Sensitivity_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, bVar.a());
    }
}
