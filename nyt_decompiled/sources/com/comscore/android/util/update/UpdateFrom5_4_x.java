package com.comscore.android.util.update;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class UpdateFrom5_4_x {
    public static final String OLD_DEFAULT_PREFS_NAME = "cSPrefs";
    private SharedPreferences a;
    private HashMap<String, String> b;
    private File c;
    private File d;
    private Context e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(400L);
            } catch (InterruptedException unused) {
            }
            if (UpdateFrom5_4_x.this.c.exists()) {
                UpdateFrom5_4_x.this.c.delete();
            }
            if (UpdateFrom5_4_x.this.d.exists()) {
                UpdateFrom5_4_x.this.d.delete();
            }
        }
    }

    class b implements FilenameFilter {
        b() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith("cs_cache_");
        }
    }

    public UpdateFrom5_4_x(Context context) {
        this.e = context;
        File file = new File(this.e.getFilesDir().getParent() + "/shared_prefs/" + OLD_DEFAULT_PREFS_NAME + ".xml");
        this.c = file;
        if (file.exists()) {
            this.d = new File(this.e.getFilesDir().getParent() + "/shared_prefs/" + OLD_DEFAULT_PREFS_NAME + ".back");
            this.b = new HashMap<>();
            SharedPreferences sharedPreferences = this.e.getSharedPreferences(OLD_DEFAULT_PREFS_NAME, 0);
            this.a = sharedPreferences;
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof String) {
                    this.b.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
    }

    public void libraryPostUpdate(Map<String, String> map, ArrayList<String> arrayList) {
        if (this.a == null) {
            return;
        }
        a();
        Iterator<String> it2 = a(this.e).iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            a(this.e, next, arrayList);
            this.e.deleteFile(next);
        }
    }

    public void libraryUpdate(Map<String, String> map) {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ns_ap_fg", "foreground_transitions_count");
        hashMap.put("installTime", "current_install_timestamp");
        String str = this.b.get("lastActivityTime");
        if (str != null && str.length() != 0) {
            map.put("last_application_accumulation_timestamp", str);
            map.put("last_session_accumulation_timestamp", str);
        }
        hashMap.put("lastApplicationAccumulationTimestamp", "last_application_accumulation_timestamp");
        hashMap.put("lastSessionAccumulationTimestamp", "last_session_accumulation_timestamp");
        hashMap.put("lastApplicationSessionTimestamp", "last_application_session_timestamp");
        hashMap.put("lastUserSessionTimestamp", "last_user_session_timestamp");
        hashMap.put("lastActiveUserSessionTimestamp", "last_active_user_session_timestamp");
        hashMap.put("foregroundTransitionsCount", "foreground_transitions_count");
        hashMap.put("totalForegroundTime", "total_foreground_time");
        hashMap.put("totalBackgroundTime", "total_background_time");
        hashMap.put("totalInactiveTime", "total_inactive_time");
        hashMap.put("accumulatedForegroundTime", "accumulated_foreground_time");
        hashMap.put("accumulatedBackgroundTime", "accumulated_background_time");
        hashMap.put("accumulatedInactiveTime", "accumulated_inactive_time");
        hashMap.put("accumulatedApplicationSessionTime", "accumulated_application_session_time");
        hashMap.put("accumulatedActiveUserSessionTime", "accumulated_active_user_session_time");
        hashMap.put("accumulatedUserSessionTime", "accumulated_user_session_time");
        hashMap.put("activeUserSessionCount", "active_user_session_count");
        hashMap.put("userInteractionCount", "user_interaction_count");
        hashMap.put("userSessionCount", "user_session_count");
        hashMap.put("applicationSessionCountKey", "application_session_count");
        hashMap.put("genesis", "genesis");
        hashMap.put("previousGenesis", "previous_genesis");
        hashMap.put("installId", "current_install_timestamp");
        hashMap.put("firstInstallId", "first_install_timestamp");
        hashMap.put("currentVersion", "previous_app_version");
        hashMap.put("runs", "runs");
        hashMap.put("coldStartCount", "cold_start_count");
        hashMap.put("lastMeasurementProcessedTimestamp", "last_transmission_time");
        hashMap.put("lastUserInteractionTimestamp", "last_user_interaction_timestamp");
        hashMap.put("crossPublisherId", "crosspublisher_id_RSA");
        hashMap.put("md5RawCrossPublisherId", "crosspublisher_id_MD5");
        for (Map.Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            String str4 = this.b.get(str2);
            if (str4 != null && str4.length() != 0) {
                map.put(str3, str4);
            }
        }
        String str5 = map.get("updated_from_versions");
        map.put("updated_from_versions", (str5 == null || str5.length() == 0) ? "5.4.x" : "5.4.x," + str5);
    }

    private ArrayList<String> a(Context context) {
        String[] strArr;
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.isDirectory()) {
            strArr = null;
        } else {
            strArr = filesDir.list(new b());
            if (strArr != null) {
                Arrays.sort(strArr);
            } else {
                strArr = new String[0];
            }
        }
        return new ArrayList<>(Arrays.asList(strArr));
    }

    private void a() {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().clear().commit();
        new Thread(new a()).start();
    }

    private void a(Context context, String str, ArrayList<String> arrayList) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(context.openFileInput(str)));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        while (true) {
            try {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (readLine.length() != 0) {
                            arrayList.add(readLine);
                        }
                    }
                } catch (Exception unused2) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        bufferedReader = bufferedReader2;
                        bufferedReader.close();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                bufferedReader.close();
                return;
            } catch (IOException unused4) {
                return;
            }
        }
    }
}
