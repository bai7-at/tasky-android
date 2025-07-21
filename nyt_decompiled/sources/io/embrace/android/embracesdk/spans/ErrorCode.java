package io.embrace.android.embracesdk.spans;

import io.embrace.android.embracesdk.annotation.BetaApi;
import io.embrace.android.embracesdk.arch.schema.ErrorCodeAttribute;
import kotlin.NoWhenBranchMatchedException;

@BetaApi
/* loaded from: classes5.dex */
public enum ErrorCode {
    FAILURE,
    USER_ABANDON,
    UNKNOWN;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ErrorCode.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ErrorCode.FAILURE.ordinal()] = 1;
            iArr[ErrorCode.USER_ABANDON.ordinal()] = 2;
            iArr[ErrorCode.UNKNOWN.ordinal()] = 3;
        }
    }

    public final ErrorCodeAttribute fromErrorCode$embrace_android_sdk_release() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ErrorCodeAttribute.Failure.INSTANCE;
        }
        if (i == 2) {
            return ErrorCodeAttribute.UserAbandon.INSTANCE;
        }
        if (i == 3) {
            return ErrorCodeAttribute.Unknown.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
