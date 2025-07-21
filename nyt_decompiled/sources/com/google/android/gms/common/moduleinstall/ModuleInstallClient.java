package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.og8;

/* loaded from: classes2.dex */
public interface ModuleInstallClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    og8 areModulesAvailable(OptionalModuleApi... optionalModuleApiArr);

    og8 deferredInstall(OptionalModuleApi... optionalModuleApiArr);

    og8 getInstallModulesIntent(OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    og8 installModules(ModuleInstallRequest moduleInstallRequest);

    og8 releaseModules(OptionalModuleApi... optionalModuleApiArr);

    @ResultIgnorabilityUnspecified
    og8 unregisterListener(InstallStatusListener installStatusListener);
}
