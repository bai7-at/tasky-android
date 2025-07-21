package androidx.compose.ui.platform;

import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

@fc1(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Channel<ww8> $channel;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GlobalSnapshotManager$ensureStarted$1(Channel channel, by0 by0Var) {
        super(2, by0Var);
        this.$channel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GlobalSnapshotManager$ensureStarted$1(this.$channel, by0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:7:0x0038, B:9:0x0040, B:10:0x002b, B:14:0x0054, B:21:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:6:0x0013, B:7:0x0038, B:9:0x0040, B:10:0x002b, B:14:0x0054, B:21:0x0026), top: B:2:0x0007 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:7:0x0038). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r5.L$1
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            java.lang.Object r3 = r5.L$0
            kotlinx.coroutines.channels.ReceiveChannel r3 = (kotlinx.coroutines.channels.ReceiveChannel) r3
            kotlin.f.b(r6)     // Catch: java.lang.Throwable -> L17
            goto L38
        L17:
            r5 = move-exception
            goto L5d
        L19:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L21:
            kotlin.f.b(r6)
            kotlinx.coroutines.channels.Channel<ww8> r3 = r5.$channel
            kotlinx.coroutines.channels.ChannelIterator r6 = r3.iterator()     // Catch: java.lang.Throwable -> L17
            r1 = r6
        L2b:
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L17
            r5.L$1 = r1     // Catch: java.lang.Throwable -> L17
            r5.label = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r6 = r1.hasNext(r5)     // Catch: java.lang.Throwable -> L17
            if (r6 != r0) goto L38
            return r0
        L38:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L17
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r6 == 0) goto L54
            java.lang.Object r6 = r1.next()     // Catch: java.lang.Throwable -> L17
            ww8 r6 = (defpackage.ww8) r6     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.atomic.AtomicBoolean r6 = androidx.compose.ui.platform.GlobalSnapshotManager.a()     // Catch: java.lang.Throwable -> L17
            r4 = 0
            r6.set(r4)     // Catch: java.lang.Throwable -> L17
            androidx.compose.runtime.snapshots.e$a r6 = androidx.compose.runtime.snapshots.e.e     // Catch: java.lang.Throwable -> L17
            r6.k()     // Catch: java.lang.Throwable -> L17
            goto L2b
        L54:
            ww8 r5 = defpackage.ww8.a     // Catch: java.lang.Throwable -> L17
            r5 = 0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r5)
            ww8 r5 = defpackage.ww8.a
            return r5
        L5d:
            throw r5     // Catch: java.lang.Throwable -> L5e
        L5e:
            r6 = move-exception
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r3, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GlobalSnapshotManager$ensureStarted$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
