package defpackage;

import androidx.compose.foundation.pager.PagerState;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class nn5 {

    public static final class a implements i04 {
        final /* synthetic */ PagerState a;

        a(PagerState pagerState) {
            this.a = pagerState;
        }

        @Override // defpackage.i04
        public int a() {
            return this.a.E();
        }

        @Override // defpackage.i04
        public int b() {
            return this.a.A();
        }

        @Override // defpackage.i04
        public int c() {
            return this.a.z();
        }

        @Override // defpackage.i04
        public int d() {
            return this.a.F() + this.a.H();
        }

        @Override // defpackage.i04
        public int e() {
            return ((fn5) i.w0(this.a.C().i())).getIndex();
        }

        @Override // defpackage.i04
        public int f(int i) {
            Object obj;
            List i2 = this.a.C().i();
            int size = i2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    obj = null;
                    break;
                }
                obj = i2.get(i3);
                if (((fn5) obj).getIndex() == i) {
                    break;
                }
                i3++;
            }
            fn5 fn5Var = (fn5) obj;
            if (fn5Var != null) {
                return fn5Var.b();
            }
            return 0;
        }

        @Override // defpackage.i04
        public void g(qc7 qc7Var, int i, int i2) {
            this.a.m0(i, i2 / this.a.G());
        }

        @Override // defpackage.i04
        public Object h(gt2 gt2Var, by0 by0Var) {
            Object e = tc7.e(this.a, null, gt2Var, by0Var, 1, null);
            return e == kotlin.coroutines.intrinsics.a.h() ? e : ww8.a;
        }

        @Override // defpackage.i04
        public float i(int i, int i2) {
            return ((i - this.a.w()) * d()) + i2;
        }
    }

    public static final i04 a(PagerState pagerState) {
        return new a(pagerState);
    }
}
