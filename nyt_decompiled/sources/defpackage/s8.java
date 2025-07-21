package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.q8;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class s8 implements h8 {
    public static final s8 a = new s8();
    private static final List b = i.e("createNoCaptchaNewsletterSubscription");

    private s8() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public q8.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        q8.b bVar = null;
        while (jsonReader.l1(b) == 0) {
            bVar = (q8.b) j8.b(j8.d(r8.a, false, 1, null)).fromJson(jsonReader, w41Var);
        }
        return new q8.c(bVar);
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, q8.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("createNoCaptchaNewsletterSubscription");
        j8.b(j8.d(r8.a, false, 1, null)).toJson(lu3Var, w41Var, cVar.a());
    }
}
