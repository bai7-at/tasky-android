package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ot7 extends fy4 {
    public static final a Companion = new a(null);
    private final AtomicBoolean l = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ot7 ot7Var, vc5 vc5Var, Object obj) {
        zq3.h(ot7Var, "this$0");
        zq3.h(vc5Var, "$observer");
        if (ot7Var.l.compareAndSet(true, false)) {
            vc5Var.a(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void j(d44 d44Var, final vc5 vc5Var) {
        zq3.h(d44Var, "owner");
        zq3.h(vc5Var, "observer");
        if (h()) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.j(d44Var, new vc5() { // from class: nt7
            @Override // defpackage.vc5
            public final void a(Object obj) {
                ot7.r(ot7.this, vc5Var, obj);
            }
        });
    }

    @Override // defpackage.fy4, androidx.lifecycle.LiveData
    public void p(Object obj) {
        this.l.set(true);
        super.p(obj);
    }
}
