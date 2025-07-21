package io.embrace.android.embracesdk.payload;

import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
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
public final class AnrSampleJsonAdapter extends JsonAdapter<AnrSample> {
    private volatile Constructor<AnrSample> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<List<ThreadInfo>> nullableListOfThreadInfoAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;

    public AnrSampleJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("ts", "threads", QueryKeys.DOCUMENT_WIDTH, QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.g(a, "JsonReader.Options.of(\"ts\", \"threads\", \"o\", \"c\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "timestamp");
        zq3.g(f, "moshi.adapter(Long::clas…Set(),\n      \"timestamp\")");
        this.longAdapter = f;
        JsonAdapter<List<ThreadInfo>> f2 = iVar.f(j.j(List.class, ThreadInfo.class), b0.e(), "threads");
        zq3.g(f2, "moshi.adapter(Types.newP…   emptySet(), \"threads\")");
        this.nullableListOfThreadInfoAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.class, b0.e(), "sampleOverheadMs");
        zq3.g(f3, "moshi.adapter(Long::clas…et(), \"sampleOverheadMs\")");
        this.nullableLongAdapter = f3;
        JsonAdapter<Integer> f4 = iVar.f(Integer.class, b0.e(), "code");
        zq3.g(f4, "moshi.adapter(Int::class…      emptySet(), \"code\")");
        this.nullableIntAdapter = f4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AnrSample");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AnrSample fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        List list = null;
        Long l2 = null;
        Integer num = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("timestamp", "ts", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"tim…            \"ts\", reader)");
                    throw x;
                }
            } else if (P == 1) {
                list = (List) this.nullableListOfThreadInfoAdapter.fromJson(jsonReader);
            } else if (P == 2) {
                l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
            } else if (P == 3) {
                i &= (int) 4294967287L;
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967287L)) {
            if (l != null) {
                return new AnrSample(l.longValue(), list, l2, num);
            }
            JsonDataException o = c29.o("timestamp", "ts", jsonReader);
            zq3.g(o, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
            throw o;
        }
        Constructor<AnrSample> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AnrSample.class.getDeclaredConstructor(Long.TYPE, List.class, Long.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AnrSample::class.java.ge…his.constructorRef = it }");
        }
        if (l == null) {
            JsonDataException o2 = c29.o("timestamp", "ts", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"timestamp\", \"ts\", reader)");
            throw o2;
        }
        AnrSample newInstance = constructor.newInstance(l, list, l2, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AnrSample anrSample) {
        zq3.h(hVar, "writer");
        if (anrSample == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("ts");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(anrSample.getTimestamp()));
        hVar.C("threads");
        this.nullableListOfThreadInfoAdapter.mo197toJson(hVar, anrSample.getThreads());
        hVar.C(QueryKeys.DOCUMENT_WIDTH);
        this.nullableLongAdapter.mo197toJson(hVar, anrSample.getSampleOverheadMs());
        hVar.C(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        this.nullableIntAdapter.mo197toJson(hVar, anrSample.getCode());
        hVar.l();
    }
}
