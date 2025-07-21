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
public final class GenericLireResponseJsonAdapter extends JsonAdapter<GenericLireResponse> {
    private volatile Constructor<GenericLireResponse> constructorRef;
    private final JsonAdapter<GenericLireResponseMeta> nullableGenericLireResponseMetaAdapter;
    private final JsonReader.b options;

    public GenericLireResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("meta");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<GenericLireResponseMeta> f = iVar.f(GenericLireResponseMeta.class, b0.e(), "meta");
        zq3.g(f, "adapter(...)");
        this.nullableGenericLireResponseMetaAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GenericLireResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        GenericLireResponseMeta genericLireResponseMeta = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                genericLireResponseMeta = (GenericLireResponseMeta) this.nullableGenericLireResponseMetaAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.h();
        if (i == -2) {
            return new GenericLireResponse(genericLireResponseMeta);
        }
        Constructor<GenericLireResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = GenericLireResponse.class.getDeclaredConstructor(GenericLireResponseMeta.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        GenericLireResponse newInstance = constructor.newInstance(genericLireResponseMeta, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GenericLireResponse genericLireResponse) {
        zq3.h(hVar, "writer");
        if (genericLireResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("meta");
        this.nullableGenericLireResponseMetaAdapter.mo197toJson(hVar, genericLireResponse.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericLireResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
