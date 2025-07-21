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
public final class WordlePuzzleProgressData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int guesses;
    private final String lastModified;
    private final int puzzleId;
    private final boolean win;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return WordlePuzzleProgressData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WordlePuzzleProgressData(int i, int i2, String str, int i3, boolean z, mk7 mk7Var) {
        if (15 != (i & 15)) {
            wv5.a(i, 15, WordlePuzzleProgressData$$serializer.INSTANCE.getDescriptor());
        }
        this.puzzleId = i2;
        this.lastModified = str;
        this.guesses = i3;
        this.win = z;
    }

    public static /* synthetic */ WordlePuzzleProgressData copy$default(WordlePuzzleProgressData wordlePuzzleProgressData, int i, String str, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = wordlePuzzleProgressData.puzzleId;
        }
        if ((i3 & 2) != 0) {
            str = wordlePuzzleProgressData.lastModified;
        }
        if ((i3 & 4) != 0) {
            i2 = wordlePuzzleProgressData.guesses;
        }
        if ((i3 & 8) != 0) {
            z = wordlePuzzleProgressData.win;
        }
        return wordlePuzzleProgressData.copy(i, str, i2, z);
    }

    public static /* synthetic */ void getLastModified$annotations() {
    }

    public static /* synthetic */ void getPuzzleId$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(WordlePuzzleProgressData wordlePuzzleProgressData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, wordlePuzzleProgressData.puzzleId);
        dVar.y(serialDescriptor, 1, wordlePuzzleProgressData.lastModified);
        dVar.w(serialDescriptor, 2, wordlePuzzleProgressData.guesses);
        dVar.x(serialDescriptor, 3, wordlePuzzleProgressData.win);
    }

    public final int component1() {
        return this.puzzleId;
    }

    public final String component2() {
        return this.lastModified;
    }

    public final int component3() {
        return this.guesses;
    }

    public final boolean component4() {
        return this.win;
    }

    public final WordlePuzzleProgressData copy(int i, String str, int i2, boolean z) {
        zq3.h(str, "lastModified");
        return new WordlePuzzleProgressData(i, str, i2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordlePuzzleProgressData)) {
            return false;
        }
        WordlePuzzleProgressData wordlePuzzleProgressData = (WordlePuzzleProgressData) obj;
        return this.puzzleId == wordlePuzzleProgressData.puzzleId && zq3.c(this.lastModified, wordlePuzzleProgressData.lastModified) && this.guesses == wordlePuzzleProgressData.guesses && this.win == wordlePuzzleProgressData.win;
    }

    public final int getGuesses() {
        return this.guesses;
    }

    public final String getLastModified() {
        return this.lastModified;
    }

    public final int getPuzzleId() {
        return this.puzzleId;
    }

    public final boolean getWin() {
        return this.win;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.puzzleId) * 31) + this.lastModified.hashCode()) * 31) + Integer.hashCode(this.guesses)) * 31) + Boolean.hashCode(this.win);
    }

    public String toString() {
        return "WordlePuzzleProgressData(puzzleId=" + this.puzzleId + ", lastModified=" + this.lastModified + ", guesses=" + this.guesses + ", win=" + this.win + ")";
    }

    public WordlePuzzleProgressData(int i, String str, int i2, boolean z) {
        zq3.h(str, "lastModified");
        this.puzzleId = i;
        this.lastModified = str;
        this.guesses = i2;
        this.win = z;
    }
}
