package androidx.paging;

import androidx.paging.PagedList;
import defpackage.uo6;
import defpackage.ym3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class o extends PagedList.b {
    public static final a b = new a(null);
    private final List a = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // androidx.paging.PagedList.b
    public void a(int i, int i2) {
        this.a.add(0);
        this.a.add(Integer.valueOf(i));
        this.a.add(Integer.valueOf(i2));
    }

    @Override // androidx.paging.PagedList.b
    public void b(int i, int i2) {
        this.a.add(1);
        this.a.add(Integer.valueOf(i));
        this.a.add(Integer.valueOf(i2));
    }

    @Override // androidx.paging.PagedList.b
    public void c(int i, int i2) {
        this.a.add(2);
        this.a.add(Integer.valueOf(i));
        this.a.add(Integer.valueOf(i2));
    }

    public final void d(PagedList.b bVar) {
        zq3.h(bVar, "other");
        ym3 t = uo6.t(uo6.u(0, this.a.size()), 3);
        int g = t.g();
        int j = t.j();
        int n = t.n();
        if ((n > 0 && g <= j) || (n < 0 && j <= g)) {
            while (true) {
                int intValue = ((Number) this.a.get(g)).intValue();
                if (intValue == 0) {
                    bVar.a(((Number) this.a.get(g + 1)).intValue(), ((Number) this.a.get(g + 2)).intValue());
                } else if (intValue == 1) {
                    bVar.b(((Number) this.a.get(g + 1)).intValue(), ((Number) this.a.get(g + 2)).intValue());
                } else {
                    if (intValue != 2) {
                        throw new IllegalStateException("Unexpected recording value");
                    }
                    bVar.c(((Number) this.a.get(g + 1)).intValue(), ((Number) this.a.get(g + 2)).intValue());
                }
                if (g == j) {
                    break;
                } else {
                    g += n;
                }
            }
        }
        this.a.clear();
    }
}
