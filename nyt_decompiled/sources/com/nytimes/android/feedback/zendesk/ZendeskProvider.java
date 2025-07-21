package com.nytimes.android.feedback.zendesk;

import com.nytimes.android.feedback.FeedbackProvider;
import com.nytimes.android.logging.NYTLogger;
import defpackage.ed2;
import defpackage.eq5;
import defpackage.h05;
import defpackage.qv6;
import defpackage.tp0;
import defpackage.wc2;
import defpackage.zq3;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class ZendeskProvider implements FeedbackProvider {
    public static final a Companion = new a(null);
    private final h05 a;
    private final ZendeskSdk b;
    private final wc2 c;
    private final qv6 d;
    private final ed2 e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return tp0.d((String) ((Pair) obj).c(), (String) ((Pair) obj2).c());
        }
    }

    public ZendeskProvider(h05 h05Var, ZendeskSdk zendeskSdk, wc2 wc2Var, qv6 qv6Var, ed2 ed2Var) {
        zq3.h(h05Var, "jobScheduler");
        zq3.h(zendeskSdk, "zendesk");
        zq3.h(wc2Var, "fieldProvider");
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(ed2Var, "resourceProvider");
        this.a = h05Var;
        this.b = zendeskSdk;
        this.c = wc2Var;
        this.d = qv6Var;
        this.e = ed2Var;
    }

    private final String c(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (h.R(sb, "@nytimes.com", true)) {
            int indexOf = sb.indexOf("@");
            String substring = sb.substring(0, indexOf);
            zq3.g(substring, "substring(...)");
            if (!h.O(substring, '+', false, 2, null)) {
                sb.insert(indexOf, "+ee");
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    private final boolean h(Map.Entry entry) {
        boolean z = ((CharSequence) entry.getValue()).length() == 0;
        if (z) {
            NYTLogger.g("Invalid param '" + entry.getKey() + "', value is empty", new Object[0]);
        }
        return z;
    }

    private final void i(Map.Entry entry) {
        Object value = entry.getValue();
        String str = (String) entry.getValue();
        Locale locale = Locale.getDefault();
        zq3.g(locale, "getDefault(...)");
        String lowerCase = str.toLowerCase(locale);
        zq3.g(lowerCase, "toLowerCase(...)");
        if (zq3.c(value, lowerCase)) {
            return;
        }
        NYTLogger.A("Invalid param '" + entry.getKey() + "', value contains upper-case chars", new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    @Override // com.nytimes.android.feedback.FeedbackProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.List r23, defpackage.by0 r24) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider.a(java.lang.String, java.lang.String, java.lang.String, java.util.List, by0):java.lang.Object");
    }

    @Override // com.nytimes.android.feedback.FeedbackProvider
    public void b() {
        this.b.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r11, java.util.List r12, defpackage.by0 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$1
            if (r0 == 0) goto L13
            r0 = r13
            com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$1 r0 = (com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$1 r0 = new com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r10 = r0.L$1
            java.lang.StringBuilder r10 = (java.lang.StringBuilder) r10
            java.lang.Object r11 = r0.L$0
            r12 = r11
            java.util.List r12 = (java.util.List) r12
            kotlin.f.b(r13)
            goto L59
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            kotlin.f.b(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r11)
            java.lang.String r11 = "\n--------------\n"
            r13.append(r11)
            wc2 r10 = r10.c
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r1) goto L56
            return r1
        L56:
            r9 = r13
            r13 = r10
            r10 = r9
        L59:
            java.util.Map r13 = (java.util.Map) r13
            java.util.List r11 = kotlin.collections.t.z(r13)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            com.nytimes.android.feedback.zendesk.ZendeskProvider$b r13 = new com.nytimes.android.feedback.zendesk.ZendeskProvider$b
            r13.<init>()
            java.util.List r11 = kotlin.collections.i.N0(r11, r13)
            r0 = r11
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3 r6 = new defpackage.ss2() { // from class: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3
                static {
                    /*
                        com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3 r0 = new com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3) com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3.a com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3.<init>():void");
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.CharSequence invoke(kotlin.Pair r2) {
                    /*
                        r1 = this;
                        java.lang.String r1 = "it"
                        defpackage.zq3.h(r2, r1)
                        java.lang.Object r1 = r2.c()
                        java.lang.Object r2 = r2.d()
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        r0.append(r1)
                        java.lang.String r1 = " : "
                        r0.append(r1)
                        r0.append(r2)
                        java.lang.String r1 = r0.toString()
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3.invoke(kotlin.Pair):java.lang.CharSequence");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        kotlin.Pair r1 = (kotlin.Pair) r1
                        java.lang.CharSequence r0 = r0.invoke(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$3.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r7 = 30
            r8 = 0
            java.lang.String r1 = "\n"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r11 = kotlin.collections.i.u0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r10.append(r11)
            java.lang.String r11 = "\n"
            r10.append(r11)
            r0 = r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4 r6 = new defpackage.ss2() { // from class: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4
                static {
                    /*
                        com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4 r0 = new com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4) com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4.a com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4.<init>():void");
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final java.lang.CharSequence invoke(java.lang.String r1) {
                    /*
                        r0 = this;
                        java.lang.String r0 = "it"
                        defpackage.zq3.h(r1, r0)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4.invoke(java.lang.String):java.lang.CharSequence");
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1) {
                    /*
                        r0 = this;
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.CharSequence r0 = r0.invoke(r1)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider$getDescriptionWithFields$4.invoke(java.lang.Object):java.lang.Object");
                }
            }
            java.lang.String r1 = "\n"
            java.lang.String r11 = kotlin.collections.i.u0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "toString(...)"
            defpackage.zq3.g(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider.d(java.lang.String, java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[LOOP:0: B:11:0x0053->B:13:0x0059, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5 A[LOOP:2: B:27:0x009f->B:29:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.by0 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.nytimes.android.feedback.zendesk.ZendeskProvider$getFilteredFields$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.feedback.zendesk.ZendeskProvider$getFilteredFields$1 r0 = (com.nytimes.android.feedback.zendesk.ZendeskProvider$getFilteredFields$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.feedback.zendesk.ZendeskProvider$getFilteredFields$1 r0 = new com.nytimes.android.feedback.zendesk.ZendeskProvider$getFilteredFields$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            com.nytimes.android.feedback.zendesk.ZendeskProvider r8 = (com.nytimes.android.feedback.zendesk.ZendeskProvider) r8
            kotlin.f.b(r9)
            goto L45
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.f.b(r9)
            wc2 r9 = r8.c
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            java.util.Map r9 = (java.util.Map) r9
            java.util.Map r9 = kotlin.collections.t.x(r9)
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8.i(r1)
            goto L53
        L63:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L70:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r2 = r8.h(r1)
            if (r2 != 0) goto L70
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L70
        L8e:
            java.util.ArrayList r9 = new java.util.ArrayList
            int r1 = r0.size()
            r9.<init>(r1)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L9f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ldf
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ":"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = r1.toLowerCase()
            java.lang.String r1 = "toLowerCase(...)"
            defpackage.zq3.g(r2, r1)
            r6 = 4
            r7 = 0
            java.lang.String r3 = " "
            java.lang.String r4 = "_"
            r5 = 0
            java.lang.String r1 = kotlin.text.h.F(r2, r3, r4, r5, r6, r7)
            r9.add(r1)
            goto L9f
        Ldf:
            ed2 r0 = r8.e
            java.lang.String r0 = r0.z()
            java.util.List r9 = kotlin.collections.i.G0(r9, r0)
            java.util.Collection r9 = (java.util.Collection) r9
            ed2 r8 = r8.e
            java.lang.String r8 = r8.G()
            java.util.List r8 = kotlin.collections.i.G0(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.feedback.zendesk.ZendeskProvider.e(by0):java.lang.Object");
    }

    public final boolean f(String str) {
        zq3.h(str, "email");
        return g(str) && eq5.j.matcher(str).matches();
    }

    public final boolean g(String str) {
        zq3.h(str, "text");
        return h.c1(str).toString().length() > 0;
    }
}
