package androidx.paging;

import androidx.paging.PageEvent;
import defpackage.hw8;
import defpackage.qs2;
import defpackage.w83;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class PagingData {
    public static final c e = new c(null);
    private static final hw8 f = new b();
    private static final w83 g = new a();
    private final Flow a;
    private final hw8 b;
    private final w83 c;
    private final qs2 d;

    public static final class a implements w83 {
        a() {
        }

        @Override // defpackage.w83
        public void a(s sVar) {
            zq3.h(sVar, "viewportHint");
        }
    }

    public static final class b implements hw8 {
        b() {
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public PagingData(Flow flow, hw8 hw8Var, w83 w83Var, qs2 qs2Var) {
        zq3.h(flow, "flow");
        zq3.h(hw8Var, "uiReceiver");
        zq3.h(w83Var, "hintReceiver");
        zq3.h(qs2Var, "cachedPageEvent");
        this.a = flow;
        this.b = hw8Var;
        this.c = w83Var;
        this.d = qs2Var;
    }

    public final PageEvent.Insert a() {
        return (PageEvent.Insert) this.d.mo865invoke();
    }

    public final Flow b() {
        return this.a;
    }

    public final w83 c() {
        return this.c;
    }

    public final hw8 d() {
        return this.b;
    }

    public /* synthetic */ PagingData(Flow flow, hw8 hw8Var, w83 w83Var, qs2 qs2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, hw8Var, w83Var, (i & 8) != 0 ? new qs2() { // from class: androidx.paging.PagingData.1
            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Void mo865invoke() {
                return null;
            }
        } : qs2Var);
    }
}
