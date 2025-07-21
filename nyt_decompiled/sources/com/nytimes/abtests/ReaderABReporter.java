package com.nytimes.abtests;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.abra.models.AbraTest;
import com.nytimes.android.abra.models.TestSpec;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.model.Event;
import com.nytimes.android.eventtracker.model.Timestamp;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import defpackage.d44;
import defpackage.dc7;
import defpackage.du8;
import defpackage.e52;
import defpackage.ei1;
import defpackage.ju4;
import defpackage.k42;
import defpackage.tx1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class ReaderABReporter extends ju4 implements ei1 {
    public static final a d = new a(null);
    private static final String e = new e52.g().a();
    private static final String f = new e52.i().a();
    private final AbraManager a;
    private final ET2Scope b;
    private final List c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(d44 d44Var, AbraManager abraManager, ET2Scope eT2Scope) {
            zq3.h(d44Var, "host");
            zq3.h(abraManager, "abraManager");
            zq3.h(eT2Scope, "et2Scope");
            if (d44Var instanceof dc7) {
                d44Var.getLifecycle().a(new ReaderABReporter(b.b((dc7) d44Var), abraManager, eT2Scope, null));
            }
        }

        private a() {
        }
    }

    public /* synthetic */ ReaderABReporter(List list, AbraManager abraManager, ET2Scope eT2Scope, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, abraManager, eT2Scope);
    }

    private final void i(String str, String str2) {
        PageContext i;
        tx1 c = this.b.c();
        if (c == null || (i = c.i()) == null || !zq3.c(i.a(), str) || !zq3.c(i.g(), str2)) {
            return;
        }
        j(i);
    }

    private final void j(PageContext pageContext) {
        List<AbraTest> allTests = this.a.getAllTests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allTests) {
            if (this.c.contains(((AbraTest) obj).getTestName())) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.a.exposeTest(((AbraTest) it2.next()).getTestName(), t.f(du8.a("pageContext", pageContext)));
        }
    }

    @Override // k42.a
    public void b(Timestamp timestamp, Event event) {
        zq3.h(timestamp, "timestamp");
        zq3.h(event, "message");
        if (zq3.c(event.p(), e) || zq3.c(event.p(), f)) {
            i(event.d(), event.j());
        }
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        super.onDestroy(d44Var);
        k42.a.j(this);
    }

    private ReaderABReporter(List list, AbraManager abraManager, ET2Scope eT2Scope) {
        this.a = abraManager;
        this.b = eT2Scope;
        List list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((TestSpec) it2.next()).getTestName());
        }
        this.c = arrayList;
        k42.a.a(this);
    }
}
