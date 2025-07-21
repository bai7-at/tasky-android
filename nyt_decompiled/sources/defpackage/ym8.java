package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class ym8 extends Converter.Factory {
    public static final a Companion = new a(null);
    private static final MediaType a = MediaType.Companion.parse("text/plain");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RequestBody c(String str) {
        RequestBody.Companion companion = RequestBody.Companion;
        zq3.e(str);
        return companion.create(str, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(ResponseBody responseBody) {
        return responseBody.string();
    }

    @Override // retrofit2.Converter.Factory
    public Converter requestBodyConverter(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        zq3.h(annotationArr, "parameterAnnotations");
        zq3.h(annotationArr2, "methodAnnotations");
        zq3.h(retrofit, "retrofit");
        if (zq3.c(String.class, type2)) {
            return new Converter() { // from class: vm8
                @Override // retrofit2.Converter
                public final Object convert(Object obj) {
                    RequestBody c;
                    c = ym8.c((String) obj);
                    return c;
                }
            };
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        zq3.h(type2, TransferTable.COLUMN_TYPE);
        zq3.h(annotationArr, "annotations");
        zq3.h(retrofit, "retrofit");
        if (zq3.c(String.class, type2)) {
            return new Converter() { // from class: wm8
                @Override // retrofit2.Converter
                public final Object convert(Object obj) {
                    String d;
                    d = ym8.d((ResponseBody) obj);
                    return d;
                }
            };
        }
        return null;
    }
}
