package com.nytimes.android.hybrid.bridge;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.hybrid.bridge.BridgeCache;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import defpackage.c29;
import defpackage.zq3;
import kotlin.collections.b0;

/* loaded from: classes4.dex */
public final class BridgeCache_CacheIntJsonAdapter extends JsonAdapter<BridgeCache.CacheInt> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.b options;
    private final JsonAdapter<String> stringAdapter;

    public BridgeCache_CacheIntJsonAdapter(i iVar) {
        zq3.h(iVar, "moshi");
        JsonReader.b a = JsonReader.b.a(TransferTable.COLUMN_KEY, "value");
        zq3.g(a, "of(...)");
        this.options = a;
        JsonAdapter<String> f = iVar.f(String.class, b0.e(), TransferTable.COLUMN_KEY);
        zq3.g(f, "adapter(...)");
        this.stringAdapter = f;
        JsonAdapter<Integer> f2 = iVar.f(Integer.TYPE, b0.e(), "value");
        zq3.g(f2, "adapter(...)");
        this.intAdapter = f2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BridgeCache.CacheInt fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "reader");
        jsonReader.b();
        String str = null;
        Integer num = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(this.options);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = (String) this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    JsonDataException x = c29.x(TransferTable.COLUMN_KEY, TransferTable.COLUMN_KEY, jsonReader);
                    zq3.g(x, "unexpectedNull(...)");
                    throw x;
                }
            } else if (P == 1 && (num = (Integer) this.intAdapter.fromJson(jsonReader)) == null) {
                JsonDataException x2 = c29.x("value__", "value", jsonReader);
                zq3.g(x2, "unexpectedNull(...)");
                throw x2;
            }
        }
        jsonReader.h();
        if (str == null) {
            JsonDataException o = c29.o(TransferTable.COLUMN_KEY, TransferTable.COLUMN_KEY, jsonReader);
            zq3.g(o, "missingProperty(...)");
            throw o;
        }
        if (num != null) {
            return new BridgeCache.CacheInt(str, num.intValue());
        }
        JsonDataException o2 = c29.o("value__", "value", jsonReader);
        zq3.g(o2, "missingProperty(...)");
        throw o2;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo197toJson(h hVar, BridgeCache.CacheInt cacheInt) {
        zq3.h(hVar, "writer");
        if (cacheInt == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        hVar.d();
        hVar.C(TransferTable.COLUMN_KEY);
        this.stringAdapter.mo197toJson(hVar, cacheInt.a());
        hVar.C("value");
        this.intAdapter.mo197toJson(hVar, Integer.valueOf(cacheInt.b()));
        hVar.l();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(");
        sb.append("BridgeCache.CacheInt");
        sb.append(')');
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
