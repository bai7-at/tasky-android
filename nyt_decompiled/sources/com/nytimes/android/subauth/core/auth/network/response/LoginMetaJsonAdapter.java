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
public final class LoginMetaJsonAdapter extends JsonAdapter<LoginMeta> {
    private final JsonAdapter<List<LoginError>> nullableListOfLoginErrorAdapter;
    private final JsonReader.b options;

    public LoginMetaJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<List<LoginError>> f = iVar.f(j.j(List.class, LoginError.class), b0.e(), SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        zq3.g(f, "adapter(...)");
        this.nullableListOfLoginErrorAdapter = f;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LoginMeta fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                list = (List) this.nullableListOfLoginErrorAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.h();
        return new LoginMeta(list);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, LoginMeta loginMeta) {
        zq3.h(hVar, "writer");
        if (loginMeta == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(SessionGatingKeys.FULL_SESSION_ERROR_LOGS);
        this.nullableListOfLoginErrorAdapter.mo197toJson(hVar, loginMeta.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(");
        sb.append("LoginMeta");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
