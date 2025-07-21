package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class NativeThreadAnrStackframe {
    private final String pc;
    private final Integer result;
    private final String soLoadAddr;
    private final String soPath;

    public NativeThreadAnrStackframe(@bt3(name = "pc") String str, @bt3(name = "l") String str2, @bt3(name = "p") String str3, @bt3(name = "r") Integer num) {
        this.pc = str;
        this.soLoadAddr = str2;
        this.soPath = str3;
        this.result = num;
    }

    public static /* synthetic */ NativeThreadAnrStackframe copy$default(NativeThreadAnrStackframe nativeThreadAnrStackframe, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeThreadAnrStackframe.pc;
        }
        if ((i & 2) != 0) {
            str2 = nativeThreadAnrStackframe.soLoadAddr;
        }
        if ((i & 4) != 0) {
            str3 = nativeThreadAnrStackframe.soPath;
        }
        if ((i & 8) != 0) {
            num = nativeThreadAnrStackframe.result;
        }
        return nativeThreadAnrStackframe.copy(str, str2, str3, num);
    }

    public final String component1$embrace_android_sdk_release() {
        return this.pc;
    }

    public final String component2$embrace_android_sdk_release() {
        return this.soLoadAddr;
    }

    public final String component3$embrace_android_sdk_release() {
        return this.soPath;
    }

    public final Integer component4$embrace_android_sdk_release() {
        return this.result;
    }

    public final NativeThreadAnrStackframe copy(@bt3(name = "pc") String str, @bt3(name = "l") String str2, @bt3(name = "p") String str3, @bt3(name = "r") Integer num) {
        return new NativeThreadAnrStackframe(str, str2, str3, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NativeThreadAnrStackframe)) {
            return false;
        }
        NativeThreadAnrStackframe nativeThreadAnrStackframe = (NativeThreadAnrStackframe) obj;
        return zq3.c(this.pc, nativeThreadAnrStackframe.pc) && zq3.c(this.soLoadAddr, nativeThreadAnrStackframe.soLoadAddr) && zq3.c(this.soPath, nativeThreadAnrStackframe.soPath) && zq3.c(this.result, nativeThreadAnrStackframe.result);
    }

    public final String getPc$embrace_android_sdk_release() {
        return this.pc;
    }

    public final Integer getResult$embrace_android_sdk_release() {
        return this.result;
    }

    public final String getSoLoadAddr$embrace_android_sdk_release() {
        return this.soLoadAddr;
    }

    public final String getSoPath$embrace_android_sdk_release() {
        return this.soPath;
    }

    public int hashCode() {
        String str = this.pc;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.soLoadAddr;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.soPath;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.result;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NativeThreadAnrStackframe(pc=" + this.pc + ", soLoadAddr=" + this.soLoadAddr + ", soPath=" + this.soPath + ", result=" + this.result + ")";
    }
}
