package com.nytimes.android.apolloschema;

import defpackage.zq3;
import type.CommentStatus;

/* loaded from: classes3.dex */
public abstract class ExtensionsKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CommentStatus.values().length];
            try {
                iArr[CommentStatus.ACCEPT_AND_DISPLAY_COMMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentStatus.DISPLAY_COMMENTS_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommentStatus.NO_COMMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.apollographql.apollo.ApolloCall r4, defpackage.by0 r5) {
        /*
            boolean r0 = r5 instanceof com.nytimes.android.apolloschema.ExtensionsKt$await$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.apolloschema.ExtensionsKt$await$1 r0 = (com.nytimes.android.apolloschema.ExtensionsKt$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.apolloschema.ExtensionsKt$await$1 r0 = new com.nytimes.android.apolloschema.ExtensionsKt$await$1
            r0.<init>(r5)
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
            java.lang.Object r5 = r4.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            yj r5 = (defpackage.yj) r5
            com.apollographql.apollo.exception.ApolloException r4 = r5.e
            if (r4 != 0) goto L44
            return r5
        L44:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.apolloschema.ExtensionsKt.a(com.apollographql.apollo.ApolloCall, by0):java.lang.Object");
    }

    public static final boolean b(CommentStatus commentStatus) {
        zq3.h(commentStatus, "<this>");
        int i = a.a[commentStatus.ordinal()];
        return i == 1 || i == 2;
    }
}
