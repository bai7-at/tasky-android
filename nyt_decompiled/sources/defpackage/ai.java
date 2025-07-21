package defpackage;

import androidx.compose.animation.core.AnimationEndReason;

/* loaded from: classes.dex */
public final class ai {
    private final fi a;
    private final AnimationEndReason b;

    public ai(fi fiVar, AnimationEndReason animationEndReason) {
        this.a = fiVar;
        this.b = animationEndReason;
    }

    public final AnimationEndReason a() {
        return this.b;
    }

    public final fi b() {
        return this.a;
    }

    public String toString() {
        return "AnimationResult(endReason=" + this.b + ", endState=" + this.a + ')';
    }
}
