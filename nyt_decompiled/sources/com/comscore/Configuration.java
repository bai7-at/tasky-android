package com.comscore;

import com.comscore.util.cpp.CppJavaBinder;
import com.comscore.util.setup.Setup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class Configuration extends CppJavaBinder {
    private List<PublisherConfiguration> b = new ArrayList();
    private List<PartnerConfiguration> c = new ArrayList();

    interface ConfigurationListener {
        void onConfigurationChanged(int i);
    }

    Configuration() {
    }

    private static native void addCrossPublisherUniqueDeviceIdChangeListenerNative(CrossPublisherUniqueDeviceIdChangeListener crossPublisherUniqueDeviceIdChangeListener);

    private static native void addIncludedPublisherNative(String str);

    private static native void addListenerNative(ConfigurationListener configurationListener);

    private static native void addPartnerConfigurationNative(long j);

    private static native void addPersistentLabelsNative(Map<String, String> map);

    private static native void addPublisherConfigurationNative(long j);

    private static native void addStartLabelsNative(Map<String, String> map);

    private static native void disableNative();

    private static native void disableTfcIntegrationNative();

    private static native void enableChildDirectedApplicationModeNative();

    private static native void enableImplementationValidationModeNative();

    private static native String getApplicationIdNative();

    private static native String getApplicationNameNative();

    private static native String getApplicationVersionNative();

    private static native String[] getLabelOrderNative();

    private static native long getPartnerConfigurationNative(String str);

    private static native long[] getPartnerConfigurationsNative();

    private static native long getPublisherConfigurationNative(String str);

    private static native long[] getPublisherConfigurationsNative();

    private static native boolean isEnabledNative();

    private static native boolean isInitializedNative();

    private static native void removeAllPersistentLabelsNative();

    private static native void removeAllStartLabelsNative();

    private static native void removeCrossPublisherUniqueDeviceIdChangeListenerNative(CrossPublisherUniqueDeviceIdChangeListener crossPublisherUniqueDeviceIdChangeListener);

    private static native void removeListenerNative(ConfigurationListener configurationListener);

    private static native void removePersistentLabelNative(String str);

    private static native void removeStartLabelNative(String str);

    private static native void setApplicationDataDirNative(String str);

    private static native void setApplicationIdNative(String str);

    private static native void setApplicationNameNative(String str);

    private static native void setApplicationVersionNative(String str);

    private static native void setCacheMaxBatchFilesNative(int i);

    private static native void setCacheMaxFlushesInARowNative(int i);

    private static native void setCacheMaxMeasurementsNative(int i);

    private static native void setCacheMeasurementExpiryNative(int i);

    private static native void setCacheMinutesToRetryNative(int i);

    private static native void setKeepAliveMeasurementEnabledNative(boolean z);

    private static native void setLabelOrderNative(String[] strArr);

    private static native void setLiveEndpointUrlNative(String str);

    private static native void setLiveTransmissionModeNative(int i);

    private static native void setOfflineCacheModeNative(int i);

    private static native void setOfflineFlushEndpointUrlNative(String str);

    private static native void setPersistentLabelNative(String str, String str2);

    private static native void setStartLabelNative(String str, String str2);

    private static native void setSystemClockJumpDetectionEnabledNative(boolean z);

    private static native void setSystemClockJumpDetectionIntervalNative(long j);

    private static native void setSystemClockJumpDetectionPrecisionNative(long j);

    private static native void setUsagePropertiesAutoUpdateIntervalNative(int i);

    private static native void setUsagePropertiesAutoUpdateModeNative(int i);

    String a() {
        try {
            return getApplicationIdNative();
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return "";
        }
    }

    public void addClient(ClientConfiguration clientConfiguration) {
        List list;
        CppJavaBinder cppJavaBinder;
        try {
            if (clientConfiguration instanceof PublisherConfiguration) {
                addPublisherConfigurationNative(clientConfiguration.d());
                list = this.b;
                cppJavaBinder = (PublisherConfiguration) clientConfiguration;
            } else {
                if (!(clientConfiguration instanceof PartnerConfiguration)) {
                    return;
                }
                addPartnerConfigurationNative(clientConfiguration.d());
                list = this.c;
                cppJavaBinder = (PartnerConfiguration) clientConfiguration;
            }
            list.add(cppJavaBinder);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addCrossPublisherUniqueDeviceIdChangeListener(CrossPublisherUniqueDeviceIdChangeListener crossPublisherUniqueDeviceIdChangeListener) {
        try {
            addCrossPublisherUniqueDeviceIdChangeListenerNative(crossPublisherUniqueDeviceIdChangeListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addIncludedPublisher(String str) {
        try {
            addIncludedPublisherNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addPersistentLabels(Map<String, String> map) {
        try {
            addPersistentLabelsNative(map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void addStartLabels(Map<String, String> map) {
        try {
            addStartLabelsNative(map);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    String b() {
        try {
            return getApplicationNameNative();
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return "";
        }
    }

    String c() {
        try {
            return getApplicationVersionNative();
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return "";
        }
    }

    boolean d() {
        try {
            return isInitializedNative();
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return false;
        }
    }

    @Override // com.comscore.util.cpp.CppJavaBinder
    protected void destroyCppObject() {
    }

    public void disable() {
        try {
            disableNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void disableTfcIntegration() {
        try {
            disableTfcIntegrationNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void enableChildDirectedApplicationMode() {
        try {
            enableChildDirectedApplicationModeNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void enableImplementationValidationMode() {
        try {
            enableImplementationValidationModeNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public String[] getLabelOrder() {
        try {
            return getLabelOrderNative();
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return null;
        }
    }

    public PartnerConfiguration getPartnerConfiguration(String str) {
        try {
            long partnerConfigurationNative = getPartnerConfigurationNative(str);
            if (partnerConfigurationNative != 0) {
                return new PartnerConfiguration(partnerConfigurationNative);
            }
            return null;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public List<PartnerConfiguration> getPartnerConfigurations() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            return this.c;
        }
        try {
            long[] partnerConfigurationsNative = getPartnerConfigurationsNative();
            ArrayList arrayList = new ArrayList(partnerConfigurationsNative.length);
            for (long j : partnerConfigurationsNative) {
                arrayList.add(new PartnerConfiguration(j));
            }
            return arrayList;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return this.c;
        }
    }

    public PublisherConfiguration getPublisherConfiguration(String str) {
        try {
            long publisherConfigurationNative = getPublisherConfigurationNative(str);
            if (publisherConfigurationNative != 0) {
                return new PublisherConfiguration(publisherConfigurationNative);
            }
            return null;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return null;
        }
    }

    public List<PublisherConfiguration> getPublisherConfigurations() {
        if (!Setup.isNativeLibrarySuccessfullyLoaded()) {
            return this.b;
        }
        try {
            long[] publisherConfigurationsNative = getPublisherConfigurationsNative();
            ArrayList arrayList = new ArrayList(publisherConfigurationsNative.length);
            for (long j : publisherConfigurationsNative) {
                arrayList.add(new PublisherConfiguration(j));
            }
            return arrayList;
        } catch (UnsatisfiedLinkError e) {
            printException(e);
            return this.b;
        }
    }

    public boolean isEnabled() {
        try {
            return isEnabledNative();
        } catch (UnsatisfiedLinkError e) {
            this.printException(e);
            return false;
        }
    }

    public void removeAllPersistentLabels() {
        try {
            removeAllPersistentLabelsNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeAllStartLabels() {
        try {
            removeAllStartLabelsNative();
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeCrossPublisherUniqueDeviceIdChangeListener(CrossPublisherUniqueDeviceIdChangeListener crossPublisherUniqueDeviceIdChangeListener) {
        try {
            removeCrossPublisherUniqueDeviceIdChangeListenerNative(crossPublisherUniqueDeviceIdChangeListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removePersistentLabel(String str) {
        try {
            removePersistentLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void removeStartLabel(String str) {
        try {
            removeStartLabelNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setApplicationId(String str) {
        try {
            setApplicationIdNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setApplicationName(String str) {
        try {
            setApplicationNameNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setApplicationVersion(String str) {
        try {
            setApplicationVersionNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setCacheMaxBatchFiles(int i) {
        if (i > 0) {
            try {
                setCacheMaxBatchFilesNative(i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setCacheMaxFlushesInARow(int i) {
        if (i > 0) {
            try {
                setCacheMaxFlushesInARowNative(i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setCacheMaxMeasurements(int i) {
        if (i > 0) {
            try {
                setCacheMaxMeasurementsNative(i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setCacheMeasurementExpiry(int i) {
        if (i > 0) {
            try {
                setCacheMeasurementExpiryNative(i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setCacheMinutesToRetry(int i) {
        if (i > 0) {
            try {
                setCacheMinutesToRetryNative(i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setKeepAliveMeasurementEnabled(boolean z) {
        try {
            setKeepAliveMeasurementEnabledNative(z);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLabelOrder(String[] strArr) {
        try {
            setLabelOrderNative(strArr);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLiveEndpointUrl(String str) {
        try {
            setLiveEndpointUrlNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setLiveTransmissionMode(int i) {
        if (i < 20001 || i > 20003) {
            return;
        }
        try {
            setLiveTransmissionModeNative(i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setOfflineCacheMode(int i) {
        if (i < 20101 || i > 20104) {
            return;
        }
        try {
            setOfflineCacheModeNative(i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setOfflineFlushEndpointUrl(String str) {
        try {
            setOfflineFlushEndpointUrlNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setPersistentLabel(String str, String str2) {
        try {
            setPersistentLabelNative(str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setStartLabel(String str, String str2) {
        try {
            setStartLabelNative(str, str2);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setSystemClockJumpDetectionInterval(long j) {
        try {
            setSystemClockJumpDetectionIntervalNative(j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setSystemClockJumpDetectionPrecision(long j) {
        try {
            setSystemClockJumpDetectionPrecisionNative(j);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void setUsagePropertiesAutoUpdateInterval(int i) {
        if (i > 0) {
            try {
                setUsagePropertiesAutoUpdateIntervalNative(i);
            } catch (UnsatisfiedLinkError e) {
                printException(e);
            }
        }
    }

    public void setUsagePropertiesAutoUpdateMode(int i) {
        if (i > 20502 || i < 20500) {
            return;
        }
        try {
            setUsagePropertiesAutoUpdateModeNative(i);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    public void systemClockJumpDetection(boolean z) {
        try {
            setSystemClockJumpDetectionEnabledNative(z);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    void a(ConfigurationListener configurationListener) {
        try {
            addListenerNative(configurationListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    void b(ConfigurationListener configurationListener) {
        try {
            removeListenerNative(configurationListener);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }

    void a(String str) {
        try {
            setApplicationDataDirNative(str);
        } catch (UnsatisfiedLinkError e) {
            printException(e);
        }
    }
}
