package io.embrace.android.embracesdk.samples;

/* loaded from: classes5.dex */
public final class EmbraceCrashSamplesNdkDelegateImpl implements CrashSamplesNdkDelegate {
    @Override // io.embrace.android.embracesdk.samples.CrashSamplesNdkDelegate
    public native void sigAbort();

    @Override // io.embrace.android.embracesdk.samples.CrashSamplesNdkDelegate
    public native void sigIllegalInstruction();

    @Override // io.embrace.android.embracesdk.samples.CrashSamplesNdkDelegate
    public native void sigfpe();

    @Override // io.embrace.android.embracesdk.samples.CrashSamplesNdkDelegate
    public native void sigsegv();

    @Override // io.embrace.android.embracesdk.samples.CrashSamplesNdkDelegate
    public native void throwException();
}
