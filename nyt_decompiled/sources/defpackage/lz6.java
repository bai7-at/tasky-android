package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.io.network.raw.CachedNetworkSource;
import com.nytimes.android.io.network.raw.OkhttpNetworkSource;
import com.nytimes.android.resourcedownloader.ResourceRetrieverImpl;
import com.nytimes.android.resourcedownloader.data.LegacyResourceStoreMigration;
import com.nytimes.android.resourcedownloader.data.ResourceDao;
import com.nytimes.android.resourcedownloader.data.ResourceDatabase;
import com.nytimes.android.resourcedownloader.data.ResourceRepository;
import com.nytimes.android.resourcedownloader.data.SourceDao;
import com.nytimes.android.resourcedownloader.font.PreCachedFontLoader;
import com.nytimes.android.resourcedownloader.network.CachingResourceDownloader;
import com.nytimes.android.resourcedownloader.utils.FileSystemPersister;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public final class lz6 {
    public static final lz6 a = new lz6();

    private lz6() {
    }

    public final FileSystemPersister a(Application application) {
        zq3.h(application, "context");
        File filesDir = application.getFilesDir();
        zq3.g(filesDir, "getFilesDir(...)");
        return new FileSystemPersister(filesDir, "hybrid-resources");
    }

    public final ResourceDao b(ResourceDatabase resourceDatabase) {
        zq3.h(resourceDatabase, "database");
        return resourceDatabase.resourceDao();
    }

    public final ResourceDatabase c(Application application) {
        zq3.h(application, "application");
        return ResourceDatabase.Companion.build(application);
    }

    public final kz6 d(b04 b04Var, b04 b04Var2) {
        zq3.h(b04Var, "networkManager");
        zq3.h(b04Var2, "httpClient");
        return new CachingResourceDownloader(b04Var, b04Var2);
    }

    public final CachedNetworkSource e(OkHttpClient okHttpClient) {
        zq3.h(okHttpClient, "okHttpClient");
        return new OkhttpNetworkSource(okHttpClient);
    }

    public final OkHttpClient f(Application application, OkHttpClient okHttpClient) {
        zq3.h(application, "context");
        zq3.h(okHttpClient, "okHttpClient");
        long j = wp1.b(application) ? 3500L : 6000L;
        OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return newBuilder.connectTimeout(1000L, timeUnit).readTimeout(j, timeUnit).cache(new Cache(new File(application.getCacheDir(), "resources"), 104857600L)).build();
    }

    public final h07 g(b04 b04Var, SharedPreferences sharedPreferences, ResourceRepository resourceRepository, Resources resources, kz6 kz6Var, f55 f55Var, LegacyResourceStoreMigration legacyResourceStoreMigration) {
        zq3.h(b04Var, "cachedNetworkSource");
        zq3.h(sharedPreferences, "sharedPreferences");
        zq3.h(resourceRepository, "resourceRepository");
        zq3.h(resources, "resources");
        zq3.h(kz6Var, "resourceDownloader");
        zq3.h(f55Var, "networkStatus");
        zq3.h(legacyResourceStoreMigration, "legacyResourceStoreMigration");
        return new ResourceRetrieverImpl(resourceRepository, kz6Var, b04Var, sharedPreferences, resources, wp1.a(), f55Var, legacyResourceStoreMigration, null, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, null);
    }

    public final SourceDao h(ResourceDatabase resourceDatabase) {
        zq3.h(resourceDatabase, "database");
        return resourceDatabase.sourceDao();
    }

    public final xd9 i(h07 h07Var, PreCachedFontLoader preCachedFontLoader) {
        zq3.h(h07Var, "resourceRetriever");
        zq3.h(preCachedFontLoader, "fontLoader");
        return new yd9(h07Var, preCachedFontLoader);
    }
}
