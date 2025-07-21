package com.nytimes.android.libs.messagingarchitecture.db;

import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.libs.messagingarchitecture.betasettings.EntitlementOption;
import defpackage.b34;
import defpackage.b4;
import defpackage.by0;
import defpackage.cb2;
import defpackage.fr4;
import defpackage.gr4;
import defpackage.js4;
import defpackage.v33;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class LegacyMessageStorage implements zr4 {
    private final b34 a;
    private final cb2 b;
    private final gr4 c;
    private final b4 d;
    private final AbraManager e;
    private final js4 f;

    public static final class a implements v33 {
        final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        @Override // defpackage.v33
        public Object a(Object obj) {
            return ((fr4) obj).c();
        }

        @Override // defpackage.v33
        public Iterator b() {
            return this.a.iterator();
        }
    }

    public LegacyMessageStorage(b34 b34Var, cb2 cb2Var, gr4 gr4Var, b4 b4Var, AbraManager abraManager, js4 js4Var) {
        zq3.h(b34Var, "legacyMessageDao");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(gr4Var, "historyDao");
        zq3.h(b4Var, "actionHistoryDao");
        zq3.h(abraManager, "abraManager");
        zq3.h(js4Var, "currentUserState");
        this.a = b34Var;
        this.b = cb2Var;
        this.c = gr4Var;
        this.d = b4Var;
        this.e = abraManager;
        this.f = js4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e8 A[LOOP:0: B:13:0x00e2->B:15:0x00e8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[LOOP:1: B:23:0x009f->B:25:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.by0 r9) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage.g(by0):java.lang.Object");
    }

    private final js4 h() {
        return this.b.K() ? new js4(i()) : this.f;
    }

    private final Set i() {
        EntitlementOption[] values = EntitlementOption.values();
        ArrayList arrayList = new ArrayList();
        for (EntitlementOption entitlementOption : values) {
            if (this.b.d(entitlementOption.name())) {
                arrayList.add(entitlementOption);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((EntitlementOption) it2.next()).getSummary());
        }
        return i.c1(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[LOOP:1: B:22:0x0072->B:24:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.zr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAll$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAll$1 r0 = (com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAll$1 r0 = new com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAll$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.g(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r5.next()
            r1 = r0
            nr4 r1 = (defpackage.nr4) r1
            java.util.List r1 = r1.b()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L48
            r4.add(r0)
            goto L48
        L63:
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.i.w(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L72:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r4.next()
            nr4 r0 = (defpackage.nr4) r0
            com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage r0 = r0.a()
            com.nytimes.android.libs.messagingarchitecture.model.Message r0 = r0.u()
            r5.add(r0)
            goto L72
        L8a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage.a(by0):java.lang.Object");
    }

    @Override // defpackage.zr4
    public Object b(by0 by0Var) {
        Object b = this.a.b(by0Var);
        return b == kotlin.coroutines.intrinsics.a.h() ? b : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.zr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getById$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getById$1 r0 = (com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getById$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getById$1 r0 = new com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getById$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.f.b(r6)
            b34 r4 = r4.a
            r0.label = r3
            java.lang.Object r6 = r4.c(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage r6 = (com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage) r6
            if (r6 == 0) goto L48
            com.nytimes.android.libs.messagingarchitecture.model.Message r4 = r6.u()
            goto L49
        L48:
            r4 = 0
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage.c(java.lang.String, by0):java.lang.Object");
    }

    @Override // defpackage.zr4
    public Object d(List list, List list2, by0 by0Var) {
        Object d = this.a.d(list2, by0Var);
        return d == kotlin.coroutines.intrinsics.a.h() ? d : ww8.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[LOOP:1: B:22:0x0079->B:24:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.zr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAllForUnit$1
            if (r0 == 0) goto L13
            r0 = r6
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAllForUnit$1 r0 = (com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAllForUnit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAllForUnit$1 r0 = new com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage$getAllForUnit$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.L$0
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            kotlin.f.b(r6)
            goto L44
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            kotlin.f.b(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.g(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r6.iterator()
        L4f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6a
            java.lang.Object r0 = r6.next()
            r1 = r0
            nr4 r1 = (defpackage.nr4) r1
            java.util.List r1 = r1.b()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L4f
            r4.add(r0)
            goto L4f
        L6a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.i.w(r4, r0)
            r6.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L79:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r0 = r4.next()
            nr4 r0 = (defpackage.nr4) r0
            com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage r0 = r0.a()
            com.nytimes.android.libs.messagingarchitecture.model.Message r0 = r0.u()
            r6.add(r0)
            goto L79
        L91:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r6 = r6.iterator()
        L9a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.nytimes.android.libs.messagingarchitecture.model.Message r1 = (com.nytimes.android.libs.messagingarchitecture.model.Message) r1
            java.lang.String r1 = r1.t()
            boolean r1 = defpackage.zq3.c(r1, r5)
            if (r1 == 0) goto L9a
            r4.add(r0)
            goto L9a
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.db.LegacyMessageStorage.e(java.lang.String, by0):java.lang.Object");
    }
}
