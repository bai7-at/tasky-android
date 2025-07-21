package com.nytimes.android.growthui.postauth.models.remoteconfig;

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
public final class PostAuthUrgencyMessageDataJsonAdapter extends JsonAdapter<PostAuthUrgencyMessageData> {
    public static final int $stable = 8;
    private volatile Constructor<PostAuthUrgencyMessageData> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public PostAuthUrgencyMessageDataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("startTimeInterval", "endTimeInterval", "header");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Long> f = iVar.f(Long.TYPE, b0.e(), "startTimeInterval");
        zq3.g(f, "adapter(...)");
        this.longAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "header");
        zq3.g(f2, "adapter(...)");
        this.stringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PostAuthUrgencyMessageData fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Long l = null;
        Long l2 = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                l = (Long) this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    JsonDataException x = c29.x("startTimeInterval", "startTimeInterval", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1) {
                l2 = (Long) this.longAdapter.fromJson(jsonReader);
                if (l2 == null) {
                    JsonDataException x2 = c29.x("endTimeInterval", "endTimeInterval", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
            } else if (P == 2) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x3 = c29.x("header_", "header", jsonReader);
                    zq3.g(x3, "unexpectedNull(...)");
                    throw x3;
                }
                i = -5;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -5) {
            if (l == null) {
                JsonDataException o = c29.o("startTimeInterval", "startTimeInterval", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            long longValue = l.longValue();
            if (l2 != null) {
                long longValue2 = l2.longValue();
                zq3.f(str, "null cannot be cast to non-null type kotlin.String");
                return new PostAuthUrgencyMessageData(longValue, longValue2, str);
            }
            JsonDataException o2 = c29.o("endTimeInterval", "endTimeInterval", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        Constructor<PostAuthUrgencyMessageData> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            constructor = PostAuthUrgencyMessageData.class.getDeclaredConstructor(cls, cls, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (l == null) {
            JsonDataException o3 = c29.o("startTimeInterval", "startTimeInterval", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (l2 != null) {
            PostAuthUrgencyMessageData newInstance = constructor.newInstance(l, l2, str, Integer.valueOf(i), null);
            zq3.g(newInstance, "newInstance(...)");
            return newInstance;
        }
        JsonDataException o4 = c29.o("endTimeInterval", "endTimeInterval", jsonReader);
        zq3.g(o4, "missingProperty(...)");
        throw o4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PostAuthUrgencyMessageData postAuthUrgencyMessageData) {
        zq3.h(hVar, "writer");
        if (postAuthUrgencyMessageData == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("startTimeInterval");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(postAuthUrgencyMessageData.getStartTimeInterval()));
        hVar.C("endTimeInterval");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(postAuthUrgencyMessageData.getEndTimeInterval()));
        hVar.C("header");
        this.stringAdapter.mo197toJson(hVar, postAuthUrgencyMessageData.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(48);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PostAuthUrgencyMessageData");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
