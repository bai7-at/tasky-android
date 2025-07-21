package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lv;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import type.Platform;
import type.adapter.Platform_ResponseAdapter;

/* loaded from: classes3.dex */
public final class xv implements h8 {
    public static final xv a = new xv();
    private static final List b = i.o("url", "platform");

    private xv() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lv.k fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        Platform platform = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 1) {
                    break;
                }
                platform = Platform_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (platform != null) {
            return new lv.k(str, platform);
        }
        vr.a(jsonReader, "platform");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lv.k kVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(kVar, "value");
        lu3Var.name("url");
        j8.a.toJson(lu3Var, w41Var, kVar.b());
        lu3Var.name("platform");
        Platform_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, kVar.a());
    }
}
