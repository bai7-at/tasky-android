package defpackage;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraVariant;

/* loaded from: classes3.dex */
public abstract class n0 {
    public static final AbraVariant a(AbraManager abraManager, ss7 ss7Var) {
        zq3.h(abraManager, "<this>");
        zq3.h(ss7Var, "test");
        return abraManager.getTestType(ss7Var.getTestName());
    }
}
