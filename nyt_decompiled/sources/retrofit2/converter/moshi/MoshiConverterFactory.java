package retrofit2.converter.moshi;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.cu3;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final i moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(i iVar, boolean z, boolean z2, boolean z3) {
        this.moshi = iVar;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public static MoshiConverterFactory create() {
        return create(new i.b().d());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(cu3.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        JsonAdapter e = this.moshi.e(type2, jsonAnnotations(annotationArr));
        if (this.lenient) {
            e = e.lenient();
        }
        if (this.failOnUnknown) {
            e = e.failOnUnknown();
        }
        if (this.serializeNulls) {
            e = e.serializeNulls();
        }
        return new MoshiRequestBodyConverter(e);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        JsonAdapter e = this.moshi.e(type2, jsonAnnotations(annotationArr));
        if (this.lenient) {
            e = e.lenient();
        }
        if (this.failOnUnknown) {
            e = e.failOnUnknown();
        }
        if (this.serializeNulls) {
            e = e.serializeNulls();
        }
        return new MoshiResponseBodyConverter(e);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(i iVar) {
        if (iVar != null) {
            return new MoshiConverterFactory(iVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }
}
