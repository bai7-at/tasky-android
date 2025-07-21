package zendesk.core;

import com.zendesk.logger.Logger;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
class CachingInterceptor implements Interceptor {
    private static final String LOG_TAG = "CachingInterceptor";
    private final BaseStorage cache;
    private final Map<String, Lock> locks = new HashMap();

    CachingInterceptor(BaseStorage baseStorage) {
        this.cache = baseStorage;
    }

    private Response createResponse(int i, Request request, ResponseBody responseBody) {
        Response.Builder builder = new Response.Builder();
        if (responseBody != null) {
            builder.body(responseBody);
        } else {
            Logger.i(LOG_TAG, "Response body is null", new Object[0]);
        }
        return builder.code(i).message(request.method()).request(request).protocol(Protocol.HTTP_1_1).build();
    }

    private Response loadData(String str, Interceptor.Chain chain) throws IOException {
        int i;
        ResponseBody responseBody;
        ResponseBody responseBody2 = (ResponseBody) this.cache.get(str, ResponseBody.class);
        if (responseBody2 == null) {
            Logger.b(LOG_TAG, "Response not cached, loading it from the network. | %s", str);
            Response proceed = chain.proceed(chain.request());
            if (proceed.isSuccessful()) {
                MediaType contentType = proceed.body().contentType();
                byte[] bytes = proceed.body().bytes();
                this.cache.put(str, ResponseBody.create(contentType, bytes));
                responseBody = ResponseBody.create(contentType, bytes);
            } else {
                Logger.b(LOG_TAG, "Unable to load data from network. | %s", str);
                responseBody = proceed.body();
            }
            i = proceed.code();
        } else {
            i = 200;
            responseBody = responseBody2;
        }
        return createResponse(i, chain.request(), responseBody);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Lock reentrantLock;
        String httpUrl = chain.request().url().toString();
        synchronized (this.locks) {
            try {
                if (this.locks.containsKey(httpUrl)) {
                    reentrantLock = this.locks.get(httpUrl);
                } else {
                    reentrantLock = new ReentrantLock();
                    this.locks.put(httpUrl, reentrantLock);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            reentrantLock.lock();
            return loadData(httpUrl, chain);
        } finally {
            reentrantLock.unlock();
        }
    }
}
