package defpackage;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class dj7 {
    private static AtomicInteger a = new AtomicInteger(0);

    public static final Modifier a(Modifier modifier, ss2 ss2Var) {
        return modifier.h(new ClearAndSetSemanticsElement(ss2Var));
    }

    public static final int b() {
        return a.addAndGet(1);
    }

    public static final Modifier c(Modifier modifier, boolean z, ss2 ss2Var) {
        return modifier.h(new AppendedSemanticsElement(z, ss2Var));
    }

    public static /* synthetic */ Modifier d(Modifier modifier, boolean z, ss2 ss2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c(modifier, z, ss2Var);
    }
}
