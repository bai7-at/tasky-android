package com.nytimes.android.features.discovery.discoverytab.composable;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.deeplink.NytUriHandlerKt;
import com.nytimes.android.designsystem.uicompose.ui.NytThemeKt;
import com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchScreenKt;
import com.nytimes.android.features.discovery.discoverysearch.DiscoverySearchViewModel;
import com.nytimes.android.features.discovery.discoverysearch.a;
import com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker;
import com.nytimes.android.features.discovery.discoverytab.DiscoverySectionViewModel;
import com.nytimes.android.features.discovery.discoverytab.ImpressionUnfearInterceptor;
import com.nytimes.android.unfear.core.composable.UnfearInterceptorKt;
import com.nytimes.android.unfear.reader.handlers.UnfearReaderHandlerProviderKt;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.composeutils.nestedscroll.ScrollObserver;
import defpackage.bu1;
import defpackage.by0;
import defpackage.cc7;
import defpackage.fc1;
import defpackage.fe4;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.i83;
import defpackage.jr1;
import defpackage.kt2;
import defpackage.m15;
import defpackage.m25;
import defpackage.n25;
import defpackage.o76;
import defpackage.or1;
import defpackage.pa9;
import defpackage.pr1;
import defpackage.py1;
import defpackage.qs2;
import defpackage.s5;
import defpackage.sa9;
import defpackage.ss2;
import defpackage.t21;
import defpackage.uh;
import defpackage.ww8;
import defpackage.x08;
import defpackage.z12;
import defpackage.zq3;
import defpackage.zr0;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes4.dex */
public abstract class DiscoveryScreenKt {
    public static final void a(final fe4 fe4Var, DiscoverySectionViewModel discoverySectionViewModel, DiscoverySearchViewModel discoverySearchViewModel, Composer composer, final int i, final int i2) {
        int i3;
        DiscoverySearchViewModel discoverySearchViewModel2;
        int i4;
        String str;
        int i5;
        int i6;
        DiscoverySectionViewModel discoverySectionViewModel2;
        DiscoverySectionViewModel discoverySectionViewModel3;
        DiscoverySearchViewModel discoverySearchViewModel3;
        Object obj;
        Composer composer2;
        final DiscoverySectionViewModel discoverySectionViewModel4;
        final DiscoverySearchViewModel discoverySearchViewModel4;
        int i7;
        zq3.h(fe4Var, "mainTabState");
        Composer h = composer.h(1043079788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(fe4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                discoverySearchViewModel2 = discoverySearchViewModel;
                if (h.S(discoverySearchViewModel2)) {
                    i7 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    i3 |= i7;
                }
            } else {
                discoverySearchViewModel2 = discoverySearchViewModel;
            }
            i7 = 128;
            i3 |= i7;
        } else {
            discoverySearchViewModel2 = discoverySearchViewModel;
        }
        if (i8 == 2 && (i3 & 731) == 146 && h.i()) {
            h.K();
            discoverySectionViewModel4 = discoverySectionViewModel;
            discoverySearchViewModel4 = discoverySearchViewModel2;
            composer2 = h;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                if (i8 != 0) {
                    h.z(1890788296);
                    sa9 a = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
                    if (a == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    t.b a2 = i83.a(a, h, 0);
                    h.z(1729797275);
                    i4 = 1890788296;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i5 = 0;
                    q c = pa9.c(DiscoverySectionViewModel.class, a, null, a2, a instanceof d ? ((d) a).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
                    h.R();
                    h.R();
                    i6 = i3 & (-113);
                    discoverySectionViewModel2 = (DiscoverySectionViewModel) c;
                } else {
                    i4 = 1890788296;
                    str = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner";
                    i5 = 0;
                    i6 = i3;
                    discoverySectionViewModel2 = discoverySectionViewModel;
                }
                if ((i2 & 4) != 0) {
                    h.z(i4);
                    sa9 a3 = LocalViewModelStoreOwner.a.a(h, LocalViewModelStoreOwner.c);
                    if (a3 == null) {
                        throw new IllegalStateException(str);
                    }
                    t.b a4 = i83.a(a3, h, i5);
                    h.z(1729797275);
                    q c2 = pa9.c(DiscoverySearchViewModel.class, a3, null, a4, a3 instanceof d ? ((d) a3).getDefaultViewModelCreationExtras() : t21.a.b, h, 36936, 0);
                    h.R();
                    h.R();
                    discoverySearchViewModel3 = (DiscoverySearchViewModel) c2;
                    discoverySectionViewModel3 = discoverySectionViewModel2;
                    i3 = i6 & (-897);
                } else {
                    discoverySectionViewModel3 = discoverySectionViewModel2;
                    i3 = i6;
                    discoverySearchViewModel3 = discoverySearchViewModel2;
                }
            } else {
                h.K();
                if (i8 != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                discoverySectionViewModel3 = discoverySectionViewModel;
                discoverySearchViewModel3 = discoverySearchViewModel2;
                i5 = 0;
            }
            h.u();
            if (b.G()) {
                b.S(1043079788, i3, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreen (DiscoveryScreen.kt:42)");
            }
            h.z(1396128245);
            ComponentActivity d = s5.d(h, i5);
            h.z(363804603);
            Object A = h.A();
            if (A == Composer.a.a()) {
                try {
                    zq3.e(d);
                    obj = z12.a(d, pr1.class);
                } catch (Exception unused) {
                    obj = null;
                }
                A = obj;
                h.q(A);
            }
            h.R();
            h.R();
            final pr1 pr1Var = (pr1) A;
            if (pr1Var == null) {
                throw new IllegalStateException("Should not be possible.");
            }
            final DiscoveryEventTracker z = pr1Var.z();
            final DiscoverySectionViewModel discoverySectionViewModel5 = discoverySectionViewModel3;
            composer2 = h;
            final DiscoverySearchViewModel discoverySearchViewModel5 = discoverySearchViewModel3;
            NytUriHandlerKt.a(zr0.b(composer2, -1224472449, true, new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i9) {
                    if ((i9 & 11) == 2 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-1224472449, i9, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreen.<anonymous> (DiscoveryScreen.kt:48)");
                    }
                    final DiscoveryEventTracker discoveryEventTracker = DiscoveryEventTracker.this;
                    final pr1 pr1Var2 = pr1Var;
                    final DiscoverySectionViewModel discoverySectionViewModel6 = discoverySectionViewModel5;
                    final fe4 fe4Var2 = fe4Var;
                    final DiscoverySearchViewModel discoverySearchViewModel6 = discoverySearchViewModel5;
                    NytThemeKt.a(false, null, null, zr0.b(composer3, 1838269967, true, new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.gt2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                            invoke((Composer) obj2, ((Number) obj3).intValue());
                            return ww8.a;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 11) == 2 && composer4.i()) {
                                composer4.K();
                                return;
                            }
                            if (b.G()) {
                                b.S(1838269967, i10, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreen.<anonymous>.<anonymous> (DiscoveryScreen.kt:49)");
                            }
                            o76[] o76VarArr = {UnfearInterceptorKt.a().c(new ImpressionUnfearInterceptor(DiscoveryEventTracker.this)), UnfearReaderHandlerProviderKt.a().c(pr1Var2.W()), UnfearReaderHandlerProviderKt.b().c(pr1Var2.W())};
                            final pr1 pr1Var3 = pr1Var2;
                            final DiscoverySectionViewModel discoverySectionViewModel7 = discoverySectionViewModel6;
                            final fe4 fe4Var3 = fe4Var2;
                            final DiscoveryEventTracker discoveryEventTracker2 = DiscoveryEventTracker.this;
                            final DiscoverySearchViewModel discoverySearchViewModel7 = discoverySearchViewModel6;
                            CompositionLocalKt.b(o76VarArr, zr0.b(composer4, -1300608305, true, new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // defpackage.gt2
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                    invoke((Composer) obj2, ((Number) obj3).intValue());
                                    return ww8.a;
                                }

                                public final void invoke(Composer composer5, int i11) {
                                    if ((i11 & 11) == 2 && composer5.i()) {
                                        composer5.K();
                                        return;
                                    }
                                    if (b.G()) {
                                        b.S(-1300608305, i11, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreen.<anonymous>.<anonymous>.<anonymous> (DiscoveryScreen.kt:54)");
                                    }
                                    final float g = bu1.g(bu1.g(48) + bu1.g(32));
                                    final n25 e = NavHostControllerKt.e(new Navigator[0], composer5, 8);
                                    final pr1 pr1Var4 = pr1.this;
                                    final DiscoverySectionViewModel discoverySectionViewModel8 = discoverySectionViewModel7;
                                    final fe4 fe4Var4 = fe4Var3;
                                    final DiscoveryEventTracker discoveryEventTracker3 = discoveryEventTracker2;
                                    final DiscoverySearchViewModel discoverySearchViewModel8 = discoverySearchViewModel7;
                                    NavHostKt.b(e, "home", null, null, null, null, null, null, null, new ss2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.ss2
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                            invoke((m25) obj2);
                                            return ww8.a;
                                        }

                                        public final void invoke(m25 m25Var) {
                                            zq3.h(m25Var, "$this$NavHost");
                                            final float f = g;
                                            final pr1 pr1Var5 = pr1Var4;
                                            final DiscoverySectionViewModel discoverySectionViewModel9 = discoverySectionViewModel8;
                                            final fe4 fe4Var5 = fe4Var4;
                                            final DiscoveryEventTracker discoveryEventTracker4 = discoveryEventTracker3;
                                            final n25 n25Var = e;
                                            NavGraphBuilderKt.c(m25Var, "home", null, null, null, null, null, null, zr0.c(1364603053, true, new kt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.1

                                                @fc1(c = "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$1$1", f = "DiscoveryScreen.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
                                                /* renamed from: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                                static final class C02721 extends SuspendLambda implements gt2 {
                                                    final /* synthetic */ fe4 $mainTabState;
                                                    final /* synthetic */ or1 $state;
                                                    int label;

                                                    @fc1(c = "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$1$1$1", f = "DiscoveryScreen.kt", l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "invokeSuspend")
                                                    /* renamed from: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    static final class C02731 extends SuspendLambda implements gt2 {
                                                        final /* synthetic */ or1 $state;
                                                        /* synthetic */ int I$0;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C02731(or1 or1Var, by0 by0Var) {
                                                            super(2, by0Var);
                                                            this.$state = or1Var;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final by0 create(Object obj, by0 by0Var) {
                                                            C02731 c02731 = new C02731(this.$state, by0Var);
                                                            c02731.I$0 = ((Number) obj).intValue();
                                                            return c02731;
                                                        }

                                                        public final Object invoke(int i, by0 by0Var) {
                                                            return ((C02731) create(Integer.valueOf(i), by0Var)).invokeSuspend(ww8.a);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            Object h = a.h();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                f.b(obj);
                                                                int i2 = this.I$0;
                                                                or1 or1Var = this.$state;
                                                                this.label = 1;
                                                                if (or1Var.a(i2, this) == h) {
                                                                    return h;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                f.b(obj);
                                                            }
                                                            return ww8.a;
                                                        }

                                                        @Override // defpackage.gt2
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                            return invoke(((Number) obj).intValue(), (by0) obj2);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C02721(fe4 fe4Var, or1 or1Var, by0 by0Var) {
                                                        super(2, by0Var);
                                                        this.$mainTabState = fe4Var;
                                                        this.$state = or1Var;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final by0 create(Object obj, by0 by0Var) {
                                                        return new C02721(this.$mainTabState, this.$state, by0Var);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object h = a.h();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            f.b(obj);
                                                            Flow onEach = FlowKt.onEach(this.$mainTabState.c(), new C02731(this.$state, null));
                                                            this.label = 1;
                                                            if (FlowKt.collect(onEach, this) == h) {
                                                                return h;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            f.b(obj);
                                                        }
                                                        return ww8.a;
                                                    }

                                                    @Override // defpackage.gt2
                                                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                                        return ((C02721) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(4);
                                                }

                                                @Override // defpackage.kt2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                                    invoke((uh) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Number) obj5).intValue());
                                                    return ww8.a;
                                                }

                                                public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer6, int i12) {
                                                    zq3.h(uhVar, "$this$composable");
                                                    zq3.h(navBackStackEntry, "it");
                                                    if (b.G()) {
                                                        b.S(1364603053, i12, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoveryScreen.kt:58)");
                                                    }
                                                    or1 c3 = DiscoverySectionsScreenKt.c(f, null, null, composer6, 6, 6);
                                                    py1.d(ww8.a, new C02721(fe4Var5, c3, null), composer6, 70);
                                                    TimeStampUtil s = pr1Var5.s();
                                                    DownloadState downloadState = (DownloadState) y.b(discoverySectionViewModel9.g(), null, composer6, 8, 1).getValue();
                                                    final DiscoveryEventTracker discoveryEventTracker5 = discoveryEventTracker4;
                                                    final DiscoverySectionViewModel discoverySectionViewModel10 = discoverySectionViewModel9;
                                                    qs2 qs2Var = new qs2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // defpackage.qs2
                                                        /* renamed from: invoke */
                                                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                            m368invoke();
                                                            return ww8.a;
                                                        }

                                                        /* renamed from: invoke, reason: collision with other method in class */
                                                        public final void m368invoke() {
                                                            DiscoveryEventTracker.this.g();
                                                            discoverySectionViewModel10.i(ParallelDownloadStrategy.FETCH_ALWAYS);
                                                        }
                                                    };
                                                    final n25 n25Var2 = n25Var;
                                                    DiscoverySectionsScreenKt.a(s, downloadState, qs2Var, new qs2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.1.3
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // defpackage.qs2
                                                        /* renamed from: invoke */
                                                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                            m369invoke();
                                                            return ww8.a;
                                                        }

                                                        /* renamed from: invoke, reason: collision with other method in class */
                                                        public final void m369invoke() {
                                                            NavController.T(n25.this, "search", null, null, 6, null);
                                                        }
                                                    }, c3, composer6, (ScrollObserver.g << 12) | 72);
                                                    if (b.G()) {
                                                        b.R();
                                                    }
                                                }
                                            }), WebSocketProtocol.PAYLOAD_SHORT, null);
                                            List e2 = i.e(m15.a("query", new ss2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.2
                                                public final void b(androidx.navigation.b bVar) {
                                                    zq3.h(bVar, "$this$navArgument");
                                                    bVar.b("");
                                                }

                                                @Override // defpackage.ss2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                    b((androidx.navigation.b) obj2);
                                                    return ww8.a;
                                                }
                                            }));
                                            final float f2 = g;
                                            final DiscoverySearchViewModel discoverySearchViewModel9 = discoverySearchViewModel8;
                                            final fe4 fe4Var6 = fe4Var4;
                                            final n25 n25Var2 = e;
                                            NavGraphBuilderKt.c(m25Var, "search?query={query}", e2, null, null, null, null, null, zr0.c(-278268138, true, new kt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.3

                                                @fc1(c = "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$3$1", f = "DiscoveryScreen.kt", l = {80}, m = "invokeSuspend")
                                                /* renamed from: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$3$1, reason: invalid class name and collision with other inner class name */
                                                static final class C02741 extends SuspendLambda implements gt2 {
                                                    final /* synthetic */ NavBackStackEntry $backStackEntry;
                                                    final /* synthetic */ fe4 $mainTabState;
                                                    final /* synthetic */ n25 $navController;
                                                    final /* synthetic */ DiscoverySearchViewModel $searchViewModel;
                                                    int label;

                                                    @fc1(c = "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$3$1$1", f = "DiscoveryScreen.kt", l = {}, m = "invokeSuspend")
                                                    /* renamed from: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$1$1$1$1$3$1$1, reason: invalid class name and collision with other inner class name */
                                                    static final class C02751 extends SuspendLambda implements gt2 {
                                                        final /* synthetic */ n25 $navController;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C02751(n25 n25Var, by0 by0Var) {
                                                            super(2, by0Var);
                                                            this.$navController = n25Var;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final by0 create(Object obj, by0 by0Var) {
                                                            return new C02751(this.$navController, by0Var);
                                                        }

                                                        public final Object invoke(int i, by0 by0Var) {
                                                            return ((C02751) create(Integer.valueOf(i), by0Var)).invokeSuspend(ww8.a);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final Object invokeSuspend(Object obj) {
                                                            a.h();
                                                            if (this.label != 0) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            f.b(obj);
                                                            NavController.T(this.$navController, "home", null, null, 6, null);
                                                            return ww8.a;
                                                        }

                                                        @Override // defpackage.gt2
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                                            return invoke(((Number) obj).intValue(), (by0) obj2);
                                                        }
                                                    }

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C02741(DiscoverySearchViewModel discoverySearchViewModel, NavBackStackEntry navBackStackEntry, fe4 fe4Var, n25 n25Var, by0 by0Var) {
                                                        super(2, by0Var);
                                                        this.$searchViewModel = discoverySearchViewModel;
                                                        this.$backStackEntry = navBackStackEntry;
                                                        this.$mainTabState = fe4Var;
                                                        this.$navController = n25Var;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final by0 create(Object obj, by0 by0Var) {
                                                        return new C02741(this.$searchViewModel, this.$backStackEntry, this.$mainTabState, this.$navController, by0Var);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object h = a.h();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            f.b(obj);
                                                            DiscoverySearchViewModel discoverySearchViewModel = this.$searchViewModel;
                                                            Bundle c = this.$backStackEntry.c();
                                                            String string = c != null ? c.getString("query") : null;
                                                            if (string == null) {
                                                                string = "";
                                                            }
                                                            discoverySearchViewModel.m(string);
                                                            Flow onEach = FlowKt.onEach(this.$mainTabState.c(), new C02751(this.$navController, null));
                                                            this.label = 1;
                                                            if (FlowKt.collect(onEach, this) == h) {
                                                                return h;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            f.b(obj);
                                                        }
                                                        return ww8.a;
                                                    }

                                                    @Override // defpackage.gt2
                                                    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                                                        return ((C02741) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                                                    }
                                                }

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(4);
                                                }

                                                private static final Set b(x08 x08Var) {
                                                    return (Set) x08Var.getValue();
                                                }

                                                @Override // defpackage.kt2
                                                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                                                    invoke((uh) obj2, (NavBackStackEntry) obj3, (Composer) obj4, ((Number) obj5).intValue());
                                                    return ww8.a;
                                                }

                                                public final void invoke(uh uhVar, NavBackStackEntry navBackStackEntry, Composer composer6, int i12) {
                                                    zq3.h(uhVar, "$this$composable");
                                                    zq3.h(navBackStackEntry, "backStackEntry");
                                                    if (b.G()) {
                                                        b.S(-278268138, i12, -1, "com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DiscoveryScreen.kt:77)");
                                                    }
                                                    py1.d(ww8.a, new C02741(discoverySearchViewModel9, navBackStackEntry, fe4Var6, n25Var2, null), composer6, 70);
                                                    jr1 l = DiscoverySearchScreenKt.l(f2, null, null, composer6, 6, 6);
                                                    LazyPagingItems b = LazyPagingItemsKt.b(discoverySearchViewModel9.j(), null, composer6, 8, 1);
                                                    x08 b2 = y.b(discoverySearchViewModel9.i(), null, composer6, 8, 1);
                                                    com.nytimes.android.features.discovery.discoverysearch.a aVar = (com.nytimes.android.features.discovery.discoverysearch.a) y.a(discoverySearchViewModel9.l(), a.d.b, null, composer6, (a.d.c << 3) | 8, 2).getValue();
                                                    String str2 = (String) y.b(discoverySearchViewModel9.k(), null, composer6, 8, 1).getValue();
                                                    Set b3 = b(b2);
                                                    final DiscoverySearchViewModel discoverySearchViewModel10 = discoverySearchViewModel9;
                                                    ss2 ss2Var = new ss2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.3.2
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // defpackage.ss2
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                            invoke((String) obj2);
                                                            return ww8.a;
                                                        }

                                                        public final void invoke(String str3) {
                                                            zq3.h(str3, "it");
                                                            DiscoverySearchViewModel.this.m(str3);
                                                        }
                                                    };
                                                    final DiscoverySearchViewModel discoverySearchViewModel11 = discoverySearchViewModel9;
                                                    ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.3.3
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // defpackage.ss2
                                                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                                            invoke((String) obj2);
                                                            return ww8.a;
                                                        }

                                                        public final void invoke(String str3) {
                                                            zq3.h(str3, "it");
                                                            DiscoverySearchViewModel.this.n(str3);
                                                        }
                                                    };
                                                    final n25 n25Var3 = n25Var2;
                                                    DiscoverySearchScreenKt.a(l, b, b3, aVar, str2, ss2Var, ss2Var2, new qs2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt.DiscoveryScreen.1.1.1.1.3.4
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // defpackage.qs2
                                                        /* renamed from: invoke */
                                                        public /* bridge */ /* synthetic */ Object mo865invoke() {
                                                            m370invoke();
                                                            return ww8.a;
                                                        }

                                                        /* renamed from: invoke, reason: collision with other method in class */
                                                        public final void m370invoke() {
                                                            NavController.T(n25.this, "home", null, null, 6, null);
                                                        }
                                                    }, null, composer6, jr1.c | 512 | (LazyPagingItems.f << 3) | (com.nytimes.android.features.discovery.discoverysearch.a.a << 9), JceEncryptionConstants.SYMMETRIC_KEY_LENGTH);
                                                    if (b.G()) {
                                                        b.R();
                                                    }
                                                }
                                            }), 124, null);
                                        }
                                    }, composer5, 56, 508);
                                    if (b.G()) {
                                        b.R();
                                    }
                                }
                            }), composer4, 56);
                            if (b.G()) {
                                b.R();
                            }
                        }
                    }), composer3, 3072, 7);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), composer2, 6);
            if (b.G()) {
                b.R();
            }
            discoverySectionViewModel4 = discoverySectionViewModel3;
            discoverySearchViewModel4 = discoverySearchViewModel3;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.features.discovery.discoverytab.composable.DiscoveryScreenKt$DiscoveryScreen$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i9) {
                    DiscoveryScreenKt.a(fe4.this, discoverySectionViewModel4, discoverySearchViewModel4, composer3, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
