package androidx.compose.foundation.gestures;

import android.view.KeyEvent;
import androidx.compose.foundation.FocusedBoundsObserverNode;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.node.l;
import androidx.compose.ui.platform.CompositionLocalsKt;
import defpackage.az7;
import defpackage.cm2;
import defpackage.ct0;
import defpackage.cz3;
import defpackage.dt0;
import defpackage.dy4;
import defpackage.fm1;
import defpackage.hd5;
import defpackage.hm5;
import defpackage.hn3;
import defpackage.nv3;
import defpackage.qk2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tc7;
import defpackage.uc0;
import defpackage.ul1;
import defpackage.vv3;
import defpackage.wl2;
import defpackage.wv3;
import defpackage.ww8;
import defpackage.xc5;
import defpackage.zv3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
final class ScrollableNode extends ul1 implements xc5, ct0, wl2, zv3 {
    private dy4 B;
    private final NestedScrollDispatcher H;
    private final DefaultFlingBehavior L;
    private final ScrollingLogic M;
    private final ScrollableNestedScrollConnection N;
    private final ContentInViewNode Q;
    private final b S;
    private final ScrollableGesturesNode X;
    private tc7 s;
    private Orientation t;
    private hm5 u;
    private boolean w;
    private boolean x;
    private qk2 y;

    public ScrollableNode(tc7 tc7Var, Orientation orientation, hm5 hm5Var, boolean z, boolean z2, qk2 qk2Var, dy4 dy4Var, uc0 uc0Var) {
        ScrollableKt.d dVar;
        this.s = tc7Var;
        this.t = orientation;
        this.u = hm5Var;
        this.w = z;
        this.x = z2;
        this.y = qk2Var;
        this.B = dy4Var;
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        this.H = nestedScrollDispatcher;
        dVar = ScrollableKt.g;
        DefaultFlingBehavior defaultFlingBehavior = new DefaultFlingBehavior(az7.c(dVar), null, 2, null);
        this.L = defaultFlingBehavior;
        tc7 tc7Var2 = this.s;
        Orientation orientation2 = this.t;
        hm5 hm5Var2 = this.u;
        boolean z3 = this.x;
        qk2 qk2Var2 = this.y;
        ScrollingLogic scrollingLogic = new ScrollingLogic(tc7Var2, orientation2, hm5Var2, z3, qk2Var2 == null ? defaultFlingBehavior : qk2Var2, nestedScrollDispatcher);
        this.M = scrollingLogic;
        ScrollableNestedScrollConnection scrollableNestedScrollConnection = new ScrollableNestedScrollConnection(scrollingLogic, this.w);
        this.N = scrollableNestedScrollConnection;
        ContentInViewNode contentInViewNode = (ContentInViewNode) e2(new ContentInViewNode(this.t, this.s, this.x, uc0Var));
        this.Q = contentInViewNode;
        this.S = (b) e2(new b(this.w));
        e2(NestedScrollNodeKt.b(scrollableNestedScrollConnection, nestedScrollDispatcher));
        e2(cm2.a());
        e2(new BringIntoViewResponderNode(contentInViewNode));
        e2(new FocusedBoundsObserverNode(new ss2() { // from class: androidx.compose.foundation.gestures.ScrollableNode.1
            {
                super(1);
            }

            public final void b(cz3 cz3Var) {
                ScrollableNode.this.j2().z2(cz3Var);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((cz3) obj);
                return ww8.a;
            }
        }));
        this.X = (ScrollableGesturesNode) e2(new ScrollableGesturesNode(scrollingLogic, this.t, this.w, nestedScrollDispatcher, this.B));
    }

    private final void l2() {
        this.L.d(az7.c((fm1) dt0.a(this, CompositionLocalsKt.e())));
    }

    @Override // defpackage.zv3
    public boolean B0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        l2();
        l.a(this, new qs2() { // from class: androidx.compose.foundation.gestures.ScrollableNode$onAttach$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m22invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m22invoke() {
                dt0.a(ScrollableNode.this, CompositionLocalsKt.e());
            }
        });
    }

    @Override // defpackage.wl2
    public void P0(FocusProperties focusProperties) {
        focusProperties.g(false);
    }

    @Override // defpackage.zv3
    public boolean S0(KeyEvent keyEvent) {
        long a;
        if (this.w) {
            long a2 = wv3.a(keyEvent);
            nv3.a aVar = nv3.b;
            if ((nv3.p(a2, aVar.j()) || nv3.p(wv3.a(keyEvent), aVar.k())) && vv3.e(wv3.b(keyEvent), vv3.a.a()) && !wv3.e(keyEvent)) {
                ScrollingLogic scrollingLogic = this.M;
                if (this.t == Orientation.Vertical) {
                    int f = hn3.f(this.Q.v2());
                    a = hd5.a(0.0f, nv3.p(wv3.a(keyEvent), aVar.k()) ? f : -f);
                } else {
                    int g = hn3.g(this.Q.v2());
                    a = hd5.a(nv3.p(wv3.a(keyEvent), aVar.k()) ? g : -g, 0.0f);
                }
                BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new ScrollableNode$onKeyEvent$1$1(scrollingLogic, a, null), 3, null);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xc5
    public void g0() {
        l2();
    }

    public final ContentInViewNode j2() {
        return this.Q;
    }

    public final void k2(tc7 tc7Var, Orientation orientation, hm5 hm5Var, boolean z, boolean z2, qk2 qk2Var, dy4 dy4Var, uc0 uc0Var) {
        if (this.w != z) {
            this.N.a(z);
            this.S.e2(z);
        }
        this.M.r(tc7Var, orientation, hm5Var, z2, qk2Var == null ? this.L : qk2Var, this.H);
        this.X.l2(orientation, z, dy4Var);
        this.Q.B2(orientation, tc7Var, z2, uc0Var);
        this.s = tc7Var;
        this.t = orientation;
        this.u = hm5Var;
        this.w = z;
        this.x = z2;
        this.y = qk2Var;
        this.B = dy4Var;
    }
}
