package com.chartbeat.androidsdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes2.dex */
final class SiteVisitTracker {
    private static final String KEY_LAST_SITE_VISIT_DEPTH = "site-visit-depth-";
    private static final String KEY_LAST_SITE_VISIT_ID = "site-visit-uid-";
    private static final String KEY_LAST_SITE_VISIT_REFERRER = "site-visit-referrer-";
    private static final String KEY_LAST_SITE_VISIT_REFRESH_TIME = "site-visit-refresh_time-";
    private static final int MINUTES_TO_TRACK_SITE_VISIT = 30;
    private static final int SITE_VISIT_ID_CHAR_LENGTH = 28;
    private static final String TAG = "Chartbeat SiteVisitTracker";
    protected SharedPreferences prefs;

    SiteVisitTracker(Context context) {
        if (context == null) {
            throw new NullPointerException("Activity or application context cannot be null");
        }
        this.prefs = context.getSharedPreferences(ChartBeatTracker.CHARTBEAT_PREFS, 0);
    }

    public int getSiteVisitDepth() {
        return this.prefs.getInt(KEY_LAST_SITE_VISIT_DEPTH, 0);
    }

    public String getSiteVisitId() {
        return this.prefs.getString(KEY_LAST_SITE_VISIT_ID, null);
    }

    public String getSiteVisitReferrer() {
        return this.prefs.getString(KEY_LAST_SITE_VISIT_REFERRER, null);
    }

    Date getSiteVisitRefreshTime() {
        long j = this.prefs.getLong(KEY_LAST_SITE_VISIT_REFRESH_TIME, 0L);
        if (j != 0) {
            return new Date(j);
        }
        return null;
    }

    Boolean hasSiteVisitExpired() {
        Date date = new Date();
        Date siteVisitRefreshTime = getSiteVisitRefreshTime();
        if (siteVisitRefreshTime == null) {
            return Boolean.TRUE;
        }
        siteVisitRefreshTime.setMinutes(siteVisitRefreshTime.getMinutes() + 30);
        return Boolean.valueOf(siteVisitRefreshTime.before(date));
    }

    void storeSiteVisitDepth(int i) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putInt(KEY_LAST_SITE_VISIT_DEPTH, i);
        edit.apply();
    }

    public void storeSiteVisitId(String str) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(KEY_LAST_SITE_VISIT_ID, str);
        edit.apply();
    }

    void storeSiteVisitReferrer(String str) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putString(KEY_LAST_SITE_VISIT_REFERRER, str);
        edit.apply();
    }

    void storeSiteVisitRefreshTime(Date date) {
        SharedPreferences.Editor edit = this.prefs.edit();
        edit.putLong(KEY_LAST_SITE_VISIT_REFRESH_TIME, date.getTime());
        edit.apply();
    }

    public void trackSiteVisit(String str) {
        if (str == null) {
            str = new String();
        }
        String siteVisitReferrer = getSiteVisitReferrer();
        if (!(!(siteVisitReferrer == null || str.length() <= 0 || siteVisitReferrer.equals(str)) || hasSiteVisitExpired().booleanValue() || (siteVisitReferrer == null && str.length() > 0))) {
            storeSiteVisitDepth(getSiteVisitDepth() + 1);
            return;
        }
        storeSiteVisitDepth(1);
        storeSiteVisitReferrer(str);
        storeSiteVisitId(SecurityUtils.randomChars(SITE_VISIT_ID_CHAR_LENGTH));
        storeSiteVisitRefreshTime(new Date());
    }

    public void visited() {
        storeSiteVisitRefreshTime(new Date());
    }
}
