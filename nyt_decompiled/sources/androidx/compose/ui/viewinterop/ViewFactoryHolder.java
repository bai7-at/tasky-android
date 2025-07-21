package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.c;
import androidx.compose.runtime.saveable.a;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AbstractComposeView;
import defpackage.ib9;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.ww8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class ViewFactoryHolder extends AndroidViewHolder implements ib9 {
    private final View Q;
    private final NestedScrollDispatcher S;
    private final androidx.compose.runtime.saveable.a e0;
    private final int f0;
    private final String g0;
    private a.InterfaceC0052a h0;
    private ss2 i0;
    private ss2 j0;
    private ss2 k0;

    /* synthetic */ ViewFactoryHolder(Context context, c cVar, View view, NestedScrollDispatcher nestedScrollDispatcher, androidx.compose.runtime.saveable.a aVar, int i, m mVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : cVar, view, (i2 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, aVar, i, mVar);
    }

    private final void r() {
        androidx.compose.runtime.saveable.a aVar = this.e0;
        if (aVar != null) {
            setSavableRegistryEntry(aVar.b(this.g0, new qs2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final Object mo865invoke() {
                    View view;
                    SparseArray<Parcelable> sparseArray = new SparseArray<>();
                    view = ViewFactoryHolder.this.Q;
                    view.saveHierarchyState(sparseArray);
                    return sparseArray;
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(a.InterfaceC0052a interfaceC0052a) {
        a.InterfaceC0052a interfaceC0052a2 = this.h0;
        if (interfaceC0052a2 != null) {
            interfaceC0052a2.unregister();
        }
        this.h0 = interfaceC0052a;
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.S;
    }

    public final ss2 getReleaseBlock() {
        return this.k0;
    }

    public final ss2 getResetBlock() {
        return this.j0;
    }

    @Override // defpackage.ib9
    public /* bridge */ /* synthetic */ AbstractComposeView getSubCompositionView() {
        return super.getSubCompositionView();
    }

    public final ss2 getUpdateBlock() {
        return this.i0;
    }

    @Override // defpackage.ib9
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(ss2 ss2Var) {
        this.k0 = ss2Var;
        setRelease(new qs2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$releaseBlock$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m107invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m107invoke() {
                View view;
                view = ViewFactoryHolder.this.Q;
                ViewFactoryHolder.this.getReleaseBlock().invoke(view);
                ViewFactoryHolder.this.s();
            }
        });
    }

    public final void setResetBlock(ss2 ss2Var) {
        this.j0 = ss2Var;
        setReset(new qs2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$resetBlock$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m108invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m108invoke() {
                View view;
                view = ViewFactoryHolder.this.Q;
                ViewFactoryHolder.this.getResetBlock().invoke(view);
            }
        });
    }

    public final void setUpdateBlock(ss2 ss2Var) {
        this.i0 = ss2Var;
        setUpdate(new qs2() { // from class: androidx.compose.ui.viewinterop.ViewFactoryHolder$updateBlock$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo865invoke() {
                m109invoke();
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m109invoke() {
                View view;
                view = ViewFactoryHolder.this.Q;
                ViewFactoryHolder.this.getUpdateBlock().invoke(view);
            }
        });
    }

    private ViewFactoryHolder(Context context, c cVar, View view, NestedScrollDispatcher nestedScrollDispatcher, androidx.compose.runtime.saveable.a aVar, int i, m mVar) {
        super(context, cVar, i, nestedScrollDispatcher, view, mVar);
        this.Q = view;
        this.S = nestedScrollDispatcher;
        this.e0 = aVar;
        this.f0 = i;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        this.g0 = valueOf;
        Object e = aVar != null ? aVar.e(valueOf) : null;
        SparseArray<Parcelable> sparseArray = e instanceof SparseArray ? (SparseArray) e : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        r();
        this.i0 = AndroidView_androidKt.e();
        this.j0 = AndroidView_androidKt.e();
        this.k0 = AndroidView_androidKt.e();
    }

    public ViewFactoryHolder(Context context, ss2 ss2Var, c cVar, androidx.compose.runtime.saveable.a aVar, int i, m mVar) {
        this(context, cVar, (View) ss2Var.invoke(context), null, aVar, i, mVar, 8, null);
    }
}
