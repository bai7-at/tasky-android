package com.nytimes.android.deeplink;

import android.content.Intent;
import android.net.Uri;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.navigation.deeplink.DeepLinkManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.ld1;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.deeplink.NytUriHandler$openUriWithUrlExtra$1", f = "NytUriHandler.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class NytUriHandler$openUriWithUrlExtra$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $extraAssetUrl;
    final /* synthetic */ String $uri;
    int label;
    final /* synthetic */ NytUriHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NytUriHandler$openUriWithUrlExtra$1(NytUriHandler nytUriHandler, String str, String str2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = nytUriHandler;
        this.$uri = str;
        this.$extraAssetUrl = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new NytUriHandler$openUriWithUrlExtra$1(this.this$0, this.$uri, this.$extraAssetUrl, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ld1 ld1Var;
        jk jkVar;
        DeepLinkManager deepLinkManager;
        jk jkVar2;
        jk jkVar3;
        Object h = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
                deepLinkManager = this.this$0.b;
                jkVar2 = this.this$0.a;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.$uri));
                this.label = 1;
                obj = deepLinkManager.c(jkVar2, intent, (r16 & 4) != 0 ? false : false, (r16 & 8) != 0 ? "" : null, (r16 & 16) != 0 ? false : true, this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            }
            Intent intent2 = (Intent) obj;
            String str = this.$extraAssetUrl;
            if (str != null && intent2 != null) {
                intent2.putExtra("com.nytimes.android.extra.ASSET_URL", str);
            }
            jkVar3 = this.this$0.a;
            jkVar3.startActivity(intent2);
        } catch (Exception e) {
            NYTLogger.i(e, "Fallback: External URL - path: " + this.$uri, new Object[0]);
            ld1Var = this.this$0.c;
            jkVar = this.this$0.a;
            ld1Var.c(jkVar, this.$uri);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((NytUriHandler$openUriWithUrlExtra$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
