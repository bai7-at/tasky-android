package defpackage;

import com.nytimes.android.ads.hybrid.HybridAdManagerImpl;
import com.nytimes.android.hybrid.HybridScriptInflater;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class lb3 {
    public static final lb3 a = new lb3();

    private lb3() {
    }

    public final kb3 a(bc bcVar) {
        zq3.h(bcVar, "alsRepository");
        return new HybridAdManagerImpl(bcVar, Dispatchers.getIO(), null, new HybridScriptInflater(Dispatchers.getIO()), null, 20, null);
    }
}
