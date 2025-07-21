package com.nytimes.android.internal.pushmessaging.tagmanager;

import com.nytimes.android.internal.pushmessaging.PushMessaging;
import com.nytimes.android.internal.pushmessaging.database.PushMessagingDao;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class TagManagerRemote extends TagManagerLocal {
    private final TagMetadataAPI c;
    private final PushMessaging.c d;
    private final PushMessagingDao e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagManagerRemote(TagMetadataAPI tagMetadataAPI, PushMessaging.c cVar, PushMessagingDao pushMessagingDao) {
        super(cVar, pushMessagingDao);
        zq3.h(tagMetadataAPI, "tagMetadataAPI");
        zq3.h(cVar, "settings");
        zq3.h(pushMessagingDao, "pushMessagingDao");
        this.c = tagMetadataAPI;
        this.d = cVar;
        this.e = pushMessagingDao;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(retrofit2.Response r8, defpackage.by0 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$handleSuccessfulResponse$1
            if (r0 == 0) goto L13
            r0 = r9
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$handleSuccessfulResponse$1 r0 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$handleSuccessfulResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$handleSuccessfulResponse$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$handleSuccessfulResponse$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.f.b(r9)
            goto Lca
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            kotlin.f.b(r9)
            goto L98
        L3c:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            retrofit2.Response r8 = (retrofit2.Response) r8
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote r7 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote) r7
            kotlin.f.b(r9)
            goto L73
        L49:
            kotlin.f.b(r9)
            okhttp3.Response r9 = r8.raw()
            okhttp3.Response r9 = r9.networkResponse()
            r2 = 0
            java.lang.String r6 = "PushMessaging"
            if (r9 != 0) goto L9c
            ul8$b r9 = defpackage.ul8.a
            ul8$c r9 = r9.z(r6)
            java.lang.String r3 = "getTagMetadata: success cache"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r9.a(r3, r2)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r7.c(r0)
            if (r9 != r1) goto L73
            return r1
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L99
            com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI$a r9 = com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI.Companion
            java.lang.Object r8 = r8.body()
            defpackage.zq3.e(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.List r8 = r9.a(r8)
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r9 = r7.i(r8, r0)
            if (r9 != r1) goto L98
            return r1
        L98:
            return r9
        L99:
            com.nytimes.android.internal.pushmessaging.tagmanager.a$b r7 = com.nytimes.android.internal.pushmessaging.tagmanager.a.b.a
            goto Lb1
        L9c:
            java.lang.Object r9 = r8.body()
            if (r9 != 0) goto Lb2
            ul8$b r7 = defpackage.ul8.a
            ul8$c r7 = r7.z(r6)
            java.lang.String r8 = "getTagMetadata failed: empty body"
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r7.d(r8, r9)
            com.nytimes.android.internal.pushmessaging.tagmanager.a$a r7 = com.nytimes.android.internal.pushmessaging.tagmanager.a.C0334a.a
        Lb1:
            return r7
        Lb2:
            com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI$a r9 = com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI.Companion
            java.lang.Object r8 = r8.body()
            defpackage.zq3.e(r8)
            java.util.List r8 = (java.util.List) r8
            java.util.List r8 = r9.a(r8)
            r0.label = r3
            java.lang.Object r9 = r7.i(r8, r0)
            if (r9 != r1) goto Lca
            return r1
        Lca:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote.h(retrofit2.Response, by0):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.util.List r7, defpackage.by0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$updateDatabase$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$updateDatabase$1 r0 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$updateDatabase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$updateDatabase$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$updateDatabase$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            java.lang.String r5 = "PushMessaging"
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L2c
            goto L5a
        L2c:
            r6 = move-exception
            goto L6a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.f.b(r8)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L4f
            ul8$b r6 = defpackage.ul8.a
            ul8$c r6 = r6.z(r5)
            java.lang.String r7 = "getTagMetadata failed: no tags"
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r6.d(r7, r8)
            com.nytimes.android.internal.pushmessaging.tagmanager.a$a r6 = com.nytimes.android.internal.pushmessaging.tagmanager.a.C0334a.a
            goto L79
        L4f:
            com.nytimes.android.internal.pushmessaging.database.PushMessagingDao r6 = r6.e     // Catch: java.lang.Exception -> L2c
            r0.label = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r6 = r6.g(r7, r0)     // Catch: java.lang.Exception -> L2c
            if (r6 != r1) goto L5a
            return r1
        L5a:
            ul8$b r6 = defpackage.ul8.a     // Catch: java.lang.Exception -> L2c
            ul8$c r6 = r6.z(r5)     // Catch: java.lang.Exception -> L2c
            java.lang.String r7 = "getTagMetadata updated database"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L2c
            r6.a(r7, r8)     // Catch: java.lang.Exception -> L2c
            com.nytimes.android.internal.pushmessaging.tagmanager.a$c r6 = com.nytimes.android.internal.pushmessaging.tagmanager.a.c.a     // Catch: java.lang.Exception -> L2c
            goto L79
        L6a:
            ul8$b r7 = defpackage.ul8.a
            ul8$c r7 = r7.z(r5)
            java.lang.String r8 = "getTagMetadata database call failed with exception"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r7.f(r6, r8, r0)
            com.nytimes.android.internal.pushmessaging.tagmanager.a$a r6 = com.nytimes.android.internal.pushmessaging.tagmanager.a.C0334a.a
        L79:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote.i(java.util.List, by0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x006b, B:18:0x003d, B:19:0x0057, B:21:0x005f, B:24:0x006e, B:27:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002b, B:12:0x006b, B:18:0x003d, B:19:0x0057, B:21:0x005f, B:24:0x006e, B:27:0x0044), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerLocal, defpackage.vf8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$refreshTagMetadata$1
            if (r0 == 0) goto L13
            r0 = r8
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$refreshTagMetadata$1 r0 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$refreshTagMetadata$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$refreshTagMetadata$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote$refreshTagMetadata$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "PushMessaging"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L41
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L2f
            goto L6b
        L2f:
            r7 = move-exception
            goto L91
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.L$0
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote r7 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote) r7
            kotlin.f.b(r8)     // Catch: java.lang.Exception -> L2f
            goto L57
        L41:
            kotlin.f.b(r8)
            com.nytimes.android.internal.pushmessaging.tagmanager.TagMetadataAPI r8 = r7.c     // Catch: java.lang.Exception -> L2f
            com.nytimes.android.internal.pushmessaging.PushMessaging$c r2 = r7.d     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L2f
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2f
            r0.label = r6     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r8.getTagMetadata(r2, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L57
            return r1
        L57:
            retrofit2.Response r8 = (retrofit2.Response) r8     // Catch: java.lang.Exception -> L2f
            boolean r2 = r8.isSuccessful()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L6e
            r2 = 0
            r0.L$0 = r2     // Catch: java.lang.Exception -> L2f
            r0.label = r5     // Catch: java.lang.Exception -> L2f
            java.lang.Object r8 = r7.h(r8, r0)     // Catch: java.lang.Exception -> L2f
            if (r8 != r1) goto L6b
            return r1
        L6b:
            com.nytimes.android.internal.pushmessaging.tagmanager.a r8 = (com.nytimes.android.internal.pushmessaging.tagmanager.a) r8     // Catch: java.lang.Exception -> L2f
            goto La0
        L6e:
            ul8$b r7 = defpackage.ul8.a     // Catch: java.lang.Exception -> L2f
            ul8$c r7 = r7.z(r4)     // Catch: java.lang.Exception -> L2f
            int r8 = r8.code()     // Catch: java.lang.Exception -> L2f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2f
            r0.<init>()     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "getTagMetadata failed: "
            r0.append(r1)     // Catch: java.lang.Exception -> L2f
            r0.append(r8)     // Catch: java.lang.Exception -> L2f
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L2f
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2f
            r7.d(r8, r0)     // Catch: java.lang.Exception -> L2f
            com.nytimes.android.internal.pushmessaging.tagmanager.a$a r8 = com.nytimes.android.internal.pushmessaging.tagmanager.a.C0334a.a     // Catch: java.lang.Exception -> L2f
            goto La0
        L91:
            ul8$b r8 = defpackage.ul8.a
            ul8$c r8 = r8.z(r4)
            java.lang.String r0 = "getTagMetadata failed with exception"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r8.f(r7, r0, r1)
            com.nytimes.android.internal.pushmessaging.tagmanager.a$a r8 = com.nytimes.android.internal.pushmessaging.tagmanager.a.C0334a.a
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerRemote.b(by0):java.lang.Object");
    }
}
