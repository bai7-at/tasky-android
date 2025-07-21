package com.nytimes.subauth.ui.ui.screens;

import com.nytimes.subauth.ui.login.SubauthLoginViewModel;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes4.dex */
/* synthetic */ class LireContainerScreenKt$LireContainerScreen$2 extends FunctionReferenceImpl implements gt2 {
    LireContainerScreenKt$LireContainerScreen$2(Object obj) {
        super(2, obj, SubauthLoginViewModel.class, "onWebItem", "onWebItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    public final void g(String str, String str2) {
        zq3.h(str, "p0");
        zq3.h(str2, "p1");
        ((SubauthLoginViewModel) this.receiver).I0(str, str2);
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        g((String) obj, (String) obj2);
        return ww8.a;
    }
}
