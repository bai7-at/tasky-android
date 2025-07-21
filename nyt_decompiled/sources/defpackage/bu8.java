package defpackage;

import android.text.style.TtsSpan;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class bu8 {
    public static final TtsSpan a(au8 au8Var) {
        if (au8Var instanceof z49) {
            return b((z49) au8Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(z49 z49Var) {
        return new TtsSpan.VerbatimBuilder(z49Var.a()).build();
    }
}
