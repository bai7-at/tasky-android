package io.embrace.android.embracesdk.capture.envelope.resource;

import android.content.pm.PackageInfo;
import defpackage.zq3;
import io.embrace.android.embracesdk.Embrace;
import io.embrace.android.embracesdk.capture.metadata.AppEnvironment;
import io.embrace.android.embracesdk.capture.metadata.HostedSdkVersionInfo;
import io.embrace.android.embracesdk.capture.metadata.MetadataService;
import io.embrace.android.embracesdk.internal.BuildInfo;
import io.embrace.android.embracesdk.internal.DeviceArchitecture;
import io.embrace.android.embracesdk.internal.payload.EnvelopeResource;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class EnvelopeResourceSourceImpl implements EnvelopeResourceSource {
    private final Embrace.AppFramework appFramework;
    private final BuildInfo buildInfo;
    private final Device device;
    private final DeviceArchitecture deviceArchitecture;
    private final AppEnvironment.Environment environment;
    private final HostedSdkVersionInfo hosted;
    private final MetadataService metadataService;
    private final PackageInfo packageInfo;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Embrace.AppFramework.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Embrace.AppFramework.NATIVE.ordinal()] = 1;
            iArr[Embrace.AppFramework.REACT_NATIVE.ordinal()] = 2;
            iArr[Embrace.AppFramework.UNITY.ordinal()] = 3;
            iArr[Embrace.AppFramework.FLUTTER.ordinal()] = 4;
        }
    }

    public EnvelopeResourceSourceImpl(HostedSdkVersionInfo hostedSdkVersionInfo, AppEnvironment.Environment environment, BuildInfo buildInfo, PackageInfo packageInfo, Embrace.AppFramework appFramework, DeviceArchitecture deviceArchitecture, Device device, MetadataService metadataService) {
        zq3.h(hostedSdkVersionInfo, "hosted");
        zq3.h(environment, "environment");
        zq3.h(buildInfo, "buildInfo");
        zq3.h(packageInfo, "packageInfo");
        zq3.h(appFramework, "appFramework");
        zq3.h(deviceArchitecture, "deviceArchitecture");
        zq3.h(device, "device");
        zq3.h(metadataService, "metadataService");
        this.hosted = hostedSdkVersionInfo;
        this.environment = environment;
        this.buildInfo = buildInfo;
        this.packageInfo = packageInfo;
        this.appFramework = appFramework;
        this.deviceArchitecture = deviceArchitecture;
        this.device = device;
        this.metadataService = metadataService;
    }

    private final EnvelopeResource.AppFramework mapFramework(Embrace.AppFramework appFramework) {
        int i = WhenMappings.$EnumSwitchMapping$0[appFramework.ordinal()];
        if (i == 1) {
            return EnvelopeResource.AppFramework.NATIVE;
        }
        if (i == 2) {
            return EnvelopeResource.AppFramework.REACT_NATIVE;
        }
        if (i == 3) {
            return EnvelopeResource.AppFramework.UNITY;
        }
        if (i == 4) {
            return EnvelopeResource.AppFramework.FLUTTER;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r1 == null) goto L26;
     */
    @Override // io.embrace.android.embracesdk.capture.envelope.resource.EnvelopeResourceSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.embrace.android.embracesdk.internal.payload.EnvelopeResource getEnvelopeResource() {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.embrace.android.embracesdk.capture.envelope.resource.EnvelopeResourceSourceImpl.getEnvelopeResource():io.embrace.android.embracesdk.internal.payload.EnvelopeResource");
    }
}
