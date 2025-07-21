package defpackage;

import androidx.compose.foundation.pager.PagerState;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class in5 implements n04 {
    private final PagerState a;
    private final int b;

    public in5(PagerState pagerState, int i) {
        this.a = pagerState;
        this.b = i;
    }

    @Override // defpackage.n04
    public int a() {
        return this.a.E();
    }

    @Override // defpackage.n04
    public void b() {
        kv6 N = this.a.N();
        if (N != null) {
            N.f();
        }
    }

    @Override // defpackage.n04
    public boolean c() {
        return !this.a.C().i().isEmpty();
    }

    @Override // defpackage.n04
    public int d() {
        return Math.max(0, this.a.z() - this.b);
    }

    @Override // defpackage.n04
    public int e() {
        return Math.min(a() - 1, ((fn5) i.w0(this.a.C().i())).getIndex() + this.b);
    }
}
