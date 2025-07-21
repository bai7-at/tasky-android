package androidx.core.os;

import android.os.OutcomeReceiver;
import defpackage.by0;
import defpackage.dl5;

/* loaded from: classes.dex */
public abstract class a {
    public static final OutcomeReceiver a(by0 by0Var) {
        return dl5.a(new ContinuationOutcomeReceiver(by0Var));
    }
}
