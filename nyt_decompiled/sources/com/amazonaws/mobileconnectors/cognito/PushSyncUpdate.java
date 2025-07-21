package com.amazonaws.mobileconnectors.cognito;

import android.content.Intent;
import android.os.Bundle;
import com.amazonaws.services.cognitosync.model.InvalidParameterException;

@Deprecated
/* loaded from: classes.dex */
public class PushSyncUpdate {
    private final String datasetName;
    private final String identityId;
    private final String identityPoolId;
    private final String source;
    private final long syncCount;

    PushSyncUpdate(Intent intent) {
        if (!isPushSyncUpdate(intent)) {
            throw new InvalidParameterException("Invalid bundle, only messages from Cognito for push sync are valid");
        }
        Bundle extras = intent.getExtras();
        this.source = extras.getString("source");
        this.identityPoolId = extras.getString("identityPoolId");
        this.identityId = extras.getString("identityId");
        this.datasetName = extras.getString("datasetName");
        this.syncCount = Long.parseLong(extras.getString("syncCount"));
    }

    public static boolean isPushSyncUpdate(Intent intent) {
        return intent != null && intent.hasExtra("source") && intent.hasExtra("identityPoolId") && intent.hasExtra("identityId") && intent.hasExtra("datasetName") && intent.hasExtra("syncCount");
    }

    public String getDatasetName() {
        return this.datasetName;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public String getSource() {
        return this.source;
    }

    public long getSyncCount() {
        return this.syncCount;
    }
}
