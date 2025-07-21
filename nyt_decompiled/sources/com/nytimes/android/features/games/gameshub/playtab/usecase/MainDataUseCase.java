package com.nytimes.android.features.games.gameshub.playtab.usecase;

import android.app.Application;
import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGameCardEntity;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabContentDetails;
import com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState;
import com.nytimes.android.features.games.gameshub.playtab.usecase.a;
import com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider;
import defpackage.by0;
import defpackage.fc1;
import defpackage.oi7;
import defpackage.u14;
import defpackage.ui9;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class MainDataUseCase implements a {
    private final Application a;
    private final GamesConfigurationProvider b;
    private final GamesProgressProvider c;

    public MainDataUseCase(Application application, GamesConfigurationProvider gamesConfigurationProvider, GamesProgressProvider gamesProgressProvider) {
        zq3.h(application, "context");
        zq3.h(gamesConfigurationProvider, "configurationProvider");
        zq3.h(gamesProgressProvider, "progressProvider");
        this.a = application;
        this.b = gamesConfigurationProvider;
        this.c = gamesProgressProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List g(GamesConfigurationProvider.b bVar, u14 u14Var) {
        List b;
        List b2;
        boolean d = bVar.d();
        ArrayList arrayList = null;
        if (d) {
            NytGamesConfiguration b3 = bVar.b();
            if (b3 != null && (b2 = b3.b()) != null) {
                List list = b2;
                arrayList = new ArrayList(i.w(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(PlayTabContentDetails.Companion.d((NytGameCardEntity) it2.next()));
                }
            }
        } else {
            if (d) {
                throw new NoWhenBranchMatchedException();
            }
            NytGamesConfiguration b4 = bVar.b();
            if (b4 != null && (b = b4.b()) != null) {
                NytGamesProgressState nytGamesProgressState = (NytGamesProgressState) u14Var.a();
                if (nytGamesProgressState == null) {
                    return i.l();
                }
                List list2 = b;
                arrayList = new ArrayList(i.w(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(PlayTabContentDetails.Companion.c(this.a, bVar.e(), (NytGameCardEntity) it3.next(), nytGamesProgressState));
                }
            }
        }
        return arrayList == null ? i.l() : arrayList;
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public Object a(CoroutineScope coroutineScope, by0 by0Var) {
        final Flow flowCombine = FlowKt.flowCombine(this.b.b(), this.c.a(), new MainDataUseCase$getGameCardDetails$2(this, null));
        return FlowKt.stateIn(new Flow() { // from class: com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1

            /* renamed from: com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1$2", f = "MainDataUseCase.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, defpackage.by0 r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1$2$1 r0 = (com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1$2$1 r0 = new com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r8)
                        goto L6a
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.f.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r6 = r6.a
                        kotlin.Pair r7 = (kotlin.Pair) r7
                        iv2 r8 = new iv2
                        java.lang.Object r2 = r7.c()
                        com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$b r2 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider.b) r2
                        boolean r2 = r2.e()
                        java.lang.Object r4 = r7.c()
                        com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$b r4 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider.b) r4
                        java.lang.String r4 = r4.c()
                        java.lang.Object r5 = r7.c()
                        com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider$b r5 = (com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider.b) r5
                        com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration r5 = r5.b()
                        java.lang.Object r7 = r7.d()
                        java.util.List r7 = (java.util.List) r7
                        r8.<init>(r2, r4, r5, r7)
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r8, r0)
                        if (r6 != r1) goto L6a
                        return r1
                    L6a:
                        ww8 r6 = defpackage.ww8.a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$getGameCardDetails$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var2) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var2);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, coroutineScope, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$reloadData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$reloadData$1 r0 = (com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$reloadData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$reloadData$1 r0 = new com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase$reloadData$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.f.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase r6 = (com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase) r6
            kotlin.f.b(r7)
            goto L64
        L3f:
            java.lang.Object r6 = r0.L$0
            com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase r6 = (com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase) r6
            kotlin.f.b(r7)
            goto L57
        L47:
            kotlin.f.b(r7)
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider r7 = r6.c
            r0.L$0 = r6
            r0.label = r5
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider r7 = r6.c
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider r6 = r6.b
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            ww8 r6 = defpackage.ww8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.playtab.usecase.MainDataUseCase.b(by0):java.lang.Object");
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public String c(boolean z, int i, Enum r3) {
        return a.C0278a.a(this, z, i, r3);
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public ui9 d() {
        return a.C0278a.b(this);
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public void e(oi7 oi7Var) {
        a.C0278a.c(this, oi7Var);
    }
}
