package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class vd0 extends Converter.Factory {
    /* JADX INFO: Access modifiers changed from: private */
    public static final sd0 b(ResponseBody responseBody) {
        return responseBody.source();
    }

    @Override // retrofit2.Converter.Factory
    public Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        zq3.h(annotationArr, "annotations");
        zq3.h(retrofit, "retrofit");
        if (zq3.c(sd0.class, type2)) {
            return new Converter() { // from class: td0
                @Override // retrofit2.Converter
                public final Object convert(Object obj) {
                    sd0 b;
                    b = vd0.b((ResponseBody) obj);
                    return b;
                }
            };
        }
        return null;
    }
}
