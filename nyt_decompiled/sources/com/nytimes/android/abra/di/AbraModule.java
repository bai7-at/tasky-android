package com.nytimes.android.abra.di;

import android.content.Context;
import com.dropbox.android.external.store4.SourceOfTruth;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraManagerImpl;
import com.nytimes.android.abra.R;
import com.nytimes.android.abra.allocator.AbraAllocator;
import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.io.AbraFileSystem;
import com.nytimes.android.abra.io.AbraNetworkUpdater;
import com.nytimes.android.abra.io.AbraService;
import com.nytimes.android.abra.io.StoreClientKt;
import com.nytimes.android.abra.models.AbraPackage;
import com.nytimes.android.abra.sources.AbraLocalSource;
import com.nytimes.android.abra.utilities.ParamProvider;
import com.nytimes.android.abra.utilities.TestReporter;
import defpackage.b04;
import defpackage.m28;
import defpackage.n28;
import defpackage.zq3;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public final class AbraModule {
    private final int abraCodeRes;
    private final int abraRulesRes;
    private final Context context;
    private final b04 okHttpClient;
    private final ParamProvider paramProvider;
    private final TestReporter testReporter;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface AbraAllocatorScope {
    }

    public AbraModule(Context context, ParamProvider paramProvider, TestReporter testReporter, int i, int i2, b04 b04Var) {
        zq3.h(context, "context");
        zq3.h(paramProvider, "paramProvider");
        zq3.h(testReporter, "testReporter");
        zq3.h(b04Var, "okHttpClient");
        this.context = context;
        this.paramProvider = paramProvider;
        this.testReporter = testReporter;
        this.abraCodeRes = i;
        this.abraRulesRes = i2;
        this.okHttpClient = b04Var;
    }

    public final AbraFileSystem abraFileSystem(ResourceProvider resourceProvider) {
        zq3.h(resourceProvider, "resourceProvider");
        AbraFileSystem abraFileSystem = new AbraFileSystem(this.context, null, 2, null);
        abraFileSystem.copyResourcesToFS(resourceProvider);
        return abraFileSystem;
    }

    @AbraAllocatorScope
    public final CoroutineScope provideScope() {
        return CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault());
    }

    public final AbraAllocator providesAbraAllocator(AbraFileSystem abraFileSystem, AbraNetworkUpdater abraNetworkUpdater, ResourceProvider resourceProvider) {
        zq3.h(abraFileSystem, "abraFileSystem");
        zq3.h(abraNetworkUpdater, "networkUpdater");
        zq3.h(resourceProvider, "resourceProvider");
        return new AbraAllocator(this.context, this.paramProvider, new AbraPackage(abraFileSystem.readAbraRules(), abraFileSystem.readAbraBundle(), abraFileSystem.lastModifiedDate(), 0L, null, 24, null), abraNetworkUpdater, resourceProvider, null, 32, null);
    }

    public final AbraManager providesAbraManager(AbraLocalSource abraLocalSource, AbraNetworkUpdater abraNetworkUpdater, b04 b04Var, ResourceProvider resourceProvider) {
        zq3.h(abraLocalSource, "abraSource");
        zq3.h(abraNetworkUpdater, "abraNetworkUpdater");
        zq3.h(b04Var, "abraAllocator");
        zq3.h(resourceProvider, "resourceProvider");
        return new AbraManagerImpl(this.testReporter, abraLocalSource, abraNetworkUpdater, b04Var, resourceProvider);
    }

    public final AbraService providesAbraService() {
        Object create = new Retrofit.Builder().baseUrl(this.context.getString(R.string.abra_v12_base_url)).callFactory(new Call.Factory() { // from class: com.nytimes.android.abra.di.AbraModule$providesAbraService$retrofit$1
            @Override // okhttp3.Call.Factory
            public Call newCall(Request request) {
                b04 b04Var;
                zq3.h(request, "request");
                b04Var = AbraModule.this.okHttpClient;
                return ((OkHttpClient) b04Var.get()).newCall(request);
            }
        }).build().create(AbraService.class);
        zq3.g(create, "create(...)");
        return (AbraService) create;
    }

    public final CoroutineDispatcher providesCoroutinesDispatcher() {
        return Dispatchers.getIO();
    }

    public final ParamProvider providesParamProvider() {
        return this.paramProvider;
    }

    public final ResourceProvider providesResourceProvider() {
        return new ResourceProvider(this.context, this.abraCodeRes, this.abraRulesRes);
    }

    public final m28 providesStore(AbraService abraService, AbraFileSystem abraFileSystem, ResourceProvider resourceProvider) {
        zq3.h(abraService, "abraService");
        zq3.h(abraFileSystem, "abraFileSystem");
        zq3.h(resourceProvider, "resourceProvider");
        return n28.a.a(StoreClientKt.getFetcherFunc(abraService), SourceOfTruth.a.b(SourceOfTruth.a, new AbraModule$providesStore$sourceOfTruth$1(StoreClientKt.getReaderFunc(abraFileSystem), null), new AbraModule$providesStore$sourceOfTruth$2(StoreClientKt.getWriterFunc$default(resourceProvider, abraFileSystem, null, 4, null), null), null, null, 12, null)).build();
    }
}
