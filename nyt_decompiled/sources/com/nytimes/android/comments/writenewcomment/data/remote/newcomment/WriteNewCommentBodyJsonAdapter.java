package com.nytimes.android.comments.writenewcomment.data.remote.newcomment;

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
public final class WriteNewCommentBodyJsonAdapter extends JsonAdapter<WriteNewCommentBody> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<WriteNewCommentBody> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public WriteNewCommentBodyJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("commentBody", "userDisplayName", "userLocation", "url", "NotifyViaEmailOnApproval", "parentID");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "commentBody");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Boolean> f2 = iVar.f(Boolean.TYPE, b0.e(), "notifyViaEmailOnApproval");
        zq3.g(f2, "adapter(...)");
        this.booleanAdapter = f2;
        JsonAdapter<Long> f3 = iVar.f(Long.TYPE, b0.e(), "parentID");
        zq3.g(f3, "adapter(...)");
        this.longAdapter = f3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("WriteNewCommentBody");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public WriteNewCommentBody fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Boolean bool = Boolean.FALSE;
        jsonReader.b();
        int i = -1;
        Boolean bool2 = bool;
        Long l = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        JsonDataException x = c29.x("commentBody", "commentBody", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x2 = c29.x("userDisplayName", "userDisplayName", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x3 = c29.x("userLocation", "userLocation", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("url", "url", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 4:
                    bool2 = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        JsonDataException x5 = c29.x("notifyViaEmailOnApproval", "NotifyViaEmailOnApproval", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    i &= -17;
                    break;
                case 5:
                    l = (Long) this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        JsonDataException x6 = c29.x("parentID", "parentID", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i &= -33;
                    break;
            }
        }
        jsonReader.h();
        if (i == -49) {
            if (str == null) {
                JsonDataException o = c29.o("commentBody", "commentBody", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            if (str2 == null) {
                JsonDataException o2 = c29.o("userDisplayName", "userDisplayName", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            if (str3 == null) {
                JsonDataException o3 = c29.o("userLocation", "userLocation", jsonReader);
                zq3.g(o3, "missingProperty(...)");
                throw o3;
            }
            if (str4 != null) {
                return new WriteNewCommentBody(str, str2, str3, str4, bool2.booleanValue(), l.longValue());
            }
            JsonDataException o4 = c29.o("url", "url", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        Constructor<WriteNewCommentBody> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = WriteNewCommentBody.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Boolean.TYPE, Long.TYPE, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        if (str == null) {
            JsonDataException o5 = c29.o("commentBody", "commentBody", jsonReader);
            zq3.g(o5, "missingProperty(...)");
            throw o5;
        }
        if (str2 == null) {
            JsonDataException o6 = c29.o("userDisplayName", "userDisplayName", jsonReader);
            zq3.g(o6, "missingProperty(...)");
            throw o6;
        }
        if (str3 == null) {
            JsonDataException o7 = c29.o("userLocation", "userLocation", jsonReader);
            zq3.g(o7, "missingProperty(...)");
            throw o7;
        }
        if (str4 == null) {
            JsonDataException o8 = c29.o("url", "url", jsonReader);
            zq3.g(o8, "missingProperty(...)");
            throw o8;
        }
        WriteNewCommentBody newInstance = constructor.newInstance(str, str2, str3, str4, bool2, l, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, WriteNewCommentBody writeNewCommentBody) {
        zq3.h(hVar, "writer");
        if (writeNewCommentBody == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("commentBody");
        this.stringAdapter.mo197toJson(hVar, writeNewCommentBody.getCommentBody());
        hVar.C("userDisplayName");
        this.stringAdapter.mo197toJson(hVar, writeNewCommentBody.getUserDisplayName());
        hVar.C("userLocation");
        this.stringAdapter.mo197toJson(hVar, writeNewCommentBody.getUserLocation());
        hVar.C("url");
        this.stringAdapter.mo197toJson(hVar, writeNewCommentBody.getUrl());
        hVar.C("NotifyViaEmailOnApproval");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(writeNewCommentBody.getNotifyViaEmailOnApproval()));
        hVar.C("parentID");
        this.longAdapter.mo197toJson(hVar, Long.valueOf(writeNewCommentBody.getParentID()));
        hVar.l();
    }
}
