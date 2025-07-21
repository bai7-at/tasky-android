package defpackage;

import com.nytimes.android.coroutinesutils.FetchResult;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.DefaultConstructorMarker;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public final class w45 extends CallAdapter.Factory {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w45 a() {
            return new w45(null);
        }

        private a() {
        }
    }

    public /* synthetic */ w45(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // retrofit2.CallAdapter.Factory
    public CallAdapter get(Type type2, Annotation[] annotationArr, Retrofit retrofit) {
        zq3.h(type2, "returnType");
        zq3.h(annotationArr, "annotations");
        zq3.h(retrofit, "retrofit");
        Type parameterUpperBound = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type2);
        if (!zq3.c(CallAdapter.Factory.getRawType(type2), Call.class) || !zq3.c(CallAdapter.Factory.getRawType(parameterUpperBound), FetchResult.class)) {
            return null;
        }
        zq3.f(parameterUpperBound, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type parameterUpperBound2 = CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
        zq3.e(parameterUpperBound2);
        return new v45(parameterUpperBound2);
    }

    private w45() {
    }
}
