package com.nytimes.android.eventtracker.pagetracker.scope;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.eventtracker.pagetracker.ET2SinglePageClient;
import defpackage.by0;
import defpackage.e32;
import defpackage.e52;
import defpackage.fc1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tx1;
import defpackage.ue4;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public interface ET2Scope extends ET2PageScope {

    public static final class DefaultImpls {
        public static Object b(ET2Scope eT2Scope, final e32 e32Var, by0 by0Var) {
            Object e = eT2Scope.e(new ss2() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$awaitET2Page$4
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(tx1 tx1Var) {
                    zq3.h(tx1Var, "it");
                    return Boolean.valueOf(zq3.c(tx1Var.h(), e32.this));
                }
            }, by0Var);
            return e == a.h() ? e : ww8.a;
        }

        public static Object c(ET2Scope eT2Scope, ss2 ss2Var, by0 by0Var) {
            Object firstOrNull = FlowKt.firstOrNull(FlowKt.filterNotNull(eT2Scope.f()), new ET2Scope$awaitET2Page$2(ss2Var), by0Var);
            return firstOrNull == a.h() ? firstOrNull : ww8.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object d(ss2 ss2Var, tx1 tx1Var, by0 by0Var) {
            return ss2Var.invoke(tx1Var);
        }

        public static Flow e(ET2Scope eT2Scope) {
            final MutableStateFlow d = eT2Scope.d().d();
            return new Flow() { // from class: com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1

                /* renamed from: com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2 implements FlowCollector {
                    final /* synthetic */ FlowCollector a;

                    @fc1(c = "com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1$2", f = "ET2Scope.kt", l = {223}, m = "emit")
                    /* renamed from: com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(by0 by0Var) {
                            super(by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1$2$1 r0 = (com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1$2$1 r0 = new com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.f.b(r6)
                            goto L45
                        L29:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L31:
                            kotlin.f.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                            java.util.List r5 = (java.util.List) r5
                            java.lang.Object r5 = kotlin.collections.i.y0(r5)
                            r0.label = r3
                            java.lang.Object r4 = r4.emit(r5, r0)
                            if (r4 != r1) goto L45
                            return r1
                        L45:
                            ww8 r4 = defpackage.ww8.a
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope$DefaultImpls$currentPageFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector, by0 by0Var) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                    return collect == a.h() ? collect : ww8.a;
                }
            };
        }

        public static tx1 f(ET2Scope eT2Scope) {
            return (tx1) i.y0((List) eT2Scope.d().d().getValue());
        }

        public static void g(ET2Scope eT2Scope, e52 e52Var, ue4 ue4Var, ue4 ue4Var2, qs2 qs2Var) {
            zq3.h(e52Var, "eventSubject");
            zq3.h(qs2Var, "extraData");
            eT2Scope.d().c().a(e52Var, ue4Var, ue4Var2, qs2Var);
        }

        public static void h(ET2Scope eT2Scope) {
            eT2Scope.d().c().b();
        }
    }

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    void a(e52 e52Var, ue4 ue4Var, ue4 ue4Var2, qs2 qs2Var);

    @Override // com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope
    void b();

    tx1 c();

    ET2SinglePageClient d();

    Object e(ss2 ss2Var, by0 by0Var);

    Flow f();

    Object g(e32 e32Var, by0 by0Var);
}
