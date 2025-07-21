package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeThreadAnrStackframeJsonAdapter extends JsonAdapter<NativeThreadAnrStackframe> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public NativeThreadAnrStackframeJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("pc", "l", "p", QueryKeys.EXTERNAL_REFERRER);
        zq3.g(a, "JsonReader.Options.of(\"pc\", \"l\", \"p\", \"r\")");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "pc");
        zq3.g(f, "moshi.adapter(String::cl…,\n      emptySet(), \"pc\")");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.class, b0.e(), "result");
        zq3.g(f2, "moshi.adapter(Int::class…    emptySet(), \"result\")");
        this.nullableIntAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeThreadAnrStackframe");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeThreadAnrStackframe fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new NativeThreadAnrStackframe(str, str2, str3, num);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeThreadAnrStackframe nativeThreadAnrStackframe) {
        zq3.h(hVar, "writer");
        if (nativeThreadAnrStackframe == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("pc");
        this.nullableStringAdapter.mo197toJson(hVar, nativeThreadAnrStackframe.getPc$embrace_android_sdk_release());
        hVar.C("l");
        this.nullableStringAdapter.mo197toJson(hVar, nativeThreadAnrStackframe.getSoLoadAddr$embrace_android_sdk_release());
        hVar.C("p");
        this.nullableStringAdapter.mo197toJson(hVar, nativeThreadAnrStackframe.getSoPath$embrace_android_sdk_release());
        hVar.C(QueryKeys.EXTERNAL_REFERRER);
        this.nullableIntAdapter.mo197toJson(hVar, nativeThreadAnrStackframe.getResult$embrace_android_sdk_release());
        hVar.l();
    }
}
