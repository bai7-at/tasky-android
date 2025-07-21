package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.pw6;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qw6 implements h8 {
    public static final qw6 a = new qw6();
    private static final List b = i.e("unSubscribeNewsletter");

    private qw6() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public pw6.b fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        pw6.c cVar = null;
        while (jsonReader.l1(b) == 0) {
            cVar = (pw6.c) j8.d(rw6.a, false, 1, null).fromJson(jsonReader, w41Var);
        }
        if (cVar != null) {
            return new pw6.b(cVar);
        }
        vr.a(jsonReader, "unSubscribeNewsletter");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, pw6.b bVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(bVar, "value");
        lu3Var.name("unSubscribeNewsletter");
        j8.d(rw6.a, false, 1, null).toJson(lu3Var, w41Var, bVar.a());
    }
}
