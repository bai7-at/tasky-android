package androidx.paging;

import androidx.paging.PageEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import defpackage.by0;
import defpackage.hw8;
import defpackage.qs2;
import defpackage.rr3;
import defpackage.w83;
import defpackage.ww8;
import defpackage.yn5;
import defpackage.zq3;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public abstract class PagingDataPresenter {
    private final CoroutineContext a;
    private w83 b;
    private hw8 c;
    private h d;
    private final MutableCombinedLoadStateCollection e;
    private final CopyOnWriteArrayList f;
    private final SingleRunner g;
    private volatile boolean h;
    private volatile int i;
    private final StateFlow j;
    private final MutableSharedFlow k;

    public PagingDataPresenter(CoroutineContext coroutineContext, PagingData pagingData) {
        PageEvent.Insert a;
        zq3.h(coroutineContext, "mainContext");
        this.a = coroutineContext;
        this.d = h.e.a(pagingData != null ? pagingData.a() : null);
        MutableCombinedLoadStateCollection mutableCombinedLoadStateCollection = new MutableCombinedLoadStateCollection();
        if (pagingData != null && (a = pagingData.a()) != null) {
            mutableCombinedLoadStateCollection.f(a.k(), a.g());
        }
        this.e = mutableCombinedLoadStateCollection;
        this.f = new CopyOnWriteArrayList();
        this.g = new SingleRunner(false, 1, null);
        this.j = mutableCombinedLoadStateCollection.e();
        this.k = SharedFlowKt.MutableSharedFlow(0, 64, BufferOverflow.DROP_OLDEST);
        l(new qs2() { // from class: androidx.paging.PagingDataPresenter.1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m127invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m127invoke() {
                PagingDataPresenter.this.k.tryEmit(ww8.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.util.List r7, int r8, int r9, boolean r10, androidx.paging.e r11, androidx.paging.e r12, defpackage.w83 r13, defpackage.by0 r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PagingDataPresenter.p(java.util.List, int, int, boolean, androidx.paging.e, androidx.paging.e, w83, by0):java.lang.Object");
    }

    public final void l(qs2 qs2Var) {
        zq3.h(qs2Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f.add(qs2Var);
    }

    public final Object m(PagingData pagingData, by0 by0Var) {
        Object c = SingleRunner.c(this.g, 0, new PagingDataPresenter$collectFrom$2(this, pagingData, null), by0Var, 1, null);
        return c == kotlin.coroutines.intrinsics.a.h() ? c : ww8.a;
    }

    public final Object n(int i) {
        this.h = true;
        this.i = i;
        yn5 yn5Var = yn5.a;
        if (yn5Var.a(2)) {
            yn5Var.b(2, "Accessing item index[" + i + ']', null);
        }
        w83 w83Var = this.b;
        if (w83Var != null) {
            w83Var.a(this.d.d(i));
        }
        return this.d.k(i);
    }

    public final StateFlow o() {
        return this.j;
    }

    public abstract Object q(k kVar, by0 by0Var);

    public final rr3 r() {
        return this.d.q();
    }
}
