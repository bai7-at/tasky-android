package io.embrace.android.embracesdk.internal.payload;

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
public final class LogPayloadJsonAdapter extends JsonAdapter<LogPayload> {
    private volatile Constructor<LogPayload> constructorRef;
    private final JsonAdapter<List<Log>> nullableListOfLogAdapter;
    private final JsonReader.b options;

    public LogPayloadJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("logs");
        zq3.g(a, "JsonReader.Options.of(\"logs\")");
        this.options = a;
        JsonAdapter<List<Log>> f = iVar.f(j.j(List.class, Log.class), b0.e(), "logs");
        zq3.g(f, "moshi.adapter(Types.newP…emptySet(),\n      \"logs\")");
        this.nullableListOfLogAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LogPayload");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public LogPayload fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfLogAdapter.fromJson(jsonReader);
                i &= (int) 4294967294L;
            }
        }
        jsonReader.h();
        if (i == ((int) 4294967294L)) {
            return new LogPayload(list);
        }
        Constructor<LogPayload> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LogPayload.class.getDeclaredConstructor(List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "LogPayload::class.java.g…his.constructorRef = it }");
        }
        LogPayload newInstance = constructor.newInstance(list, Integer.valueOf(i), null);
        zq3.g(newInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LogPayload logPayload) {
        zq3.h(hVar, "writer");
        if (logPayload == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("logs");
        this.nullableListOfLogAdapter.mo197toJson(hVar, logPayload.getLogs());
        hVar.l();
    }
}
