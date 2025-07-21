package com.nytimes.android.internal.pushmessaging.subscription;

import com.nytimes.android.internal.pushmessaging.subscription.PushSubscriptionAPI;
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

/* loaded from: classes4.dex */
public final class PushSubscriptionAPI_HelixResponseJsonAdapter extends JsonAdapter<PushSubscriptionAPI.HelixResponse> {
    private volatile Constructor<PushSubscriptionAPI.HelixResponse> constructorRef;
    private final JsonAdapter<List<PushSubscriptionAPI.HelixResponseResult>> nullableListOfHelixResponseResultAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public PushSubscriptionAPI_HelixResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("status", "results");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), "status");
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
        JsonAdapter<List<PushSubscriptionAPI.HelixResponseResult>> f2 = iVar.f(j.j(List.class, PushSubscriptionAPI.HelixResponseResult.class), b0.e(), "results");
        zq3.g(f2, "adapter(...)");
        this.nullableListOfHelixResponseResultAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public PushSubscriptionAPI.HelixResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
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
                list = (List) this.nullableListOfHelixResponseResultAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new PushSubscriptionAPI.HelixResponse(str, list);
        }
        Constructor<PushSubscriptionAPI.HelixResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = PushSubscriptionAPI.HelixResponse.class.getDeclaredConstructor(String.class, List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        PushSubscriptionAPI.HelixResponse newInstance = constructor.newInstance(str, list, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, PushSubscriptionAPI.HelixResponse helixResponse) {
        zq3.h(hVar, "writer");
        if (helixResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("status");
        this.nullableStringAdapter.mo197toJson(hVar, helixResponse.b());
        hVar.C("results");
        this.nullableListOfHelixResponseResultAdapter.mo197toJson(hVar, helixResponse.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(55);
        sb.append("GeneratedJsonAdapter(");
        sb.append("PushSubscriptionAPI.HelixResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
