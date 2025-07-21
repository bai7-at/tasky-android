package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class VerifyEmailWithCodeResponseJsonAdapter extends JsonAdapter<VerifyEmailWithCodeResponse> {
    private volatile Constructor<VerifyEmailWithCodeResponse> constructorRef;
    private final JsonAdapter<GenericLireResponseMeta> nullableGenericLireResponseMetaAdapter;
    private final JsonAdapter<VerifyEmailWithCodeResponseData> nullableVerifyEmailWithCodeResponseDataAdapter;
    private final JsonReader.b options;

    public VerifyEmailWithCodeResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("data", "meta");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<VerifyEmailWithCodeResponseData> f = iVar.f(VerifyEmailWithCodeResponseData.class, b0.e(), "data");
        zq3.g(f, "adapter(...)");
        this.nullableVerifyEmailWithCodeResponseDataAdapter = f;
        JsonAdapter<GenericLireResponseMeta> f2 = iVar.f(GenericLireResponseMeta.class, b0.e(), "meta");
        zq3.g(f2, "adapter(...)");
        this.nullableGenericLireResponseMetaAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VerifyEmailWithCodeResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        VerifyEmailWithCodeResponseData verifyEmailWithCodeResponseData = null;
        GenericLireResponseMeta genericLireResponseMeta = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                verifyEmailWithCodeResponseData = (VerifyEmailWithCodeResponseData) this.nullableVerifyEmailWithCodeResponseDataAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                genericLireResponseMeta = (GenericLireResponseMeta) this.nullableGenericLireResponseMetaAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new VerifyEmailWithCodeResponse(verifyEmailWithCodeResponseData, genericLireResponseMeta);
        }
        Constructor<VerifyEmailWithCodeResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = VerifyEmailWithCodeResponse.class.getDeclaredConstructor(VerifyEmailWithCodeResponseData.class, GenericLireResponseMeta.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        VerifyEmailWithCodeResponse newInstance = constructor.newInstance(verifyEmailWithCodeResponseData, genericLireResponseMeta, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, VerifyEmailWithCodeResponse verifyEmailWithCodeResponse) {
        zq3.h(hVar, "writer");
        if (verifyEmailWithCodeResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("data");
        this.nullableVerifyEmailWithCodeResponseDataAdapter.mo197toJson(hVar, verifyEmailWithCodeResponse.a());
        hVar.C("meta");
        this.nullableGenericLireResponseMetaAdapter.mo197toJson(hVar, verifyEmailWithCodeResponse.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyEmailWithCodeResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
