package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.yf2;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import type.DateTime;
import type.InterestType;
import type.adapter.InterestType_ResponseAdapter;

/* loaded from: classes3.dex */
public final class ig2 implements h8 {
    public static final ig2 a = new ig2();
    private static final List b = i.o("__typename", "interestType", "updatedAt", "metadata", "data");

    private ig2() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public yf2 fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        InterestType interestType = null;
        Instant instant = null;
        yf2.l lVar = null;
        yf2.e eVar = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                interestType = InterestType_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
            } else if (l1 == 2) {
                instant = (Instant) j8.b(w41Var.h(DateTime.Companion.getType())).fromJson(jsonReader, w41Var);
            } else if (l1 == 3) {
                lVar = (yf2.l) j8.b(j8.d(lg2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 4) {
                    break;
                }
                eVar = (yf2.e) j8.b(j8.d(dg2.a, false, 1, null)).fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (interestType != null) {
            return new yf2(str, interestType, instant, lVar, eVar);
        }
        vr.a(jsonReader, "interestType");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, yf2 yf2Var) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(yf2Var, "value");
        lu3Var.name("__typename");
        j8.a.toJson(lu3Var, w41Var, yf2Var.e());
        lu3Var.name("interestType");
        InterestType_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, yf2Var.b());
        lu3Var.name("updatedAt");
        j8.b(w41Var.h(DateTime.Companion.getType())).toJson(lu3Var, w41Var, yf2Var.d());
        lu3Var.name("metadata");
        j8.b(j8.d(lg2.a, false, 1, null)).toJson(lu3Var, w41Var, yf2Var.c());
        lu3Var.name("data");
        j8.b(j8.d(dg2.a, false, 1, null)).toJson(lu3Var, w41Var, yf2Var.a());
    }
}
