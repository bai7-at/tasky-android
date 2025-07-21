package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.tp;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class vp implements h8 {
    public static final vp a = new vp();
    private static final List b = i.o("target", "minViewportWidth");

    private vp() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public tp.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Integer num = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                num = (Integer) j8.b.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "target");
            throw new KotlinNothingValueException();
        }
        if (num != null) {
            return new tp.a(str, num.intValue());
        }
        vr.a(jsonReader, "minViewportWidth");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, tp.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("target");
        j8.a.toJson(lu3Var, w41Var, aVar.b());
        lu3Var.name("minViewportWidth");
        j8.b.toJson(lu3Var, w41Var, Integer.valueOf(aVar.a()));
    }
}
