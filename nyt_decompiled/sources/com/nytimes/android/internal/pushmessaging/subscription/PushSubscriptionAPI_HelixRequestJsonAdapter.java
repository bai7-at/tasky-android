package com.nytimes.android.internal.pushmessaging.subscription;

import com.nytimes.android.abra.utilities.ParamProviderKt;
import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import java.util.Set;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class PushSubscriptionAPI_HelixRequestJsonAdapter extends JsonAdapter<PushSubscriptionAPI.HelixRequest> {
    private volatile Constructor<PushSubscriptionAPI.HelixRequest> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Set<String>> setOfStringAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PushSubscriptionAPI_HelixRequestJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("tags", "agentId", ParamProviderKt.PARAM_TIMEZONE, "namedTimezone", "json", "send_method", "OSVersion");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Set<String>> f = iVar.f(j.j(Set.class, String.class), b0.e(), "tags");
        zq3.g(f, "adapter(...)");
        this.setOfStringAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "agentId");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "sendMethod");
        zq3.g(f3, "adapter(...)");
        this.stringAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PushSubscriptionAPI.HelixRequest fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Set set = null;
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    set = (Set) this.setOfStringAdapter.fromJson(jsonReader);
                    if (set == null) {
                        JsonDataException x = c29.x("tags", "tags", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str3 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str5 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        JsonDataException x2 = c29.x("sendMethod", "send_method", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    i &= -33;
                    break;
                case 6:
                    str6 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str6 == null) {
                        JsonDataException x3 = c29.x("osVersion", "OSVersion", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
            }
        }
        jsonReader.h();
        if (i == -63) {
            if (set == null) {
                JsonDataException o = c29.o("tags", "tags", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            zq3.f(str5, "null cannot be cast to non-null type kotlin.String");
            if (str6 != null) {
                return new PushSubscriptionAPI.HelixRequest(set, str, str2, str3, str4, str5, str6);
            }
            JsonDataException o2 = c29.o("osVersion", "OSVersion", jsonReader);
            zq3.g(o2, "missingProperty(...)");
            throw o2;
        }
        Constructor<PushSubscriptionAPI.HelixRequest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PushSubscriptionAPI.HelixRequest.class.getDeclaredConstructor(Set.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        Constructor<PushSubscriptionAPI.HelixRequest> constructor2 = constructor;
        if (set == null) {
            JsonDataException o3 = c29.o("tags", "tags", jsonReader);
            zq3.g(o3, "missingProperty(...)");
            throw o3;
        }
        if (str6 == null) {
            JsonDataException o4 = c29.o("osVersion", "OSVersion", jsonReader);
            zq3.g(o4, "missingProperty(...)");
            throw o4;
        }
        PushSubscriptionAPI.HelixRequest newInstance = constructor2.newInstance(set, str, str2, str3, str4, str5, str6, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PushSubscriptionAPI.HelixRequest helixRequest) {
        zq3.h(hVar, "writer");
        if (helixRequest == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("tags");
        this.setOfStringAdapter.mo197toJson(hVar, helixRequest.f());
        hVar.C("agentId");
        this.nullableStringAdapter.mo197toJson(hVar, helixRequest.a());
        hVar.C(ParamProviderKt.PARAM_TIMEZONE);
        this.nullableStringAdapter.mo197toJson(hVar, helixRequest.g());
        hVar.C("namedTimezone");
        this.nullableStringAdapter.mo197toJson(hVar, helixRequest.c());
        hVar.C("json");
        this.nullableStringAdapter.mo197toJson(hVar, helixRequest.b());
        hVar.C("send_method");
        this.stringAdapter.mo197toJson(hVar, helixRequest.e());
        hVar.C("OSVersion");
        this.stringAdapter.mo197toJson(hVar, helixRequest.d());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(54);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushSubscriptionAPI.HelixRequest");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
