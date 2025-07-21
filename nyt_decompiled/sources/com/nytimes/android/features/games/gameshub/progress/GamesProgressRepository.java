package com.nytimes.android.features.games.gameshub.progress;

import com.nytimes.android.features.games.gameshub.playtab.CrosswordPuzzleState;
import com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState;
import com.nytimes.android.features.games.gameshub.playtab.SpellingBeePuzzleState;
import com.nytimes.android.features.games.gameshub.playtab.WordlePuzzleState;
import com.nytimes.android.features.games.gameshub.progress.api.CrosswordMiniPuzzleProgressData;
import com.nytimes.android.features.games.gameshub.progress.api.CrosswordPuzzleProgressData;
import com.nytimes.android.features.games.gameshub.progress.api.GamesProgressApi;
import com.nytimes.android.features.games.gameshub.progress.api.GamesProgressResult;
import com.nytimes.android.features.games.gameshub.progress.api.PuzzleData;
import com.nytimes.android.features.games.gameshub.progress.api.SpellingBeePuzzleProgressData;
import com.nytimes.android.features.games.gameshub.progress.api.WordlePuzzleProgressData;
import defpackage.by0;
import defpackage.kv5;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class GamesProgressRepository {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final GamesProgressApi a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(List list) {
            zq3.h(list, "<this>");
            return ((PuzzleData) i.k0(list)).getPuzzleId();
        }

        public final int b(List list) {
            zq3.h(list, "<this>");
            return ((PuzzleData) list.get(1)).getPuzzleId();
        }

        private a() {
        }
    }

    public GamesProgressRepository(GamesProgressApi gamesProgressApi) {
        zq3.h(gamesProgressApi, "gamesProgressApi");
        this.a = gamesProgressApi;
    }

    private final NytGamesProgressState a(GamesProgressResult gamesProgressResult, int i, int i2) {
        Object obj;
        Object obj2;
        SpellingBeePuzzleState a2;
        SpellingBeePuzzleState a3;
        CrosswordPuzzleState a4;
        CrosswordPuzzleState a5;
        WordlePuzzleState a6;
        Iterator<T> it2 = gamesProgressResult.getSpellingBeeProgressData().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            SpellingBeePuzzleProgressData spellingBeePuzzleProgressData = (SpellingBeePuzzleProgressData) obj2;
            if (spellingBeePuzzleProgressData != null && spellingBeePuzzleProgressData.getPuzzleId() == i) {
                break;
            }
        }
        SpellingBeePuzzleProgressData spellingBeePuzzleProgressData2 = (SpellingBeePuzzleProgressData) obj2;
        if (spellingBeePuzzleProgressData2 == null || (a2 = kv5.c(spellingBeePuzzleProgressData2)) == null) {
            a2 = SpellingBeePuzzleState.Companion.a();
        }
        SpellingBeePuzzleState spellingBeePuzzleState = a2;
        Iterator<T> it3 = gamesProgressResult.getSpellingBeeProgressData().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            SpellingBeePuzzleProgressData spellingBeePuzzleProgressData3 = (SpellingBeePuzzleProgressData) next;
            if (spellingBeePuzzleProgressData3 != null && spellingBeePuzzleProgressData3.getPuzzleId() == i2) {
                obj = next;
                break;
            }
        }
        SpellingBeePuzzleProgressData spellingBeePuzzleProgressData4 = (SpellingBeePuzzleProgressData) obj;
        if (spellingBeePuzzleProgressData4 == null || (a3 = kv5.c(spellingBeePuzzleProgressData4)) == null) {
            a3 = SpellingBeePuzzleState.Companion.a();
        }
        SpellingBeePuzzleState spellingBeePuzzleState2 = a3;
        CrosswordPuzzleProgressData crosswordPuzzleProgressData = (CrosswordPuzzleProgressData) i.n0(gamesProgressResult.getCrosswordDailyProgressData(), 0);
        if (crosswordPuzzleProgressData == null || (a4 = kv5.b(crosswordPuzzleProgressData)) == null) {
            a4 = CrosswordPuzzleState.Companion.a();
        }
        CrosswordPuzzleState crosswordPuzzleState = a4;
        CrosswordMiniPuzzleProgressData crosswordMiniPuzzleProgressData = (CrosswordMiniPuzzleProgressData) i.n0(gamesProgressResult.getCrosswordMiniProgressData(), 0);
        if (crosswordMiniPuzzleProgressData == null || (a5 = kv5.a(crosswordMiniPuzzleProgressData)) == null) {
            a5 = CrosswordPuzzleState.Companion.a();
        }
        CrosswordPuzzleState crosswordPuzzleState2 = a5;
        WordlePuzzleProgressData wordlePuzzleProgressData = (WordlePuzzleProgressData) i.n0(gamesProgressResult.getWordleProgressData(), 0);
        if (wordlePuzzleProgressData == null || (a6 = kv5.d(wordlePuzzleProgressData)) == null) {
            a6 = WordlePuzzleState.Companion.a();
        }
        return new NytGamesProgressState(spellingBeePuzzleState, spellingBeePuzzleState2, crosswordPuzzleState, crosswordPuzzleState2, a6);
    }

    public final Object b(String str, by0 by0Var) {
        return this.a.getPuzzleId(str, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.nytimes.android.features.games.gameshub.progress.api.PuzzleIdResponse r11, defpackage.by0 r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository$getNytPuzzleData$1
            if (r0 == 0) goto L14
            r0 = r12
            com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository$getNytPuzzleData$1 r0 = (com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository$getNytPuzzleData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository$getNytPuzzleData$1 r0 = new com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository$getNytPuzzleData$1
            r0.<init>(r10, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            int r10 = r6.I$1
            int r11 = r6.I$0
            java.lang.Object r0 = r6.L$0
            com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository r0 = (com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository) r0
            kotlin.f.b(r12)
            r8 = r10
            r10 = r0
            goto L90
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            kotlin.f.b(r12)
            com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository$a r12 = com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository.Companion
            java.util.List r1 = r11.getSpellingBeePuzzleData()
            int r7 = r12.a(r1)
            java.util.List r1 = r11.getSpellingBeePuzzleData()
            int r8 = r12.b(r1)
            com.nytimes.android.features.games.gameshub.progress.api.GamesProgressApi r1 = r10.a
            java.util.List r3 = r11.getCrosswordDailyPuzzleData()
            int r3 = r12.a(r3)
            java.util.List r4 = r11.getCrosswordMiniPuzzleData()
            int r4 = r12.a(r4)
            java.lang.Integer r5 = defpackage.cc0.c(r7)
            java.lang.Integer r9 = defpackage.cc0.c(r8)
            java.lang.Integer[] r5 = new java.lang.Integer[]{r5, r9}
            java.util.List r5 = kotlin.collections.i.o(r5)
            java.util.List r11 = r11.getWordlePuzzleData()
            int r11 = r12.a(r11)
            r6.L$0 = r10
            r6.I$0 = r7
            r6.I$1 = r8
            r6.label = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r11
            java.lang.Object r12 = r1.getNytGameData(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L8f
            return r0
        L8f:
            r11 = r7
        L90:
            com.nytimes.android.features.games.gameshub.progress.api.GamesProgressResponse r12 = (com.nytimes.android.features.games.gameshub.progress.api.GamesProgressResponse) r12
            java.lang.String r0 = r12.getStatus()
            java.lang.String r1 = "OK"
            boolean r0 = defpackage.zq3.c(r0, r1)
            if (r0 == 0) goto La7
            com.nytimes.android.features.games.gameshub.progress.api.GamesProgressResult r12 = r12.getGamesProgressResult()
            com.nytimes.android.features.games.gameshub.playtab.NytGamesProgressState r10 = r10.a(r12, r11, r8)
            return r10
        La7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = r12.getStatus()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Failed to fetch games progress, status:"
            r12.append(r0)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.features.games.gameshub.progress.GamesProgressRepository.c(com.nytimes.android.features.games.gameshub.progress.api.PuzzleIdResponse, by0):java.lang.Object");
    }
}
