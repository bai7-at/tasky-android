package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;

/* loaded from: classes.dex */
public final class kn5 implements LazyLayoutIntervalContent.Interval {
    private final ss2 a;
    private final kt2 b;

    public kn5(ss2 ss2Var, kt2 kt2Var) {
        this.a = ss2Var;
        this.b = kt2Var;
    }

    public final kt2 a() {
        return this.b;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ss2 getKey() {
        return this.a;
    }
}
