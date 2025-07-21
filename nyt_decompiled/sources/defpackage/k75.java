package defpackage;

import com.nytimes.android.coroutinesutils.b;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class k75 implements b {
    @Override // com.nytimes.android.coroutinesutils.b
    public void a() {
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public void b(boolean z, Pair... pairArr) {
        zq3.h(pairArr, "attributes");
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public b c(String str) {
        zq3.h(str, "resourceName");
        return new k75();
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public void error(String str) {
        zq3.h(str, "message");
    }

    @Override // com.nytimes.android.coroutinesutils.b
    public void error(Throwable th) {
        zq3.h(th, "throwable");
    }
}
