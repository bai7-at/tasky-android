package com.amazonaws.mobileconnectors.cognito;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.auth.IdentityChangedListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobileconnectors.cognito.exceptions.RegistrationFailedException;
import com.amazonaws.mobileconnectors.cognito.exceptions.UnsubscribeFailedException;
import com.amazonaws.mobileconnectors.cognito.internal.storage.CognitoSyncStorage;
import com.amazonaws.mobileconnectors.cognito.internal.storage.SQLiteLocalStorage;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.cognitosync.AmazonCognitoSyncClient;
import com.amazonaws.services.cognitosync.model.RegisterDeviceRequest;
import com.amazonaws.services.cognitosync.model.RegisterDeviceResult;
import com.amazonaws.services.cognitosync.model.ResourceNotFoundException;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amazonaws.util.VersionInfoUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class CognitoSyncManager {
    private static final String DATABASE_NAME = "cognito_dataset_cache.db";
    private static final Log LOGGER = LogFactory.getLog((Class<?>) CognitoSyncManager.class);
    private static final String USER_AGENT = CognitoSyncManager.class.getName() + "/" + VersionInfoUtils.getVersion();
    private static SQLiteLocalStorage local;
    private final Context context;
    private final String identityPoolId;
    private final CognitoCachingCredentialsProvider provider;
    private final CognitoSyncStorage remote;
    private final AmazonCognitoSyncClient syncClient;

    @Deprecated
    public CognitoSyncManager(Context context, String str, Regions regions, CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider) {
        this(context, regions, cognitoCachingCredentialsProvider);
    }

    private static ClientConfiguration getClientConfigFromConfig(AWSConfiguration aWSConfiguration) {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        if (aWSConfiguration != null) {
            clientConfiguration.setUserAgent(aWSConfiguration.getUserAgent());
        }
        return clientConfiguration;
    }

    private static Regions getRegionFromConfig(AWSConfiguration aWSConfiguration) {
        if (aWSConfiguration == null) {
            throw new IllegalArgumentException("AWSConfiguration cannot be null");
        }
        try {
            return Regions.fromName(aWSConfiguration.optJsonObject("Cognito").getString("Region"));
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to read Cognito please check your setup or awsconfiguration.json file", e);
        }
    }

    private SharedPreferences getSharedPreferences() {
        return this.context.getSharedPreferences("com.amazonaws.mobileconnectors.cognito", 0);
    }

    void close() {
        local.close();
    }

    public String getDeviceId() {
        return getSharedPreferences().getString(namespaceIdPlatform("deviceId"), "");
    }

    String getIdentityId() {
        return DatasetUtils.getIdentityId(this.provider);
    }

    public PushSyncUpdate getPushSyncUpdate(Intent intent) {
        return new PushSyncUpdate(intent);
    }

    public boolean isDeviceRegistered() {
        if (this.provider.getCachedIdentityId() == null) {
            return false;
        }
        SharedPreferences sharedPreferences = getSharedPreferences();
        return (sharedPreferences.getString(namespaceIdPlatform("deviceId"), "").isEmpty() || sharedPreferences.getString(namespaceId("platform"), "").isEmpty()) ? false : true;
    }

    public List<DatasetMetadata> listDatasets() {
        return local.getDatasets(getIdentityId());
    }

    String namespaceId(String str) {
        return this.provider.getCachedIdentityId() + InstructionFileId.DOT + str;
    }

    String namespaceIdPlatform(String str) {
        return namespaceId(getSharedPreferences().getString(namespaceId("platform"), "")) + InstructionFileId.DOT + str;
    }

    public Dataset openOrCreateDataset(String str) {
        DatasetUtils.validateDatasetName(str);
        local.createDataset(getIdentityId(), str);
        return new DefaultDataset(this.context, str, this.provider, local, this.remote);
    }

    public void refreshDatasetMetadata() {
        local.updateDatasetMetadata(getIdentityId(), this.remote.getDatasets());
    }

    public void registerDevice(String str, String str2) {
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (isDeviceRegistered()) {
            LOGGER.info("Device is already registered");
            return;
        }
        try {
            RegisterDeviceResult registerDevice = this.syncClient.registerDevice(new RegisterDeviceRequest().withIdentityPoolId(this.provider.getIdentityPoolId()).withIdentityId(this.provider.getIdentityId()).withPlatform(str).withToken(str2));
            sharedPreferences.edit().putString(namespaceId("platform"), str).apply();
            String deviceId = registerDevice.getDeviceId();
            sharedPreferences.edit().putString(namespaceIdPlatform("deviceId"), deviceId).apply();
            LOGGER.info("Device is registered successfully: " + deviceId);
        } catch (AmazonClientException e) {
            LOGGER.error("Failed to register device", e);
            throw new RegistrationFailedException("Failed to register device", e);
        }
    }

    public void subscribe(List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            openOrCreateDataset(it2.next()).subscribe();
        }
    }

    public void subscribeAll() {
        ArrayList arrayList = new ArrayList();
        Iterator<DatasetMetadata> it2 = listDatasets().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getDatasetName());
        }
        subscribe(arrayList);
    }

    public void unregisterDevice() {
        if (this.provider.getCachedIdentityId() != null) {
            getSharedPreferences().edit().remove(namespaceIdPlatform("deviceId")).remove(namespaceId("platform")).apply();
        }
    }

    public void unsubscribe(List<String> list) {
        for (String str : list) {
            try {
                openOrCreateDataset(str).unsubscribe();
            } catch (UnsubscribeFailedException e) {
                if (!(e.getCause() instanceof ResourceNotFoundException)) {
                    throw e;
                }
                LOGGER.warn("Unable to unsubscribe to dataset " + str + ", dataset not a subscription");
            }
        }
    }

    public void unsubscribeAll() {
        ArrayList arrayList = new ArrayList();
        Iterator<DatasetMetadata> it2 = listDatasets().iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getDatasetName());
        }
        unsubscribe(arrayList);
    }

    public void wipeData() {
        this.provider.clear();
        local.wipeData();
        LOGGER.info("All data has been wiped");
    }

    CognitoSyncManager(Context context, Regions regions, CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider, AmazonCognitoSyncClient amazonCognitoSyncClient) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        this.context = context;
        this.provider = cognitoCachingCredentialsProvider;
        String identityPoolId = cognitoCachingCredentialsProvider.getIdentityPoolId();
        this.identityPoolId = identityPoolId;
        synchronized (CognitoSyncManager.class) {
            try {
                if (local == null) {
                    local = new SQLiteLocalStorage(context, DATABASE_NAME);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.syncClient = amazonCognitoSyncClient;
        amazonCognitoSyncClient.setRegion(Region.getRegion(regions));
        CognitoSyncStorage cognitoSyncStorage = new CognitoSyncStorage(identityPoolId, amazonCognitoSyncClient, cognitoCachingCredentialsProvider);
        this.remote = cognitoSyncStorage;
        cognitoSyncStorage.setUserAgent(USER_AGENT);
        cognitoCachingCredentialsProvider.registerIdentityChangedListener(new IdentityChangedListener() { // from class: com.amazonaws.mobileconnectors.cognito.CognitoSyncManager.1
            @Override // com.amazonaws.auth.IdentityChangedListener
            public void identityChanged(String str, String str2) {
                if (str2 != null) {
                    CognitoSyncManager.LOGGER.info("identity change detected");
                    SQLiteLocalStorage sQLiteLocalStorage = CognitoSyncManager.local;
                    if (str == null) {
                        str = DatasetUtils.UNKNOWN_IDENTITY_ID;
                    }
                    sQLiteLocalStorage.changeIdentityId(str, str2);
                }
            }
        });
    }

    public CognitoSyncManager(Context context, CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider, AWSConfiguration aWSConfiguration) {
        this(context, getRegionFromConfig(aWSConfiguration), cognitoCachingCredentialsProvider, getClientConfigFromConfig(aWSConfiguration));
    }

    public CognitoSyncManager(Context context, Regions regions, CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider) {
        this(context, regions, cognitoCachingCredentialsProvider, new ClientConfiguration());
    }

    public CognitoSyncManager(Context context, Regions regions, CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(context, regions, cognitoCachingCredentialsProvider, new AmazonCognitoSyncClient(cognitoCachingCredentialsProvider, clientConfiguration));
    }
}
