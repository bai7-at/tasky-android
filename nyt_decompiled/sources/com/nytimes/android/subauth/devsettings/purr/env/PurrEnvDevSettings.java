package com.nytimes.android.subauth.devsettings.purr.env;

import android.content.Context;
import com.comscore.streaming.WindowState;
import com.nytimes.android.devsettings.common.DevSettingChoiceListPreferenceItem;
import com.nytimes.android.devsettings.common.DevSettingSwitchItem;
import com.nytimes.android.devsettings.utils.ContextUtilsKt;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.model.PurrLocation;
import com.nytimes.android.subauth.core.purr.network.Environment;
import com.nytimes.android.subauth.devsettings.purr.env.PurrEnvDevSettings;
import defpackage.b22;
import defpackage.gt2;
import defpackage.r41;
import defpackage.ss2;
import defpackage.tn1;
import defpackage.un1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrEnvDevSettings {
    public static final PurrEnvDevSettings a = new PurrEnvDevSettings();

    private PurrEnvDevSettings() {
    }

    public final PurrLocation a(Context context) {
        zq3.h(context, "context");
        String string = ContextUtilsKt.a(context).getString("nyt.purr.location_key", "NO_OVERRIDE");
        zq3.e(string);
        return PurrLocation.valueOf(string);
    }

    public final un1 b(a aVar, String str) {
        zq3.h(aVar, "purrManager");
        return new DevSettingSwitchItem("Enable PURR Debug Logging", new ss2() { // from class: com.nytimes.android.subauth.devsettings.purr.env.PurrEnvDevSettings$purrEnableDebugLogging$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Context context) {
                zq3.h(context, "it");
                return Boolean.FALSE;
            }
        }, new PurrEnvDevSettings$purrEnableDebugLogging$2(aVar, null), "Enabled PURR Debug Logging", "Disable PURR Debug Logging", null, r41.a.a(), str == null ? "Enable PURR Debug Logging" : str, false, 288, null);
    }

    public final un1 c(Context context, String str) {
        zq3.h(context, "context");
        return new DevSettingChoiceListPreferenceItem("Override PURR GraphQL Env", "nyt.purr.env_key", d.C0(PurrGraphQLEnvDevSettingOption.values()), PurrGraphQLEnvDevSettingOption.PRODUCTION, null, r41.a.a(), str == null ? "Override PURR GraphQL Env" : str, false, false, WindowState.NORMAL, null).j(context);
    }

    public final un1 d(Context context, final a aVar, String str) {
        zq3.h(context, "context");
        zq3.h(aVar, "purrManager");
        return new DevSettingChoiceListPreferenceItem("Override PURR Location (clears PURR cache)", "nyt.purr.location_key", d.C0(PurrLocationDevSettingOption.values()), PurrLocationDevSettingOption.NO_OVERRIDE, new gt2() { // from class: com.nytimes.android.subauth.devsettings.purr.env.PurrEnvDevSettings$purrOverrideLocationSetting$1
            {
                super(2);
            }

            public final void b(Context context2, PurrEnvDevSettings.PurrLocationDevSettingOption purrLocationDevSettingOption) {
                zq3.h(context2, "<anonymous parameter 0>");
                zq3.h(purrLocationDevSettingOption, "<anonymous parameter 1>");
                a.this.clear();
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((Context) obj, (PurrEnvDevSettings.PurrLocationDevSettingOption) obj2);
                return ww8.a;
            }
        }, r41.a.a(), str == null ? "Override PURR Location (clears PURR cache)" : str, false, false, 384, null).j(context);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PurrGraphQLEnvDevSettingOption implements tn1 {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ PurrGraphQLEnvDevSettingOption[] $VALUES;
        public static final PurrGraphQLEnvDevSettingOption DEV;
        public static final PurrGraphQLEnvDevSettingOption EXPERIMENTAL2;
        public static final PurrGraphQLEnvDevSettingOption EXPERIMENTAL3;
        public static final PurrGraphQLEnvDevSettingOption EXPERIMENTAL5;
        public static final PurrGraphQLEnvDevSettingOption PRODUCTION = new PurrGraphQLEnvDevSettingOption("PRODUCTION", 0, Environment.PRODUCTION.getUrl(), "PRODUCTION", null, false, 12, null);
        private final String prefValue;
        private final boolean requestRestart;
        private final String summary;
        private final String title;

        private static final /* synthetic */ PurrGraphQLEnvDevSettingOption[] $values() {
            return new PurrGraphQLEnvDevSettingOption[]{PRODUCTION, DEV, EXPERIMENTAL2, EXPERIMENTAL3, EXPERIMENTAL5};
        }

        static {
            int i = 12;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            boolean z = false;
            DEV = new PurrGraphQLEnvDevSettingOption("DEV", 1, Environment.DEV.getUrl(), "DEV", str, z, i, defaultConstructorMarker);
            int i2 = 12;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            String str2 = null;
            boolean z2 = false;
            EXPERIMENTAL2 = new PurrGraphQLEnvDevSettingOption("EXPERIMENTAL2", 2, Environment.EXPERIMENTAL2.getUrl(), "EXPERIMENTAL2", str2, z2, i2, defaultConstructorMarker2);
            EXPERIMENTAL3 = new PurrGraphQLEnvDevSettingOption("EXPERIMENTAL3", 3, Environment.EXPERIMENTAL3.getUrl(), "EXPERIMENTAL3", str, z, i, defaultConstructorMarker);
            EXPERIMENTAL5 = new PurrGraphQLEnvDevSettingOption("EXPERIMENTAL5", 4, Environment.EXPERIMENTAL5.getUrl(), "EXPERIMENTAL5", str2, z2, i2, defaultConstructorMarker2);
            PurrGraphQLEnvDevSettingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PurrGraphQLEnvDevSettingOption(String str, int i, String str2, String str3, String str4, boolean z) {
            this.prefValue = str2;
            this.title = str3;
            this.summary = str4;
            this.requestRestart = z;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static PurrGraphQLEnvDevSettingOption valueOf(String str) {
            return (PurrGraphQLEnvDevSettingOption) Enum.valueOf(PurrGraphQLEnvDevSettingOption.class, str);
        }

        public static PurrGraphQLEnvDevSettingOption[] values() {
            return (PurrGraphQLEnvDevSettingOption[]) $VALUES.clone();
        }

        @Override // defpackage.tn1
        public String getPrefValue() {
            return this.prefValue;
        }

        @Override // defpackage.tn1
        public boolean getRequestRestart() {
            return this.requestRestart;
        }

        @Override // defpackage.tn1
        public String getSummary() {
            return this.summary;
        }

        @Override // defpackage.tn1
        public String getTitle() {
            return this.title;
        }

        /* synthetic */ PurrGraphQLEnvDevSettingOption(String str, int i, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, (i2 & 4) != 0 ? null : str4, (i2 & 8) != 0 ? true : z);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PurrLocationDevSettingOption implements tn1 {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ PurrLocationDevSettingOption[] $VALUES;
        public static final PurrLocationDevSettingOption AUSTRALIA;
        public static final PurrLocationDevSettingOption CALIFORNIA;
        public static final PurrLocationDevSettingOption EUROPE;
        public static final PurrLocationDevSettingOption NEW_YORK;
        public static final PurrLocationDevSettingOption NO_OVERRIDE = new PurrLocationDevSettingOption("NO_OVERRIDE", 0, "NO_OVERRIDE", PurrLocation.NO_OVERRIDE.getLabel(), null, false, 12, null);
        private final String prefValue;
        private final boolean requestRestart;
        private final String summary;
        private final String title;

        private static final /* synthetic */ PurrLocationDevSettingOption[] $values() {
            return new PurrLocationDevSettingOption[]{NO_OVERRIDE, CALIFORNIA, EUROPE, NEW_YORK, AUSTRALIA};
        }

        static {
            int i = 12;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            boolean z = false;
            CALIFORNIA = new PurrLocationDevSettingOption("CALIFORNIA", 1, "CALIFORNIA", PurrLocation.CALIFORNIA.getLabel(), str, z, i, defaultConstructorMarker);
            int i2 = 12;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            String str2 = null;
            boolean z2 = false;
            EUROPE = new PurrLocationDevSettingOption("EUROPE", 2, "EUROPE", PurrLocation.EUROPE.getLabel(), str2, z2, i2, defaultConstructorMarker2);
            NEW_YORK = new PurrLocationDevSettingOption("NEW_YORK", 3, "NEW_YORK", PurrLocation.NEW_YORK.getLabel(), str, z, i, defaultConstructorMarker);
            AUSTRALIA = new PurrLocationDevSettingOption("AUSTRALIA", 4, "AUSTRALIA", PurrLocation.AUSTRALIA.getLabel(), str2, z2, i2, defaultConstructorMarker2);
            PurrLocationDevSettingOption[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PurrLocationDevSettingOption(String str, int i, String str2, String str3, String str4, boolean z) {
            this.prefValue = str2;
            this.title = str3;
            this.summary = str4;
            this.requestRestart = z;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static PurrLocationDevSettingOption valueOf(String str) {
            return (PurrLocationDevSettingOption) Enum.valueOf(PurrLocationDevSettingOption.class, str);
        }

        public static PurrLocationDevSettingOption[] values() {
            return (PurrLocationDevSettingOption[]) $VALUES.clone();
        }

        @Override // defpackage.tn1
        public String getPrefValue() {
            return this.prefValue;
        }

        @Override // defpackage.tn1
        public boolean getRequestRestart() {
            return this.requestRestart;
        }

        @Override // defpackage.tn1
        public String getSummary() {
            return this.summary;
        }

        @Override // defpackage.tn1
        public String getTitle() {
            return this.title;
        }

        /* synthetic */ PurrLocationDevSettingOption(String str, int i, String str2, String str3, String str4, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, str3, (i2 & 4) != 0 ? null : str4, (i2 & 8) != 0 ? true : z);
        }
    }
}
