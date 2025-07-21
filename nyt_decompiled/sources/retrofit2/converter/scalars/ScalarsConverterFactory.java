package retrofit2.converter.scalars;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarResponseBodyConverters;

/* loaded from: classes5.dex */
public final class ScalarsConverterFactory extends Converter.Factory {
    private ScalarsConverterFactory() {
    }

    public static ScalarsConverterFactory create() {
        return new ScalarsConverterFactory();
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (type2 == String.class || type2 == Boolean.TYPE || type2 == Boolean.class || type2 == Byte.TYPE || type2 == Byte.class || type2 == Character.TYPE || type2 == Character.class || type2 == Double.TYPE || type2 == Double.class || type2 == Float.TYPE || type2 == Float.class || type2 == Integer.TYPE || type2 == Integer.class || type2 == Long.TYPE || type2 == Long.class || type2 == Short.TYPE || type2 == Short.class) {
            return ScalarRequestBodyConverter.INSTANCE;
        }
        return null;
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        if (type2 == String.class) {
            return ScalarResponseBodyConverters.StringResponseBodyConverter.INSTANCE;
        }
        if (type2 == Boolean.class || type2 == Boolean.TYPE) {
            return ScalarResponseBodyConverters.BooleanResponseBodyConverter.INSTANCE;
        }
        if (type2 == Byte.class || type2 == Byte.TYPE) {
            return ScalarResponseBodyConverters.ByteResponseBodyConverter.INSTANCE;
        }
        if (type2 == Character.class || type2 == Character.TYPE) {
            return ScalarResponseBodyConverters.CharacterResponseBodyConverter.INSTANCE;
        }
        if (type2 == Double.class || type2 == Double.TYPE) {
            return ScalarResponseBodyConverters.DoubleResponseBodyConverter.INSTANCE;
        }
        if (type2 == Float.class || type2 == Float.TYPE) {
            return ScalarResponseBodyConverters.FloatResponseBodyConverter.INSTANCE;
        }
        if (type2 == Integer.class || type2 == Integer.TYPE) {
            return ScalarResponseBodyConverters.IntegerResponseBodyConverter.INSTANCE;
        }
        if (type2 == Long.class || type2 == Long.TYPE) {
            return ScalarResponseBodyConverters.LongResponseBodyConverter.INSTANCE;
        }
        if (type2 == Short.class || type2 == Short.TYPE) {
            return ScalarResponseBodyConverters.ShortResponseBodyConverter.INSTANCE;
        }
        return null;
    }
}
