package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ug4 implements fn5 {
    private final int a;
    private final int b;
    private final List c;
    private final long d;
    private final Object e;
    private final Alignment.b f;
    private final Alignment.c g;
    private final LayoutDirection h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final int[] l;
    private int m;
    private int n;

    public /* synthetic */ ug4(int i, int i2, List list, long j, Object obj, Orientation orientation, Alignment.b bVar, Alignment.c cVar, LayoutDirection layoutDirection, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, list, j, obj, orientation, bVar, cVar, layoutDirection, z);
    }

    private final int e(l lVar) {
        return this.j ? lVar.v0() : lVar.F0();
    }

    private final long f(int i) {
        int[] iArr = this.l;
        int i2 = i * 2;
        return wm3.a(iArr[i2], iArr[i2 + 1]);
    }

    public final void a(int i) {
        this.m = b() + i;
        int length = this.l.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.j;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                int[] iArr = this.l;
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    @Override // defpackage.fn5
    public int b() {
        return this.m;
    }

    public final int c() {
        return this.k;
    }

    public final Object d() {
        return this.e;
    }

    public final int g() {
        return this.b;
    }

    @Override // defpackage.fn5
    public int getIndex() {
        return this.a;
    }

    public final void h(l.a aVar) {
        if (this.n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            l lVar = (l) this.c.get(i);
            long f = f(i);
            if (this.i) {
                f = wm3.a(this.j ? vm3.j(f) : (this.n - vm3.j(f)) - e(lVar), this.j ? (this.n - vm3.k(f)) - e(lVar) : vm3.k(f));
            }
            long j = this.d;
            long a = wm3.a(vm3.j(f) + vm3.j(j), vm3.k(f) + vm3.k(j));
            if (this.j) {
                l.a.t(aVar, lVar, a, 0.0f, null, 6, null);
            } else {
                l.a.p(aVar, lVar, a, 0.0f, null, 6, null);
            }
        }
    }

    public final void i(int i, int i2, int i3) {
        int F0;
        this.m = i;
        this.n = this.j ? i3 : i2;
        List list = this.c;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = (l) list.get(i4);
            int i5 = i4 * 2;
            if (this.j) {
                int[] iArr = this.l;
                Alignment.b bVar = this.f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i5] = bVar.a(lVar.F0(), i2, this.h);
                this.l[i5 + 1] = i;
                F0 = lVar.v0();
            } else {
                int[] iArr2 = this.l;
                iArr2[i5] = i;
                int i6 = i5 + 1;
                Alignment.c cVar = this.g;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i6] = cVar.a(lVar.v0(), i3);
                F0 = lVar.F0();
            }
            i += F0;
        }
    }

    private ug4(int i, int i2, List list, long j, Object obj, Orientation orientation, Alignment.b bVar, Alignment.c cVar, LayoutDirection layoutDirection, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = j;
        this.e = obj;
        this.f = bVar;
        this.g = cVar;
        this.h = layoutDirection;
        this.i = z;
        this.j = orientation == Orientation.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            l lVar = (l) list.get(i4);
            i3 = Math.max(i3, !this.j ? lVar.v0() : lVar.F0());
        }
        this.k = i3;
        this.l = new int[this.c.size() * 2];
        this.n = RecyclerView.UNDEFINED_DURATION;
    }
}
