package com.nytimes.android.coroutinesutils;

import com.nytimes.android.coroutinesutils.DownloadState;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class a {
    public static final DownloadState a(DownloadState downloadState, Object obj) {
        zq3.h(downloadState, "<this>");
        return obj != null ? downloadState instanceof DownloadState.c ? new DownloadState.d(obj) : downloadState instanceof DownloadState.a ? new DownloadState.b(obj, ((DownloadState.a) downloadState).c()) : downloadState : downloadState;
    }
}
