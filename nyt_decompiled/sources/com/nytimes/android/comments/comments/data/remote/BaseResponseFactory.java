package com.nytimes.android.comments.comments.data.remote;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import defpackage.zq3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class BaseResponseFactory implements JsonAdapter.e {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final BaseResponseFactory INSTANCE = new BaseResponseFactory();

    private static final class BaseResponseJsonAdapter extends JsonAdapter<Object> {
        private final JsonAdapter<?> delegate;

        public BaseResponseJsonAdapter(JsonAdapter<?> jsonAdapter) {
            zq3.h(jsonAdapter, "delegate");
            this.delegate = jsonAdapter;
        }

        @Override // com.squareup.moshi.JsonAdapter
        public Object fromJson(JsonReader jsonReader) {
            zq3.h(jsonReader, "reader");
            jsonReader.b();
            Object obj = null;
            while (jsonReader.r() != JsonReader.Token.END_OBJECT) {
                if (zq3.c(jsonReader.nextName(), "results")) {
                    obj = this.delegate.fromJson(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.h();
            return obj;
        }

        public final JsonAdapter<?> getDelegate() {
            return this.delegate;
        }

        @Override // com.squareup.moshi.JsonAdapter
        /* renamed from: toJson, reason: merged with bridge method [inline-methods] */
        public Void mo197toJson(h hVar, Object obj) {
            zq3.h(hVar, "writer");
            throw new UnsupportedOperationException("@WrappedBaseResponse is only used to deserialize objects.");
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BaseResponseFactory getINSTANCE() {
            return BaseResponseFactory.INSTANCE;
        }

        private Companion() {
        }
    }

    @Override // com.squareup.moshi.JsonAdapter.e
    public JsonAdapter<?> create(Type type2, Set<? extends Annotation> set, i iVar) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        zq3.h(set, "annotations");
        zq3.h(iVar, "moshi");
        Set k = j.k(set, WrappedBaseResponse.class);
        if (k == null) {
            return null;
        }
        JsonAdapter i = iVar.i(this, type2, k);
        zq3.e(i);
        return new BaseResponseJsonAdapter(i);
    }
}
