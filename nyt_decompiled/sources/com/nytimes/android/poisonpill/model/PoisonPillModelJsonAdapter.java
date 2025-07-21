package com.nytimes.android.poisonpill.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PoisonPillModelJsonAdapter extends JsonAdapter<PoisonPillModel> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Pill> pillAdapter;

    public PoisonPillModelJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("pill", "remainingDismisses", "lastDismissTimestampSeconds");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Pill> f = iVar.f(Pill.class, b0.e(), "pill");
        zq3.g(f, "adapter(...)");
        this.pillAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "remainingDismisses");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "lastDismissTimestampSeconds");
        zq3.g(f3, "adapter(...)");
        this.nullableLongAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PoisonPillModel fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Pill pill = null;
        Integer num = null;
        Long l = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                pill = (Pill) this.pillAdapter.fromJson(jsonReader);
                if (pill == null) {
                    JsonDataException x = c29.x("pill", "pill", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("remainingDismisses", "remainingDismisses", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (pill == null) {
            JsonDataException o = c29.o("pill", "pill", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (num != null) {
            return new PoisonPillModel(pill, num.intValue(), l);
        }
        JsonDataException o2 = c29.o("remainingDismisses", "remainingDismisses", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PoisonPillModel poisonPillModel) {
        zq3.h(hVar, "writer");
        if (poisonPillModel == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("pill");
        this.pillAdapter.mo197toJson(hVar, poisonPillModel.b());
        hVar.C("remainingDismisses");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(poisonPillModel.c()));
        hVar.C("lastDismissTimestampSeconds");
        this.nullableLongAdapter.mo197toJson(hVar, poisonPillModel.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PoisonPillModel");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
