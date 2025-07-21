package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.AdConfigurationDirectiveValue;
import defpackage.cg5;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class fg5 implements h8 {
    public static final fg5 a = new fg5();
    private static final List b = i.e("value");

    private fg5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg5.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        AdConfigurationDirectiveValue adConfigurationDirectiveValue = null;
        while (jsonReader.l1(b) == 0) {
            adConfigurationDirectiveValue = (AdConfigurationDirectiveValue) j8.b(z5.a).fromJson(jsonReader, w41Var);
        }
        return new cg5.c(adConfigurationDirectiveValue);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, cg5.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("value");
        j8.b(z5.a).toJson(lu3Var, w41Var, cVar.a());
    }
}
