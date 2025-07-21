package com.nytimes.android.features.games.gameshub.playtab;

import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class NytGamesProgressState {
    public static final Companion Companion = new Companion(null);
    private final SpellingBeePuzzleState a;
    private final SpellingBeePuzzleState b;
    private final CrosswordPuzzleState c;
    private final CrosswordPuzzleState d;
    private final WordlePuzzleState e;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return NytGamesProgressState$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ NytGamesProgressState(int i, SpellingBeePuzzleState spellingBeePuzzleState, SpellingBeePuzzleState spellingBeePuzzleState2, CrosswordPuzzleState crosswordPuzzleState, CrosswordPuzzleState crosswordPuzzleState2, WordlePuzzleState wordlePuzzleState, mk7 mk7Var) {
        if (31 != (i & 31)) {
            wv5.a(i, 31, NytGamesProgressState$$serializer.INSTANCE.getDescriptor());
        }
        this.a = spellingBeePuzzleState;
        this.b = spellingBeePuzzleState2;
        this.c = crosswordPuzzleState;
        this.d = crosswordPuzzleState2;
        this.e = wordlePuzzleState;
    }

    public static final /* synthetic */ void f(NytGamesProgressState nytGamesProgressState, d dVar, SerialDescriptor serialDescriptor) {
        SpellingBeePuzzleState$$serializer spellingBeePuzzleState$$serializer = SpellingBeePuzzleState$$serializer.INSTANCE;
        dVar.z(serialDescriptor, 0, spellingBeePuzzleState$$serializer, nytGamesProgressState.a);
        dVar.z(serialDescriptor, 1, spellingBeePuzzleState$$serializer, nytGamesProgressState.b);
        CrosswordPuzzleState$$serializer crosswordPuzzleState$$serializer = CrosswordPuzzleState$$serializer.INSTANCE;
        dVar.z(serialDescriptor, 2, crosswordPuzzleState$$serializer, nytGamesProgressState.c);
        dVar.z(serialDescriptor, 3, crosswordPuzzleState$$serializer, nytGamesProgressState.d);
        dVar.z(serialDescriptor, 4, WordlePuzzleState$$serializer.INSTANCE, nytGamesProgressState.e);
    }

    public final CrosswordPuzzleState a() {
        return this.c;
    }

    public final CrosswordPuzzleState b() {
        return this.d;
    }

    public final SpellingBeePuzzleState c() {
        return this.a;
    }

    public final SpellingBeePuzzleState d() {
        return this.b;
    }

    public final WordlePuzzleState e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NytGamesProgressState)) {
            return false;
        }
        NytGamesProgressState nytGamesProgressState = (NytGamesProgressState) obj;
        return zq3.c(this.a, nytGamesProgressState.a) && zq3.c(this.b, nytGamesProgressState.b) && zq3.c(this.c, nytGamesProgressState.c) && zq3.c(this.d, nytGamesProgressState.d) && zq3.c(this.e, nytGamesProgressState.e);
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "NytGamesProgressState(spellingBeeTodayState=" + this.a + ", spellingBeeYesterdayState=" + this.b + ", crosswordDailyState=" + this.c + ", crosswordMiniState=" + this.d + ", wordleState=" + this.e + ")";
    }

    public NytGamesProgressState(SpellingBeePuzzleState spellingBeePuzzleState, SpellingBeePuzzleState spellingBeePuzzleState2, CrosswordPuzzleState crosswordPuzzleState, CrosswordPuzzleState crosswordPuzzleState2, WordlePuzzleState wordlePuzzleState) {
        zq3.h(spellingBeePuzzleState, "spellingBeeTodayState");
        zq3.h(spellingBeePuzzleState2, "spellingBeeYesterdayState");
        zq3.h(crosswordPuzzleState, "crosswordDailyState");
        zq3.h(crosswordPuzzleState2, "crosswordMiniState");
        zq3.h(wordlePuzzleState, "wordleState");
        this.a = spellingBeePuzzleState;
        this.b = spellingBeePuzzleState2;
        this.c = crosswordPuzzleState;
        this.d = crosswordPuzzleState2;
        this.e = wordlePuzzleState;
    }
}
