package com.nytimes.android.devsettings.common;

import android.content.Context;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "com.nytimes.android.devsettings.common.DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2", f = "DevSettingSwitchItem.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2 extends SuspendLambda implements it2 {
    final /* synthetic */ it2 $onCheckedChange;
    final /* synthetic */ String $preferenceKey;
    final /* synthetic */ boolean $requestRestart;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2(boolean z, it2 it2Var, String str, by0 by0Var) {
        super(3, by0Var);
        this.$requestRestart = z;
        this.$onCheckedChange = it2Var;
        this.$preferenceKey = str;
    }

    public final Object b(Context context, boolean z, by0 by0Var) {
        DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2 devSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2 = new DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2(this.$requestRestart, this.$onCheckedChange, this.$preferenceKey, by0Var);
        devSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2.L$0 = context;
        devSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2.Z$0 = z;
        return devSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2.invokeSuspend(ww8.a);
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b((Context) obj, ((Boolean) obj2).booleanValue(), (by0) obj3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        return defpackage.cc0.a(r2);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
            int r1 = r7.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            kotlin.f.b(r8)
            goto L50
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L18:
            kotlin.f.b(r8)
            java.lang.Object r8 = r7.L$0
            android.content.Context r8 = (android.content.Context) r8
            boolean r1 = r7.Z$0
            android.content.SharedPreferences r4 = com.nytimes.android.devsettings.utils.ContextUtilsKt.a(r8)
            java.lang.String r5 = r7.$preferenceKey
            android.content.SharedPreferences$Editor r4 = r4.edit()
            java.lang.String r6 = "editor"
            defpackage.zq3.g(r4, r6)
            r4.putBoolean(r5, r1)
            r4.apply()
            boolean r4 = r7.$requestRestart
            if (r4 == 0) goto L3f
            sn1 r4 = defpackage.sn1.a
            r4.b()
        L3f:
            it2 r4 = r7.$onCheckedChange
            if (r4 == 0) goto L5a
            java.lang.Boolean r1 = defpackage.cc0.a(r1)
            r7.label = r3
            java.lang.Object r8 = r4.invoke(r8, r1, r7)
            if (r8 != r0) goto L50
            return r0
        L50:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L5d
        L58:
            r2 = r3
            goto L5d
        L5a:
            if (r1 == 0) goto L5d
            goto L58
        L5d:
            java.lang.Boolean r7 = defpackage.cc0.a(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.devsettings.common.DevSettingSwitchItemKt$DevSettingSwitchPreferenceItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
