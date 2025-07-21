package com.nytimes.android.dimodules;

import android.app.Application;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.nytimes.android.NYTApplication;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.analytics.purr.PurrTrackerTypeWrapper;
import com.nytimes.android.api.cms.LatestFeed;
import com.nytimes.android.api.config.model.EComm;
import com.nytimes.android.deeplink.types.RealAssetLaunchIntentFactoryWrapper;
import com.nytimes.android.dimodules.ApplicationModule;
import com.nytimes.android.entitlements.purr.client.contracts.models.PurrTrackerType;
import com.nytimes.android.latestfeed.feed.FeedStore;
import com.nytimes.android.messaging.postloginregioffers.PostLoginRegiOfferManager;
import com.nytimes.android.subauth.IterateUserTraitsProviderImpl;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.ae0;
import defpackage.b04;
import defpackage.c06;
import defpackage.cb2;
import defpackage.cs3;
import defpackage.ct5;
import defpackage.d96;
import defpackage.ey3;
import defpackage.hk6;
import defpackage.js4;
import defpackage.ly3;
import defpackage.ms;
import defpackage.my3;
import defpackage.p86;
import defpackage.sc6;
import defpackage.ss2;
import defpackage.td4;
import defpackage.uy3;
import defpackage.y74;
import defpackage.z58;
import defpackage.zq3;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.b0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public interface ApplicationModule {
    public static final Companion Companion = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        public static final class a implements p86 {
            final /* synthetic */ b04 a;

            /* renamed from: com.nytimes.android.dimodules.ApplicationModule$Companion$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0260a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PurrTrackerTypeWrapper.values().length];
                    try {
                        iArr[PurrTrackerTypeWrapper.CONTROLLER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PurrTrackerTypeWrapper.PROCESSOR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PurrTrackerTypeWrapper.ESSENTIAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            a(b04 b04Var) {
                this.a = b04Var;
            }

            private final PurrTrackerType d(PurrTrackerTypeWrapper purrTrackerTypeWrapper) {
                int i = C0260a.a[purrTrackerTypeWrapper.ordinal()];
                if (i == 1) {
                    return PurrTrackerType.CONTROLLER;
                }
                if (i == 2) {
                    return PurrTrackerType.PROCESSOR;
                }
                if (i == 3) {
                    return PurrTrackerType.ESSENTIAL;
                }
                throw new NoWhenBranchMatchedException();
            }

            @Override // defpackage.p86
            public Flow a(PurrTrackerTypeWrapper purrTrackerTypeWrapper) {
                zq3.h(purrTrackerTypeWrapper, "trackerType");
                return ((d96) this.a.get()).e(d(purrTrackerTypeWrapper));
            }

            @Override // defpackage.p86
            public boolean b(PurrTrackerTypeWrapper purrTrackerTypeWrapper) {
                zq3.h(purrTrackerTypeWrapper, "trackerType");
                return ((d96) this.a.get()).f(d(purrTrackerTypeWrapper));
            }

            @Override // defpackage.p86
            public StateFlow c(PurrTrackerTypeWrapper purrTrackerTypeWrapper, CoroutineScope coroutineScope, SharingStarted sharingStarted) {
                return p86.a.a(this, purrTrackerTypeWrapper, coroutineScope, sharingStarted);
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Observable j(FeedStore feedStore) {
            zq3.h(feedStore, "$feedStore");
            Observable observable = RxSingleKt.rxSingle$default(null, new ApplicationModule$Companion$provideLatestCampaignCodes$1$1(feedStore, null), 1, null).toObservable();
            zq3.g(observable, "toObservable(...)");
            return observable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Observable l(FeedStore feedStore) {
            zq3.h(feedStore, "$feedStore");
            Observable stream = feedStore.stream();
            final ApplicationModule$Companion$provideLatestEComm$1$1 applicationModule$Companion$provideLatestEComm$1$1 = new PropertyReference1Impl() { // from class: com.nytimes.android.dimodules.ApplicationModule$Companion$provideLatestEComm$1$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, defpackage.kv3
                public Object get(Object obj) {
                    return ((LatestFeed) obj).getEcomm();
                }
            };
            Observable map = stream.map(new Function() { // from class: jn
                @Override // io.reactivex.functions.Function
                public final Object apply(Object obj) {
                    EComm m;
                    m = ApplicationModule.Companion.m(ss2.this, obj);
                    return m;
                }
            });
            zq3.g(map, "map(...)");
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EComm m(ss2 ss2Var, Object obj) {
            zq3.h(ss2Var, "$tmp0");
            zq3.h(obj, "p0");
            return (EComm) ss2Var.invoke(obj);
        }

        public final ms d(FeedStore feedStore, uy3 uy3Var, td4 td4Var, z58 z58Var, CoroutineScope coroutineScope) {
            zq3.h(feedStore, "feedStore");
            zq3.h(uy3Var, "helper");
            zq3.h(td4Var, "intentFactory");
            zq3.h(z58Var, "subauthClient");
            zq3.h(coroutineScope, "applicationCoroutineScope");
            return new RealAssetLaunchIntentFactoryWrapper(feedStore, uy3Var, td4Var, z58Var, coroutineScope);
        }

        public final ae0 e(Application application) {
            zq3.h(application, "application");
            NYTApplication nYTApplication = (NYTApplication) application;
            return new ae0("release", nYTApplication.k(), nYTApplication.r());
        }

        public final Gson f() {
            return ct5.a();
        }

        public final cs3 g(Application application, z58 z58Var) {
            zq3.h(application, "application");
            zq3.h(z58Var, "subauth");
            return new IterateUserTraitsProviderImpl(application, z58Var);
        }

        public final ey3 h(ms msVar, com.nytimes.android.entitlements.a aVar, Resources resources) {
            zq3.h(msVar, "wrapper");
            zq3.h(aVar, "eCommClient");
            zq3.h(resources, "res");
            return new ey3(msVar, aVar, b0.d(resources.getString(hk6.deep_link_nyt_web_host)));
        }

        public final ly3 i(final FeedStore feedStore) {
            zq3.h(feedStore, "feedStore");
            return new ly3() { // from class: in
                @Override // defpackage.ly3
                public final Observable get() {
                    Observable j;
                    j = ApplicationModule.Companion.j(FeedStore.this);
                    return j;
                }
            };
        }

        public final my3 k(final FeedStore feedStore) {
            zq3.h(feedStore, "feedStore");
            return new my3() { // from class: hn
                @Override // defpackage.my3
                public final Observable stream() {
                    Observable l;
                    l = ApplicationModule.Companion.l(FeedStore.this);
                    return l;
                }
            };
        }

        public final y74 n(cb2 cb2Var, Resources resources) {
            zq3.h(cb2Var, "featureFlagUtil");
            zq3.h(resources, "res");
            return new y74(resources.getBoolean(sc6.is_tablet), new c06(cb2Var));
        }

        public final js4 o(z58 z58Var) {
            zq3.h(z58Var, "subauth");
            return new js4(kotlin.collections.i.c1(z58Var.h().i()));
        }

        public final PostLoginRegiOfferManager p(NetworkStatus networkStatus, z58 z58Var, AbraManager abraManager) {
            zq3.h(networkStatus, "networkStatus");
            zq3.h(z58Var, "subauthClient");
            zq3.h(abraManager, "abraManager");
            return new PostLoginRegiOfferManager(networkStatus, z58Var, abraManager);
        }

        public final p86 q(b04 b04Var) {
            zq3.h(b04Var, "purrManagerClient");
            return new a(b04Var);
        }
    }
}
