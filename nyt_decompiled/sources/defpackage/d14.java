package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;

/* loaded from: classes.dex */
public final class d14 implements LazyLayoutIntervalContent.Interval {
    private final ss2 a;
    private final ss2 b;
    private final kt2 c;

    public d14(ss2 ss2Var, ss2 ss2Var2, kt2 kt2Var) {
        this.a = ss2Var;
        this.b = ss2Var2;
        this.c = kt2Var;
    }

    public final kt2 a() {
        return this.c;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ss2 getKey() {
        return this.a;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ss2 getType() {
        return this.b;
    }
}
