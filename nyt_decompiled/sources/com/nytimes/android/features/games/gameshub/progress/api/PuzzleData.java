package com.nytimes.android.features.games.gameshub.progress.api;

import androidx.annotation.Keep;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@Keep
@lk7
/* loaded from: classes4.dex */
public final class PuzzleData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String printDate;
    private final int puzzleId;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return PuzzleData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PuzzleData() {
        this((String) null, 0, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ PuzzleData copy$default(PuzzleData puzzleData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = puzzleData.printDate;
        }
        if ((i2 & 2) != 0) {
            i = puzzleData.puzzleId;
        }
        return puzzleData.copy(str, i);
    }

    public static /* synthetic */ void getPrintDate$annotations() {
    }

    public static /* synthetic */ void getPuzzleId$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(PuzzleData puzzleData, d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.A(serialDescriptor, 0) || !zq3.c(puzzleData.printDate, "")) {
            dVar.y(serialDescriptor, 0, puzzleData.printDate);
        }
        if (!dVar.A(serialDescriptor, 1) && puzzleData.puzzleId == 0) {
            return;
        }
        dVar.w(serialDescriptor, 1, puzzleData.puzzleId);
    }

    public final String component1() {
        return this.printDate;
    }

    public final int component2() {
        return this.puzzleId;
    }

    public final PuzzleData copy(String str, int i) {
        zq3.h(str, "printDate");
        return new PuzzleData(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PuzzleData)) {
            return false;
        }
        PuzzleData puzzleData = (PuzzleData) obj;
        return zq3.c(this.printDate, puzzleData.printDate) && this.puzzleId == puzzleData.puzzleId;
    }

    public final String getPrintDate() {
        return this.printDate;
    }

    public final int getPuzzleId() {
        return this.puzzleId;
    }

    public int hashCode() {
        return (this.printDate.hashCode() * 31) + Integer.hashCode(this.puzzleId);
    }

    public String toString() {
        return "PuzzleData(printDate=" + this.printDate + ", puzzleId=" + this.puzzleId + ")";
    }

    public /* synthetic */ PuzzleData(int i, String str, int i2, mk7 mk7Var) {
        this.printDate = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.puzzleId = 0;
        } else {
            this.puzzleId = i2;
        }
    }

    public PuzzleData(String str, int i) {
        zq3.h(str, "printDate");
        this.printDate = str;
        this.puzzleId = i;
    }

    public /* synthetic */ PuzzleData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
