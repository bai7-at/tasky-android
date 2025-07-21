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
public final class CrosswordPuzzleProgressData {
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
            return CrosswordPuzzleProgressData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CrosswordPuzzleProgressData(int i, int i2, String str, int i3, String str2, boolean z, String str3, int i4, mk7 mk7Var) {
        if (127 != (i & 127)) {
            wv5.a(i, 127, CrosswordPuzzleProgressData$$serializer.INSTANCE.getDescriptor());
        }
        this.puzzleId = i2;
        this.lastModified = str;
        this.percentFilled = i3;
        this.printDate = str2;
        this.solved = z;
        this.star = str3;
        this.completionTime = i4;
    }

    public static /* synthetic */ CrosswordPuzzleProgressData copy$default(CrosswordPuzzleProgressData crosswordPuzzleProgressData, int i, String str, int i2, String str2, boolean z, String str3, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = crosswordPuzzleProgressData.puzzleId;
        }
        if ((i4 & 2) != 0) {
            str = crosswordPuzzleProgressData.lastModified;
        }
        String str4 = str;
        if ((i4 & 4) != 0) {
            i2 = crosswordPuzzleProgressData.percentFilled;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            str2 = crosswordPuzzleProgressData.printDate;
        }
        String str5 = str2;
        if ((i4 & 16) != 0) {
            z = crosswordPuzzleProgressData.solved;
        }
        boolean z2 = z;
        if ((i4 & 32) != 0) {
            str3 = crosswordPuzzleProgressData.star;
        }
        String str6 = str3;
        if ((i4 & 64) != 0) {
            i3 = crosswordPuzzleProgressData.completionTime;
        }
        return crosswordPuzzleProgressData.copy(i, str4, i5, str5, z2, str6, i3);
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

    public static final /* synthetic */ void write$Self$games_hub_release(CrosswordPuzzleProgressData crosswordPuzzleProgressData, d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, crosswordPuzzleProgressData.puzzleId);
        dVar.y(serialDescriptor, 1, crosswordPuzzleProgressData.lastModified);
        dVar.w(serialDescriptor, 2, crosswordPuzzleProgressData.percentFilled);
        dVar.y(serialDescriptor, 3, crosswordPuzzleProgressData.printDate);
        dVar.x(serialDescriptor, 4, crosswordPuzzleProgressData.solved);
        dVar.y(serialDescriptor, 5, crosswordPuzzleProgressData.star);
        dVar.w(serialDescriptor, 6, crosswordPuzzleProgressData.completionTime);
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

    public final CrosswordPuzzleProgressData copy(int i, String str, int i2, String str2, boolean z, String str3, int i3) {
        zq3.h(str, "lastModified");
        zq3.h(str2, "printDate");
        zq3.h(str3, "star");
        return new CrosswordPuzzleProgressData(i, str, i2, str2, z, str3, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrosswordPuzzleProgressData)) {
            return false;
        }
        CrosswordPuzzleProgressData crosswordPuzzleProgressData = (CrosswordPuzzleProgressData) obj;
        return this.puzzleId == crosswordPuzzleProgressData.puzzleId && zq3.c(this.lastModified, crosswordPuzzleProgressData.lastModified) && this.percentFilled == crosswordPuzzleProgressData.percentFilled && zq3.c(this.printDate, crosswordPuzzleProgressData.printDate) && this.solved == crosswordPuzzleProgressData.solved && zq3.c(this.star, crosswordPuzzleProgressData.star) && this.completionTime == crosswordPuzzleProgressData.completionTime;
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
        return "CrosswordPuzzleProgressData(puzzleId=" + this.puzzleId + ", lastModified=" + this.lastModified + ", percentFilled=" + this.percentFilled + ", printDate=" + this.printDate + ", solved=" + this.solved + ", star=" + this.star + ", completionTime=" + this.completionTime + ")";
    }

    public CrosswordPuzzleProgressData(int i, String str, int i2, String str2, boolean z, String str3, int i3) {
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
