package com.nytimes.android.features.games.gameshub.playtab.usecase;

import android.app.Application;
import com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGameCardEntity;
import com.nytimes.android.features.games.gameshub.configuration.models.NytGamesConfiguration;
import com.nytimes.android.features.games.gameshub.configuration.models.PlayTabContentDetails;
import com.nytimes.android.features.games.gameshub.playtab.CrosswordPuzzleState;
import com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState;
import com.nytimes.android.features.games.gameshub.playtab.SpellingBeePuzzleState;
import com.nytimes.android.features.games.gameshub.playtab.WordlePuzzleState;
import com.nytimes.android.features.games.gameshub.progress.api.data.DailyProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.EntitledSpellingBeeProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.MiniProgress;
import com.nytimes.android.features.games.gameshub.progress.api.data.NonEntitledSpellingBeeProgress;
import com.nytimes.android.features.games.gameshub.ui.util.AnnotatedStringUtilsKt;
import defpackage.by0;
import defpackage.iv2;
import defpackage.oi7;
import defpackage.ui9;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class DebugDataUseCase implements com.nytimes.android.features.games.gameshub.playtab.usecase.a {
    public static final a Companion;
    public static final int f;
    private static final oi7 g;
    private static final NytGamesProgressState h;
    private final Application a;
    private final GamesConfigurationProvider b;
    private NytGamesProgressState c;
    private final MutableStateFlow d;
    private final StateFlow e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NytGamesProgressState c(oi7 oi7Var) {
            return new NytGamesProgressState(new SpellingBeePuzzleState(1, oi7Var.e()), new SpellingBeePuzzleState(0, oi7Var.f()), new CrosswordPuzzleState(1, false, oi7Var.c().getCeiling(), (String) null, 8, (DefaultConstructorMarker) null), new CrosswordPuzzleState(1, false, oi7Var.d().getCeiling(), (String) null, 8, (DefaultConstructorMarker) null), new WordlePuzzleState(0, oi7Var.g().e(), oi7Var.g().d()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String e(String str) {
            StringBuilder sb = new StringBuilder();
            if (str != null) {
                for (int i = 0; i < str.length(); i++) {
                    char charAt = str.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(' ');
                    }
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            zq3.g(sb2, "toString(...)");
            return sb2;
        }

        public final oi7 d() {
            return DebugDataUseCase.g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        Companion = aVar;
        f = 8;
        EntitledSpellingBeeProgress entitledSpellingBeeProgress = EntitledSpellingBeeProgress.EMPTY;
        oi7 oi7Var = new oi7(entitledSpellingBeeProgress.getRank(), entitledSpellingBeeProgress.getRank(), DailyProgress.Default, MiniProgress.Default, ui9.Companion.c());
        g = oi7Var;
        h = aVar.c(oi7Var);
    }

    public DebugDataUseCase(Application application, GamesConfigurationProvider gamesConfigurationProvider) {
        zq3.h(application, "context");
        zq3.h(gamesConfigurationProvider, "configurationProvider");
        this.a = application;
        this.b = gamesConfigurationProvider;
        this.c = h;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new iv2(false, "", null, i.l()));
        this.d = MutableStateFlow;
        this.e = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final String g(Enum r4) {
        if (r4 instanceof EntitledSpellingBeeProgress) {
            return AnnotatedStringUtilsKt.c(((EntitledSpellingBeeProgress) r4).getRank(), null, 1, null);
        }
        if (r4 instanceof NonEntitledSpellingBeeProgress) {
            return AnnotatedStringUtilsKt.c(((NonEntitledSpellingBeeProgress) r4).getRank(), null, 1, null);
        }
        if (r4 instanceof DailyProgress) {
            return Companion.e(r4.name()) + " (" + ((DailyProgress) r4).getCeiling() + "%)";
        }
        if (!(r4 instanceof MiniProgress)) {
            return r4.name();
        }
        return Companion.e(r4.name()) + " (" + ((MiniProgress) r4).getCeiling() + "%)";
    }

    private final void h(NytGamesProgressState nytGamesProgressState) {
        List b;
        Object value;
        GamesConfigurationProvider.b bVar = (GamesConfigurationProvider.b) this.b.b().getValue();
        NytGamesConfiguration b2 = bVar.b();
        if (b2 == null || (b = b2.b()) == null) {
            return;
        }
        List list = b;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(PlayTabContentDetails.Companion.c(this.a, bVar.e(), (NytGameCardEntity) it2.next(), nytGamesProgressState));
        }
        MutableStateFlow mutableStateFlow = this.d;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ((iv2) value).a(bVar.e(), bVar.c(), b2, arrayList)));
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public Object a(CoroutineScope coroutineScope, by0 by0Var) {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase$reloadData$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase$reloadData$1 r0 = (com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase$reloadData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase$reloadData$1 r0 = new com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase$reloadData$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase r4 = (com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase) r4
            kotlin.f.b(r5)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r5)
            com.nytimes.android.features.games.gameshub.configuration.GamesConfigurationProvider r5 = r4.b
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState r5 = r4.c
            r4.h(r5)
            ww8 r4 = defpackage.ww8.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.playtab.usecase.DebugDataUseCase.b(by0):java.lang.Object");
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public String c(boolean z, int i, Enum r8) {
        MiniProgress miniProgress;
        DailyProgress dailyProgress;
        zq3.h(r8, "enum");
        if (!z) {
            return g(r8);
        }
        if (r8 instanceof EntitledSpellingBeeProgress) {
            return i == 0 ? this.c.c().c() : this.c.d().c();
        }
        if (r8 instanceof NonEntitledSpellingBeeProgress) {
            return i == 0 ? this.c.c().c() : this.c.d().c();
        }
        int i2 = 0;
        if (r8 instanceof DailyProgress) {
            int b = this.c.a().b();
            DailyProgress[] values = DailyProgress.values();
            int length = values.length;
            while (true) {
                if (i2 >= length) {
                    dailyProgress = null;
                    break;
                }
                dailyProgress = values[i2];
                if (dailyProgress.getCeiling() == b) {
                    break;
                }
                i2++;
            }
            return Companion.e(dailyProgress != null ? dailyProgress.name() : null) + " (" + (dailyProgress != null ? Integer.valueOf(dailyProgress.getCeiling()) : null) + "%)";
        }
        if (!(r8 instanceof MiniProgress)) {
            return "";
        }
        int b2 = this.c.b().b();
        MiniProgress[] values2 = MiniProgress.values();
        int length2 = values2.length;
        while (true) {
            if (i2 >= length2) {
                miniProgress = null;
                break;
            }
            miniProgress = values2[i2];
            if (miniProgress.getCeiling() == b2) {
                break;
            }
            i2++;
        }
        return Companion.e(miniProgress != null ? miniProgress.name() : null) + " (" + (miniProgress != null ? Integer.valueOf(miniProgress.getCeiling()) : null) + "%)";
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public ui9 d() {
        return new ui9(0, this.c.e().b(), this.c.e().d(), 1, null);
    }

    @Override // com.nytimes.android.features.games.gameshub.playtab.usecase.a
    public void e(oi7 oi7Var) {
        zq3.h(oi7Var, "items");
        NytGamesProgressState c = Companion.c(oi7Var);
        this.c = c;
        h(c);
    }
}
