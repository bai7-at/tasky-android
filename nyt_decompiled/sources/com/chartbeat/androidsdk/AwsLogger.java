package com.chartbeat.androidsdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferListener;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3Client;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class AwsLogger {
    private static AwsLogger single_instance;
    private String DEFAULT_BUCKET = "chartbeat-sdk";
    private String IDENTITYPOOLID = "us-east-1:89109093-5e56-4960-928b-5edc0e63a985";
    private Regions IDENTITY_POOL_REGIONS;
    private Regions S3__REGIONS;
    private String accountId;
    private String cacheDirectory;
    private String codename;
    private String domain;
    private String hardware;
    private String incremental;
    private String manufacturer;
    private String model;
    private String os_version;
    private String release;
    private String sdk_int;
    private String sdk_version_code;
    private String sdk_version_name;
    private String security_patch;
    private TransferUtility transferUtility;
    private String version_code;
    private String version_name;

    private AwsLogger(Context context, String str, String str2) {
        Regions regions = Regions.US_EAST_1;
        this.S3__REGIONS = regions;
        this.IDENTITY_POOL_REGIONS = regions;
        this.cacheDirectory = "";
        this.version_code = "";
        this.version_name = "";
        this.sdk_version_code = "";
        this.sdk_version_name = "";
        this.os_version = "";
        this.manufacturer = "";
        this.model = "";
        this.hardware = "";
        this.codename = "";
        this.sdk_int = "";
        this.incremental = "";
        this.release = "";
        this.security_patch = "";
        this.accountId = str;
        this.domain = str2;
        AmazonS3Client amazonS3Client = new AmazonS3Client(new CognitoCachingCredentialsProvider(context, this.IDENTITYPOOLID, this.IDENTITY_POOL_REGIONS));
        amazonS3Client.setRegion(Region.getRegion(this.S3__REGIONS));
        this.transferUtility = TransferUtility.builder().context(context).s3Client(amazonS3Client).defaultBucket(this.DEFAULT_BUCKET).build();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str3 = packageInfo.versionName;
            setVersion_code(packageInfo.versionCode + "");
            setVersion_name(str3);
        } catch (Exception unused) {
        }
        setSdk_Version_code("12");
        setSdk_Version_name(BuildConfig.VERSION_NAME);
        setOs_version(System.getProperty("os.version"));
        setManufacturer(Build.MANUFACTURER);
        setModel(Build.MODEL);
        setHardware(Build.HARDWARE);
        setSdk_int(Build.VERSION.SDK_INT + "");
        setCodename(Build.VERSION.CODENAME);
        setIncremental(Build.VERSION.INCREMENTAL);
        setRelease(Build.VERSION.RELEASE);
        setSecurity_patch(Build.VERSION.SECURITY_PATCH);
        setCacheDirectory(context.getCacheDir().getPath());
    }

    private String getFileName() {
        if (this.domain == "") {
            this.domain = "no_domain";
        }
        if (this.accountId == "") {
            this.accountId = "no_accountId";
        }
        String str = "andoroid_sdk/" + this.domain + "/" + this.accountId + "/exceptions/";
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return str + calendar.get(1) + "/" + (calendar.get(2) + 1) + "/" + calendar.get(5) + "/" + calendar.get(11) + "/" + (calendar.get(12) >= 30 ? "30" : "00") + "/" + System.currentTimeMillis() + QueryKeys.END_MARKER + this.accountId + ".json";
    }

    public static AwsLogger getInstance() {
        AwsLogger awsLogger = single_instance;
        if (awsLogger != null) {
            return awsLogger;
        }
        throw new NullPointerException("AwsLogger not initialized.  Call initInstance");
    }

    private File getLogFile(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        Date date = new Date();
        HashMap hashMap = new HashMap();
        hashMap.put("APP_VERSION_CODE", this.version_code);
        hashMap.put("APP_VERSION_NAME", this.version_name);
        hashMap.put("SDK_VERSION_CODE", this.sdk_version_code);
        hashMap.put("SDK_VERSION_NAME", this.sdk_version_name);
        hashMap.put("os.version", this.os_version);
        hashMap.put("MANUFACTURER", this.manufacturer);
        hashMap.put("MODEL", this.model);
        hashMap.put("HARDWARE", this.hardware);
        hashMap.put("SDK_INT", this.sdk_int);
        hashMap.put("CODENAME", this.codename);
        hashMap.put("INCREMENTAL", this.incremental);
        hashMap.put("RELEASE", this.release);
        hashMap.put("SECURITY_PATCH", this.security_patch);
        hashMap.put("EXCEPTION DATE", date);
        hashMap.put("EXCEPTION", stringWriter2);
        String jSONObject = new JSONObject(hashMap).toString();
        File file = new File(this.cacheDirectory + System.currentTimeMillis() + "_tmp.json");
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(jSONObject);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    public static AwsLogger initInstance(Context context, String str, String str2) {
        if (single_instance == null) {
            single_instance = new AwsLogger(context, str, str2);
        }
        return single_instance;
    }

    public String getCacheDirectory() {
        return this.cacheDirectory;
    }

    public void logError(Exception exc) {
        try {
            final File logFile = getLogFile(exc);
            this.transferUtility.upload(this.DEFAULT_BUCKET, getFileName(), logFile).setTransferListener(new TransferListener() { // from class: com.chartbeat.androidsdk.AwsLogger.1
                @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
                public void onError(int i, Exception exc2) {
                    exc2.printStackTrace();
                }

                @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
                public void onProgressChanged(int i, long j, long j2) {
                }

                @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
                public void onStateChanged(int i, TransferState transferState) {
                    if (TransferState.COMPLETED == transferState) {
                        Logger.d("AWS Logger", "Upload to S3 completed");
                        logFile.delete();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCacheDirectory(String str) {
        this.cacheDirectory = str;
    }

    public void setCodename(String str) {
        this.codename = str;
    }

    public void setHardware(String str) {
        this.hardware = str;
    }

    public void setIncremental(String str) {
        this.incremental = str;
    }

    public void setManufacturer(String str) {
        this.manufacturer = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setOs_version(String str) {
        this.os_version = str;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSdk_Version_code(String str) {
        this.sdk_version_code = str;
    }

    public void setSdk_Version_name(String str) {
        this.sdk_version_name = str;
    }

    public void setSdk_int(String str) {
        this.sdk_int = str;
    }

    public void setSecurity_patch(String str) {
        this.security_patch = str;
    }

    public void setVersion_code(String str) {
        this.version_code = str;
    }

    public void setVersion_name(String str) {
        this.version_name = str;
    }
}
