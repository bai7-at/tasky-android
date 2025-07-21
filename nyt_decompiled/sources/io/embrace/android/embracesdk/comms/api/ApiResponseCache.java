package io.embrace.android.embracesdk.comms.api;

import android.net.http.HttpResponseCache;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.serialization.EmbraceSerializer;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import io.embrace.android.embracesdk.storage.StorageService;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.CacheResponse;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ApiResponseCache implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final String ETAG_HEADER = "ETag";
    private static final long MAX_CACHE_SIZE_BYTES = 2097152;
    private volatile HttpResponseCache cache;
    private final Object lock;
    private final InternalEmbraceLogger logger;
    private final EmbraceSerializer serializer;
    private final StorageService storageService;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ApiResponseCache(EmbraceSerializer embraceSerializer, StorageService storageService, InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(embraceSerializer, "serializer");
        zq3.h(storageService, "storageService");
        zq3.h(internalEmbraceLogger, "logger");
        this.serializer = embraceSerializer;
        this.storageService = storageService;
        this.logger = internalEmbraceLogger;
        this.lock = new Object();
    }

    private final void initializeIfNeeded() {
        HttpResponseCache httpResponseCache;
        if (this.cache == null) {
            synchronized (this.lock) {
                if (this.cache == null) {
                    try {
                        httpResponseCache = HttpResponseCache.install(this.storageService.getConfigCacheDir(), 2097152L);
                    } catch (IOException e) {
                        this.logger.log("Failed to initialize HTTP cache.", InternalEmbraceLogger.Severity.WARNING, e, false);
                        httpResponseCache = null;
                    }
                    this.cache = httpResponseCache;
                }
                ww8 ww8Var = ww8.a;
            }
        }
    }

    private final CacheResponse retrieveCacheResponse(String str, ApiRequest apiRequest) {
        initializeIfNeeded();
        HttpResponseCache httpResponseCache = this.cache;
        if (httpResponseCache == null) {
            return null;
        }
        try {
            URI create = URI.create(str);
            String obj = apiRequest.getHttpMethod().toString();
            Map<String, String> headers = apiRequest.getHeaders();
            LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(headers.size()));
            for (Object obj2 : headers.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj2).getKey(), i.e(((Map.Entry) obj2).getValue()));
            }
            return httpResponseCache.get(create, obj, linkedHashMap);
        } catch (IOException unused) {
            return null;
        }
    }

    private final String retrieveETag(CacheResponse cacheResponse) {
        try {
            List<String> list = cacheResponse.getHeaders().get("ETag");
            List<String> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException e) {
            this.logger.log("Failed to find ETag", InternalEmbraceLogger.Severity.WARNING, e, false);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        HttpResponseCache httpResponseCache = this.cache;
        if (httpResponseCache != null) {
            httpResponseCache.flush();
        }
    }

    public final CachedConfig retrieveCachedConfig(String str, ApiRequest apiRequest) {
        Object b;
        RemoteConfig remoteConfig;
        zq3.h(str, "url");
        zq3.h(apiRequest, "request");
        CacheResponse retrieveCacheResponse = retrieveCacheResponse(str, apiRequest);
        if (retrieveCacheResponse != null) {
            try {
                Result.a aVar = Result.a;
                EmbraceSerializer embraceSerializer = this.serializer;
                InputStream body = retrieveCacheResponse.getBody();
                zq3.g(body, "body");
                b = Result.b((RemoteConfig) embraceSerializer.fromJson(body, RemoteConfig.class));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                b = Result.b(f.a(th));
            }
            if (Result.g(b)) {
                b = null;
            }
            remoteConfig = (RemoteConfig) b;
        } else {
            remoteConfig = null;
        }
        return new CachedConfig(remoteConfig, retrieveCacheResponse != null ? retrieveETag(retrieveCacheResponse) : null);
    }
}
