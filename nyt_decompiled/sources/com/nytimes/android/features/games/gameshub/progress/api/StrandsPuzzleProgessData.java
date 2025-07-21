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
public final class StrandsPuzzleProgessData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String lastModified;
    private final int puzzleId;
    private final int themeWordsFound;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return StrandsPuzzleProgessData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StrandsPuzzleProgessData(int i, int i2, String str, int i3, mk7 mk7Var) {
        if (7 != (i & 7)) {
            wv5.a(i, 7, StrandsPuzzleProgessData$$serializer.INSTANCE.getDescriptor());
        }
        this.puzzleId = i2;
        this.lastModified = str;
        this.themeWordsFound = i3;
    }

    public static /* synthetic */ StrandsPuzzleProgessData copy$default(StrandsPuzzleProgessData strandsPuzzleProgessData, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = strandsPuzzleProgessData.puzzleId;
        }
        if ((i3 & 2) != 0) {
            str = strandsPuzzleProgessData.lastModified;
        }
        if ((i3 & 4) != 0) {
            i2 = strandsPuzzleProgessData.themeWordsFound;
        }
        return strandsPuzzleProgessData.copy(i, str, i2);
    }

    public static /* synthetic */ void getLastModified$annotations() {
    }

    public static /* synthetic */ void getPuzzleId$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(StrandsPuzzleProgessData strandsPuzzleProgessData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, strandsPuzzleProgessData.puzzleId);
        dVar.y(serialDescriptor, 1, strandsPuzzleProgessData.lastModified);
        dVar.w(serialDescriptor, 2, strandsPuzzleProgessData.themeWordsFound);
    }

    public final int component1() {
        return this.puzzleId;
    }

    public final String component2() {
        return this.lastModified;
    }

    public final int component3() {
        return this.themeWordsFound;
    }

    public final StrandsPuzzleProgessData copy(int i, String str, int i2) {
        zq3.h(str, "lastModified");
        return new StrandsPuzzleProgessData(i, str, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrandsPuzzleProgessData)) {
            return false;
        }
        StrandsPuzzleProgessData strandsPuzzleProgessData = (StrandsPuzzleProgessData) obj;
        return this.puzzleId == strandsPuzzleProgessData.puzzleId && zq3.c(this.lastModified, strandsPuzzleProgessData.lastModified) && this.themeWordsFound == strandsPuzzleProgessData.themeWordsFound;
    }

    public final String getLastModified() {
        return this.lastModified;
    }

    public final int getPuzzleId() {
        return this.puzzleId;
    }

    public final int getThemeWordsFound() {
        return this.themeWordsFound;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.puzzleId) * 31) + this.lastModified.hashCode()) * 31) + Integer.hashCode(this.themeWordsFound);
    }

    public String toString() {
        return "StrandsPuzzleProgessData(puzzleId=" + this.puzzleId + ", lastModified=" + this.lastModified + ", themeWordsFound=" + this.themeWordsFound + ")";
    }

    public StrandsPuzzleProgessData(int i, String str, int i2) {
        zq3.h(str, "lastModified");
        this.puzzleId = i;
        this.lastModified = str;
        this.themeWordsFound = i2;
    }
}
