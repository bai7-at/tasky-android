package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class AppExitInfoDataJsonAdapter extends JsonAdapter<AppExitInfoData> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public AppExitInfoDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("sid", "side", "im", "pss", "rs", "rss", "st", "ts", "blob", "ds", "trs");
        zq3.g(a, "JsonReader.Options.of(\"s…ts\", \"blob\", \"ds\", \"trs\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "sessionId");
        zq3.g(f, "moshi.adapter(String::cl… emptySet(), \"sessionId\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "importance");
        zq3.g(f2, "moshi.adapter(Int::class…emptySet(), \"importance\")");
        this.nullableIntAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "pss");
        zq3.g(f3, "moshi.adapter(Long::clas…\n      emptySet(), \"pss\")");
        this.nullableLongAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AppExitInfoData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AppExitInfoData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        Long l2 = null;
        Integer num3 = null;
        Long l3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 6:
                    num3 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
                case 7:
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 8:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 9:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 10:
                    str5 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        return new AppExitInfoData(str, str2, num, l, num2, l2, num3, l3, str3, str4, str5);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AppExitInfoData appExitInfoData) {
        zq3.h(hVar, "writer");
        if (appExitInfoData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("sid");
        this.nullableStringAdapter.mo197toJson(hVar, appExitInfoData.getSessionId$embrace_android_sdk_release());
        hVar.C("side");
        this.nullableStringAdapter.mo197toJson(hVar, appExitInfoData.getSessionIdError$embrace_android_sdk_release());
        hVar.C("im");
        this.nullableIntAdapter.mo197toJson(hVar, appExitInfoData.getImportance$embrace_android_sdk_release());
        hVar.C("pss");
        this.nullableLongAdapter.mo197toJson(hVar, appExitInfoData.getPss$embrace_android_sdk_release());
        hVar.C("rs");
        this.nullableIntAdapter.mo197toJson(hVar, appExitInfoData.getReason$embrace_android_sdk_release());
        hVar.C("rss");
        this.nullableLongAdapter.mo197toJson(hVar, appExitInfoData.getRss$embrace_android_sdk_release());
        hVar.C("st");
        this.nullableIntAdapter.mo197toJson(hVar, appExitInfoData.getStatus$embrace_android_sdk_release());
        hVar.C("ts");
        this.nullableLongAdapter.mo197toJson(hVar, appExitInfoData.getTimestamp$embrace_android_sdk_release());
        hVar.C("blob");
        this.nullableStringAdapter.mo197toJson(hVar, appExitInfoData.getTrace$embrace_android_sdk_release());
        hVar.C("ds");
        this.nullableStringAdapter.mo197toJson(hVar, appExitInfoData.getDescription$embrace_android_sdk_release());
        hVar.C("trs");
        this.nullableStringAdapter.mo197toJson(hVar, appExitInfoData.getTraceStatus$embrace_android_sdk_release());
        hVar.l();
    }
}
