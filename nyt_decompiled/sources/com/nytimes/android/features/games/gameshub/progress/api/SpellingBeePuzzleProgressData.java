package com.nytimes.android.features.games.gameshub.progress.api;

import androidx.annotation.Keep;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@Keep
@lk7
/* loaded from: classes4.dex */
public final class SpellingBeePuzzleProgressData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean isRevealed;
    private final String lastModified;
    private final int puzzleId;
    private final String rank;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return SpellingBeePuzzleProgressData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SpellingBeePuzzleProgressData(int i, int i2, String str, boolean z, String str2, mk7 mk7Var) {
        if (15 != (i & 15)) {
            wv5.a(i, 15, SpellingBeePuzzleProgressData$$serializer.INSTANCE.getDescriptor());
        }
        this.puzzleId = i2;
        this.lastModified = str;
        this.isRevealed = z;
        this.rank = str2;
    }

    public static /* synthetic */ SpellingBeePuzzleProgressData copy$default(SpellingBeePuzzleProgressData spellingBeePuzzleProgressData, int i, String str, boolean z, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = spellingBeePuzzleProgressData.puzzleId;
        }
        if ((i2 & 2) != 0) {
            str = spellingBeePuzzleProgressData.lastModified;
        }
        if ((i2 & 4) != 0) {
            z = spellingBeePuzzleProgressData.isRevealed;
        }
        if ((i2 & 8) != 0) {
            str2 = spellingBeePuzzleProgressData.rank;
        }
        return spellingBeePuzzleProgressData.copy(i, str, z, str2);
    }

    public static /* synthetic */ void getLastModified$annotations() {
    }

    public static /* synthetic */ void getPuzzleId$annotations() {
    }

    public static /* synthetic */ void isRevealed$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(SpellingBeePuzzleProgressData spellingBeePuzzleProgressData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, spellingBeePuzzleProgressData.puzzleId);
        dVar.y(serialDescriptor, 1, spellingBeePuzzleProgressData.lastModified);
        dVar.x(serialDescriptor, 2, spellingBeePuzzleProgressData.isRevealed);
        dVar.y(serialDescriptor, 3, spellingBeePuzzleProgressData.rank);
    }

    public final int component1() {
        return this.puzzleId;
    }

    public final String component2() {
        return this.lastModified;
    }

    public final boolean component3() {
        return this.isRevealed;
    }

    public final String component4() {
        return this.rank;
    }

    public final SpellingBeePuzzleProgressData copy(int i, String str, boolean z, String str2) {
        zq3.h(str, "lastModified");
        zq3.h(str2, "rank");
        return new SpellingBeePuzzleProgressData(i, str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpellingBeePuzzleProgressData)) {
            return false;
        }
        SpellingBeePuzzleProgressData spellingBeePuzzleProgressData = (SpellingBeePuzzleProgressData) obj;
        return this.puzzleId == spellingBeePuzzleProgressData.puzzleId && zq3.c(this.lastModified, spellingBeePuzzleProgressData.lastModified) && this.isRevealed == spellingBeePuzzleProgressData.isRevealed && zq3.c(this.rank, spellingBeePuzzleProgressData.rank);
    }

    public final String getLastModified() {
        return this.lastModified;
    }

    public final int getPuzzleId() {
        return this.puzzleId;
    }

    public final String getRank() {
        return this.rank;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.puzzleId) * 31) + this.lastModified.hashCode()) * 31) + Boolean.hashCode(this.isRevealed)) * 31) + this.rank.hashCode();
    }

    public final boolean isRevealed() {
        return this.isRevealed;
    }

    public String toString() {
        return "SpellingBeePuzzleProgressData(puzzleId=" + this.puzzleId + ", lastModified=" + this.lastModified + ", isRevealed=" + this.isRevealed + ", rank=" + this.rank + ")";
    }

    public SpellingBeePuzzleProgressData(int i, String str, boolean z, String str2) {
        zq3.h(str, "lastModified");
        zq3.h(str2, "rank");
        this.puzzleId = i;
        this.lastModified = str;
        this.isRevealed = z;
        this.rank = str2;
    }
}
