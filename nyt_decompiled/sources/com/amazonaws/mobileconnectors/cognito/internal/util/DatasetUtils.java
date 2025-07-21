package com.amazonaws.mobileconnectors.cognito.internal.util;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.cognito.Record;
import java.util.regex.Pattern;

@Deprecated
/* loaded from: classes.dex */
public final class DatasetUtils {
    public static final Pattern DATASET_NAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_.:-]{1,128}$");
    public static final String UNKNOWN_IDENTITY_ID = "unknown";

    public static long computeRecordSize(Record record) {
        if (record == null) {
            return 0L;
        }
        return StringUtils.utf8ByteLength(record.getKey()) + StringUtils.utf8ByteLength(record.getValue());
    }

    public static String getIdentityId(CognitoCachingCredentialsProvider cognitoCachingCredentialsProvider) {
        return cognitoCachingCredentialsProvider.getCachedIdentityId() == null ? UNKNOWN_IDENTITY_ID : cognitoCachingCredentialsProvider.getCachedIdentityId();
    }

    public static String validateDatasetName(String str) {
        if (DATASET_NAME_PATTERN.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException("Invalid dataset name");
    }

    public static String validateRecordKey(String str) {
        if (StringUtils.isEmpty(str) || StringUtils.utf8ByteLength(str) > 128) {
            throw new IllegalArgumentException("Invalid record key");
        }
        return str;
    }
}
