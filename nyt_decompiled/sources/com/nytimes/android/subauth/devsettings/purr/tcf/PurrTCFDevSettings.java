package com.nytimes.android.subauth.devsettings.purr.tcf;

import android.content.Context;
import androidx.compose.ui.text.a;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingLazySummaryItem;
import com.nytimes.android.subauth.core.purr.directive.AgentTCFInfo;
import com.nytimes.android.subauth.core.purr.directive.TCFInfo;
import com.nytimes.android.subauth.devsettings.purr.tcf.PurrTCFDevSettings;
import defpackage.b22;
import defpackage.gt2;
import defpackage.r41;
import defpackage.r96;
import defpackage.un1;
import defpackage.ww8;
import defpackage.zn1;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.i;
import kotlin.enums.a;

/* loaded from: classes4.dex */
public final class PurrTCFDevSettings {
    public static final PurrTCFDevSettings a = new PurrTCFDevSettings();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PurrAcceptRejectTCFDevSettingOption {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ PurrAcceptRejectTCFDevSettingOption[] $VALUES;
        public static final PurrAcceptRejectTCFDevSettingOption NO_CHANGE = new PurrAcceptRejectTCFDevSettingOption("NO_CHANGE", 0);
        public static final PurrAcceptRejectTCFDevSettingOption CLEAR = new PurrAcceptRejectTCFDevSettingOption("CLEAR", 1);
        public static final PurrAcceptRejectTCFDevSettingOption USE_EXAMPLE = new PurrAcceptRejectTCFDevSettingOption("USE_EXAMPLE", 2);

        private static final /* synthetic */ PurrAcceptRejectTCFDevSettingOption[] $values() {
            return new PurrAcceptRejectTCFDevSettingOption[]{NO_CHANGE, CLEAR, USE_EXAMPLE};
        }

        static {
            PurrAcceptRejectTCFDevSettingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PurrAcceptRejectTCFDevSettingOption(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static PurrAcceptRejectTCFDevSettingOption valueOf(String str) {
            return (PurrAcceptRejectTCFDevSettingOption) Enum.valueOf(PurrAcceptRejectTCFDevSettingOption.class, str);
        }

        public static PurrAcceptRejectTCFDevSettingOption[] values() {
            return (PurrAcceptRejectTCFDevSettingOption[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PurrTCFHashesDevSettingOption {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ PurrTCFHashesDevSettingOption[] $VALUES;
        public static final PurrTCFHashesDevSettingOption NO_CHANGE = new PurrTCFHashesDevSettingOption("NO_CHANGE", 0);
        public static final PurrTCFHashesDevSettingOption DIFF_HASHES = new PurrTCFHashesDevSettingOption("DIFF_HASHES", 1);
        public static final PurrTCFHashesDevSettingOption SAME_HASHES = new PurrTCFHashesDevSettingOption("SAME_HASHES", 2);
        public static final PurrTCFHashesDevSettingOption NO_HASHES = new PurrTCFHashesDevSettingOption("NO_HASHES", 3);

        private static final /* synthetic */ PurrTCFHashesDevSettingOption[] $values() {
            return new PurrTCFHashesDevSettingOption[]{NO_CHANGE, DIFF_HASHES, SAME_HASHES, NO_HASHES};
        }

        static {
            PurrTCFHashesDevSettingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PurrTCFHashesDevSettingOption(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static PurrTCFHashesDevSettingOption valueOf(String str) {
            return (PurrTCFHashesDevSettingOption) Enum.valueOf(PurrTCFHashesDevSettingOption.class, str);
        }

        public static PurrTCFHashesDevSettingOption[] values() {
            return (PurrTCFHashesDevSettingOption[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PurrTCFInfoDevSettingOption {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ PurrTCFInfoDevSettingOption[] $VALUES;
        public static final PurrTCFInfoDevSettingOption NO_CHANGE = new PurrTCFInfoDevSettingOption("NO_CHANGE", 0);
        public static final PurrTCFInfoDevSettingOption NO_TCF = new PurrTCFInfoDevSettingOption("NO_TCF", 1);
        public static final PurrTCFInfoDevSettingOption ACCEPT_ALL_TCF = new PurrTCFInfoDevSettingOption("ACCEPT_ALL_TCF", 2);
        public static final PurrTCFInfoDevSettingOption REJECT_ALL_TCF = new PurrTCFInfoDevSettingOption("REJECT_ALL_TCF", 3);
        public static final PurrTCFInfoDevSettingOption ACCEPT_ONE_PURPOSE_FEATURE_VENDOR = new PurrTCFInfoDevSettingOption("ACCEPT_ONE_PURPOSE_FEATURE_VENDOR", 4);

        private static final /* synthetic */ PurrTCFInfoDevSettingOption[] $values() {
            return new PurrTCFInfoDevSettingOption[]{NO_CHANGE, NO_TCF, ACCEPT_ALL_TCF, REJECT_ALL_TCF, ACCEPT_ONE_PURPOSE_FEATURE_VENDOR};
        }

        static {
            PurrTCFInfoDevSettingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private PurrTCFInfoDevSettingOption(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static PurrTCFInfoDevSettingOption valueOf(String str) {
            return (PurrTCFInfoDevSettingOption) Enum.valueOf(PurrTCFInfoDevSettingOption.class, str);
        }

        public static PurrTCFInfoDevSettingOption[] values() {
            return (PurrTCFInfoDevSettingOption[]) $VALUES.clone();
        }
    }

    private PurrTCFDevSettings() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.text.a b(TCFInfo tCFInfo, AgentTCFInfo agentTCFInfo, String str, String str2) {
        Map<String, Object> decodedInfo = tCFInfo.getDecodedInfo();
        String tcfString = tCFInfo.getTcfString();
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        c0064a.i("TCF Info:\n");
        c0064a.i("\tTCF String: " + tcfString + "\n");
        if (zq3.c(tcfString, str == null ? "CPyZhwAPyZhwAAMABBENASEEADAAAAAAAAAAB_QAgABAD-AAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ" : str)) {
            c0064a.i("\t(AKA Accept All TCF)\n");
        } else if (zq3.c(tcfString, str2 == null ? "CPyZhwAPyZhwAAMABBENASEAAAAAAAAAAAAAAAAAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ" : str2)) {
            c0064a.i("\t(AKA Reject All TCF)\n");
        }
        c0064a.i("\tTCF Notices Hash: " + tCFInfo.getTcfNoticesHash() + "\n");
        c0064a.i("\tTCF Latest hash: " + tCFInfo.getLatestNoticesHash() + "\n");
        c0064a.i("\n");
        if (decodedInfo.isEmpty()) {
            c0064a.i("TCF Decoded Info: N/A\n");
        } else {
            c0064a.i("TCF Decoded Info:\n");
            for (Map.Entry<String, Object> entry : decodedInfo.entrySet()) {
                c0064a.i("\t" + entry.getKey() + " : " + entry.getValue() + "\n");
            }
        }
        c0064a.i("\n");
        if (agentTCFInfo == null) {
            c0064a.i("Agent TCF: N/A\n");
        } else {
            c0064a.i("Agent TCF:\n");
            c0064a.i("\tAgent TCF String: " + agentTCFInfo.getAgentTcfString() + "\n");
            String agentTcfString = agentTCFInfo.getAgentTcfString();
            if (zq3.c(agentTcfString, str != null ? str : "CPyZhwAPyZhwAAMABBENASEEADAAAAAAAAAAB_QAgABAD-AAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ")) {
                c0064a.i("\t\t(AKA Accept All TCF)\n");
            } else if (zq3.c(agentTcfString, str2 != null ? str2 : "CPyZhwAPyZhwAAMABBENASEAAAAAAAAAAAAAAAAAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ")) {
                c0064a.i("\t\t(AKA Reject All TCF)\n");
            }
            c0064a.i("\tAgent TCF Hash: " + agentTCFInfo.getAgentTCFNoticesHash() + "\n");
        }
        c0064a.i("\n");
        c0064a.i("Accept All TCF: " + str + "\n\n");
        c0064a.i("Reject All TCF: " + str2 + "\n\n");
        return c0064a.o();
    }

    public final un1 c(Context context, final com.nytimes.android.subauth.core.purr.a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        PurrAcceptRejectTCFDevSettingOption[] values = PurrAcceptRejectTCFDevSettingOption.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (PurrAcceptRejectTCFDevSettingOption purrAcceptRejectTCFDevSettingOption : values) {
            arrayList.add(new zn1(purrAcceptRejectTCFDevSettingOption.name(), purrAcceptRejectTCFDevSettingOption.name(), null, false, 12, null));
        }
        return new DevSettingChoiceListPreferenceItem("Set Accept All TCF String", "PURR_Accept_All_TCF_String_Override", i.X0(arrayList), null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.purr.tcf.PurrTCFDevSettings$setAcceptAllTCFDevSetting$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.values().length];
                    try {
                        iArr[PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.CLEAR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.USE_EXAMPLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    a = iArr;
                }
            }

            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption purrAcceptRejectTCFDevSettingOption2;
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                try {
                    purrAcceptRejectTCFDevSettingOption2 = PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.valueOf(zn1Var.getPrefValue());
                } catch (Exception unused) {
                    purrAcceptRejectTCFDevSettingOption2 = PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.NO_CHANGE;
                }
                int i = a.a[purrAcceptRejectTCFDevSettingOption2.ordinal()];
                if (i == 1) {
                    com.nytimes.android.subauth.core.purr.a.this.f(null);
                } else {
                    if (i != 2) {
                        return;
                    }
                    com.nytimes.android.subauth.core.purr.a.this.f("CPyZhwAPyZhwAAMABBENASEEADAAAAAAAAAAB_QAgABAD-AAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ");
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, r41.a.a(), str == null ? "Set Accept All TCF String" : str, false, false, 392, null).j(context);
    }

    public final un1 d(Context context, final com.nytimes.android.subauth.core.purr.a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        PurrAcceptRejectTCFDevSettingOption[] values = PurrAcceptRejectTCFDevSettingOption.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (PurrAcceptRejectTCFDevSettingOption purrAcceptRejectTCFDevSettingOption : values) {
            arrayList.add(new zn1(purrAcceptRejectTCFDevSettingOption.name(), purrAcceptRejectTCFDevSettingOption.name(), null, false, 12, null));
        }
        return new DevSettingChoiceListPreferenceItem("Set Reject All TCF String", "PURR_Reject_All_TCF_String_Override", i.X0(arrayList), null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.purr.tcf.PurrTCFDevSettings$setRejectAllTCFDevSetting$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.values().length];
                    try {
                        iArr[PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.CLEAR.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.USE_EXAMPLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    a = iArr;
                }
            }

            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption purrAcceptRejectTCFDevSettingOption2;
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                try {
                    purrAcceptRejectTCFDevSettingOption2 = PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.valueOf(zn1Var.getPrefValue());
                } catch (Exception unused) {
                    purrAcceptRejectTCFDevSettingOption2 = PurrTCFDevSettings.PurrAcceptRejectTCFDevSettingOption.NO_CHANGE;
                }
                int i = a.a[purrAcceptRejectTCFDevSettingOption2.ordinal()];
                if (i == 1) {
                    com.nytimes.android.subauth.core.purr.a.this.i(null);
                } else {
                    if (i != 2) {
                        return;
                    }
                    com.nytimes.android.subauth.core.purr.a.this.i("CPyZhwAPyZhwAAMABBENASEAAAAAAAAAAAAAAAAAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ");
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, r41.a.a(), str == null ? "Set Reject All TCF String" : str, false, false, 392, null).j(context);
    }

    public final un1 e(Context context, final com.nytimes.android.subauth.core.purr.a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        PurrTCFInfoDevSettingOption[] values = PurrTCFInfoDevSettingOption.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (PurrTCFInfoDevSettingOption purrTCFInfoDevSettingOption : values) {
            arrayList.add(new zn1(purrTCFInfoDevSettingOption.name(), purrTCFInfoDevSettingOption.name(), null, false, 12, null));
        }
        return new DevSettingChoiceListPreferenceItem("Set Saved TCF String", "PURR_Saved_TCF_String", i.X0(arrayList), null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.purr.tcf.PurrTCFDevSettings$setSavedTCFStringDevSetting$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PurrTCFDevSettings.PurrTCFInfoDevSettingOption.values().length];
                    try {
                        iArr[PurrTCFDevSettings.PurrTCFInfoDevSettingOption.NO_TCF.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PurrTCFDevSettings.PurrTCFInfoDevSettingOption.ACCEPT_ALL_TCF.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PurrTCFDevSettings.PurrTCFInfoDevSettingOption.REJECT_ALL_TCF.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PurrTCFDevSettings.PurrTCFInfoDevSettingOption.ACCEPT_ONE_PURPOSE_FEATURE_VENDOR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    a = iArr;
                }
            }

            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                PurrTCFDevSettings.PurrTCFInfoDevSettingOption purrTCFInfoDevSettingOption2;
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                try {
                    purrTCFInfoDevSettingOption2 = PurrTCFDevSettings.PurrTCFInfoDevSettingOption.valueOf(zn1Var.getPrefValue());
                } catch (Exception unused) {
                    purrTCFInfoDevSettingOption2 = PurrTCFDevSettings.PurrTCFInfoDevSettingOption.NO_CHANGE;
                }
                int i = a.a[purrTCFInfoDevSettingOption2.ordinal()];
                if (i == 1) {
                    com.nytimes.android.subauth.core.purr.a.this.o(null, null);
                    return;
                }
                if (i == 2) {
                    com.nytimes.android.subauth.core.purr.a.this.o("CPyZhwAPyZhwAAMABBENASEEADAAAAAAAAAAB_QAgABAD-AAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ", r96.a.a());
                } else if (i == 3) {
                    com.nytimes.android.subauth.core.purr.a.this.o("CPyZhwAPyZhwAAMABBENASEAAAAAAAAAAAAAAAAAAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ", r96.a.b());
                } else {
                    if (i != 4) {
                        return;
                    }
                    com.nytimes.android.subauth.core.purr.a.this.o("CPyZhwAPyZhwAAMABBENASEEABAAAAAAAAAAB_QAQB_AAAAA.IgoMV_H3_bX9v8Tq16ft0eYFX99j77uQxBhfJs-4FyDvW_JwVn2EyNAUytqYKmRIEuzZBIQFsHJnURVChQogVryHsYkGMhTEAJ-BkgHMRa2dYCFxvmYtjEQIZ5_p_czf52R_9_dn-3czjT9lnnzVtO2dlcKidS59tH_l_bRKb-7Ied-7W_4v09tfrkW_eTVu_9evvp9-u_s_v__934AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAQ", null);
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, r41.a.a(), str == null ? "Set Saved TCF String" : str, false, false, 392, null).j(context);
    }

    public final un1 f(Context context, final com.nytimes.android.subauth.core.purr.a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        PurrTCFHashesDevSettingOption[] values = PurrTCFHashesDevSettingOption.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (PurrTCFHashesDevSettingOption purrTCFHashesDevSettingOption : values) {
            arrayList.add(new zn1(purrTCFHashesDevSettingOption.name(), purrTCFHashesDevSettingOption.name(), null, false, 12, null));
        }
        return new DevSettingChoiceListPreferenceItem("Set Saved TCF Notice Hashes", "PURR_Saved_TCF_Notice_Hashes", i.X0(arrayList), null, new gt2() { // from class: com.nytimes.android.subauth.devsettings.purr.tcf.PurrTCFDevSettings$setTCFHashesDevSetting$2

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[PurrTCFDevSettings.PurrTCFHashesDevSettingOption.values().length];
                    try {
                        iArr[PurrTCFDevSettings.PurrTCFHashesDevSettingOption.DIFF_HASHES.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PurrTCFDevSettings.PurrTCFHashesDevSettingOption.SAME_HASHES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PurrTCFDevSettings.PurrTCFHashesDevSettingOption.NO_HASHES.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            {
                super(2);
            }

            public final void b(Context context2, zn1 zn1Var) {
                PurrTCFDevSettings.PurrTCFHashesDevSettingOption purrTCFHashesDevSettingOption2;
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(zn1Var, "item");
                try {
                    purrTCFHashesDevSettingOption2 = PurrTCFDevSettings.PurrTCFHashesDevSettingOption.valueOf(zn1Var.getPrefValue());
                } catch (Exception unused) {
                    purrTCFHashesDevSettingOption2 = PurrTCFDevSettings.PurrTCFHashesDevSettingOption.NO_CHANGE;
                }
                int i = a.a[purrTCFHashesDevSettingOption2.ordinal()];
                if (i == 1) {
                    com.nytimes.android.subauth.core.purr.a.this.w("1234", "5678");
                } else if (i == 2) {
                    com.nytimes.android.subauth.core.purr.a.this.w("1234", "1234");
                } else {
                    if (i != 3) {
                        return;
                    }
                    com.nytimes.android.subauth.core.purr.a.this.w(null, null);
                }
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (zn1) obj2);
                return ww8.a;
            }
        }, r41.a.a(), str == null ? "Set Saved TCF Notice Hashes" : str, false, false, 392, null).j(context);
    }

    public final un1 g(Context context, com.nytimes.android.subauth.core.purr.a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        return new DevSettingLazySummaryItem("Should Show TCF Blocker Card (Click to refresh)", null, new PurrTCFDevSettings$showTCFBlockerCardUIStatusDevSetting$1(aVar, context, null), null, null, null, r41.a.a(), str == null ? "Should Show TCF Blocker Card (Click to refresh)" : str, false, true, 314, null);
    }

    public final un1 h(Context context, com.nytimes.android.subauth.core.purr.a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        return new DevSettingLazySummaryItem("Current TCF Info (Click to refresh)", null, new PurrTCFDevSettings$showTCFInfoDevSetting$1(aVar, context, null), null, null, null, r41.a.a(), str == null ? "Current TCF Info (Click to refresh)" : str, false, true, 314, null);
    }
}
