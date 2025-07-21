package com.nytimes.android.libs.messagingarchitecture.core;

import android.app.Application;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ba1;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fs4;
import defpackage.s16;
import defpackage.tr4;
import defpackage.u16;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class MessagePreferencesStore {
    private final fs4 a;
    private final ba1 b;
    private final s16.a c;
    private final s16.a d;
    private final Flow e;

    public MessagePreferencesStore(Application application, fs4 fs4Var) {
        ba1 b;
        zq3.h(application, "application");
        zq3.h(fs4Var, "converters");
        this.a = fs4Var;
        b = tr4.b(application);
        this.b = b;
        this.c = u16.f("lastMessageDateTime");
        this.d = u16.a("overrideMessagesLocally");
        final Flow data = b.getData();
        this.e = new Flow() { // from class: com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1

            /* renamed from: com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ MessagePreferencesStore b;

                @fc1(c = "com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1$2", f = "MessagePreferencesStore.kt", l = {219}, m = "emit")
                /* renamed from: com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector, MessagePreferencesStore messagePreferencesStore) {
                    this.a = flowCollector;
                    this.b = messagePreferencesStore;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, defpackage.by0 r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1$2$1 r0 = (com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1$2$1 r0 = new com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r7)
                        goto L74
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.f.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.a
                        s16 r6 = (defpackage.s16) r6
                        com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore r2 = r5.b
                        s16$a r2 = com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore.b(r2)
                        java.lang.Object r2 = r6.c(r2)
                        java.lang.String r2 = (java.lang.String) r2
                        if (r2 == 0) goto L51
                        com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore r4 = r5.b
                        fs4 r4 = com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore.a(r4)
                        org.threeten.bp.LocalDateTime r2 = r4.e(r2)
                        goto L52
                    L51:
                        r2 = 0
                    L52:
                        com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore r5 = r5.b
                        s16$a r5 = com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore.c(r5)
                        java.lang.Object r5 = r6.c(r5)
                        java.lang.Boolean r5 = (java.lang.Boolean) r5
                        if (r5 == 0) goto L65
                        boolean r5 = r5.booleanValue()
                        goto L66
                    L65:
                        r5 = 0
                    L66:
                        is4 r6 = new is4
                        r6.<init>(r2, r5)
                        r0.label = r3
                        java.lang.Object r5 = r7.emit(r6, r0)
                        if (r5 != r1) goto L74
                        return r1
                    L74:
                        ww8 r5 = defpackage.ww8.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.core.MessagePreferencesStore$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }

    public final Object d(by0 by0Var) {
        Object a = PreferencesKt.a(this.b, new MessagePreferencesStore$activateLocalMessageOverride$2(this, null), by0Var);
        return a == a.h() ? a : ww8.a;
    }

    public final Object e(by0 by0Var) {
        Object a = PreferencesKt.a(this.b, new MessagePreferencesStore$deactivateLocalMessageOverride$2(this, null), by0Var);
        return a == a.h() ? a : ww8.a;
    }

    public final Flow f() {
        return this.e;
    }

    public final Object g(LocalDateTime localDateTime, by0 by0Var) {
        Object a = PreferencesKt.a(this.b, new MessagePreferencesStore$setLastMessageDateTime$2(this, localDateTime, null), by0Var);
        return a == a.h() ? a : ww8.a;
    }
}
