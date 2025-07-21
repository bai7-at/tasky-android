package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import com.nytimes.android.subauth.core.type.EmailMarketingOptInUiDirectiveValue;
import defpackage.cg5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class gg5 implements h8 {
    public static final gg5 a = new gg5();
    private static final List b = i.e("value");

    private gg5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public cg5.d fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        EmailMarketingOptInUiDirectiveValue emailMarketingOptInUiDirectiveValue = null;
        while (jsonReader.l1(b) == 0) {
            emailMarketingOptInUiDirectiveValue = ez1.a.fromJson(jsonReader, w41Var);
        }
        if (emailMarketingOptInUiDirectiveValue != null) {
            return new cg5.d(emailMarketingOptInUiDirectiveValue);
        }
        vr.a(jsonReader, "value");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, cg5.d dVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(dVar, "value");
        lu3Var.name("value");
        ez1.a.toJson(lu3Var, w41Var, dVar.a());
    }
}
