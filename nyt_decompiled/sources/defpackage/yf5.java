package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.wf5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class yf5 implements h8 {
    public static final yf5 a = new yf5();
    private static final List b = i.o("tcString", "noticeVersion", "tcDecodedData");

    private yf5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wf5.a fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                str3 = (String) j8.a.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "tcString");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "noticeVersion");
            throw new KotlinNothingValueException();
        }
        if (str3 != null) {
            return new wf5.a(str, str2, str3);
        }
        vr.a(jsonReader, "tcDecodedData");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, wf5.a aVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(aVar, "value");
        lu3Var.name("tcString");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, aVar.c());
        lu3Var.name("noticeVersion");
        h8Var.toJson(lu3Var, w41Var, aVar.a());
        lu3Var.name("tcDecodedData");
        h8Var.toJson(lu3Var, w41Var, aVar.b());
    }
}
