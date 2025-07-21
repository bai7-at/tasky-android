package defpackage;

import com.nytimes.android.designsystem.uiview.ProgressVisibility;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class p81 {
    private final sn2 a;
    private final ProgressVisibility b;

    public p81(sn2 sn2Var, ProgressVisibility progressVisibility) {
        zq3.h(progressVisibility, "progressVisibility");
        this.a = sn2Var;
        this.b = progressVisibility;
    }

    public static /* synthetic */ p81 b(p81 p81Var, sn2 sn2Var, ProgressVisibility progressVisibility, int i, Object obj) {
        if ((i & 1) != 0) {
            sn2Var = p81Var.a;
        }
        if ((i & 2) != 0) {
            progressVisibility = p81Var.b;
        }
        return p81Var.a(sn2Var, progressVisibility);
    }

    public final p81 a(sn2 sn2Var, ProgressVisibility progressVisibility) {
        zq3.h(progressVisibility, "progressVisibility");
        return new p81(sn2Var, progressVisibility);
    }

    public final sn2 c() {
        return this.a;
    }

    public final ProgressVisibility d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p81)) {
            return false;
        }
        p81 p81Var = (p81) obj;
        return zq3.c(this.a, p81Var.a) && this.b == p81Var.b;
    }

    public int hashCode() {
        sn2 sn2Var = this.a;
        return ((sn2Var == null ? 0 : sn2Var.hashCode()) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "DailyFiveViewState(loadedData=" + this.a + ", progressVisibility=" + this.b + ")";
    }

    public /* synthetic */ p81(sn2 sn2Var, ProgressVisibility progressVisibility, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sn2Var, (i & 2) != 0 ? ProgressVisibility.INDICATOR_ONLY : progressVisibility);
    }
}
