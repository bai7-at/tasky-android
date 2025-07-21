package io.embrace.android.embracesdk;

import defpackage.hp6;
import defpackage.iv3;
import defpackage.qs2;
import defpackage.zq3;
import defpackage.zt6;
import io.embrace.android.embracesdk.injection.CoreModule;
import io.embrace.android.embracesdk.injection.CrashModule;
import io.embrace.android.embracesdk.injection.EssentialServiceModule;
import io.embrace.android.embracesdk.injection.InitModule;
import io.embrace.android.embracesdk.injection.LoadType;
import io.embrace.android.embracesdk.injection.OpenTelemetryModule;
import io.embrace.android.embracesdk.injection.SingletonDelegate;
import io.embrace.android.embracesdk.internal.EmbraceInternalInterface;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final class InternalInterfaceModuleImpl implements InternalInterfaceModule {
    static final /* synthetic */ iv3[] $$delegatedProperties = {zt6.i(new PropertyReference1Impl(InternalInterfaceModuleImpl.class, "embraceInternalInterface", "getEmbraceInternalInterface()Lio/embrace/android/embracesdk/internal/EmbraceInternalInterface;", 0)), zt6.i(new PropertyReference1Impl(InternalInterfaceModuleImpl.class, "reactNativeInternalInterface", "getReactNativeInternalInterface()Lio/embrace/android/embracesdk/ReactNativeInternalInterface;", 0)), zt6.i(new PropertyReference1Impl(InternalInterfaceModuleImpl.class, "unityInternalInterface", "getUnityInternalInterface()Lio/embrace/android/embracesdk/UnityInternalInterface;", 0)), zt6.i(new PropertyReference1Impl(InternalInterfaceModuleImpl.class, "flutterInternalInterface", "getFlutterInternalInterface()Lio/embrace/android/embracesdk/FlutterInternalInterface;", 0))};
    private final hp6 embraceInternalInterface$delegate;
    private final hp6 flutterInternalInterface$delegate;
    private final hp6 reactNativeInternalInterface$delegate;
    private final hp6 unityInternalInterface$delegate;

    public InternalInterfaceModuleImpl(final InitModule initModule, final OpenTelemetryModule openTelemetryModule, final CoreModule coreModule, final EssentialServiceModule essentialServiceModule, final EmbraceImpl embraceImpl, final CrashModule crashModule) {
        zq3.h(initModule, "initModule");
        zq3.h(openTelemetryModule, "openTelemetryModule");
        zq3.h(coreModule, "coreModule");
        zq3.h(essentialServiceModule, "essentialServiceModule");
        zq3.h(embraceImpl, "embrace");
        zq3.h(crashModule, "crashModule");
        qs2 qs2Var = new qs2() { // from class: io.embrace.android.embracesdk.InternalInterfaceModuleImpl$embraceInternalInterface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final EmbraceInternalInterfaceImpl mo865invoke() {
                return new EmbraceInternalInterfaceImpl(EmbraceImpl.this, initModule, essentialServiceModule.getConfigService(), openTelemetryModule.getInternalTracer());
            }
        };
        LoadType loadType = LoadType.LAZY;
        this.embraceInternalInterface$delegate = new SingletonDelegate(loadType, qs2Var);
        this.reactNativeInternalInterface$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.InternalInterfaceModuleImpl$reactNativeInternalInterface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final ReactNativeInternalInterfaceImpl mo865invoke() {
                return new ReactNativeInternalInterfaceImpl(embraceImpl, InternalInterfaceModuleImpl.this.getEmbraceInternalInterface(), coreModule.getAppFramework(), crashModule.getCrashService(), essentialServiceModule.getMetadataService(), essentialServiceModule.getHostedSdkVersionInfo(), initModule.getLogger());
            }
        });
        this.unityInternalInterface$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.InternalInterfaceModuleImpl$unityInternalInterface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final UnityInternalInterfaceImpl mo865invoke() {
                return new UnityInternalInterfaceImpl(embraceImpl, InternalInterfaceModuleImpl.this.getEmbraceInternalInterface(), essentialServiceModule.getHostedSdkVersionInfo(), initModule.getLogger());
            }
        });
        this.flutterInternalInterface$delegate = new SingletonDelegate(loadType, new qs2() { // from class: io.embrace.android.embracesdk.InternalInterfaceModuleImpl$flutterInternalInterface$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final FlutterInternalInterfaceImpl mo865invoke() {
                return new FlutterInternalInterfaceImpl(embraceImpl, InternalInterfaceModuleImpl.this.getEmbraceInternalInterface(), essentialServiceModule.getHostedSdkVersionInfo(), initModule.getLogger());
            }
        });
    }

    @Override // io.embrace.android.embracesdk.InternalInterfaceModule
    public EmbraceInternalInterface getEmbraceInternalInterface() {
        return (EmbraceInternalInterface) this.embraceInternalInterface$delegate.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.embrace.android.embracesdk.InternalInterfaceModule
    public FlutterInternalInterface getFlutterInternalInterface() {
        return (FlutterInternalInterface) this.flutterInternalInterface$delegate.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.embrace.android.embracesdk.InternalInterfaceModule
    public ReactNativeInternalInterface getReactNativeInternalInterface() {
        return (ReactNativeInternalInterface) this.reactNativeInternalInterface$delegate.getValue(this, $$delegatedProperties[1]);
    }

    @Override // io.embrace.android.embracesdk.InternalInterfaceModule
    public UnityInternalInterface getUnityInternalInterface() {
        return (UnityInternalInterface) this.unityInternalInterface$delegate.getValue(this, $$delegatedProperties[2]);
    }
}
