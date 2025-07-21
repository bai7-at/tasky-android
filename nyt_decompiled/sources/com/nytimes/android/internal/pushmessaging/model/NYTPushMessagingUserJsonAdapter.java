package com.nytimes.android.internal.pushmessaging.model;

import co.datadome.sdk.ChallengeActivity;
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
public final class NYTPushMessagingUserJsonAdapter extends JsonAdapter<NYTPushMessagingUser> {
    private volatile Constructor<NYTPushMessagingUser> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public NYTPushMessagingUserJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(ChallengeActivity.ARG_COOKIE, "regiId", "advertisingId");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), ChallengeActivity.ARG_COOKIE);
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "regiId");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
        JsonAdapter<String> f3 = iVar.f(String.class, b0.e(), "advertisingId");
        zq3.g(f3, "adapter(...)");
        this.stringAdapter = f3;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public NYTPushMessagingUser fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        Integer num = 0;
        jsonReader.b();
        String str = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                num = (Integer) this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    JsonDataException x = c29.x("regiId", "regiId", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
                i &= -3;
            } else if (P == 2) {
                str2 = (String) this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    JsonDataException x2 = c29.x("advertisingId", "advertisingId", jsonReader);
                    zq3.g(x2, "unexpectedNull(...)");
                    throw x2;
                }
                i &= -5;
            } else {
                continue;
            }
        }
        jsonReader.h();
        if (i == -8) {
            int intValue = num.intValue();
            zq3.f(str2, "null cannot be cast to non-null type kotlin.String");
            return new NYTPushMessagingUser(str, intValue, str2);
        }
        Constructor<NYTPushMessagingUser> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Integer.TYPE;
            constructor = NYTPushMessagingUser.class.getDeclaredConstructor(String.class, cls, String.class, cls, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        NYTPushMessagingUser newInstance = constructor.newInstance(str, num, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, NYTPushMessagingUser nYTPushMessagingUser) {
        zq3.h(hVar, "writer");
        if (nYTPushMessagingUser == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(ChallengeActivity.ARG_COOKIE);
        this.nullableStringAdapter.mo197toJson(hVar, nYTPushMessagingUser.b());
        hVar.C("regiId");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(nYTPushMessagingUser.c()));
        hVar.C("advertisingId");
        this.stringAdapter.mo197toJson(hVar, nYTPushMessagingUser.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("NYTPushMessagingUser");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
