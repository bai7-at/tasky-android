package defpackage;

import androidx.datastore.preferences.core.MutablePreferences;
import defpackage.s16;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class t16 {
    public static final s16 a() {
        return new MutablePreferences(null, true, 1, null);
    }

    public static final MutablePreferences b(s16.b... bVarArr) {
        zq3.h(bVarArr, "pairs");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.h((s16.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return mutablePreferences;
    }
}
