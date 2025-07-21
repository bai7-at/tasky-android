package defpackage;

import com.chartbeat.androidsdk.QueryKeys;
import com.google.common.collect.ImmutableMap;
import com.nytimes.android.api.cms.Tag;

/* loaded from: classes2.dex */
public abstract class nm0 {
    public static String b(q72 q72Var) {
        ur.a(q72Var != null);
        int k = ku4.k(q72Var.s().l);
        if (k == -1) {
            k = ku4.k(q72Var.s().k);
        }
        if (k == 1) {
            return Tag.A;
        }
        if (k == 2) {
            return QueryKeys.INTERNAL_REFERRER;
        }
        return null;
    }

    public abstract ImmutableMap a();

    public abstract nm0 c(long j);

    public abstract nm0 d(String str);
}
