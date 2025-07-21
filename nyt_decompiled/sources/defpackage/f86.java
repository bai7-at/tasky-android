package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes3.dex */
public final class f86 implements h8 {
    public static final f86 a = new f86();
    private static final List b = i.o("url", "uri");

    private f86() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e86 fromJson(JsonReader jsonReader, w41 w41Var) {
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
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (str2 != null) {
            return new e86(str, str2);
        }
        vr.a(jsonReader, "uri");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, e86 e86Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(e86Var, "value");
        lu3Var.name("url");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, e86Var.b());
        lu3Var.name("uri");
        h8Var.toJson(lu3Var, w41Var, e86Var.a());
    }
}
