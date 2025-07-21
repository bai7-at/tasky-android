package defpackage;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.coroutinesutils.b;

/* loaded from: classes4.dex */
public abstract class w93 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b bVar, DownloadState downloadState) {
        if (downloadState instanceof DownloadState.a) {
            bVar.error(((DownloadState.a) downloadState).c());
            return;
        }
        if (downloadState instanceof DownloadState.b) {
            bVar.error(((DownloadState.b) downloadState).d());
        } else {
            if (zq3.c(downloadState, DownloadState.c.b) || (downloadState instanceof DownloadState.d) || !(downloadState instanceof DownloadState.e)) {
                return;
            }
            bVar.a();
        }
    }
}
