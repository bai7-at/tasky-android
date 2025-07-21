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
public final class CrosswordMiniPuzzleProgressData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int completionTime;
    private final String lastModified;
    private final int percentFilled;
    private final String printDate;
    private final int puzzleId;
    private final boolean solved;
    private final String star;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return CrosswordMiniPuzzleProgressData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrosswordMiniPuzzleProgressData(int i, int i2, String str, int i3, String str2, boolean z, String str3, int i4, mk7 mk7Var) {
        if (127 != (i & 127)) {
            wv5.a(i, 127, CrosswordMiniPuzzleProgressData$$serializer.INSTANCE.getDescriptor());
        }
        this.puzzleId = i2;
        this.lastModified = str;
        this.percentFilled = i3;
        this.printDate = str2;
        this.solved = z;
        this.star = str3;
        this.completionTime = i4;
    }

    public static /* synthetic */ CrosswordMiniPuzzleProgressData copy$default(CrosswordMiniPuzzleProgressData crosswordMiniPuzzleProgressData, int i, String str, int i2, String str2, boolean z, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = crosswordMiniPuzzleProgressData.puzzleId;
        }
        if ((i4 & 2) != 0) {
            str = crosswordMiniPuzzleProgressData.lastModified;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            i2 = crosswordMiniPuzzleProgressData.percentFilled;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            str2 = crosswordMiniPuzzleProgressData.printDate;
        }
        String str5 = str2;
        if ((i4 & 16) != 0) {
            z = crosswordMiniPuzzleProgressData.solved;
        }
        boolean z2 = z;
        if ((i4 & 32) != 0) {
            str3 = crosswordMiniPuzzleProgressData.star;
        }
        String str6 = str3;
        if ((i4 & 64) != 0) {
            i3 = crosswordMiniPuzzleProgressData.completionTime;
        }
        return crosswordMiniPuzzleProgressData.copy(i, str4, i5, str5, z2, str6, i3);
    }

    public static /* synthetic */ void getCompletionTime$annotations() {
    }

    public static /* synthetic */ void getLastModified$annotations() {
    }

    public static /* synthetic */ void getPercentFilled$annotations() {
    }

    public static /* synthetic */ void getPrintDate$annotations() {
    }

    public static /* synthetic */ void getPuzzleId$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(CrosswordMiniPuzzleProgressData crosswordMiniPuzzleProgressData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, crosswordMiniPuzzleProgressData.puzzleId);
        dVar.y(serialDescriptor, 1, crosswordMiniPuzzleProgressData.lastModified);
        dVar.w(serialDescriptor, 2, crosswordMiniPuzzleProgressData.percentFilled);
        dVar.y(serialDescriptor, 3, crosswordMiniPuzzleProgressData.printDate);
        dVar.x(serialDescriptor, 4, crosswordMiniPuzzleProgressData.solved);
        dVar.y(serialDescriptor, 5, crosswordMiniPuzzleProgressData.star);
        dVar.w(serialDescriptor, 6, crosswordMiniPuzzleProgressData.completionTime);
    }

    public final int component1() {
        return this.puzzleId;
    }

    public final String component2() {
        return this.lastModified;
    }

    public final int component3() {
        return this.percentFilled;
    }

    public final String component4() {
        return this.printDate;
    }

    public final boolean component5() {
        return this.solved;
    }

    public final String component6() {
        return this.star;
    }

    public final int component7() {
        return this.completionTime;
    }

    public final CrosswordMiniPuzzleProgressData copy(int i, String str, int i2, String str2, boolean z, String str3, int i3) {
        zq3.h(str, "lastModified");
        zq3.h(str2, "printDate");
        zq3.h(str3, "star");
        return new CrosswordMiniPuzzleProgressData(i, str, i2, str2, z, str3, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrosswordMiniPuzzleProgressData)) {
            return false;
        }
        CrosswordMiniPuzzleProgressData crosswordMiniPuzzleProgressData = (CrosswordMiniPuzzleProgressData) obj;
        return this.puzzleId == crosswordMiniPuzzleProgressData.puzzleId && zq3.c(this.lastModified, crosswordMiniPuzzleProgressData.lastModified) && this.percentFilled == crosswordMiniPuzzleProgressData.percentFilled && zq3.c(this.printDate, crosswordMiniPuzzleProgressData.printDate) && this.solved == crosswordMiniPuzzleProgressData.solved && zq3.c(this.star, crosswordMiniPuzzleProgressData.star) && this.completionTime == crosswordMiniPuzzleProgressData.completionTime;
    }

    public final int getCompletionTime() {
        return this.completionTime;
    }

    public final String getLastModified() {
        return this.lastModified;
    }

    public final int getPercentFilled() {
        return this.percentFilled;
    }

    public final String getPrintDate() {
        return this.printDate;
    }

    public final int getPuzzleId() {
        return this.puzzleId;
    }

    public final boolean getSolved() {
        return this.solved;
    }

    public final String getStar() {
        return this.star;
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.puzzleId) * 31) + this.lastModified.hashCode()) * 31) + Integer.hashCode(this.percentFilled)) * 31) + this.printDate.hashCode()) * 31) + Boolean.hashCode(this.solved)) * 31) + this.star.hashCode()) * 31) + Integer.hashCode(this.completionTime);
    }

    public String toString() {
        return "CrosswordMiniPuzzleProgressData(puzzleId=" + this.puzzleId + ", lastModified=" + this.lastModified + ", percentFilled=" + this.percentFilled + ", printDate=" + this.printDate + ", solved=" + this.solved + ", star=" + this.star + ", completionTime=" + this.completionTime + ")";
    }

    public CrosswordMiniPuzzleProgressData(int i, String str, int i2, String str2, boolean z, String str3, int i3) {
        zq3.h(str, "lastModified");
        zq3.h(str2, "printDate");
        zq3.h(str3, "star");
        this.puzzleId = i;
        this.lastModified = str;
        this.percentFilled = i2;
        this.printDate = str2;
        this.solved = z;
        this.star = str3;
        this.completionTime = i3;
    }
}
