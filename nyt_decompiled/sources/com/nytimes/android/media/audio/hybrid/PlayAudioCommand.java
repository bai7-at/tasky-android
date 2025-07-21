package com.nytimes.android.media.audio.hybrid;

import com.nytimes.android.media.common.AudioType;
import com.nytimes.android.media.common.NYTMediaItem;
import defpackage.mc0;
import defpackage.nc0;
import defpackage.rb3;
import defpackage.zq3;
import kotlin.random.Random;

/* loaded from: classes4.dex */
public final class PlayAudioCommand extends mc0 {
    private final rb3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayAudioCommand(rb3 rb3Var) {
        super("playAudio");
        zq3.h(rb3Var, "hybridAudioHandler");
        this.b = rb3Var;
    }

    private final String d() {
        return String.valueOf(Random.a.g());
    }

    private final NYTMediaItem e(nc0 nc0Var) {
        String l = nc0Var.l("audioSourceID");
        if (l == null) {
            l = d();
        }
        String str = l;
        String j = nc0Var.j("audioFileURL");
        String j2 = nc0Var.j("audioAssetURI");
        String l2 = nc0Var.l("articleURI");
        String l3 = nc0Var.l("articleHeadline");
        if (l3 == null) {
            l3 = nc0Var.j("audioHeadline");
        }
        return new NYTMediaItem(str, j, l3, null, 0L, false, false, j2, null, null, nc0Var.l("showOrPublisherImageURL"), null, null, null, null, AudioType.AUDIO, null, null, null, null, null, null, null, null, null, null, null, l2, false, null, null, null, null, null, false, null, false, false, null, null, null, null, -134251656, 1023, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // defpackage.mc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.webkit.WebView r7, int r8, defpackage.nc0 r9, defpackage.by0 r10) {
        /*
            r6 = this;
            boolean r7 = r10 instanceof com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$1
            if (r7 == 0) goto L13
            r7 = r10
            com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$1 r7 = (com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$1) r7
            int r0 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r7.label = r0
            goto L18
        L13:
            com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$1 r7 = new com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$1
            r7.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            int r8 = r7.I$0
            kotlin.f.b(r10)     // Catch: java.lang.Exception -> L2c
            goto L5d
        L2c:
            r6 = move-exception
            r1 = r8
            goto L65
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.f.b(r10)
            nc0 r10 = new nc0     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "data"
            java.util.Map r9 = r9.g(r1)     // Catch: java.lang.Exception -> L2c
            r10.<init>(r9)     // Catch: java.lang.Exception -> L2c
            com.nytimes.android.media.common.NYTMediaItem r9 = r6.e(r10)     // Catch: java.lang.Exception -> L2c
            kotlinx.coroutines.MainCoroutineDispatcher r10 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L2c
            com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$2 r1 = new com.nytimes.android.media.audio.hybrid.PlayAudioCommand$run$2     // Catch: java.lang.Exception -> L2c
            r1.<init>(r6, r9, r3)     // Catch: java.lang.Exception -> L2c
            r7.I$0 = r8     // Catch: java.lang.Exception -> L2c
            r7.label = r2     // Catch: java.lang.Exception -> L2c
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r10, r1, r7)     // Catch: java.lang.Exception -> L2c
            if (r6 != r0) goto L5d
            return r0
        L5d:
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r6 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion     // Catch: java.lang.Exception -> L2c
            r7 = 2
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r6 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.a.d(r6, r8, r3, r7, r3)     // Catch: java.lang.Exception -> L2c
            goto L72
        L65:
            com.nytimes.android.hybrid.bridge.BridgeCommandResult$a r0 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.Companion
            java.lang.String r3 = r6.getMessage()
            r4 = 2
            r5 = 0
            r2 = 0
            com.nytimes.android.hybrid.bridge.BridgeCommandResult r6 = com.nytimes.android.hybrid.bridge.BridgeCommandResult.a.b(r0, r1, r2, r3, r4, r5)
        L72:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.media.audio.hybrid.PlayAudioCommand.b(android.webkit.WebView, int, nc0, by0):java.lang.Object");
    }
}
