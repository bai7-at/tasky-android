package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class DeleteAccountResponseMetaJsonAdapter extends JsonAdapter<DeleteAccountResponseMeta> {
    private volatile Constructor<DeleteAccountResponseMeta> constructorRef;
    private final JsonAdapter<List<DeleteAccountResponseError>> nullableListOfDeleteAccountResponseErrorAdapter;
    private final JsonReader.b options;

    public DeleteAccountResponseMetaJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<DeleteAccountResponseError>> f = iVar.f(j.j(List.class, DeleteAccountResponseError.class), b0.e(), SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(f, "adapter(...)");
        this.nullableListOfDeleteAccountResponseErrorAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public DeleteAccountResponseMeta fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfDeleteAccountResponseErrorAdapter.fromJson(jsonReader);
                i = -2;
            }
        }
        jsonReader.h();
        if (i == -2) {
            return new DeleteAccountResponseMeta(list);
        }
        Constructor<DeleteAccountResponseMeta> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = DeleteAccountResponseMeta.class.getDeclaredConstructor(List.class, Integer.TYPE, c29.c);
            this.constructorRef = constructor;
            zq3.g(constructor, "also(...)");
        }
        DeleteAccountResponseMeta newInstance = constructor.newInstance(list, Integer.valueOf(i), null);
        zq3.g(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, DeleteAccountResponseMeta deleteAccountResponseMeta) {
        zq3.h(hVar, "writer");
        if (deleteAccountResponseMeta == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        this.nullableListOfDeleteAccountResponseErrorAdapter.mo197toJson(hVar, deleteAccountResponseMeta.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(47);
        sb.append("GeneratedJsonAdapter(");
        sb.append("DeleteAccountResponseMeta");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
