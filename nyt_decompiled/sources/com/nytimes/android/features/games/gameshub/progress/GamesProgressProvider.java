package com.nytimes.android.features.games.gameshub.progress;

import defpackage.u14;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.threeten.bp.LocalDate;

/* loaded from: classes4.dex */
public final class GamesProgressProvider {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final GamesProgressRepository a;
    private final MutableStateFlow b;
    private final MutableStateFlow c;
    private final StateFlow d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b() {
            String localDate = LocalDate.now().toString();
            zq3.g(localDate, "toString(...)");
            return localDate;
        }

        private a() {
        }
    }

    public GamesProgressProvider(GamesProgressRepository gamesProgressRepository) {
        zq3.h(gamesProgressRepository, "gamesProgressRepository");
        this.a = gamesProgressRepository;
        u14.b bVar = u14.b.b;
        this.b = StateFlowKt.MutableStateFlow(bVar);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bVar);
        this.c = MutableStateFlow;
        this.d = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow a() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r4.b.setValue(new u14.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleIds$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleIds$1 r0 = (com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleIds$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleIds$1 r0 = new com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleIds$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider r4 = (com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider) r4
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L54
        L2d:
            r5 = move-exception
            goto L61
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.b
            u14$b r2 = u14.b.b
            r5.setValue(r2)
            com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository r5 = r4.a     // Catch: java.lang.Exception -> L2d
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$a r2 = com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider.Companion     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider.a.a(r2)     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r5.b(r2, r0)     // Catch: java.lang.Exception -> L2d
            if (r5 != r1) goto L54
            return r1
        L54:
            com.nytimes.android.features.games.gameshub.progress.api.PuzzleIdResponse r5 = (com.nytimes.android.features.games.gameshub.progress.api.PuzzleIdResponse) r5     // Catch: java.lang.Exception -> L2d
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.b     // Catch: java.lang.Exception -> L2d
            u14$c r1 = new u14$c     // Catch: java.lang.Exception -> L2d
            r1.<init>(r5)     // Catch: java.lang.Exception -> L2d
            r0.setValue(r1)     // Catch: java.lang.Exception -> L2d
            goto L6b
        L61:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.b
            u14$a r0 = new u14$a
            r0.<init>(r5)
            r4.setValue(r0)
        L6b:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider.b(by0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(5:19|20|(2:22|(1:24))|13|14)|12|13|14))|27|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        r4.c.setValue(new u14.a(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleProgressData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleProgressData$1 r0 = (com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleProgressData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleProgressData$1 r0 = new com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider$getPuzzleProgressData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider r4 = (com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider) r4
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L2d
            goto L5e
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.f.b(r5)
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.c
            u14$b r2 = u14.b.b
            r5.setValue(r2)
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.b     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L2d
            u14 r5 = (defpackage.u14) r5     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Exception -> L2d
            com.nytimes.android.features.games.gameshub.progress.api.PuzzleIdResponse r5 = (com.nytimes.android.features.games.gameshub.progress.api.PuzzleIdResponse) r5     // Catch: java.lang.Exception -> L2d
            if (r5 == 0) goto L75
            com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository r2 = r4.a     // Catch: java.lang.Exception -> L2d
            r0.L$0 = r4     // Catch: java.lang.Exception -> L2d
            r0.label = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r5 = r2.c(r5, r0)     // Catch: java.lang.Exception -> L2d
            if (r5 != r1) goto L5e
            return r1
        L5e:
            com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState r5 = (com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState) r5     // Catch: java.lang.Exception -> L2d
            kotlinx.coroutines.flow.MutableStateFlow r0 = r4.c     // Catch: java.lang.Exception -> L2d
            u14$c r1 = new u14$c     // Catch: java.lang.Exception -> L2d
            r1.<init>(r5)     // Catch: java.lang.Exception -> L2d
            r0.setValue(r1)     // Catch: java.lang.Exception -> L2d
            goto L75
        L6b:
            kotlinx.coroutines.flow.MutableStateFlow r4 = r4.c
            u14$a r0 = new u14$a
            r0.<init>(r5)
            r4.setValue(r0)
        L75:
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.progress.GamesProgressProvider.c(by0):java.lang.Object");
    }
}
