package io.embrace.android.embracesdk.payload;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.chartbeat.androidsdk.QueryKeys;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.payload.AnrInterval;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class AnrIntervalJsonAdapter extends JsonAdapter<AnrInterval> {
    private volatile Constructor<AnrInterval> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<AnrSampleList> nullableAnrSampleListAdapter;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<AnrInterval.Type> typeAdapter;

    public AnrIntervalJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("st", "lk", Session.MESSAGE_TYPE_END, QueryKeys.INTERNAL_REFERRER, "se", QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        zq3.g(a, "JsonReader.Options.of(\"s…k\", \"en\", \"v\", \"se\", \"c\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "lastKnownTime");
        zq3.g(f2, "moshi.adapter(Long::clas…tySet(), \"lastKnownTime\")");
        this.nullableLongAdapter = f2;
        JsonAdapter<AnrInterval.Type> f3 = iVar.f(AnrInterval.Type.class, b0.e(), TransferTable.COLUMN_TYPE);
        zq3.g(f3, "moshi.adapter(AnrInterva…java, emptySet(), \"type\")");
        this.typeAdapter = f3;
        JsonAdapter<AnrSampleList> f4 = iVar.f(AnrSampleList.class, b0.e(), "anrSampleList");
        zq3.g(f4, "moshi.adapter(AnrSampleL…tySet(), \"anrSampleList\")");
        this.nullableAnrSampleListAdapter = f4;
        JsonAdapter<Integer> f5 = iVar.f(Integer.class, b0.e(), "code");
        zq3.g(f5, "moshi.adapter(Int::class…      emptySet(), \"code\")");
        this.nullableIntAdapter = f5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("AnrInterval");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public AnrInterval fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        int i = -1;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        AnrInterval.Type type2 = null;
        AnrSampleList anrSampleList = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    Long l4 = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l4 == null) {
                        JsonDataException x = c29.x("startTime", "st", jsonReader);
                        zq3.g(x, "Util.unexpectedNull(\"sta…            \"st\", reader)");
                        throw x;
                    }
                    l = l4;
                    break;
                case 1:
                    i &= (int) 4294967293L;
                    l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    i &= (int) 4294967291L;
                    l3 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    AnrInterval.Type type3 = (AnrInterval.Type) this.typeAdapter.fromJson(jsonReader);
                    if (type3 == null) {
                        JsonDataException x2 = c29.x(TransferTable.COLUMN_TYPE, QueryKeys.INTERNAL_REFERRER, jsonReader);
                        zq3.g(x2, "Util.unexpectedNull(\"type\", \"v\", reader)");
                        throw x2;
                    }
                    i &= (int) 4294967287L;
                    type2 = type3;
                    break;
                case 4:
                    i &= (int) 4294967279L;
                    anrSampleList = (AnrSampleList) this.nullableAnrSampleListAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    i &= (int) 4294967263L;
                    num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967233L)) {
            if (l == null) {
                JsonDataException o = c29.o("startTime", "st", jsonReader);
                zq3.g(o, "Util.missingProperty(\"startTime\", \"st\", reader)");
                throw o;
            }
            long longValue = l.longValue();
            if (type2 != null) {
                return new AnrInterval(longValue, l2, l3, type2, anrSampleList, num);
            }
            throw new NullPointerException("null cannot be cast to non-null type io.embrace.android.embracesdk.payload.AnrInterval.Type");
        }
        Constructor<AnrInterval> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AnrInterval.class.getDeclaredConstructor(Long.TYPE, Long.class, Long.class, AnrInterval.Type.class, AnrSampleList.class, Integer.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "AnrInterval::class.java.…his.constructorRef = it }");
        }
        if (l == null) {
            JsonDataException o2 = c29.o("startTime", "st", jsonReader);
            zq3.g(o2, "Util.missingProperty(\"startTime\", \"st\", reader)");
            throw o2;
        }
        AnrInterval newInstance = constructor.newInstance(l, l2, l3, type2, anrSampleList, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, AnrInterval anrInterval) {
        zq3.h(hVar, "writer");
        if (anrInterval == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(anrInterval.getStartTime()));
        hVar.C("lk");
        this.nullableLongAdapter.mo197toJson(hVar, anrInterval.getLastKnownTime());
        hVar.C(Session.MESSAGE_TYPE_END);
        this.nullableLongAdapter.mo197toJson(hVar, anrInterval.getEndTime());
        hVar.C(QueryKeys.INTERNAL_REFERRER);
        this.typeAdapter.mo197toJson(hVar, anrInterval.getType());
        hVar.C("se");
        this.nullableAnrSampleListAdapter.mo197toJson(hVar, anrInterval.getAnrSampleList());
        hVar.C(QueryKeys.TIME_ON_VIEW_IN_MINUTES);
        this.nullableIntAdapter.mo197toJson(hVar, anrInterval.getCode());
        hVar.l();
    }
}
