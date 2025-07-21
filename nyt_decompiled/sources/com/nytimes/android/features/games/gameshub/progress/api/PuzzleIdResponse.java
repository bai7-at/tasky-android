package com.nytimes.android.features.games.gameshub.progress.api;

import androidx.annotation.Keep;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.qo;
import defpackage.wv5;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@Keep
@lk7
/* loaded from: classes4.dex */
public final class PuzzleIdResponse {
    private static final KSerializer[] $childSerializers;
    private final List<PuzzleData> crosswordDailyPuzzleData;
    private final List<PuzzleData> crosswordMiniPuzzleData;
    private final List<PuzzleData> spellingBeePuzzleData;
    private final List<PuzzleData> wordlePuzzleData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PuzzleIdResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        PuzzleData$$serializer puzzleData$$serializer = PuzzleData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new qo(puzzleData$$serializer), new qo(puzzleData$$serializer), new qo(puzzleData$$serializer), new qo(puzzleData$$serializer)};
    }

    public /* synthetic */ PuzzleIdResponse(int i, List list, List list2, List list3, List list4, mk7 mk7Var) {
        if (15 != (i & 15)) {
            wv5.a(i, 15, PuzzleIdResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.crosswordDailyPuzzleData = list;
        this.crosswordMiniPuzzleData = list2;
        this.spellingBeePuzzleData = list3;
        this.wordlePuzzleData = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PuzzleIdResponse copy$default(PuzzleIdResponse puzzleIdResponse, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = puzzleIdResponse.crosswordDailyPuzzleData;
        }
        if ((i & 2) != 0) {
            list2 = puzzleIdResponse.crosswordMiniPuzzleData;
        }
        if ((i & 4) != 0) {
            list3 = puzzleIdResponse.spellingBeePuzzleData;
        }
        if ((i & 8) != 0) {
            list4 = puzzleIdResponse.wordlePuzzleData;
        }
        return puzzleIdResponse.copy(list, list2, list3, list4);
    }

    public static /* synthetic */ void getCrosswordDailyPuzzleData$annotations() {
    }

    public static /* synthetic */ void getCrosswordMiniPuzzleData$annotations() {
    }

    public static /* synthetic */ void getSpellingBeePuzzleData$annotations() {
    }

    public static /* synthetic */ void getWordlePuzzleData$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(PuzzleIdResponse puzzleIdResponse, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = $childSerializers;
        dVar.z(serialDescriptor, 0, kSerializerArr[0], puzzleIdResponse.crosswordDailyPuzzleData);
        dVar.z(serialDescriptor, 1, kSerializerArr[1], puzzleIdResponse.crosswordMiniPuzzleData);
        dVar.z(serialDescriptor, 2, kSerializerArr[2], puzzleIdResponse.spellingBeePuzzleData);
        dVar.z(serialDescriptor, 3, kSerializerArr[3], puzzleIdResponse.wordlePuzzleData);
    }

    public final List<PuzzleData> component1() {
        return this.crosswordDailyPuzzleData;
    }

    public final List<PuzzleData> component2() {
        return this.crosswordMiniPuzzleData;
    }

    public final List<PuzzleData> component3() {
        return this.spellingBeePuzzleData;
    }

    public final List<PuzzleData> component4() {
        return this.wordlePuzzleData;
    }

    public final PuzzleIdResponse copy(List<PuzzleData> list, List<PuzzleData> list2, List<PuzzleData> list3, List<PuzzleData> list4) {
        zq3.h(list, "crosswordDailyPuzzleData");
        zq3.h(list2, "crosswordMiniPuzzleData");
        zq3.h(list3, "spellingBeePuzzleData");
        zq3.h(list4, "wordlePuzzleData");
        return new PuzzleIdResponse(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PuzzleIdResponse)) {
            return false;
        }
        PuzzleIdResponse puzzleIdResponse = (PuzzleIdResponse) obj;
        return zq3.c(this.crosswordDailyPuzzleData, puzzleIdResponse.crosswordDailyPuzzleData) && zq3.c(this.crosswordMiniPuzzleData, puzzleIdResponse.crosswordMiniPuzzleData) && zq3.c(this.spellingBeePuzzleData, puzzleIdResponse.spellingBeePuzzleData) && zq3.c(this.wordlePuzzleData, puzzleIdResponse.wordlePuzzleData);
    }

    public final List<PuzzleData> getCrosswordDailyPuzzleData() {
        return this.crosswordDailyPuzzleData;
    }

    public final List<PuzzleData> getCrosswordMiniPuzzleData() {
        return this.crosswordMiniPuzzleData;
    }

    public final List<PuzzleData> getSpellingBeePuzzleData() {
        return this.spellingBeePuzzleData;
    }

    public final List<PuzzleData> getWordlePuzzleData() {
        return this.wordlePuzzleData;
    }

    public int hashCode() {
        return (((((this.crosswordDailyPuzzleData.hashCode() * 31) + this.crosswordMiniPuzzleData.hashCode()) * 31) + this.spellingBeePuzzleData.hashCode()) * 31) + this.wordlePuzzleData.hashCode();
    }

    public String toString() {
        return "PuzzleIdResponse(crosswordDailyPuzzleData=" + this.crosswordDailyPuzzleData + ", crosswordMiniPuzzleData=" + this.crosswordMiniPuzzleData + ", spellingBeePuzzleData=" + this.spellingBeePuzzleData + ", wordlePuzzleData=" + this.wordlePuzzleData + ")";
    }

    public PuzzleIdResponse(List<PuzzleData> list, List<PuzzleData> list2, List<PuzzleData> list3, List<PuzzleData> list4) {
        zq3.h(list, "crosswordDailyPuzzleData");
        zq3.h(list2, "crosswordMiniPuzzleData");
        zq3.h(list3, "spellingBeePuzzleData");
        zq3.h(list4, "wordlePuzzleData");
        this.crosswordDailyPuzzleData = list;
        this.crosswordMiniPuzzleData = list2;
        this.spellingBeePuzzleData = list3;
        this.wordlePuzzleData = list4;
    }
}
