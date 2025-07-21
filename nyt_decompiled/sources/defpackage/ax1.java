package defpackage;

import androidx.compose.runtime.y;

/* loaded from: classes.dex */
public final class ax1 extends m76 {
    private final tw7 b;

    public ax1(tw7 tw7Var, qs2 qs2Var) {
        super(qs2Var);
        this.b = tw7Var;
    }

    @Override // defpackage.bt0
    public x08 b(Object obj, x08 x08Var) {
        if (x08Var == null || !(x08Var instanceof sy4)) {
            return y.i(obj, this.b);
        }
        ((sy4) x08Var).setValue(obj);
        return x08Var;
    }
}
