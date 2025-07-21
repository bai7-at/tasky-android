package com.nytimes.android.internal.graphql.interceptor;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class OldResponseException extends IOException {
    public OldResponseException(String str, String str2, String str3) {
        super("Response Last-Modified=" + str3 + " is older than the If-Modified-Since=" + str2 + " of the most recent request for operation=" + str + InstructionFileId.DOT);
    }
}
