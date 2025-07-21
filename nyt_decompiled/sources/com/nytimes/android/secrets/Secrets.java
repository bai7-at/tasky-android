package com.nytimes.android.secrets;

import defpackage.b22;
import defpackage.yj0;
import java.util.ArrayList;
import kotlin.collections.i;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class Secrets {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ Secrets[] $VALUES;
    private final byte[] value;
    public static final Secrets COMSCORE_CUSTOMER_C2 = new Secrets("COMSCORE_CUSTOMER_C2", 0, new byte[]{-40, 36, 16, -116, 49, 7, -42});
    public static final Secrets DATA_DOME_KEY = new Secrets("DATA_DOME_KEY", 1, new byte[]{-34, 82, 19, -116, 61, 7, -43, 80, 104, -19, -66, -72, -59, 39, 38, 57, -71, -64, -112, 89, 61, 43, -82, -111, 46, 85, 16, -104, -99, 10});
    public static final Secrets ZENDESK_PROD = new Secrets("ZENDESK_PROD", 2, new byte[]{-122, 123, 66, -48, 105, 82, -70, 101, 77, -76, -48, -18, -100, 12, 0, 98, -11, -84, -59, 10, 51, 44, -37, -18, 90, 47, 24, -23, -111, 43, 2, -82, 57, 74, 69, -28, 24, -26});
    public static final Secrets APPS_FLYER_KEY = new Secrets("APPS_FLYER_KEY", 3, new byte[]{-78, 83, 72, -42, 70, 14, -78, 96, 83, -25, -70, -41, -109, 14, 7, 117, -44, -78, -46, 38, 85, 94});
    public static final Secrets ITERATE_API_KEY_PROD = new Secrets("ITERATE_API_KEY_PROD", 4, new byte[]{-114, 109, 106, -47, 103, 112, -122, Byte.MAX_VALUE, 102, -74, -59, -60, -91, 31, 44, 61, -49, -102, -22, 27, 77, 118, -65, -30, 14, 84, 96, -21, -32, 37, 75, -112, 94, 109, 110, -19, 80, -76, 22, -5, 32, -123, 75, -43, 117, 34, 123, 82, -115, -58, -26, -66, -121, -67, -119, 114, -68, -80, 54, -36, -36, -14, 102, -58, -126, 89, 18, -24, 125, 121, -113, 67, 25, -122, -11, -56, -121, 40, 33, 77, -7, -66, -50, 37, 54, 87, -86, -114, 88, 94, 64, -86, -64, 47, 108, -114, 56, 103, 78, -69, 6, -97, 59, -32, 122, -86, 45, -83, 55, 54, 86, 54, -64, -8, -123, -4, -71, -67, -46, 46, -69, -69, 57, -42, -40, -115, 71, -54, -119, 78, 88, -47, 111, 78, -93, 90, 91, -86, -50, -56, -107, 1, 81, 62, -39, -124, -27, 39, 48, 126, -73, -69, 46, 102, 102, -70, -16, Byte.MAX_VALUE, 84});
    public static final Secrets GAMMA_PART = new Secrets("GAMMA_PART", 5, new byte[]{-37, 32, 16, -51, 115, 90, -41, 99});
    public static final Secrets DATADOG_STG = new Secrets("DATADOG_STG", 6, new byte[]{-101, 97, 66, -40, 99, 6, -43, 32, 79, -71, -69, -17, -62, 6, 81, 59, -80, -112, -64, 90, 49, 126, -40, -17, 85, 116, 75, -21, -54, 42, 9, -4, 107, 29, 69});
    public static final Secrets GCM_KEY = new Secrets("GCM_KEY", 7, new byte[]{-46, 34, 16, -114, 53, 15, -35, 32, 26, -19, -71, -76});
    public static final Secrets BETA_PART = new Secrets("BETA_PART", 8, new byte[]{-123, 97, 74, -115, 107, 89, -120, 101});
    public static final Secrets ZENDESK_STAGING = new Secrets("ZENDESK_STAGING", 9, new byte[]{-122, 123, 66, -48, 105, 82, -70, 101, 77, -76, -48, -18, -100, 12, 0, 98, -11, -84, -111, 13, 54, 125, -120, -26, 14, 34, 29, -19, -104, 120, 95, -84, 110, 72, 66, -26, 74, -25});
    public static final Secrets AKAMAI_SALT_1 = new Secrets("AKAMAI_SALT_1", 10, new byte[]{-115, 112, 24, -33, 103, 82, -44, 119, 25, -21, -72, -76, -56, 0, 4, 63});
    public static final Secrets AKAMAI_SALT_2 = new Secrets("AKAMAI_SALT_2", 11, new byte[]{-114, 112, 22, -116, 97, 83, -46, 36, 74, -18, -18, -66, -57, 81, 86, 56});
    public static final Secrets ALPHA_PART = new Secrets("ALPHA_PART", 12, new byte[]{-123, 44, 20, -35, 113, 93, -122, 37});
    public static final Secrets DATADOG_STG_APPLICATION_ID = new Secrets("DATADOG_STG_APPLICATION_ID", 13, new byte[]{-114, 117, 20, -118, 52, 5, -46, 38, 4, -70, -68, -66, -59, 72, 81, 111, -28, -106, -114, 10, 49, 40, -44, -6, 14, 38, 74, -65, -54, 44, 14, -86, 58, 74, 18, -73});
    public static final Secrets ITERATE_API_KEY_STAGING = new Secrets("ITERATE_API_KEY_STAGING", 14, new byte[]{-114, 109, 106, -47, 103, 112, -122, Byte.MAX_VALUE, 102, -74, -59, -60, -91, 31, 44, 61, -49, -102, -22, 27, 77, 118, -65, -30, 14, 84, 96, -21, -32, 37, 75, -112, 94, 109, 110, -19, 80, -76, 22, -5, 32, -123, 75, -43, 117, 34, 123, 82, -115, -58, -26, -66, -121, -67, -119, 114, -68, -80, 11, -41, -57, -16, 118, -5, -39, 77, 116, -17, 104, 121, -79, 126, 65, -112, -40, -60, -121, 40, 33, 77, -7, -66, -12, 45, 125, 66, -70, -103, 6, 94, 64, -86, -64, 47, 108, -114, 56, 103, 78, -69, 6, -97, 5, -32, 51, -86, 61, -113, 123, 54, 120, 12, -116, -8, -123, -4, -76, -79, -103, 92, -97, -71, 56, -43, -22, -5, 92, -61, -82, 78, 70, -12, Byte.MAX_VALUE, 92, -42, 113, 92, -108, -62, -24, -78, 1, 93, 86, -49, -89, -21, 62, 80, 94, -94, -92, 58, 68, Byte.MAX_VALUE, -70, -58, 59, 80});
    public static final Secrets APP_CENTER_KEY = new Secrets("APP_CENTER_KEY", 15, new byte[]{-37, 32, 70, -35, 61, 82, -46, 36, 4, -24, -18, -24, -64, 72, 93, 106, -28, -62, -114, 95, 54, 40, -119, -6, 15, 113, 26, -19, -49, 124, 13, -84, 61, 72, 69, -20});
    public static final Secrets DATADOG_PROD_APPLICATION_ID = new Secrets("DATADOG_PROD_APPLICATION_ID", 16, new byte[]{-35, 118, 70, -120, 99, 83, -46, 112, 4, -67, -21, -18, -61, 72, 81, 110, -71, -59, -114, 80, 98, 43, -40, -6, 15, 32, 24, -23, -112, 43, 88, -86, 58, 79, 20, -28});
    public static final Secrets DATADOG_PROD = new Secrets("DATADOG_PROD", 17, new byte[]{-101, 97, 66, -114, 50, 2, -35, 47, 28, -22, -65, -23, -64, 93, 80, 52, -29, -59, -106, 90, 102, 33, -40, -17, 91, 33, 26, -27, -49, 47, 14, -83, 59, 75, 65});
    public static final Secrets GCM_KEY_STAGING = new Secrets("GCM_KEY_STAGING", 18, new byte[]{-46, 34, 16, -114, 53, 15, -35, 32, 26, -19, -71, -76});
    public static final Secrets NEW_RELIC_KEY = new Secrets("NEW_RELIC_KEY", 19, new byte[]{-86, 85, 67, -120, 52, 84, -42, 119, 75, -22, -74, -18, -63, 85, 81, 63, -29, -61, -58, 95, 103, 43, -119, -32, 94, 47, 27, -71, -53, 40, 90, -15, 49, 28, 16, -79, 79, -23, 14, -125, 121, -125});

    private static final /* synthetic */ Secrets[] $values() {
        return new Secrets[]{COMSCORE_CUSTOMER_C2, DATA_DOME_KEY, ZENDESK_PROD, APPS_FLYER_KEY, ITERATE_API_KEY_PROD, GAMMA_PART, DATADOG_STG, GCM_KEY, BETA_PART, ZENDESK_STAGING, AKAMAI_SALT_1, AKAMAI_SALT_2, ALPHA_PART, DATADOG_STG_APPLICATION_ID, ITERATE_API_KEY_STAGING, APP_CENTER_KEY, DATADOG_PROD_APPLICATION_ID, DATADOG_PROD, GCM_KEY_STAGING, NEW_RELIC_KEY};
    }

    static {
        Secrets[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private Secrets(String str, int i, byte[] bArr) {
        this.value = bArr;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static Secrets valueOf(String str) {
        return (Secrets) Enum.valueOf(Secrets.class, str);
    }

    public static Secrets[] values() {
        return (Secrets[]) $VALUES.clone();
    }

    public final String decode() {
        byte[] bArr = this.value;
        ArrayList arrayList = new ArrayList(bArr.length);
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            arrayList.add(Byte.valueOf((byte) (salt()[i2 % salt().length].byteValue() ^ bArr[i])));
            i++;
            i2++;
        }
        return new String(i.R0(arrayList), yj0.b);
    }

    public final byte[] getValue() {
        return this.value;
    }

    public final Byte[] salt() {
        return new Byte[]{(byte) -21, (byte) 20, (byte) 32, (byte) -71, (byte) 5, (byte) 55, (byte) -27, (byte) 22, (byte) 41, (byte) -33, (byte) -113, (byte) -115, (byte) -16, (byte) 101, (byte) 101, (byte) 12, (byte) -127, (byte) -13, (byte) -93, (byte) 104, (byte) 4, (byte) 24, (byte) -19, (byte) -41, (byte) 109, (byte) 23, (byte) 41, (byte) -35, (byte) -87, (byte) 78, (byte) 59, (byte) -56, (byte) 8, (byte) 46, (byte) 36, (byte) -44, (byte) 126, (byte) -47, (byte) 111, (byte) -79, (byte) 74, (byte) -25, (byte) 121, (byte) -28, (byte) 2, (byte) 123, (byte) 44, (byte) 103, (byte) -72, (byte) -98, (byte) -44, (byte) -46, (byte) -20, (byte) -12, (byte) -29, (byte) 29, (byte) -43, (byte) -2, (byte) 97, (byte) -111, (byte) -85, (byte) -67, (byte) 50, (byte) -82};
    }
}
