package com.nytimes.android.libs.messagingarchitecture.network;

import com.apollographql.apollo.ApolloClient;
import defpackage.ku8;
import defpackage.nk5;
import defpackage.pg0;
import defpackage.sg5;
import defpackage.z58;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import org.threeten.bp.Instant;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneOffset;
import type.MessageSelectionMessageCapInput;

/* loaded from: classes4.dex */
public final class MessageHistoryUpdater {
    private final ApolloClient a;
    private final z58 b;

    public MessageHistoryUpdater(ApolloClient apolloClient, z58 z58Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(z58Var, "subauthClient");
        this.a = apolloClient;
        this.b = z58Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.by0 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$fetchMessageCaps$1
            if (r0 == 0) goto L13
            r0 = r14
            com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$fetchMessageCaps$1 r0 = (com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$fetchMessageCaps$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$fetchMessageCaps$1 r0 = new com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$fetchMessageCaps$1
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r14)
            goto L95
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            java.lang.Object r13 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater r13 = (com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater) r13
            kotlin.f.b(r14)
            goto L69
        L40:
            java.lang.Object r13 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater r13 = (com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater) r13
            kotlin.f.b(r14)
            goto L58
        L48:
            kotlin.f.b(r14)
            z58 r14 = r13.b
            r0.L$0 = r13
            r0.label = r5
            java.lang.Object r14 = r14.v(r0)
            if (r14 != r1) goto L58
            return r1
        L58:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L6b
            z58 r14 = r13.b
            r0.L$0 = r13
            r0.label = r4
            java.lang.Object r14 = r14.C(r0)
            if (r14 != r1) goto L69
            return r1
        L69:
            java.lang.String r14 = (java.lang.String) r14
        L6b:
            r8 = r14
            if (r8 == 0) goto L79
            type.UserIdentifier r14 = new type.UserIdentifier
            r11 = 6
            r12 = 0
            r9 = 0
            r10 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            goto L7a
        L79:
            r14 = r6
        L7a:
            com.apollographql.apollo.ApolloClient r13 = r13.a
            f19 r2 = new f19
            nk5$c r4 = new nk5$c
            r4.<init>(r14)
            r2.<init>(r4)
            com.apollographql.apollo.ApolloCall r13 = r13.L(r2)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r14 = com.nytimes.android.apolloschema.ExtensionsKt.a(r13, r0)
            if (r14 != r1) goto L95
            return r1
        L95:
            yj r14 = (defpackage.yj) r14
            ii5$a r13 = r14.c
            f19$b r13 = (f19.b) r13
            if (r13 == 0) goto Lbb
            f19$d r13 = r13.a()
            if (r13 == 0) goto Lbb
            f19$c r13 = r13.a()
            if (r13 == 0) goto Lbb
            sg5 r13 = r13.a()
            if (r13 == 0) goto Lbb
            java.util.List r13 = r13.a()
            if (r13 == 0) goto Lbb
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r6 = kotlin.collections.i.h0(r13)
        Lbb:
            if (r6 != 0) goto Lc1
            java.util.List r6 = kotlin.collections.i.l()
        Lc1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater.a(by0):java.lang.Object");
    }

    public final List b(List list, List list2) {
        Object obj;
        Instant d;
        LocalDateTime d2;
        zq3.h(list, "messageHistory");
        zq3.h(list2, "remoteRecords");
        ArrayList arrayList = new ArrayList();
        List<pg0> a1 = i.a1(list);
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            sg5.a aVar = (sg5.a) it2.next();
            Iterator it3 = a1.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                pg0 pg0Var = (pg0) obj;
                if (zq3.c(pg0Var.e(), aVar.b()) && zq3.c(pg0Var.f(), aVar.e())) {
                    break;
                }
            }
            pg0 pg0Var2 = (pg0) obj;
            int g = pg0Var2 != null ? pg0Var2.g() : 0;
            Integer f = aVar.f();
            int intValue = g + (f != null ? f.intValue() : 0);
            if (pg0Var2 == null || (d2 = pg0Var2.d()) == null || (d = d2.toInstant(ZoneOffset.UTC)) == null) {
                d = aVar.d();
            }
            Boolean valueOf = pg0Var2 != null ? Boolean.valueOf(pg0Var2.b()) : aVar.c();
            ku8.a(a1).remove(pg0Var2);
            arrayList.add(new MessageSelectionMessageCapInput(new nk5.c(aVar.a()), new nk5.c(aVar.b()), new nk5.c(valueOf), new nk5.c(d), new nk5.c(aVar.e()), new nk5.c(Integer.valueOf(intValue))));
        }
        for (pg0 pg0Var3 : a1) {
            arrayList.add(new MessageSelectionMessageCapInput(null, new nk5.c(pg0Var3.e()), new nk5.c(Boolean.valueOf(pg0Var3.b())), new nk5.c(pg0Var3.d().toInstant(ZoneOffset.UTC)), new nk5.c(pg0Var3.f()), new nk5.c(Integer.valueOf(pg0Var3.g())), 1, null));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r76, defpackage.by0 r77) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater.c(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r6, defpackage.by0 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$updateMessageHistory$1
            if (r0 == 0) goto L13
            r0 = r7
            com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$updateMessageHistory$1 r0 = (com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$updateMessageHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$updateMessageHistory$1 r0 = new com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater$updateMessageHistory$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = r0.L$0
            com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater r5 = (com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater) r5
            kotlin.f.b(r7)
            goto L5a
        L41:
            kotlin.f.b(r7)
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L71
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            java.util.List r7 = (java.util.List) r7
            java.util.List r6 = r5.b(r6, r7)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r5 = r5.c(r6, r0)
            if (r5 != r1) goto L6e
            return r1
        L6e:
            ww8 r5 = defpackage.ww8.a
            return r5
        L71:
            ww8 r5 = defpackage.ww8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.network.MessageHistoryUpdater.d(java.util.List, by0):java.lang.Object");
    }
}
