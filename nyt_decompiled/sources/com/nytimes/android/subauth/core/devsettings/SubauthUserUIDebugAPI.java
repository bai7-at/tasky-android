package com.nytimes.android.subauth.core.devsettings;

import com.nytimes.android.subauth.core.devsettings.models.DeleteAccountStatusOverride;
import com.nytimes.android.subauth.core.devsettings.models.LIREErrorStateOverride;
import defpackage.b22;

/* loaded from: classes4.dex */
public interface SubauthUserUIDebugAPI {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CaliforniaNoticeOverrideState {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ CaliforniaNoticeOverrideState[] $VALUES;
        public static final CaliforniaNoticeOverrideState NO_OVERRIDE = new CaliforniaNoticeOverrideState("NO_OVERRIDE", 0);
        public static final CaliforniaNoticeOverrideState SHOW = new CaliforniaNoticeOverrideState("SHOW", 1);
        public static final CaliforniaNoticeOverrideState HIDE = new CaliforniaNoticeOverrideState("HIDE", 2);

        private static final /* synthetic */ CaliforniaNoticeOverrideState[] $values() {
            return new CaliforniaNoticeOverrideState[]{NO_OVERRIDE, SHOW, HIDE};
        }

        static {
            CaliforniaNoticeOverrideState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CaliforniaNoticeOverrideState(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static CaliforniaNoticeOverrideState valueOf(String str) {
            return (CaliforniaNoticeOverrideState) Enum.valueOf(CaliforniaNoticeOverrideState.class, str);
        }

        public static CaliforniaNoticeOverrideState[] values() {
            return (CaliforniaNoticeOverrideState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OfferCheckboxOverrideState {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ OfferCheckboxOverrideState[] $VALUES;
        public static final OfferCheckboxOverrideState NO_OVERRIDE = new OfferCheckboxOverrideState("NO_OVERRIDE", 0);
        public static final OfferCheckboxOverrideState CHECKED = new OfferCheckboxOverrideState("CHECKED", 1);
        public static final OfferCheckboxOverrideState UNCHECKED = new OfferCheckboxOverrideState("UNCHECKED", 2);
        public static final OfferCheckboxOverrideState DO_NOT_DISPLAY = new OfferCheckboxOverrideState("DO_NOT_DISPLAY", 3);

        private static final /* synthetic */ OfferCheckboxOverrideState[] $values() {
            return new OfferCheckboxOverrideState[]{NO_OVERRIDE, CHECKED, UNCHECKED, DO_NOT_DISPLAY};
        }

        static {
            OfferCheckboxOverrideState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private OfferCheckboxOverrideState(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static OfferCheckboxOverrideState valueOf(String str) {
            return (OfferCheckboxOverrideState) Enum.valueOf(OfferCheckboxOverrideState.class, str);
        }

        public static OfferCheckboxOverrideState[] values() {
            return (OfferCheckboxOverrideState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OverrideCustomLoginWithNYTS {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ OverrideCustomLoginWithNYTS[] $VALUES;
        public static final OverrideCustomLoginWithNYTS NO_OVERRIDE = new OverrideCustomLoginWithNYTS("NO_OVERRIDE", 0);
        public static final OverrideCustomLoginWithNYTS SUCCESS = new OverrideCustomLoginWithNYTS("SUCCESS", 1);
        public static final OverrideCustomLoginWithNYTS SUCCESS_WITH_DELAY = new OverrideCustomLoginWithNYTS("SUCCESS_WITH_DELAY", 2);
        public static final OverrideCustomLoginWithNYTS FAILURE = new OverrideCustomLoginWithNYTS("FAILURE", 3);
        public static final OverrideCustomLoginWithNYTS FAILURE_WITH_DELAY = new OverrideCustomLoginWithNYTS("FAILURE_WITH_DELAY", 4);

        private static final /* synthetic */ OverrideCustomLoginWithNYTS[] $values() {
            return new OverrideCustomLoginWithNYTS[]{NO_OVERRIDE, SUCCESS, SUCCESS_WITH_DELAY, FAILURE, FAILURE_WITH_DELAY};
        }

        static {
            OverrideCustomLoginWithNYTS[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private OverrideCustomLoginWithNYTS(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static OverrideCustomLoginWithNYTS valueOf(String str) {
            return (OverrideCustomLoginWithNYTS) Enum.valueOf(OverrideCustomLoginWithNYTS.class, str);
        }

        public static OverrideCustomLoginWithNYTS[] values() {
            return (OverrideCustomLoginWithNYTS[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SSOActionOverrideState {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ SSOActionOverrideState[] $VALUES;
        public static final SSOActionOverrideState NO_OVERRIDE = new SSOActionOverrideState("NO_OVERRIDE", 0);
        public static final SSOActionOverrideState ACTION_LOGIN = new SSOActionOverrideState("ACTION_LOGIN", 1);
        public static final SSOActionOverrideState ACTION_REGISTER = new SSOActionOverrideState("ACTION_REGISTER", 2);
        public static final SSOActionOverrideState ACTION_LINKED_REGILITE = new SSOActionOverrideState("ACTION_LINKED_REGILITE", 3);

        private static final /* synthetic */ SSOActionOverrideState[] $values() {
            return new SSOActionOverrideState[]{NO_OVERRIDE, ACTION_LOGIN, ACTION_REGISTER, ACTION_LINKED_REGILITE};
        }

        static {
            SSOActionOverrideState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SSOActionOverrideState(String str, int i) {
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static SSOActionOverrideState valueOf(String str) {
            return (SSOActionOverrideState) Enum.valueOf(SSOActionOverrideState.class, str);
        }

        public static SSOActionOverrideState[] values() {
            return (SSOActionOverrideState[]) $VALUES.clone();
        }
    }

    void a(LIREErrorStateOverride lIREErrorStateOverride);

    void d(OverrideCustomLoginWithNYTS overrideCustomLoginWithNYTS);

    boolean e();

    void f(DeleteAccountStatusOverride deleteAccountStatusOverride);
}
