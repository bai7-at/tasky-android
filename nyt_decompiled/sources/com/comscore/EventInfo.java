package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import java.util.Map;

/* loaded from: classes2.dex */
public class EventInfo extends CppJavaBinder {
    private long b;

    public EventInfo() {
        this.b = 0L;
        try {
            this.b = newCppInstanceNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    private static native void addIncludedPublisherNative(long j, String str);

    private static native void addLabelsNative(long j, Map<String, String> map);

    private static native void addPublisherLabelsNative(long j, String str, Map<String, String> map);

    private static native void destroyCppInstanceNative(long j);

    private static native long newCppInstanceNative();

    private static native void setLabelNative(long j, String str, String str2);

    private static native void setPublisherLabelNative(long j, String str, String str2, String str3);

    long a() {
        return this.b;
    }

    public void addIncludedPublisher(String str) {
        try {
            addIncludedPublisherNative(this.b, str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addLabels(Map<String, String> map) {
        try {
            addLabelsNative(this.b, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addPublisherLabels(String str, Map<String, String> map) {
        try {
            addPublisherLabelsNative(this.b, str, map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
        destroyCppInstanceNative(this.b);
    }

    public void setLabel(String str, String str2) {
        try {
            setLabelNative(this.b, str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPublisherLabel(String str, String str2, String str3) {
        try {
            setPublisherLabelNative(this.b, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
