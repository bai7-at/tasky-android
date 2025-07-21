package com.google.android.exoplayer2;

@Deprecated
/* loaded from: classes2.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final g2 timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(g2 g2Var, int i, long j) {
        this.timeline = g2Var;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
