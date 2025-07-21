package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class ud0 extends Converter.Factory {

    class a implements Converter {
        a() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public sd0 convert(ResponseBody responseBody) {
            return responseBody.source();
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        if (sd0.class.equals(type2)) {
            return new a();
        }
        return null;
    }
}
