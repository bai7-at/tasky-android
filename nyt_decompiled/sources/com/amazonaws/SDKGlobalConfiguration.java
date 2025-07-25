package com.amazonaws;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class SDKGlobalConfiguration {
    public static final String ACCESS_KEY_ENV_VAR = "AWS_ACCESS_KEY_ID";
    public static final String ACCESS_KEY_SYSTEM_PROPERTY = "aws.accessKeyId";
    public static final String ALTERNATE_ACCESS_KEY_ENV_VAR = "AWS_ACCESS_KEY";
    public static final String ALTERNATE_SECRET_KEY_ENV_VAR = "AWS_SECRET_ACCESS_KEY";
    public static final String AWS_SESSION_TOKEN_ENV_VAR = "AWS_SESSION_TOKEN";
    public static final String DEFAULT_METRICS_SYSTEM_PROPERTY = "com.amazonaws.sdk.enableDefaultMetrics";
    public static final String DEFAULT_S3_STREAM_BUFFER_SIZE = "com.amazonaws.sdk.s3.defaultStreamBufferSize";
    public static final String DISABLE_CERT_CHECKING_SYSTEM_PROPERTY = "com.amazonaws.sdk.disableCertChecking";
    public static final String DISABLE_REMOTE_REGIONS_FILE_SYSTEM_PROPERTY = "com.amazonaws.regions.RegionUtils.disableRemote";
    public static final String EC2_METADATA_SERVICE_OVERRIDE_SYSTEM_PROPERTY = "com.amazonaws.sdk.ec2MetadataServiceEndpointOverride";
    private static final AtomicLong GLOBAL_TIME_OFFSET = new AtomicLong(0);

    @Deprecated
    public static final String PROFILING_SYSTEM_PROPERTY = "com.amazonaws.sdk.enableRuntimeProfiling";

    @Deprecated
    public static final String REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY = "com.amazonaws.regions.RegionUtils.fileOverride";
    public static final String SECRET_KEY_ENV_VAR = "AWS_SECRET_KEY";
    public static final String SECRET_KEY_SYSTEM_PROPERTY = "aws.secretKey";

    public static long getGlobalTimeOffset() {
        return GLOBAL_TIME_OFFSET.get();
    }

    public static void setGlobalTimeOffset(long j) {
        GLOBAL_TIME_OFFSET.set(j);
    }

    @Deprecated
    public static void setGlobalTimeOffset(int i) {
        setGlobalTimeOffset(i);
    }
}
