package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class qw5 implements h8 {
    public static final qw5 a = new qw5();
    private static final List b = i.o("id", "subscriptionUrls", "stream");

    private qw5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lw5.f fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        List list = null;
        lw5.g gVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                list = j8.a(j8.d(sw5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                gVar = (lw5.g) j8.b(j8.d(rw5.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "id");
            throw new KotlinNothingValueException();
        }
        if (list != null) {
            return new lw5.f(str, list, gVar);
        }
        vr.a(jsonReader, "subscriptionUrls");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lw5.f fVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(fVar, "value");
        lu3Var.name("id");
        j8.a.toJson(lu3Var, w41Var, fVar.a());
        lu3Var.name("subscriptionUrls");
        j8.a(j8.d(sw5.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.c());
        lu3Var.name("stream");
        j8.b(j8.d(rw5.a, false, 1, null)).toJson(lu3Var, w41Var, fVar.b());
    }
}
