package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.bu2;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class mu2 implements h8 {
    public static final mu2 a = new mu2();
    private static final List b = i.e("assets");

    private mu2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public bu2.l fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        bu2.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (bu2.c) j8.b(j8.d(eu2.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new bu2.l(cVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, bu2.l lVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(lVar, "value");
        lu3Var.name("assets");
        j8.b(j8.d(eu2.a, false, 1, null)).toJson(lu3Var, w41Var, lVar.a());
    }
}
