package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeThreadAnrSampleJsonAdapter extends JsonAdapter<NativeThreadAnrSample> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<NativeThreadAnrStackframe>> nullableListOfNativeThreadAnrStackframeAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;

    public NativeThreadAnrSampleJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.EXTERNAL_REFERRER, QueryKeys.TOKEN, QueryKeys.SUBDOMAIN, "s");
        zq3.g(a, "JsonReader.Options.of(\"r\", \"t\", \"d\", \"s\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "result");
        zq3.g(f, "moshi.adapter(Int::class…    emptySet(), \"result\")");
        this.nullableIntAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "sampleTimestamp");
        zq3.g(f2, "moshi.adapter(Long::clas…Set(), \"sampleTimestamp\")");
        this.nullableLongAdapter = f2;
        JsonAdapter<List<NativeThreadAnrStackframe>> f3 = iVar.f(j.j(List.class, NativeThreadAnrStackframe.class), b0.e(), "stackframes");
        zq3.g(f3, "moshi.adapter(Types.newP…mptySet(), \"stackframes\")");
        this.nullableListOfNativeThreadAnrStackframeAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeThreadAnrSample");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeThreadAnrSample fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Long l = null;
        Long l2 = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                list = (List) this.nullableListOfNativeThreadAnrStackframeAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new NativeThreadAnrSample(num, l, l2, list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeThreadAnrSample nativeThreadAnrSample) {
        zq3.h(hVar, "writer");
        if (nativeThreadAnrSample == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.EXTERNAL_REFERRER);
        this.nullableIntAdapter.mo197toJson(hVar, nativeThreadAnrSample.getResult());
        hVar.C(QueryKeys.TOKEN);
        this.nullableLongAdapter.mo197toJson(hVar, nativeThreadAnrSample.getSampleTimestamp());
        hVar.C(QueryKeys.SUBDOMAIN);
        this.nullableLongAdapter.mo197toJson(hVar, nativeThreadAnrSample.getSampleDurationMs());
        hVar.C("s");
        this.nullableListOfNativeThreadAnrStackframeAdapter.mo197toJson(hVar, nativeThreadAnrSample.getStackframes());
        hVar.l();
    }
}
