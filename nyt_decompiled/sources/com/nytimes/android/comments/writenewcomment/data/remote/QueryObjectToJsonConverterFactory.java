package com.nytimes.android.comments.writenewcomment.data.remote;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.zq3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class QueryObjectToJsonConverterFactory extends Converter.Factory {
    public static final int $stable = 8;
    private final i moshi;

    public QueryObjectToJsonConverterFactory(i iVar) {
        zq3.h(iVar, "moshi");
        this.moshi = iVar;
    }

    private final boolean hasToJson(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation instanceof ToJson) {
                return true;
            }
        }
        return false;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, String> stringConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        zq3.h(annotationArr, "annotations");
        zq3.h(retrofit, "retrofit");
        if (!hasToJson(annotationArr)) {
            return super.stringConverter(type2, annotationArr, retrofit);
        }
        final JsonAdapter d = this.moshi.d(type2);
        return new Converter() { // from class: kb6
            @Override // retrofit2.Converter
            public final Object convert(Object obj) {
                String json;
                json = JsonAdapter.this.toJson(obj);
                return json;
            }
        };
    }
}
