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
public final class LoggerRemoteStreamMessageJsonAdapter extends JsonAdapter<LoggerRemoteStreamMessage> {
    public static final int $stable = 8;
    private volatile Constructor<LoggerRemoteStreamMessage> constructorRef;
    private final JsonAdapter<LoggerRemoteStreamMessageKind> loggerRemoteStreamMessageKindAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public LoggerRemoteStreamMessageJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("sessionId", "deviceId", "deviceKind", "deviceName", "kind", "messageId");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "sessionId");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<LoggerRemoteStreamMessageKind> f2 = iVar.f(LoggerRemoteStreamMessageKind.class, b0.e(), "kind");
        zq3.g(f2, "adapter(...)");
        this.loggerRemoteStreamMessageKindAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoggerRemoteStreamMessage fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        LoggerRemoteStreamMessageKind loggerRemoteStreamMessageKind = null;
        String str6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x = c29.x("sessionId", "sessionId", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x2 = c29.x("deviceId", "deviceId", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x3 = c29.x("deviceKind", "deviceKind", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    i = -5;
                    break;
                case 3:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x4 = c29.x("deviceName", "deviceName", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 4:
                    loggerRemoteStreamMessageKind = (LoggerRemoteStreamMessageKind) this.loggerRemoteStreamMessageKindAdapter.fromJson(jsonReader);
                    if (loggerRemoteStreamMessageKind == null) {
                        JsonDataException x5 = c29.x("kind", "kind", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    break;
                case 5:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x6 = c29.x("messageId", "messageId", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    break;
            }
        }
        jsonReader.h();
        if (i == -5) {
            if (str2 == null) {
                JsonDataException o = c29.o("sessionId", "sessionId", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            if (str3 == null) {
                JsonDataException o2 = c29.o("deviceId", "deviceId", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            zq3.f(str4, "null cannot be cast to non-null type kotlin.String");
            if (str5 == null) {
                JsonDataException o3 = c29.o("deviceName", "deviceName", jsonReader);
                zq3.g(o3, "missingProperty(...)");
                throw o3;
            }
            if (loggerRemoteStreamMessageKind == null) {
                JsonDataException o4 = c29.o("kind", "kind", jsonReader);
                zq3.g(o4, "missingProperty(...)");
                throw o4;
            }
            if (str6 != null) {
                return new LoggerRemoteStreamMessage(str2, str3, str4, str5, loggerRemoteStreamMessageKind, str6);
            }
            JsonDataException o5 = c29.o("messageId", "messageId", jsonReader);
            zq3.g(o5, "missingProperty(...)");
            throw o5;
        }
        Constructor<LoggerRemoteStreamMessage> constructor = this.constructorRef;
        if (constructor == null) {
            str = "sessionId";
            constructor = LoggerRemoteStreamMessage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, LoggerRemoteStreamMessageKind.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        } else {
            str = "sessionId";
        }
        Constructor<LoggerRemoteStreamMessage> constructor2 = constructor;
        if (str2 == null) {
            String str7 = str;
            JsonDataException o6 = c29.o(str7, str7, jsonReader);
            zq3.g(o6, "missingProperty(...)");
            throw o6;
        }
        if (str3 == null) {
            JsonDataException o7 = c29.o("deviceId", "deviceId", jsonReader);
            zq3.g(o7, "missingProperty(...)");
            throw o7;
        }
        if (str5 == null) {
            JsonDataException o8 = c29.o("deviceName", "deviceName", jsonReader);
            zq3.g(o8, "missingProperty(...)");
            throw o8;
        }
        if (loggerRemoteStreamMessageKind == null) {
            JsonDataException o9 = c29.o("kind", "kind", jsonReader);
            zq3.g(o9, "missingProperty(...)");
            throw o9;
        }
        if (str6 == null) {
            JsonDataException o10 = c29.o("messageId", "messageId", jsonReader);
            zq3.g(o10, "missingProperty(...)");
            throw o10;
        }
        LoggerRemoteStreamMessage newInstance = constructor2.newInstance(str2, str3, str4, str5, loggerRemoteStreamMessageKind, str6, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoggerRemoteStreamMessage loggerRemoteStreamMessage) {
        zq3.h(hVar, "writer");
        if (loggerRemoteStreamMessage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("sessionId");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessage.f());
        hVar.C("deviceId");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessage.a());
        hVar.C("deviceKind");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessage.b());
        hVar.C("deviceName");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessage.c());
        hVar.C("kind");
        this.loggerRemoteStreamMessageKindAdapter.mo197toJson(hVar, loggerRemoteStreamMessage.d());
        hVar.C("messageId");
        this.stringAdapter.mo197toJson(hVar, loggerRemoteStreamMessage.e());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoggerRemoteStreamMessage");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
