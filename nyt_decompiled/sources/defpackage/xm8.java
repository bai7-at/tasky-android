package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public class xm8 extends Converter.Factory {
    static final MediaType a = MediaType.parse("text/plain");

    class a implements Converter {
        a() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(ResponseBody responseBody) {
            return responseBody.string();
        }
    }

    class b implements Converter {
        b() {
        }

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RequestBody convert(String str) {
            return RequestBody.create(xm8.a, str);
        }
    }

    @Override // retrofit2.Converter.Factory
    public Converter requestBodyConverter(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (String.class.equals(type2)) {
            return new b();
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        if (String.class.equals(type2)) {
            return new a();
        }
        return null;
    }
}
