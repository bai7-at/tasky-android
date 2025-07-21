package com.nytimes.android.internal.pushmessaging.model;

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
public final class SubscriptionJsonAdapter extends JsonAdapter<Subscription> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Subscription> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<Set<String>> setOfStringAdapter;
    private final JsonAdapter<String> stringAdapter;

    public SubscriptionJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("token", "tags", "regiId", "appVersion", "isReady", "environment", "id");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "token");
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Set<String>> f2 = iVar.f(j.j(Set.class, String.class), b0.e(), "tags");
        zq3.g(f2, "adapter(...)");
        this.setOfStringAdapter = f2;
        JsonAdapter<Integer> f3 = iVar.f(Integer.TYPE, b0.e(), "regiId");
        zq3.g(f3, "adapter(...)");
        this.intAdapter = f3;
        JsonAdapter<Boolean> f4 = iVar.f(Boolean.TYPE, b0.e(), "isReady");
        zq3.g(f4, "adapter(...)");
        this.booleanAdapter = f4;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Subscription fromJson(JsonReader jsonReader) {
        String str;
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str2 = null;
        int i = -1;
        Integer num = 0;
        Integer num2 = null;
        Boolean bool = null;
        String str3 = null;
        Set set = null;
        String str4 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.P(this.options)) {
                case -1:
                    jsonReader.f0();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str3 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        JsonDataException x = c29.x("token", "token", jsonReader);
                        zq3.g(x, "unexpectedNull(...)");
                        throw x;
                    }
                    break;
                case 1:
                    set = (Set) this.setOfStringAdapter.fromJson(jsonReader);
                    if (set == null) {
                        JsonDataException x2 = c29.x("tags", "tags", jsonReader);
                        zq3.g(x2, "unexpectedNull(...)");
                        throw x2;
                    }
                    break;
                case 2:
                    num2 = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        JsonDataException x3 = c29.x("regiId", "regiId", jsonReader);
                        zq3.g(x3, "unexpectedNull(...)");
                        throw x3;
                    }
                    break;
                case 3:
                    str4 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        JsonDataException x4 = c29.x("appVersion", "appVersion", jsonReader);
                        zq3.g(x4, "unexpectedNull(...)");
                        throw x4;
                    }
                    break;
                case 4:
                    bool = (Boolean) this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        JsonDataException x5 = c29.x("isReady", "isReady", jsonReader);
                        zq3.g(x5, "unexpectedNull(...)");
                        throw x5;
                    }
                    break;
                case 5:
                    str2 = (String) this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        JsonDataException x6 = c29.x("environment", "environment", jsonReader);
                        zq3.g(x6, "unexpectedNull(...)");
                        throw x6;
                    }
                    i &= -33;
                    break;
                case 6:
                    num = (Integer) this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        JsonDataException x7 = c29.x("id", "id", jsonReader);
                        zq3.g(x7, "unexpectedNull(...)");
                        throw x7;
                    }
                    i &= -65;
                    break;
            }
        }
        jsonReader.h();
        if (i == -97) {
            if (str3 == null) {
                JsonDataException o = c29.o("token", "token", jsonReader);
                zq3.g(o, "missingProperty(...)");
                throw o;
            }
            if (set == null) {
                JsonDataException o2 = c29.o("tags", "tags", jsonReader);
                zq3.g(o2, "missingProperty(...)");
                throw o2;
            }
            if (num2 == null) {
                JsonDataException o3 = c29.o("regiId", "regiId", jsonReader);
                zq3.g(o3, "missingProperty(...)");
                throw o3;
            }
            int intValue = num2.intValue();
            if (str4 == null) {
                JsonDataException o4 = c29.o("appVersion", "appVersion", jsonReader);
                zq3.g(o4, "missingProperty(...)");
                throw o4;
            }
            if (bool == null) {
                JsonDataException o5 = c29.o("isReady", "isReady", jsonReader);
                zq3.g(o5, "missingProperty(...)");
                throw o5;
            }
            boolean booleanValue = bool.booleanValue();
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            return new Subscription(str3, set, intValue, str4, booleanValue, str2, num.intValue());
        }
        Constructor<Subscription> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            str = "token";
            constructor = Subscription.class.getDeclaredConstructor(String.class, Set.class, cls, String.class, Boolean.TYPE, String.class, cls, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        } else {
            str = "token";
        }
        if (str3 == null) {
            String str5 = str;
            JsonDataException o6 = c29.o(str5, str5, jsonReader);
            zq3.g(o6, "missingProperty(...)");
            throw o6;
        }
        if (set == null) {
            JsonDataException o7 = c29.o("tags", "tags", jsonReader);
            zq3.g(o7, "missingProperty(...)");
            throw o7;
        }
        if (num2 == null) {
            JsonDataException o8 = c29.o("regiId", "regiId", jsonReader);
            zq3.g(o8, "missingProperty(...)");
            throw o8;
        }
        if (str4 == null) {
            JsonDataException o9 = c29.o("appVersion", "appVersion", jsonReader);
            zq3.g(o9, "missingProperty(...)");
            throw o9;
        }
        if (bool == null) {
            JsonDataException o10 = c29.o("isReady", "isReady", jsonReader);
            zq3.g(o10, "missingProperty(...)");
            throw o10;
        }
        Subscription newInstance = constructor.newInstance(str3, set, num2, str4, bool, str2, num, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, Subscription subscription) {
        zq3.h(hVar, "writer");
        if (subscription == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("token");
        this.stringAdapter.mo197toJson(hVar, subscription.h());
        hVar.C("tags");
        this.setOfStringAdapter.mo197toJson(hVar, subscription.g());
        hVar.C("regiId");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(subscription.f()));
        hVar.C("appVersion");
        this.stringAdapter.mo197toJson(hVar, subscription.c());
        hVar.C("isReady");
        this.booleanAdapter.mo197toJson(hVar, Boolean.valueOf(subscription.i()));
        hVar.C("environment");
        this.stringAdapter.mo197toJson(hVar, subscription.d());
        hVar.C("id");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(subscription.e()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("Subscription");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
