package com.chartbeat.androidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.jc5;
import defpackage.mb7;
import defpackage.uc5;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class UserInfo {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    private static final int DAYS_TO_REMEMBER_USER = 30;
    private static final int DAYS_TO_TRACK_VISITS = 16;
    private static final String KEY_USER_CREATION_BY_ID = "created-";
    private static final String KEY_USER_ID = "userid";
    private static final String KEY_USER_LAST_VISIT_TIME_BY_ID = "visits-";
    private static final int MINUTES_TO_TRACK_NEW_USER = 30;
    private static final String TAG = "Chartbeat userdata";
    private static final int USER_ID_CHAR_LENGTH = 18;
    private boolean isNewUser;
    protected SharedPreferences prefs;
    private SubscriptionState subscriptionState;
    private GregorianCalendar userCreated;
    private final String userID;
    private TreeSet<GregorianCalendar> visitedDates;

    UserInfo(Context context) {
        GregorianCalendar gregorianCalendar;
        if (context == null) {
            throw new NullPointerException("Activity or application context cannot be null");
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(ChartBeatTracker.CHARTBEAT_PREFS, 0);
        this.prefs = sharedPreferences;
        String string = sharedPreferences.getString(KEY_USER_ID, null);
        String string2 = this.prefs.getString(KEY_USER_CREATION_BY_ID + string, null);
        if (string == null || string2 == null) {
            string = createUser();
            gregorianCalendar = today();
            storeUser(string, gregorianCalendar);
            this.isNewUser = true;
        } else {
            gregorianCalendar = getCreationDate(string2);
            if (gregorianCalendar.compareTo((Calendar) pastDate(30, 0, 0)) >= 0) {
                this.isNewUser = false;
            } else {
                this.isNewUser = true;
                storeUser(string, today());
                jc5.q(30L, TimeUnit.MINUTES).p(mb7.b()).i(mb7.b()).m(new uc5() { // from class: com.chartbeat.androidsdk.UserInfo.1
                    @Override // defpackage.uc5
                    public void onCompleted() {
                    }

                    @Override // defpackage.uc5
                    public void onError(Throwable th) {
                        th.printStackTrace();
                    }

                    @Override // defpackage.uc5
                    public void onNext(Long l) {
                        UserInfo.this.markUserAsOld();
                    }
                });
            }
        }
        this.userID = string;
        this.userCreated = gregorianCalendar;
        this.visitedDates = getVisitDates(string);
    }

    private String createUser() {
        return SecurityUtils.randomChars(18);
    }

    private static String encodeVisitDates(Set<GregorianCalendar> set) {
        Iterator<GregorianCalendar> it2 = set.iterator();
        boolean z = true;
        String str = "";
        while (it2.hasNext()) {
            String format = DATE_FORMAT.format(it2.next().getTime());
            if (z) {
                z = false;
                str = format;
            } else {
                str = str + "," + format;
            }
        }
        return str;
    }

    private GregorianCalendar getCreationDate(String str) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        try {
            gregorianCalendar.setTime(DATE_FORMAT.parse(str));
            return gregorianCalendar;
        } catch (ParseException unused) {
            Logger.e(TAG, "Date created has become corrupt: " + str);
            return today();
        }
    }

    private TreeSet<GregorianCalendar> getVisitDates(String str) {
        TreeSet<GregorianCalendar> treeSet = new TreeSet<>();
        String string = this.prefs.getString(KEY_USER_LAST_VISIT_TIME_BY_ID + str, null);
        if (string == null) {
            return treeSet;
        }
        GregorianCalendar gregorianCalendar = today();
        gregorianCalendar.add(5, -16);
        Logger.d(TAG, "Retrieving user visited dates: " + string);
        for (String str2 : string.split(",")) {
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            try {
                gregorianCalendar2.setTime(DATE_FORMAT.parse(str2));
                if (gregorianCalendar2.after(gregorianCalendar)) {
                    treeSet.add(gregorianCalendar2);
                }
            } catch (ParseException e) {
                Logger.e(TAG, "error reading date in user info: " + e);
            }
        }
        return treeSet;
    }

    private static GregorianCalendar pastDate(int i, int i2, int i3) {
        return new GregorianCalendar(i, i2, i3) { // from class: com.chartbeat.androidsdk.UserInfo.2
            final /* synthetic */ int val$daysInPast;
            final /* synthetic */ int val$hoursInPast;
            final /* synthetic */ int val$minutesInPast;

            {
                this.val$daysInPast = i;
                this.val$hoursInPast = i2;
                this.val$minutesInPast = i3;
                add(6, -i);
                set(11, -i2);
                set(12, -i3);
                set(13, 0);
                set(14, 0);
            }
        };
    }

    private void storeUser(String str, GregorianCalendar gregorianCalendar) {
        String format = DATE_FORMAT.format(gregorianCalendar.getTime());
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(KEY_USER_ID, str);
        edit.putString(KEY_USER_CREATION_BY_ID + str, format);
        edit.commit();
    }

    static final char toHexDigit(int i) {
        int i2;
        if (i <= 9 && i >= 0) {
            i2 = i + 48;
        } else {
            if (i <= 9 || i >= 16) {
                throw new RuntimeException("I is not in hex digit range: " + i);
            }
            i2 = i + 55;
        }
        return (char) i2;
    }

    private static GregorianCalendar today() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        return new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
    }

    SubscriptionState getSubscriptionState() {
        return this.subscriptionState;
    }

    String getUserID() {
        return this.userID;
    }

    String getUserVisitFrequencyString() {
        GregorianCalendar gregorianCalendar = today();
        GregorianCalendar[] gregorianCalendarArr = new GregorianCalendar[16];
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            GregorianCalendar gregorianCalendar2 = (GregorianCalendar) gregorianCalendar.clone();
            gregorianCalendarArr[i2] = gregorianCalendar2;
            gregorianCalendar2.add(5, -i2);
            if (gregorianCalendarArr[i2].compareTo((Calendar) this.userCreated) >= 0) {
                i = i2;
            }
        }
        return new String(new char[]{toHexDigit(i), toHexDigit(((this.visitedDates.contains(gregorianCalendarArr[15]) ? 1 : 0) << 3) | ((this.visitedDates.contains(gregorianCalendarArr[14]) ? 1 : 0) << 2) | ((this.visitedDates.contains(gregorianCalendarArr[13]) ? 1 : 0) << 1) | (this.visitedDates.contains(gregorianCalendarArr[12]) ? 1 : 0)), toHexDigit(((this.visitedDates.contains(gregorianCalendarArr[11]) ? 1 : 0) << 3) | ((this.visitedDates.contains(gregorianCalendarArr[10]) ? 1 : 0) << 2) | ((this.visitedDates.contains(gregorianCalendarArr[9]) ? 1 : 0) << 1) | (this.visitedDates.contains(gregorianCalendarArr[8]) ? 1 : 0)), toHexDigit(((this.visitedDates.contains(gregorianCalendarArr[7]) ? 1 : 0) << 3) | ((this.visitedDates.contains(gregorianCalendarArr[6]) ? 1 : 0) << 2) | ((this.visitedDates.contains(gregorianCalendarArr[5]) ? 1 : 0) << 1) | (this.visitedDates.contains(gregorianCalendarArr[4]) ? 1 : 0)), toHexDigit((this.visitedDates.contains(gregorianCalendarArr[0]) ? 1 : 0) | ((this.visitedDates.contains(gregorianCalendarArr[3]) ? 1 : 0) << 3) | ((this.visitedDates.contains(gregorianCalendarArr[2]) ? 1 : 0) << 2) | ((this.visitedDates.contains(gregorianCalendarArr[1]) ? 1 : 0) << 1))});
    }

    boolean isNewUser() {
        return this.isNewUser;
    }

    void markUserAsOld() {
        this.isNewUser = false;
    }

    void setSubscriptionState(SubscriptionState subscriptionState) {
        this.subscriptionState = subscriptionState;
    }

    void visited() {
        if (this.visitedDates.add(today())) {
            String encodeVisitDates = encodeVisitDates(this.visitedDates);
            Logger.d(TAG, "Storing user visited dates: " + encodeVisitDates);
            SharedPreferences.Editor edit = this.prefs.edit();
            edit.putString(KEY_USER_LAST_VISIT_TIME_BY_ID + this.userID, encodeVisitDates);
            edit.commit();
        }
    }
}
