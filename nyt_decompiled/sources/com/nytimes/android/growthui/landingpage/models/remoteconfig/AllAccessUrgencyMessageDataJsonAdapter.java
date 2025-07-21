package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class AllAccessUrgencyMessageDataJsonAdapter extends JsonAdapter<AllAccessUrgencyMessageData> {
    public static final int $stable = 8;
    private volatile Constructor<AllAccessUrgencyMessageData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public AllAccessUrgencyMessageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("start_time_interval", "end_time_interval", "text", "sub_headline_text");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "startTimeInterval");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "headline");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AllAccessUrgencyMessageData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("startTimeInterval", "start_time_interval", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                l2 = (Long) this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    JsonDataException x2 = c29.x("endTimeInterval", "end_time_interval", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x3 = c29.x("headline", "text", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i &= -5;
            } else if (P == 3) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x4 = c29.x("subHeadline", "sub_headline_text", jsonReader);
                    zq3.g(x4, "unexpectedNull(...)");
                    throw x4;
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -13) {
            if (l == null) {
                JsonDataException o = c29.o("startTimeInterval", "start_time_interval", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            long longValue = l.longValue();
            if (l2 == null) {
                JsonDataException o2 = c29.o("endTimeInterval", "end_time_interval", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            long longValue2 = l2.longValue();
            zq3.f(str, "null cannot be cast to non-null type kotlin.String");
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            return new AllAccessUrgencyMessageData(longValue, longValue2, str, str2);
        }
        Constructor<AllAccessUrgencyMessageData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            constructor = AllAccessUrgencyMessageData.class.getDeclaredConstructor(cls, cls, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (l == null) {
            JsonDataException o3 = c29.o("startTimeInterval", "start_time_interval", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (l2 == null) {
            JsonDataException o4 = c29.o("endTimeInterval", "end_time_interval", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        AllAccessUrgencyMessageData newInstance = constructor.newInstance(l, l2, str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AllAccessUrgencyMessageData allAccessUrgencyMessageData) {
        zq3.h(hVar, "writer");
        if (allAccessUrgencyMessageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("start_time_interval");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(allAccessUrgencyMessageData.getStartTimeInterval()));
        hVar.C("end_time_interval");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(allAccessUrgencyMessageData.getEndTimeInterval()));
        hVar.C("text");
        this.stringAdapter.mo197toJson(hVar, allAccessUrgencyMessageData.a());
        hVar.C("sub_headline_text");
        this.stringAdapter.mo197toJson(hVar, allAccessUrgencyMessageData.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AllAccessUrgencyMessageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
