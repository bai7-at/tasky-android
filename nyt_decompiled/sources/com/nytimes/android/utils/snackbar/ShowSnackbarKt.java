package com.nytimes.android.utils.snackbar;

/* loaded from: classes4.dex */
public abstract class ShowSnackbarKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final androidx.compose.material.SnackbarHostState r16, kotlinx.coroutines.CoroutineScope r17, final defpackage.ss2 r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.snackbar.ShowSnackbarKt.b(androidx.compose.material.SnackbarHostState, kotlinx.coroutines.CoroutineScope, ss2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.material.SnackbarHostState r8, com.nytimes.android.utils.snackbar.b r9, defpackage.by0 r10) {
        /*
            boolean r0 = r10 instanceof com.nytimes.android.utils.snackbar.ShowSnackbarKt$showSnackbar$1
            if (r0 == 0) goto L14
            r0 = r10
            com.nytimes.android.utils.snackbar.ShowSnackbarKt$showSnackbar$1 r0 = (com.nytimes.android.utils.snackbar.ShowSnackbarKt$showSnackbar$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            com.nytimes.android.utils.snackbar.ShowSnackbarKt$showSnackbar$1 r0 = new com.nytimes.android.utils.snackbar.ShowSnackbarKt$showSnackbar$1
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L44
            if (r1 == r2) goto L3b
            r8 = 3
            if (r1 != r8) goto L33
            kotlin.f.b(r10)
            ww8 r8 = defpackage.ww8.a
            return r8
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r5.L$0
            r9 = r8
            com.nytimes.android.utils.snackbar.b r9 = (com.nytimes.android.utils.snackbar.b) r9
            kotlin.f.b(r10)
            goto L90
        L44:
            kotlin.f.b(r10)
            goto L6b
        L48:
            kotlin.f.b(r10)
            boolean r10 = r9 instanceof com.nytimes.android.utils.snackbar.b.a
            if (r10 == 0) goto L6e
            r10 = r9
            com.nytimes.android.utils.snackbar.b$a r10 = (com.nytimes.android.utils.snackbar.b.a) r10
            java.lang.CharSequence r10 = r10.a()
            java.lang.String r2 = r10.toString()
            androidx.compose.material.SnackbarDuration r4 = r9.getDuration()
            r5.label = r3
            r3 = 0
            r6 = 2
            r7 = 0
            r1 = r8
            java.lang.Object r8 = androidx.compose.material.SnackbarHostState.e(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L6b
            return r0
        L6b:
            ww8 r8 = defpackage.ww8.a
            return r8
        L6e:
            boolean r10 = r9 instanceof com.nytimes.android.utils.snackbar.b.C0444b
            if (r10 == 0) goto L9f
            r10 = r9
            com.nytimes.android.utils.snackbar.b$b r10 = (com.nytimes.android.utils.snackbar.b.C0444b) r10
            java.lang.CharSequence r1 = r10.c()
            java.lang.String r1 = r1.toString()
            androidx.compose.material.SnackbarDuration r3 = r9.getDuration()
            java.lang.String r10 = r10.b()
            r5.L$0 = r9
            r5.label = r2
            java.lang.Object r10 = r8.d(r1, r10, r3, r5)
            if (r10 != r0) goto L90
            return r0
        L90:
            androidx.compose.material.SnackbarResult r10 = (androidx.compose.material.SnackbarResult) r10
            androidx.compose.material.SnackbarResult r8 = androidx.compose.material.SnackbarResult.ActionPerformed
            if (r10 != r8) goto L9f
            com.nytimes.android.utils.snackbar.b$b r9 = (com.nytimes.android.utils.snackbar.b.C0444b) r9
            qs2 r8 = r9.a()
            r8.mo865invoke()
        L9f:
            ww8 r8 = defpackage.ww8.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.utils.snackbar.ShowSnackbarKt.c(androidx.compose.material.SnackbarHostState, com.nytimes.android.utils.snackbar.b, by0):java.lang.Object");
    }
}
