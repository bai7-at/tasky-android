package io.embrace.android.embracesdk.okhttp3.swazzle.callback.okhttp3;

import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.annotation.InternalApi;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3ApplicationInterceptor;
import io.embrace.android.embracesdk.okhttp3.EmbraceOkHttp3NetworkInterceptor;
import java.util.Iterator;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

@InternalApi
/* loaded from: classes5.dex */
public final class OkHttpClient {

    @InternalApi
    public static final class Builder {
        private Builder() {
        }

        public static void _constructorOnPostBody(OkHttpClient.Builder builder) {
            logInfo("Embrace OkHTTP Wrapper; onPostBody");
            addEmbraceInterceptors(builder);
        }

        public static void _preBuild(OkHttpClient.Builder builder) {
            logInfo("Embrace OkHTTP Wrapper; onPrebuild");
            addEmbraceInterceptors(builder);
        }

        private static void addEmbraceInterceptors(OkHttpClient.Builder builder) {
            try {
                logInfo("Embrace OkHTTP Wrapper; Adding interceptors");
                addInterceptor(builder.interceptors(), new EmbraceOkHttp3ApplicationInterceptor());
                addInterceptor(builder.networkInterceptors(), new EmbraceOkHttp3NetworkInterceptor());
            } catch (Exception e) {
                logError("Could not add OkHttp interceptor. ", e);
            } catch (NoSuchMethodError e2) {
                logError("Altered OkHttpClient implementation, could not add OkHttp interceptor. ", e2);
            }
        }

        private static void addInterceptor(List<Interceptor> list, Interceptor interceptor) {
            if (list != null && !containsInstance(list, interceptor.getClass())) {
                list.add(0, interceptor);
                return;
            }
            logInfo("Not adding interceptor [" + interceptor.getClass().getSimpleName() + "]");
        }

        private static <T> boolean containsInstance(List<T> list, Class<? extends T> cls) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (cls.isInstance(it2.next())) {
                    logInfo("[" + cls.getSimpleName() + "] already present in list");
                    return true;
                }
            }
            return false;
        }

        private static void logError(String str, Throwable th) {
            Embrace.getInstance().getInternalInterface().logError(str, null, null, false);
            Embrace.getInstance().getInternalInterface().logInternalError(th);
        }

        private static void logInfo(String str) {
            Embrace.getInstance().getInternalInterface().logInfo(str, null);
        }
    }

    private OkHttpClient() {
    }
}
