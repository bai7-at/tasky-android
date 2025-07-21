package defpackage;

import com.nytimes.android.fragment.AssetArgs;

/* loaded from: classes4.dex */
public final class oa3 {
    private final p76 a;
    private final p76 b;

    public oa3(p76 p76Var, p76 p76Var2) {
        zq3.h(p76Var, "hybrid");
        zq3.h(p76Var2, "web");
        this.a = p76Var;
        this.b = p76Var2;
    }

    public final na3 a(AssetArgs assetArgs) {
        zq3.h(assetArgs, "assetArgs");
        if (assetArgs.c()) {
            Object obj = this.a.get();
            zq3.e(obj);
            return (na3) obj;
        }
        Object obj2 = this.b.get();
        zq3.e(obj2);
        return (na3) obj2;
    }
}
