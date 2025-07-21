package com.nytimes.android.share.sheet;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class ShareInstagramStoriesAssetsJsonAdapter extends JsonAdapter<ShareInstagramStoriesAssets> {
    public static final int $stable = 8;
    private final JsonAdapter<HexCodes> hexCodesAdapter;
    private final JsonAdapter<InstagramStoriesImages> instagramStoriesImagesAdapter;
    private final JsonReader.b options;

    public ShareInstagramStoriesAssetsJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a("hexCodes", "assets");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<HexCodes> f = iVar.f(HexCodes.class, b0.e(), "hexCodes");
        zq3.g(f, "adapter(...)");
        this.hexCodesAdapter = f;
        JsonAdapter<InstagramStoriesImages> f2 = iVar.f(InstagramStoriesImages.class, b0.e(), "assets");
        zq3.g(f2, "adapter(...)");
        this.instagramStoriesImagesAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public ShareInstagramStoriesAssets fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        HexCodes hexCodes = null;
        InstagramStoriesImages instagramStoriesImages = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                hexCodes = (HexCodes) this.hexCodesAdapter.fromJson(jsonReader);
                if (hexCodes == null) {
                    JsonDataException x = c29.x("hexCodes", "hexCodes", jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (instagramStoriesImages = (InstagramStoriesImages) this.instagramStoriesImagesAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("assets", "assets", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (hexCodes == null) {
            JsonDataException o = c29.o("hexCodes", "hexCodes", jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (instagramStoriesImages != null) {
            return new ShareInstagramStoriesAssets(hexCodes, instagramStoriesImages);
        }
        JsonDataException o2 = c29.o("assets", "assets", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, ShareInstagramStoriesAssets shareInstagramStoriesAssets) {
        zq3.h(hVar, "writer");
        if (shareInstagramStoriesAssets == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C("hexCodes");
        this.hexCodesAdapter.mo197toJson(hVar, shareInstagramStoriesAssets.b());
        hVar.C("assets");
        this.instagramStoriesImagesAdapter.mo197toJson(hVar, shareInstagramStoriesAssets.a());
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(49);
        sb.append("GeneratedJsonAdapter(");
        sb.append("ShareInstagramStoriesAssets");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
