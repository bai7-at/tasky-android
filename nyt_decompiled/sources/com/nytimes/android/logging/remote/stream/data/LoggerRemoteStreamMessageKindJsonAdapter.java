package com.nytimes.android.logging.remote.stream.data;

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
public final class LoggerRemoteStreamMessageKindJsonAdapter extends JsonAdapter<LoggerRemoteStreamMessageKind> {
    public static final int $stable = 8;
    private volatile Constructor<LoggerRemoteStreamMessageKind> constructorRef;
    private final JsonAdapter<LoggerRemoteStreamMessageData> nullableLoggerRemoteStreamMessageDataAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public LoggerRemoteStreamMessageKindJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "kind");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<LoggerRemoteStreamMessageData> f = iVar.f(LoggerRemoteStreamMessageData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.nullableLoggerRemoteStreamMessageDataAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "kind");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoggerRemoteStreamMessageKind fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        LoggerRemoteStreamMessageData loggerRemoteStreamMessageData = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                loggerRemoteStreamMessageData = (LoggerRemoteStreamMessageData) this.nullableLoggerRemoteStreamMessageDataAdapter.fromJson(jsonReader);
                i = -2;
            } else if (P == 1 && (str = (String) this.stringAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x = c29.x("kind", "kind", jsonReader);
                zq3.g(x, "unexpectedNull(...)");
                throw x;
            }
        }
        jsonReader.h();
        if (i == -2) {
            if (str != null) {
                return new LoggerRemoteStreamMessageKind(loggerRemoteStreamMessageData, str);
            }
            JsonDataException o = c29.o("kind", "kind", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        Constructor<LoggerRemoteStreamMessageKind> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = LoggerRemoteStreamMessageKind.class.getDeclaredConstructor(LoggerRemoteStreamMessageData.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (str != null) {
            LoggerRemoteStreamMessageKind newInstance = constructor.newInstance(loggerRemoteStreamMessageData, str, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o2 = c29.o("kind", "kind", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoggerRemoteStreamMessageKind loggerRemoteStreamMessageKind) {
        zq3.h(hVar, "writer");
        if (loggerRemoteStreamMessageKind == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.nullableLoggerRemoteStreamMessageDataAdapter.mo197toJson(hVar, loggerRemoteStreamMessageKind.a());
        hVar.C("kind");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessageKind.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoggerRemoteStreamMessageKind");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
