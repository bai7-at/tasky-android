package com.nytimes.android.dailyfive.domain;

import com.facebook.AuthenticationTokenClaims;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.c29;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ChannelCategoryJsonAdapter extends JsonAdapter<ChannelCategory> {
    public static final int $stable = 8;
    private final JsonAdapter<List<Channel>> listOfChannelAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public ChannelCategoryJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(AuthenticationTokenClaims.JSON_KEY_NAME, "channels");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<List<Channel>> f2 = iVar.f(j.j(List.class, Channel.class), b0.e(), "channels");
        zq3.g(f2, "adapter(...)");
        this.listOfChannelAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ChannelCategory fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        List list = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (list = (List) this.listOfChannelAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("channels", "channels", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o(AuthenticationTokenClaims.JSON_KEY_NAME, AuthenticationTokenClaims.JSON_KEY_NAME, jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (list != null) {
            return new ChannelCategory(str, list);
        }
        JsonDataException o2 = c29.o("channels", "channels", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ChannelCategory channelCategory) {
        zq3.h(hVar, "writer");
        if (channelCategory == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(AuthenticationTokenClaims.JSON_KEY_NAME);
        this.stringAdapter.mo197toJson(hVar, channelCategory.b());
        hVar.C("channels");
        this.listOfChannelAdapter.mo197toJson(hVar, channelCategory.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ChannelCategory");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
