package com.nytimes.android.devsettings.home.composables;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.devsettings.home.composables.DevSettingsFragmentComposableKt$AndroidDevSettingFragment$1", f = "DevSettingsFragmentComposable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class DevSettingsFragmentComposableKt$AndroidDevSettingFragment$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ int $frameLayoutViewId;
    final /* synthetic */ String $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevSettingsFragmentComposableKt$AndroidDevSettingFragment$1(FragmentManager fragmentManager, Fragment fragment, int i, String str, by0 by0Var) {
        super(2, by0Var);
        this.$fragmentManager = fragmentManager;
        this.$fragment = fragment;
        this.$frameLayoutViewId = i;
        this.$tag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new DevSettingsFragmentComposableKt$AndroidDevSettingFragment$1(this.$fragmentManager, this.$fragment, this.$frameLayoutViewId, this.$tag, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        DevSettingsFragmentComposableKt.b(this.$fragmentManager, this.$fragment);
        this.$fragmentManager.p().r(this.$frameLayoutViewId, this.$fragment, this.$tag).h();
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((DevSettingsFragmentComposableKt$AndroidDevSettingFragment$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
