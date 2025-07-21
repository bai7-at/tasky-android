package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class NativeCrashDataErrorJsonAdapter extends JsonAdapter<NativeCrashDataError> {
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonReader.b options;

    public NativeCrashDataErrorJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(QueryKeys.IS_NEW_USER, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.g(a, "JsonReader.Options.of(\"n\", \"c\")");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "number");
        zq3.g(f, "moshi.adapter(Int::class…    emptySet(), \"number\")");
        this.nullableIntAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NativeCrashDataError");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public NativeCrashDataError fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        Integer num2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            } else if (P == 1) {
                num2 = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new NativeCrashDataError(num, num2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NativeCrashDataError nativeCrashDataError) {
        zq3.h(hVar, "writer");
        if (nativeCrashDataError == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(QueryKeys.IS_NEW_USER);
        this.nullableIntAdapter.mo197toJson(hVar, nativeCrashDataError.getNumber());
        hVar.C(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        this.nullableIntAdapter.mo197toJson(hVar, nativeCrashDataError.getContext());
        hVar.l();
    }
}
