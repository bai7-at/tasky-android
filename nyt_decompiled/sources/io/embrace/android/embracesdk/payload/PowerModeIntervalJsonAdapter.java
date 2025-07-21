package io.embrace.android.embracesdk.payload;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes5.dex */
public final class PowerModeIntervalJsonAdapter extends JsonAdapter<PowerModeInterval> {
    private volatile Constructor<PowerModeInterval> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<Long> nullableLongAdapter;
    private final JsonReader.b options;

    public PowerModeIntervalJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("st", Session.MESSAGE_TYPE_END);
        zq3.g(a, "JsonReader.Options.of(\"st\", \"en\")");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "startTime");
        zq3.g(f, "moshi.adapter(Long::clas…Set(),\n      \"startTime\")");
        this.longAdapter = f;
        JsonAdapter<Long> f2 = iVar.f(Long.class, b0.e(), "endTime");
        zq3.g(f2, "moshi.adapter(Long::clas…   emptySet(), \"endTime\")");
        this.nullableLongAdapter = f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PowerModeInterval");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public PowerModeInterval fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("startTime", "st", jsonReader);
                    zq3.g(x, "Util.unexpectedNull(\"sta…            \"st\", reader)");
                    throw x;
                }
            } else if (P == 1) {
                l2 = (Long) this.nullableLongAdapter.fromJson(jsonReader);
                i &= (int) 4294967293L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967293L)) {
            if (l != null) {
                return new PowerModeInterval(l.longValue(), l2);
            }
            JsonDataException o = c29.o("startTime", "st", jsonReader);
            zq3.g(o, "Util.missingProperty(\"startTime\", \"st\", reader)");
            throw o;
        }
        Constructor<PowerModeInterval> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PowerModeInterval.class.getDeclaredConstructor(Long.TYPE, Long.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "PowerModeInterval::class…his.constructorRef = it }");
        }
        if (l != null) {
            PowerModeInterval newInstance = constructor.newInstance(l, l2, Integer.valueOf(i), null);
            zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return newInstance;
        }
        JsonDataException o2 = c29.o("startTime", "st", jsonReader);
        zq3.g(o2, "Util.missingProperty(\"startTime\", \"st\", reader)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PowerModeInterval powerModeInterval) {
        zq3.h(hVar, "writer");
        if (powerModeInterval == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("st");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(powerModeInterval.getStartTime()));
        hVar.C(Session.MESSAGE_TYPE_END);
        this.nullableLongAdapter.mo197toJson(hVar, powerModeInterval.getEndTime());
        hVar.l();
    }
}
