package com.nytimes.android.subauth.core.auth.network.response;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.zq3;
import io.embrace.android.embracesdk.gating.SessionGatingKeys;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class GenericLireResponseMetaJsonAdapter extends JsonAdapter<GenericLireResponseMeta> {
    private final JsonAdapter<List<GenericLireResponseError>> nullableListOfGenericLireResponseErrorAdapter;
    private final JsonReader.b options;

    public GenericLireResponseMetaJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<GenericLireResponseError>> f = iVar.f(j.j(List.class, GenericLireResponseError.class), b0.e(), SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(f, "adapter(...)");
        this.nullableListOfGenericLireResponseErrorAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GenericLireResponseMeta fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfGenericLireResponseErrorAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new GenericLireResponseMeta(list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, GenericLireResponseMeta genericLireResponseMeta) {
        zq3.h(hVar, "writer");
        if (genericLireResponseMeta == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        this.nullableListOfGenericLireResponseErrorAdapter.mo197toJson(hVar, genericLireResponseMeta.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(45);
        sb.append("GeneratedJsonAdapter(");
        sb.append("GenericLireResponseMeta");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
