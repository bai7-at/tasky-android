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
public final class LoggerRemoteStreamMessageDataJsonAdapter extends JsonAdapter<LoggerRemoteStreamMessageData> {
    public static final int $stable = 8;
    private volatile Constructor<LoggerRemoteStreamMessageData> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<LoggerRemoteStreamMessageLocation> nullableLoggerRemoteStreamMessageLocationAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public LoggerRemoteStreamMessageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("date", "level", "location", "message", "throwable");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "date");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "level");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
        JsonAdapter<LoggerRemoteStreamMessageLocation> f3 = iVar.f(LoggerRemoteStreamMessageLocation.class, b0.e(), "location");
        zq3.g(f3, "adapter(...)");
        this.nullableLoggerRemoteStreamMessageLocationAdapter = f3;
        JsonAdapter<String> f4 = iVar.f(String.class, b0.e(), "message");
        zq3.g(f4, "adapter(...)");
        this.stringAdapter = f4;
        JsonAdapter<String> f5 = iVar.f(String.class, b0.e(), "throwable");
        zq3.g(f5, "adapter(...)");
        this.nullableStringAdapter = f5;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoggerRemoteStreamMessageData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Integer num = null;
        LoggerRemoteStreamMessageLocation loggerRemoteStreamMessageLocation = null;
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("date", "date", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x2 = c29.x("level", "level", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                loggerRemoteStreamMessageLocation = (LoggerRemoteStreamMessageLocation) this.nullableLoggerRemoteStreamMessageLocationAdapter.fromJson(jsonReader);
                i = -5;
            } else if (P == 3) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x3 = c29.x("message", "message", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
            } else if (P == 4) {
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        if (i == -5) {
            if (l == null) {
                JsonDataException o = c29.o("date", "date", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            long longValue = l.longValue();
            if (num == null) {
                JsonDataException o2 = c29.o("level", "level", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            int intValue = num.intValue();
            if (str != null) {
                return new LoggerRemoteStreamMessageData(longValue, intValue, loggerRemoteStreamMessageLocation, str, str2);
            }
            JsonDataException o3 = c29.o("message", "message", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        Constructor<LoggerRemoteStreamMessageData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            constructor = LoggerRemoteStreamMessageData.class.getDeclaredConstructor(cls, cls2, LoggerRemoteStreamMessageLocation.class, String.class, String.class, cls2, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Constructor<LoggerRemoteStreamMessageData> constructor2 = constructor;
        if (l == null) {
            JsonDataException o4 = c29.o("date", "date", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        if (num == null) {
            JsonDataException o5 = c29.o("level", "level", jsonReader);
            zq3.g(o5, "missingProperty(...)");
            throw o5;
        }
        if (str == null) {
            JsonDataException o6 = c29.o("message", "message", jsonReader);
            zq3.g(o6, "missingProperty(...)");
            throw o6;
        }
        LoggerRemoteStreamMessageData newInstance = constructor2.newInstance(l, num, loggerRemoteStreamMessageLocation, str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoggerRemoteStreamMessageData loggerRemoteStreamMessageData) {
        zq3.h(hVar, "writer");
        if (loggerRemoteStreamMessageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("date");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(loggerRemoteStreamMessageData.a()));
        hVar.C("level");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(loggerRemoteStreamMessageData.b()));
        hVar.C("location");
        this.nullableLoggerRemoteStreamMessageLocationAdapter.mo197toJson(hVar, loggerRemoteStreamMessageData.c());
        hVar.C("message");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessageData.d());
        hVar.C("throwable");
        this.nullableStringAdapter.mo197toJson(hVar, loggerRemoteStreamMessageData.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(51);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoggerRemoteStreamMessageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
