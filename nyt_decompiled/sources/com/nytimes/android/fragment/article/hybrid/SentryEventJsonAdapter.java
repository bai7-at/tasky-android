package com.nytimes.android.fragment.article.hybrid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class SentryEventJsonAdapter extends JsonAdapter<SentryEvent> {
    public static final int $stable = 8;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public SentryEventJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("event_id", "message", "level", "platform", "request", "sentryUrl");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "eventId");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SentryEvent fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (jsonReader.hasNext()) {
            String str7 = str6;
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("eventId", "event_id", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("message", "message", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x3 = c29.x("level", "level", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("platform", "platform", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 4:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x5 = c29.x("request", "request", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    break;
                case 5:
                    String str8 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str8 == null) {
                        JsonDataException x6 = c29.x("sentryUrl", "sentryUrl", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    str6 = str8;
                    continue;
            }
            str6 = str7;
        }
        String str9 = str6;
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o("eventId", "event_id", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (str2 == null) {
            JsonDataException o2 = c29.o("message", "message", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        if (str3 == null) {
            JsonDataException o3 = c29.o("level", "level", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (str4 == null) {
            JsonDataException o4 = c29.o("platform", "platform", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        if (str5 == null) {
            JsonDataException o5 = c29.o("request", "request", jsonReader);
            zq3.g(o5, "missingProperty(...)");
            throw o5;
        }
        if (str9 != null) {
            return new SentryEvent(str, str2, str3, str4, str5, str9);
        }
        JsonDataException o6 = c29.o("sentryUrl", "sentryUrl", jsonReader);
        zq3.g(o6, "missingProperty(...)");
        throw o6;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SentryEvent sentryEvent) {
        zq3.h(hVar, "writer");
        if (sentryEvent == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("event_id");
        this.stringAdapter.mo197toJson(hVar, sentryEvent.a());
        hVar.C("message");
        this.stringAdapter.mo197toJson(hVar, sentryEvent.c());
        hVar.C("level");
        this.stringAdapter.mo197toJson(hVar, sentryEvent.b());
        hVar.C("platform");
        this.stringAdapter.mo197toJson(hVar, sentryEvent.d());
        hVar.C("request");
        this.stringAdapter.mo197toJson(hVar, sentryEvent.e());
        hVar.C("sentryUrl");
        this.stringAdapter.mo197toJson(hVar, sentryEvent.f());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SentryEvent");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
