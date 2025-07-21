package io.embrace.android.embracesdk.samples;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.File;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

/* loaded from: classes5.dex */
final /* synthetic */ class AutomaticVerificationChecker$isVerificationCorrect$1 extends MutablePropertyReference0Impl {
    AutomaticVerificationChecker$isVerificationCorrect$1(AutomaticVerificationChecker automaticVerificationChecker) {
        super(automaticVerificationChecker, AutomaticVerificationChecker.class, TransferTable.COLUMN_FILE, "getFile()Ljava/io/File;", 0);
    }

    @Override // defpackage.jv3
    public Object get() {
        return AutomaticVerificationChecker.access$getFile$p((AutomaticVerificationChecker) this.receiver);
    }

    public void set(Object obj) {
        ((AutomaticVerificationChecker) this.receiver).file = (File) obj;
    }
}
