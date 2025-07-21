package com.nytimes.android.abra.di;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.io.AbraNetworkUpdater_Factory;
import com.nytimes.android.abra.sources.AbraLocalSource_Factory;
import defpackage.g16;
import defpackage.nt1;
import defpackage.p76;

/* loaded from: classes2.dex */
public final class DaggerAbraComponent {

    private static final class AbraComponentImpl implements AbraComponent {
        private final AbraComponentImpl abraComponentImpl;
        private p76 abraFileSystemProvider;
        private p76 abraLocalSourceProvider;
        private p76 abraNetworkUpdaterProvider;
        private p76 provideScopeProvider;
        private p76 providesAbraAllocatorProvider;
        private p76 providesAbraManagerProvider;
        private p76 providesAbraServiceProvider;
        private p76 providesCoroutinesDispatcherProvider;
        private p76 providesParamProvider;
        private p76 providesResourceProvider;
        private p76 providesStoreProvider;

        private void initialize(AbraModule abraModule) {
            p76 b = nt1.b(AbraModule_ProvidesResourceProviderFactory.create(abraModule));
            this.providesResourceProvider = b;
            this.abraFileSystemProvider = nt1.b(AbraModule_AbraFileSystemFactory.create(abraModule, b));
            p76 b2 = nt1.b(AbraModule_ProvidesAbraServiceFactory.create(abraModule));
            this.providesAbraServiceProvider = b2;
            this.providesStoreProvider = nt1.b(AbraModule_ProvidesStoreFactory.create(abraModule, b2, this.abraFileSystemProvider, this.providesResourceProvider));
            this.providesParamProvider = nt1.b(AbraModule_ProvidesParamProviderFactory.create(abraModule));
            p76 b3 = nt1.b(AbraModule_ProvidesCoroutinesDispatcherFactory.create(abraModule));
            this.providesCoroutinesDispatcherProvider = b3;
            p76 b4 = nt1.b(AbraNetworkUpdater_Factory.create(this.providesStoreProvider, this.providesParamProvider, b3));
            this.abraNetworkUpdaterProvider = b4;
            this.providesAbraAllocatorProvider = nt1.b(AbraModule_ProvidesAbraAllocatorFactory.create(abraModule, this.abraFileSystemProvider, b4, this.providesResourceProvider));
            AbraModule_ProvideScopeFactory create = AbraModule_ProvideScopeFactory.create(abraModule);
            this.provideScopeProvider = create;
            AbraLocalSource_Factory create2 = AbraLocalSource_Factory.create(this.providesAbraAllocatorProvider, create);
            this.abraLocalSourceProvider = create2;
            this.providesAbraManagerProvider = nt1.b(AbraModule_ProvidesAbraManagerFactory.create(abraModule, create2, this.abraNetworkUpdaterProvider, this.providesAbraAllocatorProvider, this.providesResourceProvider));
        }

        @Override // com.nytimes.android.abra.di.AbraComponent
        public AbraManager abraManager() {
            return (AbraManager) this.providesAbraManagerProvider.get();
        }

        private AbraComponentImpl(AbraModule abraModule) {
            this.abraComponentImpl = this;
            initialize(abraModule);
        }
    }

    public static final class Builder {
        private AbraModule abraModule;

        public Builder abraModule(AbraModule abraModule) {
            this.abraModule = (AbraModule) g16.b(abraModule);
            return this;
        }

        public AbraComponent build() {
            g16.a(this.abraModule, AbraModule.class);
            return new AbraComponentImpl(this.abraModule);
        }

        private Builder() {
        }
    }

    private DaggerAbraComponent() {
    }

    public static Builder builder() {
        return new Builder();
    }
}
