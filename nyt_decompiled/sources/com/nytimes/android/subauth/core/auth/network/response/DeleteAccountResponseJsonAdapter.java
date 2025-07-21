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
public final class DeleteAccountResponseJsonAdapter extends JsonAdapter<DeleteAccountResponse> {
    private volatile Constructor<DeleteAccountResponse> constructorRef;
    private final JsonAdapter<DeleteAccountResponseData> nullableDeleteAccountResponseDataAdapter;
    private final JsonAdapter<DeleteAccountResponseMeta> nullableDeleteAccountResponseMetaAdapter;
    private final JsonReader.b options;

    public DeleteAccountResponseJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("meta", "data");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<DeleteAccountResponseMeta> f = iVar.f(DeleteAccountResponseMeta.class, b0.e(), "meta");
        zq3.g(f, "adapter(...)");
        this.nullableDeleteAccountResponseMetaAdapter = f;
        JsonAdapter<DeleteAccountResponseData> f2 = iVar.f(DeleteAccountResponseData.class, b0.e(), "data");
        zq3.g(f2, "adapter(...)");
        this.nullableDeleteAccountResponseDataAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeleteAccountResponse fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        DeleteAccountResponseMeta deleteAccountResponseMeta = null;
        DeleteAccountResponseData deleteAccountResponseData = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                deleteAccountResponseMeta = (DeleteAccountResponseMeta) this.nullableDeleteAccountResponseMetaAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (P == 1) {
                deleteAccountResponseData = (DeleteAccountResponseData) this.nullableDeleteAccountResponseDataAdapter.fromJson(jsonReader);
                i &= -3;
            }
        }
        jsonReader.h();
        if (i == -4) {
            return new DeleteAccountResponse(deleteAccountResponseMeta, deleteAccountResponseData);
        }
        Constructor<DeleteAccountResponse> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DeleteAccountResponse.class.getDeclaredConstructor(DeleteAccountResponseMeta.class, DeleteAccountResponseData.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        DeleteAccountResponse newInstance = constructor.newInstance(deleteAccountResponseMeta, deleteAccountResponseData, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DeleteAccountResponse deleteAccountResponse) {
        zq3.h(hVar, "writer");
        if (deleteAccountResponse == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("meta");
        this.nullableDeleteAccountResponseMetaAdapter.mo197toJson(hVar, deleteAccountResponse.c());
        hVar.C("data");
        this.nullableDeleteAccountResponseDataAdapter.mo197toJson(hVar, deleteAccountResponse.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(43);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DeleteAccountResponse");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
