package zendesk.core;

import com.zendesk.logger.Logger;
import defpackage.e17;
import defpackage.r48;
import defpackage.tm9;
import defpackage.y22;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
class ZendeskBlipsProvider implements BlipsProvider, BlipsCoreProvider {
    static final String ACTION_CORE_INIT = "init";
    static final String ACTION_CORE_PUSH_OFF = "PushOff";
    static final String ACTION_CORE_PUSH_ON = "PushOn";
    static final String BLIPS_CORE_CATEGORY = "CoreSDK";
    private static final String BLIP_VALUE_STRING = "payload";
    private static final String CHANNEL_CORE_SDK = "core_sdk";
    private static final String CODE_FIELD_NAME_STRING = "code";
    private static final String CODE_VALUE_JAVA_STRING = "java";
    private static final String CORE_VERSION_STRING = "4.0.4";
    private static final String DEVICE_INFO_FIELD_STRING = "device";
    private static final String LOG_TAG = "ZendeskBlipsProvider";
    private final String appId;
    private final BlipsService blipsService;
    private final CoreSettingsStorage coreSettingsStorage;
    private final DeviceInfo deviceInfo;
    private final Executor executor;
    private final IdentityManager identityManager;
    private final Serializer serializer;

    ZendeskBlipsProvider(BlipsService blipsService, DeviceInfo deviceInfo, Serializer serializer, IdentityManager identityManager, String str, CoreSettingsStorage coreSettingsStorage, Executor executor) {
        this.blipsService = blipsService;
        this.deviceInfo = deviceInfo;
        this.serializer = serializer;
        this.identityManager = identityManager;
        this.appId = str;
        this.coreSettingsStorage = coreSettingsStorage;
        this.executor = executor;
    }

    private Map<String, Object> addDeviceInfoToValue(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(DEVICE_INFO_FIELD_STRING, this.deviceInfo.getInfo());
        if (map != null && !map.isEmpty()) {
            hashMap.put(BLIP_VALUE_STRING, map);
        }
        return hashMap;
    }

    @Override // zendesk.core.BlipsCoreProvider
    public void coreInitialized() {
        HashMap hashMap = new HashMap();
        hashMap.put(CODE_FIELD_NAME_STRING, CODE_VALUE_JAVA_STRING);
        sendBlip(new UserAction("4.0.4", CHANNEL_CORE_SDK, BLIPS_CORE_CATEGORY, ACTION_CORE_INIT, null, hashMap), BlipsGroup.REQUIRED);
    }

    @Override // zendesk.core.BlipsCoreProvider
    public void corePushDisabled(Long l) {
        sendBlip(BlipsGroup.REQUIRED, new UserAction("4.0.4", CHANNEL_CORE_SDK, BLIPS_CORE_CATEGORY, ACTION_CORE_PUSH_OFF), l);
    }

    @Override // zendesk.core.BlipsCoreProvider
    public void corePushEnabled() {
        sendBlip(new UserAction("4.0.4", CHANNEL_CORE_SDK, BLIPS_CORE_CATEGORY, ACTION_CORE_PUSH_ON), BlipsGroup.REQUIRED);
    }

    BlipsRequest createBlipsRequest(UserAction userAction, String str, String str2, Long l) {
        return BlipsRequest.buildUserAction(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, userAction.getVersion(), userAction.getChannel(), userAction.getCategory(), userAction.getAction(), userAction.getLabel(), addDeviceInfoToValue(userAction.getValue()));
    }

    void dispatchBlip(final BlipsRequest blipsRequest) {
        this.executor.execute(new Runnable() { // from class: zendesk.core.ZendeskBlipsProvider.1
            @Override // java.lang.Runnable
            public void run() {
                ZendeskBlipsProvider.this.blipsService.send(ZendeskBlipsProvider.this.serializer.serialize(blipsRequest)).enqueue(new e17(new tm9() { // from class: zendesk.core.ZendeskBlipsProvider.1.1
                    @Override // defpackage.tm9
                    public void onError(y22 y22Var) {
                        Logger.b(ZendeskBlipsProvider.LOG_TAG, "Unable to send Blip | Error: %s", y22Var.a());
                    }

                    @Override // defpackage.tm9
                    public void onSuccess(Void r1) {
                    }
                }));
            }
        });
    }

    @Override // zendesk.core.BlipsProvider
    public void sendBlip(UserAction userAction, BlipsGroup blipsGroup) {
        sendBlip(blipsGroup, userAction, this.identityManager.getUserId());
    }

    void sendBlip(BlipsGroup blipsGroup, UserAction userAction, Long l) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && r48.b(userAction.getChannel())) {
            dispatchBlip(createBlipsRequest(userAction, this.identityManager.getBlipsUuid(), this.appId, l));
        }
    }

    BlipsRequest createBlipsRequest(PageView pageView, String str, String str2, Long l) {
        return BlipsRequest.buildPageView(str, BlipsFormatHelper.nowAsString(new Date()), l, str2, pageView.getVersion(), pageView.getChannel(), pageView.getUrl(), pageView.getNavigatorLanguage(), pageView.getPageTitle(), pageView.getPageId(), pageView.getPageLocale(), addDeviceInfoToValue(pageView.getValue()));
    }

    @Override // zendesk.core.BlipsProvider
    public void sendBlip(PageView pageView, BlipsGroup blipsGroup) {
        if (this.coreSettingsStorage.getBlipsSettings().getBlipsPermissions().isEnabled(blipsGroup) && r48.b(pageView.getChannel())) {
            dispatchBlip(createBlipsRequest(pageView, this.identityManager.getBlipsUuid(), this.appId, this.identityManager.getUserId()));
        }
    }
}
