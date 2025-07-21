package com.nytimes.android.subauth.core.purr.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class TcfPreferenceDataJsonAdapter extends JsonAdapter<TcfPreferenceData> {
    private final JsonAdapter<CurrentTCFNoticeData> currentTCFNoticeDataAdapter;
    private final JsonAdapter<UserTCFData> nullableUserTCFDataAdapter;
    private final JsonReader.b options;

    public TcfPreferenceDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("currentNoticeData", "userTCFData");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<CurrentTCFNoticeData> f = iVar.f(CurrentTCFNoticeData.class, b0.e(), "currentNoticeData");
        zq3.g(f, "adapter(...)");
        this.currentTCFNoticeDataAdapter = f;
        JsonAdapter<UserTCFData> f2 = iVar.f(UserTCFData.class, b0.e(), "userTCFData");
        zq3.g(f2, "adapter(...)");
        this.nullableUserTCFDataAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("TcfPreferenceData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public TcfPreferenceData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        CurrentTCFNoticeData currentTCFNoticeData = null;
        UserTCFData userTCFData = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                currentTCFNoticeData = (CurrentTCFNoticeData) this.currentTCFNoticeDataAdapter.fromJson(jsonReader);
                if (currentTCFNoticeData == null) {
                    JsonDataException x = c29.x("currentNoticeData", "currentNoticeData", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                userTCFData = (UserTCFData) this.nullableUserTCFDataAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (currentTCFNoticeData != null) {
            return new TcfPreferenceData(currentTCFNoticeData, userTCFData);
        }
        JsonDataException o = c29.o("currentNoticeData", "currentNoticeData", jsonReader);
        zq3.g(o, "missingProperty(...)");
        throw o;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, TcfPreferenceData tcfPreferenceData) {
        zq3.h(hVar, "writer");
        if (tcfPreferenceData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("currentNoticeData");
        this.currentTCFNoticeDataAdapter.mo197toJson(hVar, tcfPreferenceData.getCurrentNoticeData());
        hVar.C("userTCFData");
        this.nullableUserTCFDataAdapter.mo197toJson(hVar, tcfPreferenceData.getUserTCFData());
        hVar.l();
    }
}
