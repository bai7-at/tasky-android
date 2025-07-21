package com.nytimes.android.api.cms;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import java.lang.reflect.Constructor;
import kotlin.collections.b0;

/* loaded from: classes3.dex */
public final class SubscribeUrlJsonAdapter extends JsonAdapter<SubscribeUrl> {
    private volatile Constructor<SubscribeUrl> constructorRef;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.b options;

    public SubscribeUrlJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(TransferTable.COLUMN_TYPE, "url");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), TransferTable.COLUMN_TYPE);
        zq3.g(f, "adapter(...)");
        this.nullableStringAdapter = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(");
        sb.append("SubscribeUrl");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public SubscribeUrl fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
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
                str2 = (String) this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new SubscribeUrl(str, str2);
        }
        Constructor<SubscribeUrl> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SubscribeUrl.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        SubscribeUrl newInstance = constructor.newInstance(str, str2, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, SubscribeUrl subscribeUrl) {
        zq3.h(hVar, "writer");
        if (subscribeUrl == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(TransferTable.COLUMN_TYPE);
        this.nullableStringAdapter.mo197toJson(hVar, subscribeUrl.getType());
        hVar.C("url");
        this.nullableStringAdapter.mo197toJson(hVar, subscribeUrl.getUrl());
        hVar.l();
    }
}
