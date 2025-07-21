package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeSymbols {
    private static final String ARCH_X86_64_NAME = "x86_64";
    private static final String ARCH_X86_NAME = "x86";
    private static final String ARM_64_NAME = "arm64-v8a";
    private static final String ARM_ABI_V7_NAME = "armeabi-v7a";
    public static final Companion Companion = new Companion(null);
    private final Map<String, Map<String, String>> symbols;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeSymbols(@bt3(name = "symbols") Map<String, ? extends Map<String, String>> map) {
        zq3.h(map, "symbols");
        this.symbols = map;
    }

    public final Map<String, String> getSymbolByArchitecture(String str) {
        if (str == null) {
            return new HashMap();
        }
        Map<String, String> map = this.symbols.containsKey(str) ? this.symbols.get(str) : zq3.c(str, ARM_64_NAME) ? this.symbols.get(ARM_ABI_V7_NAME) : zq3.c(str, ARCH_X86_64_NAME) ? this.symbols.get(ARCH_X86_NAME) : null;
        return map == null ? new HashMap() : map;
    }

    public final Map<String, Map<String, String>> getSymbols$embrace_android_sdk_release() {
        return this.symbols;
    }
}
