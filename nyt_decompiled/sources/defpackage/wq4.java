package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tq4;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class wq4 implements h8 {
    public static final wq4 a = new wq4();
    private static final List b = i.o("text", "style");

    private wq4() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tq4.c fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "text");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new tq4.c(str, str2);
        }
        vr.a(jsonReader, "style");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tq4.c cVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(cVar, "value");
        lu3Var.name("text");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, cVar.b());
        lu3Var.name("style");
        h8Var.toJson(lu3Var, w41Var, cVar.a());
    }
}
