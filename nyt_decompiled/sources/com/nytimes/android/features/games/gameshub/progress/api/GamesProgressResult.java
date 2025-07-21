package com.nytimes.android.features.games.gameshub.progress.api;

import androidx.annotation.Keep;
import defpackage.he0;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@Keep
@lk7
/* loaded from: classes4.dex */
public final class GamesProgressResult {
    private final List<CrosswordPuzzleProgressData> crosswordDailyProgressData;
    private final List<CrosswordMiniPuzzleProgressData> crosswordMiniProgressData;
    private final List<SpellingBeePuzzleProgressData> spellingBeeProgressData;
    private final List<WordlePuzzleProgressData> wordleProgressData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer[] $childSerializers = {new qo(he0.u(CrosswordPuzzleProgressData$$serializer.INSTANCE)), new qo(he0.u(CrosswordMiniPuzzleProgressData$$serializer.INSTANCE)), new qo(he0.u(SpellingBeePuzzleProgressData$$serializer.INSTANCE)), new qo(he0.u(WordlePuzzleProgressData$$serializer.INSTANCE))};

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return GamesProgressResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public GamesProgressResult() {
        this((List) null, (List) null, (List) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GamesProgressResult copy$default(GamesProgressResult gamesProgressResult, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = gamesProgressResult.crosswordDailyProgressData;
        }
        if ((i & 2) != 0) {
            list2 = gamesProgressResult.crosswordMiniProgressData;
        }
        if ((i & 4) != 0) {
            list3 = gamesProgressResult.spellingBeeProgressData;
        }
        if ((i & 8) != 0) {
            list4 = gamesProgressResult.wordleProgressData;
        }
        return gamesProgressResult.copy(list, list2, list3, list4);
    }

    public static /* synthetic */ void getCrosswordDailyProgressData$annotations() {
    }

    public static /* synthetic */ void getCrosswordMiniProgressData$annotations() {
    }

    public static /* synthetic */ void getSpellingBeeProgressData$annotations() {
    }

    public static /* synthetic */ void getWordleProgressData$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(GamesProgressResult gamesProgressResult, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = $childSerializers;
        if (dVar.A(serialDescriptor, 0) || !zq3.c(gamesProgressResult.crosswordDailyProgressData, i.l())) {
            dVar.z(serialDescriptor, 0, kSerializerArr[0], gamesProgressResult.crosswordDailyProgressData);
        }
        if (dVar.A(serialDescriptor, 1) || !zq3.c(gamesProgressResult.crosswordMiniProgressData, i.l())) {
            dVar.z(serialDescriptor, 1, kSerializerArr[1], gamesProgressResult.crosswordMiniProgressData);
        }
        if (dVar.A(serialDescriptor, 2) || !zq3.c(gamesProgressResult.spellingBeeProgressData, i.l())) {
            dVar.z(serialDescriptor, 2, kSerializerArr[2], gamesProgressResult.spellingBeeProgressData);
        }
        if (!dVar.A(serialDescriptor, 3) && zq3.c(gamesProgressResult.wordleProgressData, i.l())) {
            return;
        }
        dVar.z(serialDescriptor, 3, kSerializerArr[3], gamesProgressResult.wordleProgressData);
    }

    public final List<CrosswordPuzzleProgressData> component1() {
        return this.crosswordDailyProgressData;
    }

    public final List<CrosswordMiniPuzzleProgressData> component2() {
        return this.crosswordMiniProgressData;
    }

    public final List<SpellingBeePuzzleProgressData> component3() {
        return this.spellingBeeProgressData;
    }

    public final List<WordlePuzzleProgressData> component4() {
        return this.wordleProgressData;
    }

    public final GamesProgressResult copy(List<CrosswordPuzzleProgressData> list, List<CrosswordMiniPuzzleProgressData> list2, List<SpellingBeePuzzleProgressData> list3, List<WordlePuzzleProgressData> list4) {
        zq3.h(list, "crosswordDailyProgressData");
        zq3.h(list2, "crosswordMiniProgressData");
        zq3.h(list3, "spellingBeeProgressData");
        zq3.h(list4, "wordleProgressData");
        return new GamesProgressResult(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesProgressResult)) {
            return false;
        }
        GamesProgressResult gamesProgressResult = (GamesProgressResult) obj;
        return zq3.c(this.crosswordDailyProgressData, gamesProgressResult.crosswordDailyProgressData) && zq3.c(this.crosswordMiniProgressData, gamesProgressResult.crosswordMiniProgressData) && zq3.c(this.spellingBeeProgressData, gamesProgressResult.spellingBeeProgressData) && zq3.c(this.wordleProgressData, gamesProgressResult.wordleProgressData);
    }

    public final List<CrosswordPuzzleProgressData> getCrosswordDailyProgressData() {
        return this.crosswordDailyProgressData;
    }

    public final List<CrosswordMiniPuzzleProgressData> getCrosswordMiniProgressData() {
        return this.crosswordMiniProgressData;
    }

    public final List<SpellingBeePuzzleProgressData> getSpellingBeeProgressData() {
        return this.spellingBeeProgressData;
    }

    public final List<WordlePuzzleProgressData> getWordleProgressData() {
        return this.wordleProgressData;
    }

    public int hashCode() {
        return (((((this.crosswordDailyProgressData.hashCode() * 31) + this.crosswordMiniProgressData.hashCode()) * 31) + this.spellingBeeProgressData.hashCode()) * 31) + this.wordleProgressData.hashCode();
    }

    public String toString() {
        return "GamesProgressResult(crosswordDailyProgressData=" + this.crosswordDailyProgressData + ", crosswordMiniProgressData=" + this.crosswordMiniProgressData + ", spellingBeeProgressData=" + this.spellingBeeProgressData + ", wordleProgressData=" + this.wordleProgressData + ")";
    }

    public /* synthetic */ GamesProgressResult(int i, List list, List list2, List list3, List list4, mk7 mk7Var) {
        this.crosswordDailyProgressData = (i & 1) == 0 ? i.l() : list;
        if ((i & 2) == 0) {
            this.crosswordMiniProgressData = i.l();
        } else {
            this.crosswordMiniProgressData = list2;
        }
        if ((i & 4) == 0) {
            this.spellingBeeProgressData = i.l();
        } else {
            this.spellingBeeProgressData = list3;
        }
        if ((i & 8) == 0) {
            this.wordleProgressData = i.l();
        } else {
            this.wordleProgressData = list4;
        }
    }

    public GamesProgressResult(List<CrosswordPuzzleProgressData> list, List<CrosswordMiniPuzzleProgressData> list2, List<SpellingBeePuzzleProgressData> list3, List<WordlePuzzleProgressData> list4) {
        zq3.h(list, "crosswordDailyProgressData");
        zq3.h(list2, "crosswordMiniProgressData");
        zq3.h(list3, "spellingBeeProgressData");
        zq3.h(list4, "wordleProgressData");
        this.crosswordDailyProgressData = list;
        this.crosswordMiniProgressData = list2;
        this.spellingBeeProgressData = list3;
        this.wordleProgressData = list4;
    }

    public /* synthetic */ GamesProgressResult(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? i.l() : list, (i & 2) != 0 ? i.l() : list2, (i & 4) != 0 ? i.l() : list3, (i & 8) != 0 ? i.l() : list4);
    }
}
