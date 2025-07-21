package com.nytimes.android.subauth.core.purchase.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class VerifyPurchaseMetadataJsonAdapter extends JsonAdapter<VerifyPurchaseMetadata> {
    private volatile Constructor<VerifyPurchaseMetadata> constructorRef;
    private final JsonAdapter<Integer> nullableIntAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public VerifyPurchaseMetadataJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("code", "msg");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<Integer> f = iVar.f(Integer.class, b0.e(), "code");
        zq3.g(f, "adapter(...)");
        this.nullableIntAdapter = f;
        JsonAdapter<String> f2 = iVar.f(String.class, b0.e(), "msg");
        zq3.g(f2, "adapter(...)");
        this.nullableStringAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public VerifyPurchaseMetadata fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        Integer num = null;
        String str = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                num = (Integer) this.nullableIntAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                str = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new VerifyPurchaseMetadata(num, str);
        }
        Constructor<VerifyPurchaseMetadata> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = VerifyPurchaseMetadata.class.getDeclaredConstructor(Integer.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        VerifyPurchaseMetadata newInstance = constructor.newInstance(num, str, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, VerifyPurchaseMetadata verifyPurchaseMetadata) {
        zq3.h(hVar, "writer");
        if (verifyPurchaseMetadata == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("code");
        this.nullableIntAdapter.mo197toJson(hVar, verifyPurchaseMetadata.a());
        hVar.C("msg");
        this.nullableStringAdapter.mo197toJson(hVar, verifyPurchaseMetadata.b());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(44);
        sb.append("GeneratedJsonAdapter(");
        sb.append("VerifyPurchaseMetadata");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
