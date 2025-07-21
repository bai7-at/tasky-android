package com.nytimes.android.messaging.postloginregioffers.model;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PostAuthScheduledSkuJsonAdapter extends JsonAdapter<PostAuthScheduledSku> {
    public static final int $stable = 8;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PostAuthScheduledSkuJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("sku", "start_time_interval", "end_time_interval");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "sku");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "startTimeInterval");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PostAuthScheduledSku fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x("sku", "sku", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("startTimeInterval", "start_time_interval", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2 && (num2 = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x3 = c29.x("endTimeInterval", "end_time_interval", jsonReader);
                zq3.g(x3, "unexpectedNull(...)");
                throw x3;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("sku", "sku", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (num == null) {
            JsonDataException o2 = c29.o("startTimeInterval", "start_time_interval", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        int intValue = num.intValue();
        if (num2 != null) {
            return new PostAuthScheduledSku(str, intValue, num2.intValue());
        }
        JsonDataException o3 = c29.o("endTimeInterval", "end_time_interval", jsonReader);
        zq3.g(o3, "missingProperty(...)");
        throw o3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PostAuthScheduledSku postAuthScheduledSku) {
        zq3.h(hVar, "writer");
        if (postAuthScheduledSku == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("sku");
        this.stringAdapter.mo197toJson(hVar, postAuthScheduledSku.getSku());
        hVar.C("start_time_interval");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(postAuthScheduledSku.getStartTimeInterval()));
        hVar.C("end_time_interval");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(postAuthScheduledSku.getEndTimeInterval()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PostAuthScheduledSku");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
