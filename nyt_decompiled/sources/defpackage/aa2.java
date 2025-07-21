package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes3.dex */
public final class aa2 extends Converter.Factory {
    private final MediaType a;
    private final qk7 b;

    public aa2(MediaType mediaType, qk7 qk7Var) {
        zq3.h(mediaType, "contentType");
        zq3.h(qk7Var, "serializer");
        this.a = mediaType;
        this.b = qk7Var;
    }

    @Override // retrofit2.Converter.Factory
    public Converter requestBodyConverter(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        zq3.h(annotationArr, "parameterAnnotations");
        zq3.h(annotationArr2, "methodAnnotations");
        zq3.h(retrofit, "retrofit");
        return new ok7(this.a, this.b.c(type2), this.b);
    }

    @Override // retrofit2.Converter.Factory
    public Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        zq3.h(annotationArr, "annotations");
        zq3.h(retrofit, "retrofit");
        return new zm1(this.b.c(type2), this.b);
    }
}
