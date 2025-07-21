package defpackage;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.AbraVariant;

/* loaded from: classes3.dex */
public abstract class ts7 {
    public static final AbraVariant a(AbraManager abraManager, String str) {
        zq3.h(abraManager, "<this>");
        if (str != null) {
            return abraManager.getTestType(str);
        }
        return null;
    }
}
