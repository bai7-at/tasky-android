package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.d26;
import defpackage.dy4;
import defpackage.dy5;
import defpackage.e26;
import defpackage.fd5;
import defpackage.ll0;
import defpackage.n27;
import defpackage.nv3;
import defpackage.qs2;
import defpackage.ul1;
import defpackage.wv3;
import defpackage.zq3;
import defpackage.zv3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
abstract class AbstractClickableNode extends ul1 implements dy5, zv3 {
    private dy4 s;
    private boolean t;
    private String u;
    private n27 w;
    private qs2 x;
    private final a y;

    public static final class a {
        private e26 b;
        private final Map a = new LinkedHashMap();
        private long c = fd5.b.c();

        public final long a() {
            return this.c;
        }

        public final Map b() {
            return this.a;
        }

        public final e26 c() {
            return this.b;
        }

        public final void d(long j) {
            this.c = j;
        }

        public final void e(e26 e26Var) {
            this.b = e26Var;
        }
    }

    public /* synthetic */ AbstractClickableNode(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dy4Var, z, str, n27Var, qs2Var);
    }

    @Override // defpackage.zv3
    public boolean B0(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.dy5
    public void L(androidx.compose.ui.input.pointer.c cVar, PointerEventPass pointerEventPass, long j) {
        l2().L(cVar, pointerEventPass, j);
    }

    @Override // androidx.compose.ui.Modifier.c
    public void P1() {
        k2();
    }

    @Override // defpackage.zv3
    public boolean S0(KeyEvent keyEvent) {
        if (this.t && ll0.f(keyEvent)) {
            if (this.y.b().containsKey(nv3.m(wv3.a(keyEvent)))) {
                return false;
            }
            e26 e26Var = new e26(this.y.a(), null);
            this.y.b().put(nv3.m(wv3.a(keyEvent)), e26Var);
            BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new AbstractClickableNode$onKeyEvent$1(this, e26Var, null), 3, null);
        } else {
            if (!this.t || !ll0.b(keyEvent)) {
                return false;
            }
            e26 e26Var2 = (e26) this.y.b().remove(nv3.m(wv3.a(keyEvent)));
            if (e26Var2 != null) {
                BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new AbstractClickableNode$onKeyEvent$2$1(this, e26Var2, null), 3, null);
            }
            this.x.mo865invoke();
        }
        return true;
    }

    @Override // defpackage.dy5
    public void U0() {
        l2().U0();
    }

    protected final void k2() {
        e26 c = this.y.c();
        if (c != null) {
            this.s.c(new d26(c));
        }
        Iterator it2 = this.y.b().values().iterator();
        while (it2.hasNext()) {
            this.s.c(new d26((e26) it2.next()));
        }
        this.y.e(null);
        this.y.b().clear();
    }

    public abstract AbstractClickablePointerInputNode l2();

    protected final a m2() {
        return this.y;
    }

    protected final void n2(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var) {
        if (!zq3.c(this.s, dy4Var)) {
            k2();
            this.s = dy4Var;
        }
        if (this.t != z) {
            if (!z) {
                k2();
            }
            this.t = z;
        }
        this.u = str;
        this.w = n27Var;
        this.x = qs2Var;
    }

    private AbstractClickableNode(dy4 dy4Var, boolean z, String str, n27 n27Var, qs2 qs2Var) {
        this.s = dy4Var;
        this.t = z;
        this.u = str;
        this.w = n27Var;
        this.x = qs2Var;
        this.y = new a();
    }
}
