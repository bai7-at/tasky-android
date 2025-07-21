package defpackage;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.collections.i;

/* loaded from: classes.dex */
public final class b14 implements n04 {
    private final LazyListState a;
    private final int b;

    public b14(LazyListState lazyListState, int i) {
        this.a = lazyListState;
        this.b = i;
    }

    @Override // defpackage.n04
    public int a() {
        return this.a.x().h();
    }

    @Override // defpackage.n04
    public void b() {
        kv6 D = this.a.D();
        if (D != null) {
            D.f();
        }
    }

    @Override // defpackage.n04
    public boolean c() {
        return !this.a.x().k().isEmpty();
    }

    @Override // defpackage.n04
    public int d() {
        return Math.max(0, this.a.s() - this.b);
    }

    @Override // defpackage.n04
    public int e() {
        return Math.min(a() - 1, ((g14) i.w0(this.a.x().k())).getIndex() + this.b);
    }
}
