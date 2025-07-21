package com.nytimes.android.abra.allocator;

import com.nytimes.android.abra.utilities.ParamProviderKt;
import defpackage.zq3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class AllocationResult {
    private final Map<String, String> input;
    private final String integration;
    private final int rulesVersion;

    public static final class Error extends AllocationResult {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(int i, String str, Map<String, String> map) {
            super(i, str, map, null);
            zq3.h(str, ParamProviderKt.PARAM_INTEGRATION);
            zq3.h(map, "input");
        }
    }

    public static final class Success extends AllocationResult {
        private final String variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(String str, int i, String str2, Map<String, String> map) {
            super(i, str2, map, null);
            zq3.h(str, "variant");
            zq3.h(str2, ParamProviderKt.PARAM_INTEGRATION);
            zq3.h(map, "input");
            this.variant = str;
        }

        public final String getVariant() {
            return this.variant;
        }
    }

    public static final class SuccessNull extends AllocationResult {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuccessNull(int i, String str, Map<String, String> map) {
            super(i, str, map, null);
            zq3.h(str, ParamProviderKt.PARAM_INTEGRATION);
            zq3.h(map, "input");
        }
    }

    public /* synthetic */ AllocationResult(int i, String str, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, map);
    }

    public final Map<String, String> getInput() {
        return this.input;
    }

    public final String getIntegration() {
        return this.integration;
    }

    public final int getRulesVersion() {
        return this.rulesVersion;
    }

    private AllocationResult(int i, String str, Map<String, String> map) {
        this.rulesVersion = i;
        this.integration = str;
        this.input = map;
    }
}
