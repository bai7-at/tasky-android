package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class LegacyExceptionErrorInfoJsonAdapter extends JsonAdapter<LegacyExceptionErrorInfo> {
    private volatile Constructor<LegacyExceptionErrorInfo> constructorRef;
    private final JsonAdapter<List<LegacyExceptionInfo>> nullableListOfLegacyExceptionInfoAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public LegacyExceptionErrorInfoJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("ts", "s", "ex");
        zq3.g(a, "JsonReader.Options.of(\"ts\", \"s\", \"ex\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.class, b0.e(), "timestamp");
        zq3.g(f, "moshi.adapter(Long::clas… emptySet(), \"timestamp\")");
        this.nullableLongAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), TransferTable.COLUMN_STATE);
        zq3.g(f2, "moshi.adapter(String::cl…     emptySet(), \"state\")");
        this.nullableStringAdapter = f2;
        JsonAdapter<List<LegacyExceptionInfo>> f3 = iVar.f(j.j(List.class, LegacyExceptionInfo.class), b0.e(), "exceptions");
        zq3.g(f3, "moshi.adapter(Types.newP…emptySet(), \"exceptions\")");
        this.nullableListOfLegacyExceptionInfoAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(46);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LegacyExceptionErrorInfo");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LegacyExceptionErrorInfo fromJson(JsonReader jsonReader) {
        long j;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        String str = null;
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P != -1) {
                if (P == 0) {
                    l = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    j = 4294967294L;
                } else if (P == 1) {
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    j = 4294967293L;
                } else if (P == 2) {
                    list = (List) this.nullableListOfLegacyExceptionInfoAdapter.fromJson(jsonReader);
                    j = 4294967291L;
                }
                i &= (int) j;
            } else {
                jsonReader.f0();
                jsonReader.skipValue();
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967288L)) {
            return new LegacyExceptionErrorInfo(l, str, list);
        }
        Constructor<LegacyExceptionErrorInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LegacyExceptionErrorInfo.class.getDeclaredConstructor(Long.class, String.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "LegacyExceptionErrorInfo…his.constructorRef = it }");
        }
        LegacyExceptionErrorInfo newInstance = constructor.newInstance(l, str, list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LegacyExceptionErrorInfo legacyExceptionErrorInfo) {
        zq3.h(hVar, "writer");
        if (legacyExceptionErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("ts");
        this.nullableLongAdapter.mo197toJson(hVar, legacyExceptionErrorInfo.getTimestamp());
        hVar.C("s");
        this.nullableStringAdapter.mo197toJson(hVar, legacyExceptionErrorInfo.getState());
        hVar.C("ex");
        this.nullableListOfLegacyExceptionInfoAdapter.mo197toJson(hVar, legacyExceptionErrorInfo.getExceptions());
        hVar.l();
    }
}
