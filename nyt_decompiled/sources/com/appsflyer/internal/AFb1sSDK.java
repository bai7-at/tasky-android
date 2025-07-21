package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.appsflyer.AFLogger;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFb1sSDK {
    private static int AFInAppEventType = 1;
    private static int valueOf;
    private static char[] values = {'a', 'f', '_', 't', 'i', 'm', 'e', 's', 'p'};
    private static char AFInAppEventParameterName = 3;

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        valueOf = (AFInAppEventType + 117) % 128;
        int i = 0;
        while (i < length) {
            sb.append(Integer.toString((bArr[i] & 255) + JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 16).substring(1));
            i++;
            valueOf = (AFInAppEventType + 51) % 128;
        }
        return sb.toString();
    }

    public static String AFInAppEventType(String str) {
        valueOf = (AFInAppEventType + 21) % 128;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes(Constants.DEFAULT_ENCODING));
            String values2 = values(messageDigest.digest());
            AFInAppEventType = (valueOf + 49) % 128;
            return values2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.afErrorLog(sb.toString(), e);
            return null;
        }
    }

    public static String valueOf(String str) {
        int i = AFInAppEventType + 79;
        valueOf = i % 128;
        String str2 = null;
        try {
            if (i % 2 != 0) {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.reset();
                messageDigest.update(str.getBytes(Constants.DEFAULT_ENCODING));
                str2 = values(messageDigest.digest());
                int i2 = 85 / 0;
            } else {
                MessageDigest messageDigest2 = MessageDigest.getInstance("MD5");
                messageDigest2.reset();
                messageDigest2.update(str.getBytes(Constants.DEFAULT_ENCODING));
                str2 = values(messageDigest2.digest());
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to MD5");
            AFLogger.afErrorLog(sb.toString(), e);
        }
        return str2;
    }

    public static String values(String str) {
        String str2;
        AFInAppEventType = (valueOf + 87) % 128;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            str2 = AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA-256");
            AFLogger.afErrorLog(sb.toString(), e);
            str2 = null;
        }
        valueOf = (AFInAppEventType + 17) % 128;
        return str2;
    }

    public static boolean AFInAppEventParameterName(Map<String, Object> map, String[] strArr, AFb1dSDK aFb1dSDK) throws IllegalStateException {
        int i = (AFInAppEventType + 103) % 128;
        valueOf = i;
        if (map != null) {
            AFInAppEventType = (i + 95) % 128;
            if (!map.isEmpty()) {
                for (String str : strArr) {
                    if (!map.containsKey(str)) {
                        int i2 = AFInAppEventType + 53;
                        valueOf = i2 % 128;
                        if (i2 % 2 != 0) {
                            int i3 = 34 / 0;
                        }
                        return false;
                    }
                }
                String str2 = (String) map.remove("sig");
                if (str2 == null) {
                    AFInAppEventType = (valueOf + 43) % 128;
                    return false;
                }
                String AFInAppEventType2 = AFb1dSDK.AFInAppEventType();
                StringBuilder sb = new StringBuilder();
                sb.append(new JSONObject(map));
                sb.append(AFInAppEventType2);
                return AFInAppEventType(sb.toString(), AFb1rSDK.AFInAppEventParameterName(new WeakReference(aFb1dSDK.AFInAppEventType.AFKeystoreWrapper))).equals(str2);
            }
        }
        return false;
    }

    private static String values(byte[] bArr) {
        Formatter formatter = new Formatter();
        for (byte b : bArr) {
            AFInAppEventType = (valueOf + 9) % 128;
            formatter.format("%02x", Byte.valueOf(b));
        }
        String obj = formatter.toString();
        formatter.close();
        int i = AFInAppEventType + 59;
        valueOf = i % 128;
        if (i % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public static String AFInAppEventType(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(mac.doFinal(str.getBytes())).toLowerCase();
            int i = AFInAppEventType + 3;
            valueOf = i % 128;
            if (i % 2 != 0) {
                int i2 = 37 / 0;
            }
            return lowerCase;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static String AFInAppEventType(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        String str2 = (String) map.get(values(12 - Color.blue(0), (byte) (17 - (Process.myPid() >> 22)), "\u0001\u0002\u0000\u0005\u0005\u0003\u0007\b\u0006\u0003\b\u0002").intern());
        String str3 = (String) map.get("uid");
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 7));
        sb.append(str3.substring(0, 7));
        sb.append(str2.substring(str2.length() - 7));
        String AFInAppEventType2 = AFInAppEventType(sb.toString());
        AFInAppEventType = (valueOf + 65) % 128;
        return AFInAppEventType2;
    }

    private static String values(int i, byte b, String str) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (AFf1ySDK.afRDLog) {
            try {
                char[] cArr3 = values;
                char c = AFInAppEventParameterName;
                char[] cArr4 = new char[i];
                if (i % 2 != 0) {
                    i--;
                    cArr4[i] = (char) (cArr2[i] - b);
                }
                if (i > 1) {
                    AFf1ySDK.AFInAppEventType = 0;
                    while (true) {
                        int i2 = AFf1ySDK.AFInAppEventType;
                        if (i2 >= i) {
                            break;
                        }
                        AFf1ySDK.valueOf = cArr2[i2];
                        AFf1ySDK.values = cArr2[AFf1ySDK.AFInAppEventType + 1];
                        if (AFf1ySDK.valueOf == AFf1ySDK.values) {
                            cArr4[AFf1ySDK.AFInAppEventType] = (char) (AFf1ySDK.valueOf - b);
                            cArr4[AFf1ySDK.AFInAppEventType + 1] = (char) (AFf1ySDK.values - b);
                        } else {
                            AFf1ySDK.AFKeystoreWrapper = AFf1ySDK.valueOf / c;
                            AFf1ySDK.AFLogger = AFf1ySDK.valueOf % c;
                            AFf1ySDK.AFInAppEventParameterName = AFf1ySDK.values / c;
                            AFf1ySDK.afInfoLog = AFf1ySDK.values % c;
                            if (AFf1ySDK.AFLogger == AFf1ySDK.afInfoLog) {
                                AFf1ySDK.AFKeystoreWrapper = ((AFf1ySDK.AFKeystoreWrapper + c) - 1) % c;
                                AFf1ySDK.AFInAppEventParameterName = ((AFf1ySDK.AFInAppEventParameterName + c) - 1) % c;
                                int i3 = (AFf1ySDK.AFKeystoreWrapper * c) + AFf1ySDK.AFLogger;
                                int i4 = (AFf1ySDK.AFInAppEventParameterName * c) + AFf1ySDK.afInfoLog;
                                int i5 = AFf1ySDK.AFInAppEventType;
                                cArr4[i5] = cArr3[i3];
                                cArr4[i5 + 1] = cArr3[i4];
                            } else if (AFf1ySDK.AFKeystoreWrapper == AFf1ySDK.AFInAppEventParameterName) {
                                AFf1ySDK.AFLogger = ((AFf1ySDK.AFLogger + c) - 1) % c;
                                AFf1ySDK.afInfoLog = ((AFf1ySDK.afInfoLog + c) - 1) % c;
                                int i6 = (AFf1ySDK.AFKeystoreWrapper * c) + AFf1ySDK.AFLogger;
                                int i7 = (AFf1ySDK.AFInAppEventParameterName * c) + AFf1ySDK.afInfoLog;
                                int i8 = AFf1ySDK.AFInAppEventType;
                                cArr4[i8] = cArr3[i6];
                                cArr4[i8 + 1] = cArr3[i7];
                            } else {
                                int i9 = (AFf1ySDK.AFKeystoreWrapper * c) + AFf1ySDK.afInfoLog;
                                int i10 = (AFf1ySDK.AFInAppEventParameterName * c) + AFf1ySDK.AFLogger;
                                int i11 = AFf1ySDK.AFInAppEventType;
                                cArr4[i11] = cArr3[i9];
                                cArr4[i11 + 1] = cArr3[i10];
                            }
                        }
                        AFf1ySDK.AFInAppEventType += 2;
                    }
                }
                str2 = new String(cArr4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String AFInAppEventParameterName(Map<String, Object> map) {
        String str = (String) map.get("appsflyerKey");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(map.get(values(TextUtils.indexOf("", "", 0, 0) + 12, (byte) (17 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), "\u0001\u0002\u0000\u0005\u0005\u0003\u0007\b\u0006\u0003\b\u0002").intern()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(map.get("uid"));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(map.get("installDate"));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(map.get("counter"));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(map.get("iaecounter"));
        String AFInAppEventType2 = AFInAppEventType(valueOf(sb5.toString()));
        AFInAppEventType = (valueOf + 69) % 128;
        return AFInAppEventType2;
    }

    public static String AFInAppEventParameterName(String... strArr) {
        int i = AFInAppEventType + 7;
        valueOf = i % 128;
        if (i % 2 != 0) {
            TextUtils.join("\u2063", strArr);
            throw null;
        }
        String join = TextUtils.join("\u2063", strArr);
        int i2 = valueOf + 77;
        AFInAppEventType = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 99 / 0;
        }
        return join;
    }
}
