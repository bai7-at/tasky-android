package androidx.compose.ui.platform;

import defpackage.ss2;
import defpackage.ww8;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* loaded from: classes.dex */
public final class GlobalSnapshotManager {
    public static final GlobalSnapshotManager a = new GlobalSnapshotManager();
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicBoolean c = new AtomicBoolean(false);
    public static final int d = 8;

    private GlobalSnapshotManager() {
    }

    public final void b() {
        if (b.compareAndSet(false, true)) {
            final Channel Channel$default = ChannelKt.Channel$default(1, null, null, 6, null);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(AndroidUiDispatcher.k.b()), null, null, new GlobalSnapshotManager$ensureStarted$1(Channel$default, null), 3, null);
            androidx.compose.runtime.snapshots.e.e.i(new ss2() { // from class: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$2
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m96invoke(obj);
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m96invoke(Object obj) {
                    AtomicBoolean atomicBoolean;
                    atomicBoolean = GlobalSnapshotManager.c;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        Channel.this.mo129trySendJP2dKIU(ww8.a);
                    }
                }
            });
        }
    }
}
