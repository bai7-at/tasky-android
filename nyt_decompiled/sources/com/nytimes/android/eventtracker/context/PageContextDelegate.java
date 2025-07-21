package com.nytimes.android.eventtracker.context;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import defpackage.aa7;
import defpackage.jk;
import defpackage.qs2;
import defpackage.zq3;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PageContextDelegate {
    public static final PageContextDelegate a = new PageContextDelegate();
    private static final HashMap b = new HashMap();

    public static final class a extends androidx.lifecycle.a {
        public static final C0263a Companion = new C0263a(null);

        /* renamed from: com.nytimes.android.eventtracker.context.PageContextDelegate$a$a, reason: collision with other inner class name */
        public static final class C0263a {
            public /* synthetic */ C0263a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0263a() {
            }
        }

        public /* synthetic */ a(aa7 aa7Var, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(aa7Var, (i & 2) != 0 ? null : bundle);
        }

        @Override // androidx.lifecycle.a
        protected q e(String str, Class cls, n nVar) {
            zq3.h(str, TransferTable.COLUMN_KEY);
            zq3.h(cls, "modelClass");
            zq3.h(nVar, "handle");
            return new b(nVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(aa7 aa7Var, Bundle bundle) {
            super(aa7Var, bundle);
            zq3.h(aa7Var, "owner");
        }
    }

    public static final class b extends q {
        private final n a;
        private PageContext b;

        public static final class a implements PageContext.c {
            a() {
            }

            @Override // com.nytimes.android.eventtracker.context.PageContext.c
            public void a(PageContext pageContext, PageContext pageContext2) {
                zq3.h(pageContext, "original");
                zq3.h(pageContext2, "mutated");
                b.this.g(pageContext2);
            }
        }

        public b(n nVar) {
            PageContext pageContext;
            zq3.h(nVar, "savedStateHandle");
            this.a = nVar;
            if (nVar.c("PageContextFactory.KEY_PAGE_CONTEXT")) {
                Object d = nVar.d("PageContextFactory.KEY_PAGE_CONTEXT");
                zq3.e(d);
                pageContext = (PageContext) d;
            } else {
                pageContext = new PageContext(null, null, null, null, 0, 31, null);
                g(pageContext);
            }
            pageContext.i(new a());
            PageContextDelegate.a.c(pageContext);
            this.b = pageContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(PageContext pageContext) {
            this.a.i("PageContextFactory.KEY_PAGE_CONTEXT", pageContext);
        }

        public final PageContext f() {
            return this.b;
        }

        @Override // androidx.lifecycle.q
        protected void onCleared() {
            this.b.i(null);
            PageContextDelegate.a.d(this.b);
        }
    }

    private PageContextDelegate() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageContext a(final jk jkVar) {
        zq3.h(jkVar, "page");
        EventTracker.Guard.Companion.a("Cannot get PageContext before Activity.onCreate is called", new qs2() { // from class: com.nytimes.android.eventtracker.context.PageContextDelegate$context$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(!jk.this.getLifecycle().b().isAtLeast(Lifecycle.State.CREATED));
            }
        });
        return ((b) new t(jkVar, new a(jkVar, null, 2, 0 == true ? 1 : 0)).a(b.class)).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PageContext b(final Fragment fragment) {
        zq3.h(fragment, "page");
        EventTracker.Guard.Companion.a("Cannot get PageContext before Fragment.onCreate is called", new qs2() { // from class: com.nytimes.android.eventtracker.context.PageContextDelegate$context$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Boolean mo865invoke() {
                return Boolean.valueOf(!Fragment.this.getLifecycle().b().isAtLeast(Lifecycle.State.CREATED));
            }
        });
        return ((b) new t(fragment, new a(fragment, null, 2, 0 == true ? 1 : 0)).a(b.class)).f();
    }

    public final void c(PageContext pageContext) {
        zq3.h(pageContext, "pageContext");
        b.put(pageContext.d(), pageContext);
    }

    public final void d(PageContext pageContext) {
        zq3.h(pageContext, "pageContext");
        b.remove(pageContext.d());
    }
}
